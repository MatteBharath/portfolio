package ai.propay.invoices.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PayTo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-03T16:59:44.174379100+05:30[Asia/Calcutta]", comments = "Generator version: 7.9.0")
public class PayTo {

  private String legalEntityId;

  private String bankId;

  public PayTo() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public PayTo(String legalEntityId, String bankId) {
      this.legalEntityId = legalEntityId;
      this.bankId = bankId;
  }

  public PayTo legalEntityId(String legalEntityId) {
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

  public PayTo bankId(String bankId) {
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
    PayTo payTo = (PayTo) o;
    return Objects.equals(this.legalEntityId, payTo.legalEntityId) &&
        Objects.equals(this.bankId, payTo.bankId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legalEntityId, bankId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayTo {\n");
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

