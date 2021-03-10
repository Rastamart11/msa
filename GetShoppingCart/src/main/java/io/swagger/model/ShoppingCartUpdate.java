package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CartItem;
import io.swagger.model.RelatedParty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Shopping Cart resource is used for the temporarily selection and reservation of product offerings in e-commerce, call center and retail purchase. Shopping cart supports purchase of both physical and digital goods and service (e.g. handset, telecom network service). Shopping Cart contain list of cart items, a reference to customer (partyRole) or contact medium in case customer not exist, and the total items price including promotions Skipped properties: id,href,validFor,cartTotalPrice
 */
@ApiModel(description = "Shopping Cart resource is used for the temporarily selection and reservation of product offerings in e-commerce, call center and retail purchase. Shopping cart supports purchase of both physical and digital goods and service (e.g. handset, telecom network service). Shopping Cart contain list of cart items, a reference to customer (partyRole) or contact medium in case customer not exist, and the total items price including promotions Skipped properties: id,href,validFor,cartTotalPrice")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-12-02T17:25:57.035Z")




public class ShoppingCartUpdate   {
  @JsonProperty("cartItem")
  @Valid
  private List<CartItem> cartItem = null;

  @JsonProperty("relatedParty")
  @Valid
  private List<RelatedParty> relatedParty = null;

  public ShoppingCartUpdate cartItem(List<CartItem> cartItem) {
    this.cartItem = cartItem;
    return this;
  }

  public ShoppingCartUpdate addCartItemItem(CartItem cartItemItem) {
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

  public ShoppingCartUpdate relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public ShoppingCartUpdate addRelatedPartyItem(RelatedParty relatedPartyItem) {
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
    ShoppingCartUpdate shoppingCartUpdate = (ShoppingCartUpdate) o;
    return Objects.equals(this.cartItem, shoppingCartUpdate.cartItem) &&
        Objects.equals(this.relatedParty, shoppingCartUpdate.relatedParty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartItem, relatedParty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShoppingCartUpdate {\n");
    
    sb.append("    cartItem: ").append(toIndentedString(cartItem)).append("\n");
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

