package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ErrorListType;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Error defined for detail the fault
 */
@ApiModel(description = "Error defined for detail the fault")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-12-02T17:25:57.035Z")




public class GenericFault   {
  @JsonProperty("messageUUID")
  private String messageUUID = null;

  @JsonProperty("responseDate")
  private String responseDate = null;

  @JsonProperty("latency")
  private Integer latency = null;

  @JsonProperty("errorList")
  private ErrorListType errorList = null;

  public GenericFault messageUUID(String messageUUID) {
    this.messageUUID = messageUUID;
    return this;
  }

  /**
   * ID of message
   * @return messageUUID
  **/
  @ApiModelProperty(required = true, value = "ID of message")
  @NotNull


  public String getMessageUUID() {
    return messageUUID;
  }

  public void setMessageUUID(String messageUUID) {
    this.messageUUID = messageUUID;
  }

  public GenericFault responseDate(String responseDate) {
    this.responseDate = responseDate;
    return this;
  }

  /**
   * Date of the response
   * @return responseDate
  **/
  @ApiModelProperty(required = true, value = "Date of the response")
  @NotNull

  @Valid

  public String getResponseDate() {
    return responseDate;
  }

  public void setResponseDate(String responseDate) {
    this.responseDate = responseDate;
  }

  public GenericFault latency(Integer latency) {
    this.latency = latency;
    return this;
  }

  /**
   * Time of the operation execution in milliseconds
   * @return latency
  **/
  @ApiModelProperty(required = true, value = "Time of the operation execution in milliseconds")
  @NotNull


  public Integer getLatency() {
    return latency;
  }

  public void setLatency(Integer latency) {
    this.latency = latency;
  }

  public GenericFault errorList(ErrorListType errorList) {
    this.errorList = errorList;
    return this;
  }

  /**
   * Get errorList
   * @return errorList
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ErrorListType getErrorList() {
    return errorList;
  }

  public void setErrorList(ErrorListType errorList) {
    this.errorList = errorList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericFault genericFault = (GenericFault) o;
    return Objects.equals(this.messageUUID, genericFault.messageUUID) &&
        Objects.equals(this.responseDate, genericFault.responseDate) &&
        Objects.equals(this.latency, genericFault.latency) &&
        Objects.equals(this.errorList, genericFault.errorList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageUUID, responseDate, latency, errorList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericFault {\n");
    
    sb.append("    messageUUID: ").append(toIndentedString(messageUUID)).append("\n");
    sb.append("    responseDate: ").append(toIndentedString(responseDate)).append("\n");
    sb.append("    latency: ").append(toIndentedString(latency)).append("\n");
    sb.append("    errorList: ").append(toIndentedString(errorList)).append("\n");
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

