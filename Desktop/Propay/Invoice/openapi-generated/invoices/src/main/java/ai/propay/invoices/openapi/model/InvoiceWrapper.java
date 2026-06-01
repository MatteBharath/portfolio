package ai.propay.invoices.openapi.model;

import java.net.URI;
import java.util.Objects;
import ai.propay.invoices.openapi.model.Invoice;
import ai.propay.invoices.openapi.model.StInvoice;
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
 * InvoiceWrapper
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-03T16:59:44.174379100+05:30[Asia/Calcutta]", comments = "Generator version: 7.9.0")
public class InvoiceWrapper {

  private StInvoice stIv;

  private Invoice iv;

  public InvoiceWrapper() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public InvoiceWrapper(StInvoice stIv, Invoice iv) {
      this.stIv = stIv;
      this.iv = iv;
  }

  public InvoiceWrapper stIv(StInvoice stIv) {
    this.stIv = stIv;
    return this;
  }

  /**
   * Get stIv
   * @return stIv
   */
  @Valid 
  @Schema(name = "stIv", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stIv")
  public StInvoice getStIv() {
    return stIv;
  }

  public void setStIv(StInvoice stIv) {
    this.stIv = stIv;
  }

  public InvoiceWrapper iv(Invoice iv) {
    this.iv = iv;
    return this;
  }

  /**
   * Get iv
   * @return iv
   */
  @Valid 
  @Schema(name = "iv", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("iv")
  public Invoice getIv() {
    return iv;
  }

  public void setIv(Invoice iv) {
    this.iv = iv;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceWrapper invoiceWrapper = (InvoiceWrapper) o;
    return Objects.equals(this.stIv, invoiceWrapper.stIv) &&
        Objects.equals(this.iv, invoiceWrapper.iv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stIv, iv);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceWrapper {\n");
    sb.append("    stIv: ").append(toIndentedString(stIv)).append("\n");
    sb.append("    iv: ").append(toIndentedString(iv)).append("\n");
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

