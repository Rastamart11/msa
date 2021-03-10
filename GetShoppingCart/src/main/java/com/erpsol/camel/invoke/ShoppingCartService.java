package com.erpsol.camel.invoke;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.threeten.bp.OffsetDateTime;

import io.swagger.model.CartItem;
import io.swagger.model.CartPrice;
import io.swagger.model.Characteristic;
import io.swagger.model.DetailResType;
import io.swagger.model.ErrorListType;
import io.swagger.model.GenericFault;
import io.swagger.model.Money;
import io.swagger.model.Price;
import io.swagger.model.ProductOfferingRef;
import io.swagger.model.RelatedParty;
import io.swagger.model.ShoppingCart;

@Component
public class ShoppingCartService {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@SuppressWarnings("unchecked")
	public Object getShoppingCartResponse(Map<String, Object> row) {
		int OUT_code = (Integer) row.get("OUT_code");
		// Mapeo de la respuesta del servicio
		if (OUT_code == 0) {
			List<Object> resultSet = (ArrayList<Object>) row.get("#result-set-1");
			int count = resultSet.size();
			Map<String, Object> array;
			String OUT_id = "", OUT_poPriceType = "", OUT_poUnitOfMeasure = "", OUT_customerid = "",
					OUT_customerName = "";
			float valueCartTotalPrice = 0, OUT_poValue = 0;
			ShoppingCart shoppingCart = new ShoppingCart();
			List<CartItem> listCartItem = new ArrayList<CartItem>();
			for (int i = 0; i < count; i++) {
				float valueItemTotalPrice;
				array = (Map<String, Object>) resultSet.get(i);

				OUT_customerid = (String) array.get("customerId");
				OUT_customerName = (String) array.get("customerName");
				String OUT_poId = (String) array.get("poId");
				String OUT_poName = (String) array.get("poName");
				String OUT_poDescription = (String) array.get("poDescription");
				OUT_poPriceType = (String) array.get("poPriceType");
				OUT_poUnitOfMeasure = (String) array.get("poUnitOfMeasure");
				java.math.BigDecimal poValue = (BigDecimal) array.get("poValue");
				OUT_poValue = poValue.floatValue();
				String OUT_poUrlImage = (String) array.get("poUrlImage");
				OUT_id = (String) array.get("id");
				String OUT_itemId = (String) array.get("itemId");
				int OUT_quantity = (Integer) array.get("quantity");

				CartItem cartItem = new CartItem();
				cartItem.setId(OUT_itemId);
				cartItem.setQuantity(OUT_quantity);

				List<CartPrice> listItemTotalPrice = new ArrayList<CartPrice>();
				CartPrice itemTotalPrice = new CartPrice();
				itemTotalPrice.setPriceType(OUT_poPriceType);
				itemTotalPrice.setUnitOfMeasure(OUT_poUnitOfMeasure);
				Price price = new Price();
				Money taxIncludedAmount = new Money();
				taxIncludedAmount.setUnit(OUT_poUnitOfMeasure);
				valueItemTotalPrice = OUT_poValue * OUT_quantity;
				valueCartTotalPrice = valueCartTotalPrice + valueItemTotalPrice;
				taxIncludedAmount.setValue(valueItemTotalPrice);
				price.setTaxIncludedAmount(taxIncludedAmount);
				itemTotalPrice.setPrice(price);
				listItemTotalPrice.add(itemTotalPrice);
				cartItem.setItemTotalPrice(listItemTotalPrice);

				List<CartPrice> listItemPrice = new ArrayList<CartPrice>();
				CartPrice itemPrice = new CartPrice();
				itemPrice.setPriceType(OUT_poPriceType);
				itemPrice.setUnitOfMeasure(OUT_poUnitOfMeasure);
				Price priceItem = new Price();
				Money taxIncludedAmountItem = new Money();
				taxIncludedAmountItem.setUnit(OUT_poUnitOfMeasure);
				taxIncludedAmountItem.setValue(OUT_poValue);
				priceItem.setTaxIncludedAmount(taxIncludedAmountItem);
				itemPrice.setPrice(priceItem);
				listItemPrice.add(itemPrice);
				cartItem.setItemPrice(listItemPrice);

				ProductOfferingRef productOffering = new ProductOfferingRef();
				productOffering.setId(OUT_poId);
				productOffering.setHref("/api/rest/productOffering/" + OUT_poId);
				productOffering.setName(OUT_poName);
				productOffering.setDescription(OUT_poDescription);
				List<Characteristic> listPOCharacteristic = new ArrayList<Characteristic>();
				Characteristic poCharacteristic = new Characteristic();
				poCharacteristic.setName("image/png");
				poCharacteristic.setValue(OUT_poUrlImage);
				listPOCharacteristic.add(poCharacteristic);
				productOffering.setCharacteristic(listPOCharacteristic);
				cartItem.setProductOffering(productOffering);

				listCartItem.add(cartItem);
			}
			shoppingCart.setId(OUT_id);
			shoppingCart.setCartItem(listCartItem);

			List<CartPrice> listCartTotalPrice = new ArrayList<CartPrice>();
			CartPrice cartTotalPrice = new CartPrice();
			cartTotalPrice.setPriceType(OUT_poPriceType);
			cartTotalPrice.setUnitOfMeasure(OUT_poUnitOfMeasure);
			Price cartPrice = new Price();
			Money cartTaxIncludedAmount = new Money();
			cartTaxIncludedAmount.setUnit(OUT_poUnitOfMeasure);
			cartTaxIncludedAmount.setValue(valueCartTotalPrice);
			cartPrice.setTaxIncludedAmount(cartTaxIncludedAmount);
			cartTotalPrice.setPrice(cartPrice);
			listCartTotalPrice.add(cartTotalPrice);
			shoppingCart.setCartTotalPrice(listCartTotalPrice);

			List<RelatedParty> listRelatedParty = new ArrayList<RelatedParty>();
			RelatedParty relatedParty = new RelatedParty();
			relatedParty.setId(OUT_customerid);
			relatedParty.setIdentifierType("msisdn");
			relatedParty.setName(OUT_customerName);
			relatedParty.setRole("customer");
			listRelatedParty.add(relatedParty);
			shoppingCart.setRelatedParty(listRelatedParty);
			log.info("Was received shoppingCart : {}", shoppingCart);
			return shoppingCart;
		}
		else {
			String OUT_message = (String) row.get("OUT_message");
			GenericFault gf = new GenericFault();
			gf.setMessageUUID("dfghfgd");
			OffsetDateTime dateTime = OffsetDateTime.now();
			String requestDate = dateTime.toString();
			log.info(dateTime + "");
			gf.setResponseDate(requestDate);
			gf.setLatency(1);
			ErrorListType errorList = new ErrorListType();
			DetailResType error = new DetailResType();
			error.setCode(String.valueOf(OUT_code));
			error.setSeverityLevel("1");
			error.setDescription(OUT_message);
			error.setActor("DB");
			error.setBusinessMeaning(OUT_message);
			List<DetailResType> errorArrayList = new ArrayList<DetailResType>();
			errorArrayList.add(error);
			errorList.setError(errorArrayList);
			gf.setErrorList(errorList);
			log.info("Was received genericFault : {}", gf);
			return gf;
		}
	}

}
