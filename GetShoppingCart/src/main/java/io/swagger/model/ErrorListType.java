package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DetailResType;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * List with the detail of the faults
 */
@ApiModel(description = "List with the detail of the faults")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-12-02T17:25:57.035Z")




public class ErrorListType   {
  @JsonProperty("error")
  @Valid
  private List<DetailResType> error = null;

  public ErrorListType error(List<DetailResType> error) {
    this.error = error;
    return this;
  }

  public ErrorListType addErrorItem(DetailResType errorItem) {
    if (this.error == null) {
      this.error = new ArrayList<DetailResType>();
    }
    this.error.add(errorItem);
    return this;
  }

  /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<DetailResType> getError() {
    return error;
  }

  public void setError(List<DetailResType> error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorListType errorListType = (ErrorListType) o;
    return Objects.equals(this.error, errorListType.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorListType {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

