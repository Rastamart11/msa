package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CartPrice;
import io.swagger.model.ProductOfferingRef;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An identified part of the shopping cart. A shopping cart  is decomposed into one or more shopping cart item. Cart item represents a product offering or bundled product offering that user wish to purchase, as well as the pricing of the product offering, reference to product in case of configured characteristic or installation address. Cart items can be related to other cart item to related bundled offerings or reference cart Items to a shipping options
 */
@ApiModel(description = "An identified part of the shopping cart. A shopping cart  is decomposed into one or more shopping cart item. Cart item represents a product offering or bundled product offering that user wish to purchase, as well as the pricing of the product offering, reference to product in case of configured characteristic or installation address. Cart items can be related to other cart item to related bundled offerings or reference cart Items to a shipping options")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-12-02T17:25:57.035Z")




public class CartItem   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("ItemTotalPrice")
  @Valid
  private List<CartPrice> itemTotalPrice = null;

  @JsonProperty("action")
  private String action = null;

  @JsonProperty("itemPrice")
  @Valid
  private List<CartPrice> itemPrice = null;

  @JsonProperty("productOffering")
  private ProductOfferingRef productOffering = null;

  public CartItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of the cart item (generally it is a sequence number 01, 02, 03, ...) in the shopping cart
   * @return id
  **/
  @ApiModelProperty(value = "Identifier of the cart item (generally it is a sequence number 01, 02, 03, ...) in the shopping cart")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CartItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Quantity of cart items
   * @return quantity
  **/
  @ApiModelProperty(value = "Quantity of cart items")


  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public CartItem itemTotalPrice(List<CartPrice> itemTotalPrice) {
    this.itemTotalPrice = itemTotalPrice;
    return this;
  }

  public CartItem addItemTotalPriceItem(CartPrice itemTotalPriceItem) {
    if (this.itemTotalPrice == null) {
      this.itemTotalPrice = new ArrayList<CartPrice>();
    }
    this.itemTotalPrice.add(itemTotalPriceItem);
    return this;
  }

  /**
   * Get itemTotalPrice
   * @return itemTotalPrice
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CartPrice> getItemTotalPrice() {
    return itemTotalPrice;
  }

  public void setItemTotalPrice(List<CartPrice> itemTotalPrice) {
    this.itemTotalPrice = itemTotalPrice;
  }

  public CartItem action(String action) {
    this.action = action;
    return this;
  }

  /**
   * The action to be carried out on the Product. Can be: add, modify, delete, noChange
   * @return action
  **/
  @ApiModelProperty(value = "The action to be carried out on the Product. Can be: add, modify, delete, noChange")


  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public CartItem itemPrice(List<CartPrice> itemPrice) {
    this.itemPrice = itemPrice;
    return this;
  }

  public CartItem addItemPriceItem(CartPrice itemPriceItem) {
    if (this.itemPrice == null) {
      this.itemPrice = new ArrayList<CartPrice>();
    }
    this.itemPrice.add(itemPriceItem);
    return this;
  }

  /**
   * Get itemPrice
   * @return itemPrice
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CartPrice> getItemPrice() {
    return itemPrice;
  }

  public void setItemPrice(List<CartPrice> itemPrice) {
    this.itemPrice = itemPrice;
  }

  public CartItem productOffering(ProductOfferingRef productOffering) {
    this.productOffering = productOffering;
    return this;
  }

  /**
   * Get productOffering
   * @return productOffering
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ProductOfferingRef getProductOffering() {
    return productOffering;
  }

  public void setProductOffering(ProductOfferingRef productOffering) {
    this.productOffering = productOffering;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartItem cartItem = (CartItem) o;
    return Objects.equals(this.id, cartItem.id) &&
        Objects.equals(this.quantity, cartItem.quantity) &&
        Objects.equals(this.itemTotalPrice, cartItem.itemTotalPrice) &&
        Objects.equals(this.action, cartItem.action) &&
        Objects.equals(this.itemPrice, cartItem.itemPrice) &&
        Objects.equals(this.productOffering, cartItem.productOffering);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, quantity, itemTotalPrice, action, itemPrice, productOffering);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    itemTotalPrice: ").append(toIndentedString(itemTotalPrice)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    itemPrice: ").append(toIndentedString(itemPrice)).append("\n");
    sb.append("    productOffering: ").append(toIndentedString(productOffering)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

