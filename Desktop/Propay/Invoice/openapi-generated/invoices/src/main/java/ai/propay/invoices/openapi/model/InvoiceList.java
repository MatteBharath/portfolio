package ai.propay.invoices.openapi.model;

import java.net.URI;
import java.util.Objects;
import ai.propay.invoices.openapi.model.Invoice;
import ai.propay.invoices.openapi.model.StInvoice;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * InvoiceList
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-03T16:59:44.174379100+05:30[Asia/Calcutta]", comments = "Generator version: 7.9.0")
public class InvoiceList {

  @Valid
  private List<@Valid StInvoice> stivList = new ArrayList<>();

  @Valid
  private List<@Valid Invoice> ivList = new ArrayList<>();

  public InvoiceList() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public InvoiceList(List<@Valid StInvoice> stivList, List<@Valid Invoice> ivList) {
      this.stivList = stivList;
      this.ivList = ivList;
  }

  public InvoiceList stivList(List<@Valid StInvoice> stivList) {
    this.stivList = stivList;
    return this;
  }

  public InvoiceList addStivListItem(StInvoice stivListItem) {
    if (this.stivList == null) {
      this.stivList = new ArrayList<>();
    }
    this.stivList.add(stivListItem);
    return this;
  }

  /**
   * Get stivList
   * @return stivList
   */
  @Valid 
  @Schema(name = "stivList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stivList")
  public List<@Valid StInvoice> getStivList() {
    return stivList;
  }

  public void setStivList(List<@Valid StInvoice> stivList) {
    this.stivList = stivList;
  }

  public InvoiceList ivList(List<@Valid Invoice> ivList) {
    this.ivList = ivList;
    return this;
  }

  public InvoiceList addIvListItem(Invoice ivListItem) {
    if (this.ivList == null) {
      this.ivList = new ArrayList<>();
    }
    this.ivList.add(ivListItem);
    return this;
  }

  /**
   * Get ivList
   * @return ivList
   */
  @Valid 
  @Schema(name = "ivList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ivList")
  public List<@Valid Invoice> getIvList() {
    return ivList;
  }

  public void setIvList(List<@Valid Invoice> ivList) {
    this.ivList = ivList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceList invoiceList = (InvoiceList) o;
    return Objects.equals(this.stivList, invoiceList.stivList) &&
        Objects.equals(this.ivList, invoiceList.ivList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stivList, ivList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceList {\n");
    sb.append("    stivList: ").append(toIndentedString(stivList)).append("\n");
    sb.append("    ivList: ").append(toIndentedString(ivList)).append("\n");
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

