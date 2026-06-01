package ai.propay.invoices.openapi.model;

import java.net.URI;
import java.util.Objects;
import ai.propay.invoices.openapi.model.AddressInfo2;
import ai.propay.invoices.openapi.model.Item2;
import ai.propay.invoices.openapi.model.LegalEntityInfo2;
import ai.propay.invoices.openapi.model.StatusEnum2;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
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

@Schema(name = "Invoice_2", description = "")
@JsonTypeName("Invoice_2")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-13T14:12:03.064836200+05:30[Asia/Calcutta]", comments = "Generator version: 7.9.0")
public class Invoice2 {

  private UUID id;

  private String invoiceId;

  private String propayId;

  private Long invoiceDate;

  private Long dueDate;

  private String billTo;

  private String shipTo;

  private String earlyPaymentDays;

  @Valid
  private List<@Valid Item2> items = new ArrayList<>();

  private String subtotal;

  private String totalTax;

  private String totalOrderValue;

  private StatusEnum2 status;

  private String createdBy;

  private String ownedBy;

  private String supplierId;

  private String supplierUserEmail;

  private String notes;

  private Long revision;

  private Long createdOn;

  private AddressInfo2 shipToAddress;

  private Long updatedOn;

  private LegalEntityInfo2 billToEntity;

  private LegalEntityInfo2 payToEntity;

  private String invoiceNumber;

  public Invoice2() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public Invoice2(UUID id, String invoiceId, String propayId, Long invoiceDate, Long dueDate, String billTo, String shipTo, String earlyPaymentDays, List<@Valid Item2> items, String subtotal, String totalTax, String totalOrderValue, StatusEnum2 status, String createdBy, String ownedBy, String supplierId, String supplierUserEmail, String notes, Long revision, Long createdOn, AddressInfo2 shipToAddress, Long updatedOn, LegalEntityInfo2 billToEntity, LegalEntityInfo2 payToEntity, String invoiceNumber) {
      this.id = id;
      this.invoiceId = invoiceId;
      this.propayId = propayId;
      this.invoiceDate = invoiceDate;
      this.dueDate = dueDate;
      this.billTo = billTo;
      this.shipTo = shipTo;
      this.earlyPaymentDays = earlyPaymentDays;
      this.items = items;
      this.subtotal = subtotal;
      this.totalTax = totalTax;
      this.totalOrderValue = totalOrderValue;
      this.status = status;
      this.createdBy = createdBy;
      this.ownedBy = ownedBy;
      this.supplierId = supplierId;
      this.supplierUserEmail = supplierUserEmail;
      this.notes = notes;
      this.revision = revision;
      this.createdOn = createdOn;
      this.shipToAddress = shipToAddress;
      this.updatedOn = updatedOn;
      this.billToEntity = billToEntity;
      this.payToEntity = payToEntity;
      this.invoiceNumber = invoiceNumber;
  }

  public Invoice2 id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the invoice
   * @return id
   */
  @Valid 
  @Schema(name = "id", description = "Unique identifier for the invoice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Invoice2 invoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

  /**
   * Unique identifier for the invoice
   * @return invoiceId
   */
  
  @Schema(name = "invoiceId", description = "Unique identifier for the invoice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invoiceId")
  public String getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
  }

  public Invoice2 propayId(String propayId) {
    this.propayId = propayId;
    return this;
  }

  /**
   * Propay Transaction ID
   * @return propayId
   */
  
  @Schema(name = "propayId", description = "Propay Transaction ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("propayId")
  public String getPropayId() {
    return propayId;
  }

  public void setPropayId(String propayId) {
    this.propayId = propayId;
  }

  public Invoice2 invoiceDate(Long invoiceDate) {
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

  public Invoice2 dueDate(Long dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Due date for payment
   * @return dueDate
   */
  
  @Schema(name = "dueDate", description = "Due date for payment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dueDate")
  public Long getDueDate() {
    return dueDate;
  }

  public void setDueDate(Long dueDate) {
    this.dueDate = dueDate;
  }

  public Invoice2 billTo(String billTo) {
    this.billTo = billTo;
    return this;
  }

  /**
   * Get billTo
   * @return billTo
   */
  
  @Schema(name = "billTo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billTo")
  public String getBillTo() {
    return billTo;
  }

  public void setBillTo(String billTo) {
    this.billTo = billTo;
  }

  public Invoice2 shipTo(String shipTo) {
    this.shipTo = shipTo;
    return this;
  }

  /**
   * Get shipTo
   * @return shipTo
   */
  
  @Schema(name = "shipTo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shipTo")
  public String getShipTo() {
    return shipTo;
  }

  public void setShipTo(String shipTo) {
    this.shipTo = shipTo;
  }

  public Invoice2 earlyPaymentDays(String earlyPaymentDays) {
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

  public Invoice2 items(List<@Valid Item2> items) {
    this.items = items;
    return this;
  }

  public Invoice2 addItemsItem(Item2 itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * List of items included in the invoice
   * @return items
   */
  @Valid 
  @Schema(name = "items", description = "List of items included in the invoice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<@Valid Item2> getItems() {
    return items;
  }

  public void setItems(List<@Valid Item2> items) {
    this.items = items;
  }

  public Invoice2 subtotal(String subtotal) {
    this.subtotal = subtotal;
    return this;
  }

  /**
   * Subtotal amount for the invoice
   * @return subtotal
   */
  @Pattern(regexp = "^\\d+(\\.\\d{1,2})?$") 
  @Schema(name = "subtotal", description = "Subtotal amount for the invoice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subtotal")
  public String getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(String subtotal) {
    this.subtotal = subtotal;
  }

  public Invoice2 totalTax(String totalTax) {
    this.totalTax = totalTax;
    return this;
  }

  /**
   * Calculated as a percentage of the subtotal
   * @return totalTax
   */
  @Pattern(regexp = "^\\d+(\\.\\d{1,2})?$") 
  @Schema(name = "totalTax", description = "Calculated as a percentage of the subtotal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalTax")
  public String getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(String totalTax) {
    this.totalTax = totalTax;
  }

  public Invoice2 totalOrderValue(String totalOrderValue) {
    this.totalOrderValue = totalOrderValue;
    return this;
  }

  /**
   * Total amount for the invoice
   * @return totalOrderValue
   */
  @Pattern(regexp = "^\\d+(\\.\\d{1,2})?$") 
  @Schema(name = "totalOrderValue", description = "Total amount for the invoice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalOrderValue")
  public String getTotalOrderValue() {
    return totalOrderValue;
  }

  public void setTotalOrderValue(String totalOrderValue) {
    this.totalOrderValue = totalOrderValue;
  }

  public Invoice2 status(StatusEnum2 status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public StatusEnum2 getStatus() {
    return status;
  }

  public void setStatus(StatusEnum2 status) {
    this.status = status;
  }

  public Invoice2 createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Person who prepared the purchase order
   * @return createdBy
   */
  
  @Schema(name = "createdBy", description = "Person who prepared the purchase order", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdBy")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public Invoice2 ownedBy(String ownedBy) {
    this.ownedBy = ownedBy;
    return this;
  }

  /**
   * Get ownedBy
   * @return ownedBy
   */
  
  @Schema(name = "ownedBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ownedBy")
  public String getOwnedBy() {
    return ownedBy;
  }

  public void setOwnedBy(String ownedBy) {
    this.ownedBy = ownedBy;
  }

  public Invoice2 supplierId(String supplierId) {
    this.supplierId = supplierId;
    return this;
  }

  /**
   * ID of the supplier
   * @return supplierId
   */
  
  @Schema(name = "supplierId", description = "ID of the supplier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supplierId")
  public String getSupplierId() {
    return supplierId;
  }

  public void setSupplierId(String supplierId) {
    this.supplierId = supplierId;
  }

  public Invoice2 supplierUserEmail(String supplierUserEmail) {
    this.supplierUserEmail = supplierUserEmail;
    return this;
  }

  /**
   * Get supplierUserEmail
   * @return supplierUserEmail
   */
  @jakarta.validation.constraints.Email 
  @Schema(name = "supplierUserEmail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supplierUserEmail")
  public String getSupplierUserEmail() {
    return supplierUserEmail;
  }

  public void setSupplierUserEmail(String supplierUserEmail) {
    this.supplierUserEmail = supplierUserEmail;
  }

  public Invoice2 notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Additional notes or comments on the invoice
   * @return notes
   */
  
  @Schema(name = "notes", description = "Additional notes or comments on the invoice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public Invoice2 revision(Long revision) {
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

  public Invoice2 createdOn(Long createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * Date and time when the invoice was created
   * @return createdOn
   */
  
  @Schema(name = "createdOn", description = "Date and time when the invoice was created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdOn")
  public Long getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(Long createdOn) {
    this.createdOn = createdOn;
  }

  public Invoice2 shipToAddress(AddressInfo2 shipToAddress) {
    this.shipToAddress = shipToAddress;
    return this;
  }

  /**
   * Get shipToAddress
   * @return shipToAddress
   */
  @Valid 
  @Schema(name = "shipToAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shipToAddress")
  public AddressInfo2 getShipToAddress() {
    return shipToAddress;
  }

  public void setShipToAddress(AddressInfo2 shipToAddress) {
    this.shipToAddress = shipToAddress;
  }

  public Invoice2 updatedOn(Long updatedOn) {
    this.updatedOn = updatedOn;
    return this;
  }

  /**
   * Date and time when the invoice was last updated
   * @return updatedOn
   */
  
  @Schema(name = "updatedOn", description = "Date and time when the invoice was last updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedOn")
  public Long getUpdatedOn() {
    return updatedOn;
  }

  public void setUpdatedOn(Long updatedOn) {
    this.updatedOn = updatedOn;
  }

  public Invoice2 billToEntity(LegalEntityInfo2 billToEntity) {
    this.billToEntity = billToEntity;
    return this;
  }

  /**
   * Get billToEntity
   * @return billToEntity
   */
  @Valid 
  @Schema(name = "billToEntity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billToEntity")
  public LegalEntityInfo2 getBillToEntity() {
    return billToEntity;
  }

  public void setBillToEntity(LegalEntityInfo2 billToEntity) {
    this.billToEntity = billToEntity;
  }

  public Invoice2 payToEntity(LegalEntityInfo2 payToEntity) {
    this.payToEntity = payToEntity;
    return this;
  }

  /**
   * Get payToEntity
   * @return payToEntity
   */
  @Valid 
  @Schema(name = "payToEntity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("payToEntity")
  public LegalEntityInfo2 getPayToEntity() {
    return payToEntity;
  }

  public void setPayToEntity(LegalEntityInfo2 payToEntity) {
    this.payToEntity = payToEntity;
  }

  public Invoice2 invoiceNumber(String invoiceNumber) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invoice2 invoice2 = (Invoice2) o;
    return Objects.equals(this.id, invoice2.id) &&
        Objects.equals(this.invoiceId, invoice2.invoiceId) &&
        Objects.equals(this.propayId, invoice2.propayId) &&
        Objects.equals(this.invoiceDate, invoice2.invoiceDate) &&
        Objects.equals(this.dueDate, invoice2.dueDate) &&
        Objects.equals(this.billTo, invoice2.billTo) &&
        Objects.equals(this.shipTo, invoice2.shipTo) &&
        Objects.equals(this.earlyPaymentDays, invoice2.earlyPaymentDays) &&
        Objects.equals(this.items, invoice2.items) &&
        Objects.equals(this.subtotal, invoice2.subtotal) &&
        Objects.equals(this.totalTax, invoice2.totalTax) &&
        Objects.equals(this.totalOrderValue, invoice2.totalOrderValue) &&
        Objects.equals(this.status, invoice2.status) &&
        Objects.equals(this.createdBy, invoice2.createdBy) &&
        Objects.equals(this.ownedBy, invoice2.ownedBy) &&
        Objects.equals(this.supplierId, invoice2.supplierId) &&
        Objects.equals(this.supplierUserEmail, invoice2.supplierUserEmail) &&
        Objects.equals(this.notes, invoice2.notes) &&
        Objects.equals(this.revision, invoice2.revision) &&
        Objects.equals(this.createdOn, invoice2.createdOn) &&
        Objects.equals(this.shipToAddress, invoice2.shipToAddress) &&
        Objects.equals(this.updatedOn, invoice2.updatedOn) &&
        Objects.equals(this.billToEntity, invoice2.billToEntity) &&
        Objects.equals(this.payToEntity, invoice2.payToEntity) &&
        Objects.equals(this.invoiceNumber, invoice2.invoiceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, invoiceId, propayId, invoiceDate, dueDate, billTo, shipTo, earlyPaymentDays, items, subtotal, totalTax, totalOrderValue, status, createdBy, ownedBy, supplierId, supplierUserEmail, notes, revision, createdOn, shipToAddress, updatedOn, billToEntity, payToEntity, invoiceNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoice2 {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    propayId: ").append(toIndentedString(propayId)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    billTo: ").append(toIndentedString(billTo)).append("\n");
    sb.append("    shipTo: ").append(toIndentedString(shipTo)).append("\n");
    sb.append("    earlyPaymentDays: ").append(toIndentedString(earlyPaymentDays)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    subtotal: ").append(toIndentedString(subtotal)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
    sb.append("    totalOrderValue: ").append(toIndentedString(totalOrderValue)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    ownedBy: ").append(toIndentedString(ownedBy)).append("\n");
    sb.append("    supplierId: ").append(toIndentedString(supplierId)).append("\n");
    sb.append("    supplierUserEmail: ").append(toIndentedString(supplierUserEmail)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    shipToAddress: ").append(toIndentedString(shipToAddress)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
    sb.append("    billToEntity: ").append(toIndentedString(billToEntity)).append("\n");
    sb.append("    payToEntity: ").append(toIndentedString(payToEntity)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
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

