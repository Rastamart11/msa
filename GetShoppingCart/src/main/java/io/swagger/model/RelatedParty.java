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
 * Related Entity reference. A related party defines party or party role linked to a specific entity.
 */
@ApiModel(description = "Related Entity reference. A related party defines party or party role linked to a specific entity.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-12-02T17:25:57.035Z")




public class RelatedParty   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("identifierType")
  private String identifierType = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("role")
  private String role = null;

  public RelatedParty id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of a related entity.
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of a related entity.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RelatedParty identifierType(String identifierType) {
    this.identifierType = identifierType;
    return this;
  }

  /**
   * Get identifierType
   * @return identifierType
  **/
  @ApiModelProperty(value = "")


  public String getIdentifierType() {
    return identifierType;
  }

  public void setIdentifierType(String identifierType) {
    this.identifierType = identifierType;
  }

  public RelatedParty href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Reference of the related entity.
   * @return href
  **/
  @ApiModelProperty(value = "Reference of the related entity.")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public RelatedParty name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the related entity.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the related entity.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RelatedParty role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Role played by the related party
   * @return role
  **/
  @ApiModelProperty(value = "Role played by the related party")


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedParty relatedParty = (RelatedParty) o;
    return Objects.equals(this.id, relatedParty.id) &&
        Objects.equals(this.identifierType, relatedParty.identifierType) &&
        Objects.equals(this.href, relatedParty.href) &&
        Objects.equals(this.name, relatedParty.name) &&
        Objects.equals(this.role, relatedParty.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, identifierType, href, name, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedParty {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identifierType: ").append(toIndentedString(identifierType)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

