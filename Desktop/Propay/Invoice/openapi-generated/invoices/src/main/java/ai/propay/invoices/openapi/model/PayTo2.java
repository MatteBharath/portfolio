package ai.propay.invoices.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PayTo2
 */

@JsonTypeName("PayTo_2")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-13T14:12:03.064836200+05:30[Asia/Calcutta]", comments = "Generator version: 7.9.0")
public class PayTo2 {

  private String legalEntityId;

  private String bankId;

  public PayTo2() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public PayTo2(String legalEntityId, String bankId) {
      this.legalEntityId = legalEntityId;
      this.bankId = bankId;
  }

  public PayTo2 legalEntityId(String legalEntityId) {
    this.legalEntityId = legalEntityId;
    return this;
  }

  /**
   * Get legalEntityId
   * @return legalEntityId
   */
  
  @Schema(name = "legalEntityId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("legalEntityId")
  public String getLegalEntityId() {
    return legalEntityId;
  }

  public void setLegalEntityId(String legalEntityId) {
    this.legalEntityId = legalEntityId;
  }

  public PayTo2 bankId(String bankId) {
    this.bankId = bankId;
    return this;
  }

  /**
   * Get bankId
   * @return bankId
   */
  
  @Schema(name = "bankId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bankId")
  public String getBankId() {
    return bankId;
  }

  public void setBankId(String bankId) {
    this.bankId = bankId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayTo2 payTo2 = (PayTo2) o;
    return Objects.equals(this.legalEntityId, payTo2.legalEntityId) &&
        Objects.equals(this.bankId, payTo2.bankId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legalEntityId, bankId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayTo2 {\n");
    sb.append("    legalEntityId: ").append(toIndentedString(legalEntityId)).append("\n");
    sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

