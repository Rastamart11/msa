package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Error defined for detail the fault
 */
@ApiModel(description = "Error defined for detail the fault")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-12-02T17:25:57.035Z")




public class DetailResType   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("severityLevel")
  private String severityLevel = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("actor")
  private String actor = null;

  @JsonProperty("businessMeaning")
  private String businessMeaning = null;

  public DetailResType code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Application related code
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Application related code")
  @NotNull


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public DetailResType severityLevel(String severityLevel) {
    this.severityLevel = severityLevel;
    return this;
  }

  /**
   * Ifentifies the severity of the transaction
   * @return severityLevel
  **/
  @ApiModelProperty(value = "Ifentifies the severity of the transaction")


  public String getSeverityLevel() {
    return severityLevel;
  }

  public void setSeverityLevel(String severityLevel) {
    this.severityLevel = severityLevel;
  }

  public DetailResType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Text that explains the reason for error.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Text that explains the reason for error.")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DetailResType actor(String actor) {
    this.actor = actor;
    return this;
  }

  /**
   * Response Actor.
   * @return actor
  **/
  @ApiModelProperty(value = "Response Actor.")


  public String getActor() {
    return actor;
  }

  public void setActor(String actor) {
    this.actor = actor;
  }

  public DetailResType businessMeaning(String businessMeaning) {
    this.businessMeaning = businessMeaning;
    return this;
  }

  /**
   * Meaning of the response.
   * @return businessMeaning
  **/
  @ApiModelProperty(value = "Meaning of the response.")


  public String getBusinessMeaning() {
    return businessMeaning;
  }

  public void setBusinessMeaning(String businessMeaning) {
    this.businessMeaning = businessMeaning;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailResType detailResType = (DetailResType) o;
    return Objects.equals(this.code, detailResType.code) &&
        Objects.equals(this.severityLevel, detailResType.severityLevel) &&
        Objects.equals(this.description, detailResType.description) &&
        Objects.equals(this.actor, detailResType.actor) &&
        Objects.equals(this.businessMeaning, detailResType.businessMeaning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, severityLevel, description, actor, businessMeaning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailResType {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    severityLevel: ").append(toIndentedString(severityLevel)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
    sb.append("    businessMeaning: ").append(toIndentedString(businessMeaning)).append("\n");
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

