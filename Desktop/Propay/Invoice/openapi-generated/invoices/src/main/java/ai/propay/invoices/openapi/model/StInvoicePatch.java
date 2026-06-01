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
 * StInvoicePatch
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-18T11:39:06.956952600+05:30[Asia/Calcutta]", comments = "Generator version: 7.9.0")
public class StInvoicePatch {

  private Long revision;

  private String invoiceId;

  private Long invoiceDate;

  private String earlyPaymentDays;

  public StInvoicePatch() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public StInvoicePatch(Long revision, String invoiceId, Long invoiceDate, String earlyPaymentDays) {
      this.revision = revision;
      this.invoiceId = invoiceId;
      this.invoiceDate = invoiceDate;
      this.earlyPaymentDays = earlyPaymentDays;
  }

  public StInvoicePatch revision(Long revision) {
    this.revision = revision;
    return this;
  }

  /**
   * Get revision
   * @return revision
   */
  
  @Schema(name = "revision", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("revision")
  public Long getRevision() {
    return revision;
  }

  public void setRevision(Long revision) {
    this.revision = revision;
  }

  public StInvoicePatch invoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

  /**
   * Get invoiceId
   * @return invoiceId
   */
  
  @Schema(name = "invoiceId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invoiceId")
  public String getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
  }

  public StInvoicePatch invoiceDate(Long invoiceDate) {
    this.invoiceDate = invoiceDate;
    return this;
  }

  /**
   * Get invoiceDate
   * @return invoiceDate
   */
  
  @Schema(name = "invoiceDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invoiceDate")
  public Long getInvoiceDate() {
    return invoiceDate;
  }

  public void setInvoiceDate(Long invoiceDate) {
    this.invoiceDate = invoiceDate;
  }

  public StInvoicePatch earlyPaymentDays(String earlyPaymentDays) {
    this.earlyPaymentDays = earlyPaymentDays;
    return this;
  }

  /**
   * Get earlyPaymentDays
   * @return earlyPaymentDays
   */
  
  @Schema(name = "earlyPaymentDays", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("earlyPaymentDays")
  public String getEarlyPaymentDays() {
    return earlyPaymentDays;
  }

  public void setEarlyPaymentDays(String earlyPaymentDays) {
    this.earlyPaymentDays = earlyPaymentDays;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StInvoicePatch stInvoicePatch = (StInvoicePatch) o;
    return Objects.equals(this.revision, stInvoicePatch.revision) &&
        Objects.equals(this.invoiceId, stInvoicePatch.invoiceId) &&
        Objects.equals(this.invoiceDate, stInvoicePatch.invoiceDate) &&
        Objects.equals(this.earlyPaymentDays, stInvoicePatch.earlyPaymentDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revision, invoiceId, invoiceDate, earlyPaymentDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StInvoicePatch {\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    earlyPaymentDays: ").append(toIndentedString(earlyPaymentDays)).append("\n");
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

