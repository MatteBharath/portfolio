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
 * InvoiceEarlyPaymentPatch
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-11T10:57:39.455402400+05:30[Asia/Calcutta]", comments = "Generator version: 7.9.0")
public class InvoiceEarlyPaymentPatch {

  private Long revision;

  private String invoiceNumber;

  private Long invoiceDate;

  private String earlyPaymentDays;

  public InvoiceEarlyPaymentPatch() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public InvoiceEarlyPaymentPatch(Long revision, String invoiceNumber, Long invoiceDate, String earlyPaymentDays) {
      this.revision = revision;
      this.invoiceNumber = invoiceNumber;
      this.invoiceDate = invoiceDate;
      this.earlyPaymentDays = earlyPaymentDays;
  }

  public InvoiceEarlyPaymentPatch revision(Long revision) {
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

  public InvoiceEarlyPaymentPatch invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

  /**
   * Get invoiceNumber
   * @return invoiceNumber
   */
  
  @Schema(name = "invoiceNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invoiceNumber")
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public InvoiceEarlyPaymentPatch invoiceDate(Long invoiceDate) {
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

  public InvoiceEarlyPaymentPatch earlyPaymentDays(String earlyPaymentDays) {
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
    InvoiceEarlyPaymentPatch invoiceEarlyPaymentPatch = (InvoiceEarlyPaymentPatch) o;
    return Objects.equals(this.revision, invoiceEarlyPaymentPatch.revision) &&
        Objects.equals(this.invoiceNumber, invoiceEarlyPaymentPatch.invoiceNumber) &&
        Objects.equals(this.invoiceDate, invoiceEarlyPaymentPatch.invoiceDate) &&
        Objects.equals(this.earlyPaymentDays, invoiceEarlyPaymentPatch.earlyPaymentDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revision, invoiceNumber, invoiceDate, earlyPaymentDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceEarlyPaymentPatch {\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
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

