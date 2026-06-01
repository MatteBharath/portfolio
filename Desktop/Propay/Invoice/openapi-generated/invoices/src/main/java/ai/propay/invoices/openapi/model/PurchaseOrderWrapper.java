package ai.propay.invoices.openapi.model;

import java.net.URI;
import java.util.Objects;
import ai.propay.invoices.openapi.model.CustomerTenantPurchaseOrder;
import ai.propay.invoices.openapi.model.PurchaseOrder;
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
 * PurchaseOrderWrapper
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-13T14:12:03.064836200+05:30[Asia/Calcutta]", comments = "Generator version: 7.9.0")
public class PurchaseOrderWrapper {

  private CustomerTenantPurchaseOrder ctPo;

  private PurchaseOrder po;

  public PurchaseOrderWrapper() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public PurchaseOrderWrapper(CustomerTenantPurchaseOrder ctPo, PurchaseOrder po) {
      this.ctPo = ctPo;
      this.po = po;
  }

  public PurchaseOrderWrapper ctPo(CustomerTenantPurchaseOrder ctPo) {
    this.ctPo = ctPo;
    return this;
  }

  /**
   * Get ctPo
   * @return ctPo
   */
  @Valid 
  @Schema(name = "ctPo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ctPo")
  public CustomerTenantPurchaseOrder getCtPo() {
    return ctPo;
  }

  public void setCtPo(CustomerTenantPurchaseOrder ctPo) {
    this.ctPo = ctPo;
  }

  public PurchaseOrderWrapper po(PurchaseOrder po) {
    this.po = po;
    return this;
  }

  /**
   * Get po
   * @return po
   */
  @Valid 
  @Schema(name = "po", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("po")
  public PurchaseOrder getPo() {
    return po;
  }

  public void setPo(PurchaseOrder po) {
    this.po = po;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseOrderWrapper purchaseOrderWrapper = (PurchaseOrderWrapper) o;
    return Objects.equals(this.ctPo, purchaseOrderWrapper.ctPo) &&
        Objects.equals(this.po, purchaseOrderWrapper.po);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ctPo, po);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseOrderWrapper {\n");
    sb.append("    ctPo: ").append(toIndentedString(ctPo)).append("\n");
    sb.append("    po: ").append(toIndentedString(po)).append("\n");
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

