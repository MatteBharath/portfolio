package ai.propay.invoices.openapi.model;

import java.net.URI;
import java.util.Objects;
import ai.propay.invoices.openapi.model.AddressInfo;
import ai.propay.invoices.openapi.model.Item;
import ai.propay.invoices.openapi.model.LegalEntityInfo;
import ai.propay.invoices.openapi.model.StatusEnum;
import ai.propay.invoices.openapi.model.VendorModelEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Invoice
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-03T16:59:44.174379100+05:30[Asia/Calcutta]", comments = "Generator version: 7.9.0")
public class Invoice {

  private UUID id;

  private String invoiceId;

  private String propayId;

  private Long invoiceDate;

  private Long dueDate;

  private String billTo;

  private String shipTo;

  private String earlyPaymentDays;

  @Valid
  private List<@Valid Item> items = new ArrayList<>();

  private String subtotal;

  private String totalTax;

  private String totalOrderValue;

  private StatusEnum status;

  private String createdBy;

  private String ownedBy;

  private String supplierId;

  private String supplierUserEmail;

  private String notes;

  private Long revision;

  private Long createdOn;

  private AddressInfo shipToAddress;

  private Long updatedOn;

  private LegalEntityInfo billToEntity;

  private LegalEntityInfo payToEntity;

  private String invoiceNumber;

  private String currency;

  private String poId;

  private VendorModelEnum vendorModel;

  public Invoice() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public Invoice(UUID id, String invoiceId, String propayId, Long invoiceDate, Long dueDate, String billTo, String shipTo, String earlyPaymentDays, List<@Valid Item> items, String subtotal, String totalTax, String totalOrderValue, StatusEnum status, String createdBy, String ownedBy, String supplierId, String supplierUserEmail, String notes, Long revision, Long createdOn, AddressInfo shipToAddress, Long updatedOn, LegalEntityInfo billToEntity, LegalEntityInfo payToEntity, String invoiceNumber, String currency, String poId, VendorModelEnum vendorModel) {
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
      this.currency = currency;
      this.poId = poId;
      this.vendorModel = vendorModel;
  }

  public Invoice id(UUID id) {
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

  public Invoice invoiceId(String invoiceId) {
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

  public Invoice propayId(String propayId) {
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

  public Invoice invoiceDate(Long invoiceDate) {
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

  public Invoice dueDate(Long dueDate) {
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

  public Invoice billTo(String billTo) {
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

  public Invoice shipTo(String shipTo) {
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

  public Invoice earlyPaymentDays(String earlyPaymentDays) {
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

  public Invoice items(List<@Valid Item> items) {
    this.items = items;
    return this;
  }

  public Invoice addItemsItem(Item itemsItem) {
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
  public List<@Valid Item> getItems() {
    return items;
  }

  public void setItems(List<@Valid Item> items) {
    this.items = items;
  }

  public Invoice subtotal(String subtotal) {
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

  public Invoice totalTax(String totalTax) {
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

  public Invoice totalOrderValue(String totalOrderValue) {
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

  public Invoice status(StatusEnum status) {
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
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Invoice createdBy(String createdBy) {
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

  public Invoice ownedBy(String ownedBy) {
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

  public Invoice supplierId(String supplierId) {
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

  public Invoice supplierUserEmail(String supplierUserEmail) {
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

  public Invoice notes(String notes) {
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

  public Invoice revision(Long revision) {
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

  public Invoice createdOn(Long createdOn) {
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

  public Invoice shipToAddress(AddressInfo shipToAddress) {
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
  public AddressInfo getShipToAddress() {
    return shipToAddress;
  }

  public void setShipToAddress(AddressInfo shipToAddress) {
    this.shipToAddress = shipToAddress;
  }

  public Invoice updatedOn(Long updatedOn) {
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

  public Invoice billToEntity(LegalEntityInfo billToEntity) {
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
  public LegalEntityInfo getBillToEntity() {
    return billToEntity;
  }

  public void setBillToEntity(LegalEntityInfo billToEntity) {
    this.billToEntity = billToEntity;
  }

  public Invoice payToEntity(LegalEntityInfo payToEntity) {
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
  public LegalEntityInfo getPayToEntity() {
    return payToEntity;
  }

  public void setPayToEntity(LegalEntityInfo payToEntity) {
    this.payToEntity = payToEntity;
  }

  public Invoice invoiceNumber(String invoiceNumber) {
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

  public Invoice currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  
  @Schema(name = "currency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Invoice poId(String poId) {
    this.poId = poId;
    return this;
  }

  /**
   * Get poId
   * @return poId
   */
  
  @Schema(name = "poId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("poId")
  public String getPoId() {
    return poId;
  }

  public void setPoId(String poId) {
    this.poId = poId;
  }

  public Invoice vendorModel(VendorModelEnum vendorModel) {
    this.vendorModel = vendorModel;
    return this;
  }

  /**
   * Get vendorModel
   * @return vendorModel
   */
  @Valid 
  @Schema(name = "vendorModel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vendorModel")
  public VendorModelEnum getVendorModel() {
    return vendorModel;
  }

  public void setVendorModel(VendorModelEnum vendorModel) {
    this.vendorModel = vendorModel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invoice invoice = (Invoice) o;
    return Objects.equals(this.id, invoice.id) &&
        Objects.equals(this.invoiceId, invoice.invoiceId) &&
        Objects.equals(this.propayId, invoice.propayId) &&
        Objects.equals(this.invoiceDate, invoice.invoiceDate) &&
        Objects.equals(this.dueDate, invoice.dueDate) &&
        Objects.equals(this.billTo, invoice.billTo) &&
        Objects.equals(this.shipTo, invoice.shipTo) &&
        Objects.equals(this.earlyPaymentDays, invoice.earlyPaymentDays) &&
        Objects.equals(this.items, invoice.items) &&
        Objects.equals(this.subtotal, invoice.subtotal) &&
        Objects.equals(this.totalTax, invoice.totalTax) &&
        Objects.equals(this.totalOrderValue, invoice.totalOrderValue) &&
        Objects.equals(this.status, invoice.status) &&
        Objects.equals(this.createdBy, invoice.createdBy) &&
        Objects.equals(this.ownedBy, invoice.ownedBy) &&
        Objects.equals(this.supplierId, invoice.supplierId) &&
        Objects.equals(this.supplierUserEmail, invoice.supplierUserEmail) &&
        Objects.equals(this.notes, invoice.notes) &&
        Objects.equals(this.revision, invoice.revision) &&
        Objects.equals(this.createdOn, invoice.createdOn) &&
        Objects.equals(this.shipToAddress, invoice.shipToAddress) &&
        Objects.equals(this.updatedOn, invoice.updatedOn) &&
        Objects.equals(this.billToEntity, invoice.billToEntity) &&
        Objects.equals(this.payToEntity, invoice.payToEntity) &&
        Objects.equals(this.invoiceNumber, invoice.invoiceNumber) &&
        Objects.equals(this.currency, invoice.currency) &&
        Objects.equals(this.poId, invoice.poId) &&
        Objects.equals(this.vendorModel, invoice.vendorModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, invoiceId, propayId, invoiceDate, dueDate, billTo, shipTo, earlyPaymentDays, items, subtotal, totalTax, totalOrderValue, status, createdBy, ownedBy, supplierId, supplierUserEmail, notes, revision, createdOn, shipToAddress, updatedOn, billToEntity, payToEntity, invoiceNumber, currency, poId, vendorModel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoice {\n");
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
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    poId: ").append(toIndentedString(poId)).append("\n");
    sb.append("    vendorModel: ").append(toIndentedString(vendorModel)).append("\n");
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

