package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Money;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Provides all amounts (tax included, duty free, tax rate), used currency and percentage to apply for Price Alteration.
 */
@ApiModel(description = "Provides all amounts (tax included, duty free, tax rate), used currency and percentage to apply for Price Alteration.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-12-02T17:25:57.035Z")




public class Price   {
  @JsonProperty("percentage")
  private Float percentage = null;

  @JsonProperty("taxRate")
  private Float taxRate = null;

  @JsonProperty("dutyFreeAmount")
  private Money dutyFreeAmount = null;

  @JsonProperty("taxIncludedAmount")
  private Money taxIncludedAmount = null;

  public Price percentage(Float percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * Percentage to apply for ProdOfferPriceAlteration
   * @return percentage
  **/
  @ApiModelProperty(value = "Percentage to apply for ProdOfferPriceAlteration")


  public Float getPercentage() {
    return percentage;
  }

  public void setPercentage(Float percentage) {
    this.percentage = percentage;
  }

  public Price taxRate(Float taxRate) {
    this.taxRate = taxRate;
    return this;
  }

  /**
   * Tax rate
   * @return taxRate
  **/
  @ApiModelProperty(value = "Tax rate")


  public Float getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(Float taxRate) {
    this.taxRate = taxRate;
  }

  public Price dutyFreeAmount(Money dutyFreeAmount) {
    this.dutyFreeAmount = dutyFreeAmount;
    return this;
  }

  /**
   * All taxes excluded amount (expressed in the given currency)
   * @return dutyFreeAmount
  **/
  @ApiModelProperty(value = "All taxes excluded amount (expressed in the given currency)")

  @Valid

  public Money getDutyFreeAmount() {
    return dutyFreeAmount;
  }

  public void setDutyFreeAmount(Money dutyFreeAmount) {
    this.dutyFreeAmount = dutyFreeAmount;
  }

  public Price taxIncludedAmount(Money taxIncludedAmount) {
    this.taxIncludedAmount = taxIncludedAmount;
    return this;
  }

  /**
   * All taxes included amount (expressed in the given currency)
   * @return taxIncludedAmount
  **/
  @ApiModelProperty(value = "All taxes included amount (expressed in the given currency)")

  @Valid

  public Money getTaxIncludedAmount() {
    return taxIncludedAmount;
  }

  public void setTaxIncludedAmount(Money taxIncludedAmount) {
    this.taxIncludedAmount = taxIncludedAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Price price = (Price) o;
    return Objects.equals(this.percentage, price.percentage) &&
        Objects.equals(this.taxRate, price.taxRate) &&
        Objects.equals(this.dutyFreeAmount, price.dutyFreeAmount) &&
        Objects.equals(this.taxIncludedAmount, price.taxIncludedAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentage, taxRate, dutyFreeAmount, taxIncludedAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Price {\n");
    
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    dutyFreeAmount: ").append(toIndentedString(dutyFreeAmount)).append("\n");
    sb.append("    taxIncludedAmount: ").append(toIndentedString(taxIncludedAmount)).append("\n");
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

