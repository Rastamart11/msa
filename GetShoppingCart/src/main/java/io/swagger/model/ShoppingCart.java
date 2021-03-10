package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CartItem;
import io.swagger.model.CartPrice;
import io.swagger.model.RelatedParty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Shopping Cart resource is used for the temporarily selection and reservation of product offerings in e-commerce, call center and retail purchase. Shopping cart supports purchase of both physical and digital goods and service (e.g. handset, telecom network service). Shopping Cart contain list of cart items, a reference to customer (partyRole) or contact medium in case customer not exist, and the total items price including promotions
 */
@ApiModel(description = "Shopping Cart resource is used for the temporarily selection and reservation of product offerings in e-commerce, call center and retail purchase. Shopping cart supports purchase of both physical and digital goods and service (e.g. handset, telecom network service). Shopping Cart contain list of cart items, a reference to customer (partyRole) or contact medium in case customer not exist, and the total items price including promotions")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-12-02T17:25:57.035Z")




public class ShoppingCart   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("cartItem")
  @Valid
  private List<CartItem> cartItem = null;

  @JsonProperty("cartTotalPrice")
  @Valid
  private List<CartPrice> cartTotalPrice = null;

  @JsonProperty("relatedParty")
  @Valid
  private List<RelatedParty> relatedParty = null;

  public ShoppingCart id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier created on provider side (e.g. Order Capture system)
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier created on provider side (e.g. Order Capture system)")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ShoppingCart href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink to access the shopping cart
   * @return href
  **/
  @ApiModelProperty(value = "Hyperlink to access the shopping cart")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public ShoppingCart cartItem(List<CartItem> cartItem) {
    this.cartItem = cartItem;
    return this;
  }

  public ShoppingCart addCartItemItem(CartItem cartItemItem) {
    if (this.cartItem == null) {
      this.cartItem = new ArrayList<CartItem>();
    }
    this.cartItem.add(cartItemItem);
    return this;
  }

  /**
   * Get cartItem
   * @return cartItem
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CartItem> getCartItem() {
    return cartItem;
  }

  public void setCartItem(List<CartItem> cartItem) {
    this.cartItem = cartItem;
  }

  public ShoppingCart cartTotalPrice(List<CartPrice> cartTotalPrice) {
    this.cartTotalPrice = cartTotalPrice;
    return this;
  }

  public ShoppingCart addCartTotalPriceItem(CartPrice cartTotalPriceItem) {
    if (this.cartTotalPrice == null) {
      this.cartTotalPrice = new ArrayList<CartPrice>();
    }
    this.cartTotalPrice.add(cartTotalPriceItem);
    return this;
  }

  /**
   * Total amount of the shopping cart, usually of money, that represents the actual price paid by the Customer for cart (considering only \"Active\" cart items)
   * @return cartTotalPrice
  **/
  @ApiModelProperty(value = "Total amount of the shopping cart, usually of money, that represents the actual price paid by the Customer for cart (considering only \"Active\" cart items)")

  @Valid

  public List<CartPrice> getCartTotalPrice() {
    return cartTotalPrice;
  }

  public void setCartTotalPrice(List<CartPrice> cartTotalPrice) {
    this.cartTotalPrice = cartTotalPrice;
  }

  public ShoppingCart relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public ShoppingCart addRelatedPartyItem(RelatedParty relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<RelatedParty>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * Get relatedParty
   * @return relatedParty
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShoppingCart shoppingCart = (ShoppingCart) o;
    return Objects.equals(this.id, shoppingCart.id) &&
        Objects.equals(this.href, shoppingCart.href) &&
        Objects.equals(this.cartItem, shoppingCart.cartItem) &&
        Objects.equals(this.cartTotalPrice, shoppingCart.cartTotalPrice) &&
        Objects.equals(this.relatedParty, shoppingCart.relatedParty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, cartItem, cartTotalPrice, relatedParty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShoppingCart {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    cartItem: ").append(toIndentedString(cartItem)).append("\n");
    sb.append("    cartTotalPrice: ").append(toIndentedString(cartTotalPrice)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
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

