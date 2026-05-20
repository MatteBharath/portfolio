package ai.propay.invoices.openapi.model;

import java.net.URI;
import java.util.Objects;
import ai.propay.invoices.openapi.model.InvoiceList;
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
 * InvoicePage
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-03T16:59:44.174379100+05:30[Asia/Calcutta]", comments = "Generator version: 7.9.0")
public class InvoicePage {

  private InvoiceList invoice;

  private Long totalElements;

  private Integer totalPages;

  private Integer pageNumber;

  private Integer pageSize;

  public InvoicePage() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public InvoicePage(InvoiceList invoice, Long totalElements, Integer totalPages, Integer pageNumber, Integer pageSize) {
      this.invoice = invoice;
      this.totalElements = totalElements;
      this.totalPages = totalPages;
      this.pageNumber = pageNumber;
      this.pageSize = pageSize;
  }

  public InvoicePage invoice(InvoiceList invoice) {
    this.invoice = invoice;
    return this;
  }

  /**
   * Get invoice
   * @return invoice
   */
  @Valid 
  @Schema(name = "Invoice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Invoice")
  public InvoiceList getInvoice() {
    return invoice;
  }

  public void setInvoice(InvoiceList invoice) {
    this.invoice = invoice;
  }

  public InvoicePage totalElements(Long totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Get totalElements
   * @return totalElements
   */
  
  @Schema(name = "totalElements", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalElements")
  public Long getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }

  public InvoicePage totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Get totalPages
   * @return totalPages
   */
  
  @Schema(name = "totalPages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalPages")
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public InvoicePage pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * Get pageNumber
   * @return pageNumber
   */
  
  @Schema(name = "pageNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public InvoicePage pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   * @return pageSize
   */
  
  @Schema(name = "pageSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicePage invoicePage = (InvoicePage) o;
    return Objects.equals(this.invoice, invoicePage.invoice) &&
        Objects.equals(this.totalElements, invoicePage.totalElements) &&
        Objects.equals(this.totalPages, invoicePage.totalPages) &&
        Objects.equals(this.pageNumber, invoicePage.pageNumber) &&
        Objects.equals(this.pageSize, invoicePage.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoice, totalElements, totalPages, pageNumber, pageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicePage {\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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

