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
 * 
 */

@Schema(name = "InvoicePatch", description = "")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-03T16:59:44.174379100+05:30[Asia/Calcutta]", comments = "Generator version: 7.9.0")
public class InvoicePatch {

  private Long revision;

  private Long requestedInvoiceDate;

  private Integer daysToPercentRatio;

  private String invoiceId;

  private Long invoiceDate;

  public InvoicePatch() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public InvoicePatch(Long revision, Long requestedInvoiceDate, Integer daysToPercentRatio, String invoiceId, Long invoiceDate) {
      this.revision = revision;
      this.requestedInvoiceDate = requestedInvoiceDate;
      this.daysToPercentRatio = daysToPercentRatio;
      this.invoiceId = invoiceId;
      this.invoiceDate = invoiceDate;
  }

  public InvoicePatch revision(Long revision) {
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

  public InvoicePatch requestedInvoiceDate(Long requestedInvoiceDate) {
    this.requestedInvoiceDate = requestedInvoiceDate;
    return this;
  }

  /**
   * Get requestedInvoiceDate
   * @return requestedInvoiceDate
   */
  
  @Schema(name = "requestedInvoiceDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestedInvoiceDate")
  public Long getRequestedInvoiceDate() {
    return requestedInvoiceDate;
  }

  public void setRequestedInvoiceDate(Long requestedInvoiceDate) {
    this.requestedInvoiceDate = requestedInvoiceDate;
  }

  public InvoicePatch daysToPercentRatio(Integer daysToPercentRatio) {
    this.daysToPercentRatio = daysToPercentRatio;
    return this;
  }

  /**
   * Get daysToPercentRatio
   * @return daysToPercentRatio
   */
  
  @Schema(name = "daysToPercentRatio", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("daysToPercentRatio")
  public Integer getDaysToPercentRatio() {
    return daysToPercentRatio;
  }

  public void setDaysToPercentRatio(Integer daysToPercentRatio) {
    this.daysToPercentRatio = daysToPercentRatio;
  }

  public InvoicePatch invoiceId(String invoiceId) {
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

  public InvoicePatch invoiceDate(Long invoiceDate) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicePatch invoicePatch = (InvoicePatch) o;
    return Objects.equals(this.revision, invoicePatch.revision) &&
        Objects.equals(this.requestedInvoiceDate, invoicePatch.requestedInvoiceDate) &&
        Objects.equals(this.daysToPercentRatio, invoicePatch.daysToPercentRatio) &&
        Objects.equals(this.invoiceId, invoicePatch.invoiceId) &&
        Objects.equals(this.invoiceDate, invoicePatch.invoiceDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revision, requestedInvoiceDate, daysToPercentRatio, invoiceId, invoiceDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicePatch {\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    requestedInvoiceDate: ").append(toIndentedString(requestedInvoiceDate)).append("\n");
    sb.append("    daysToPercentRatio: ").append(toIndentedString(daysToPercentRatio)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
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

