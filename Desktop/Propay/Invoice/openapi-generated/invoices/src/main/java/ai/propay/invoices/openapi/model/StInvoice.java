package ai.propay.invoices.openapi.model;

import java.net.URI;
import java.util.Objects;
import ai.propay.invoices.openapi.model.AddressInfo;
import ai.propay.invoices.openapi.model.InvoiceFile;
import ai.propay.invoices.openapi.model.Item;
import ai.propay.invoices.openapi.model.LegalEntityInfo;
import ai.propay.invoices.openapi.model.StatusEnum;
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
 * StInvoice
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-03T16:59:44.174379100+05:30[Asia/Calcutta]", comments = "Generator version: 7.9.0")
public class StInvoice {

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

  private StatusEnum invoiceStatus;

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

  @Valid
  private List<@Valid InvoiceFile> files = new ArrayList<>();

  private Long requestedInvoiceDate;

  private Integer daysToPercentRatio;

  @Valid
  private List<String> tags = new ArrayList<>();

  public StInvoice() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public StInvoice(UUID id, String invoiceId, String propayId, Long invoiceDate, Long dueDate, String billTo, String shipTo, String earlyPaymentDays, List<@Valid Item> items, String subtotal, String totalTax, String totalOrderValue, StatusEnum invoiceStatus, String createdBy, String ownedBy, String supplierId, String supplierUserEmail, String notes, Long revision, Long createdOn, AddressInfo shipToAddress, Long updatedOn, LegalEntityInfo billToEntity, LegalEntityInfo payToEntity, List<@Valid InvoiceFile> files, Long requestedInvoiceDate, Integer daysToPercentRatio, List<String> tags) {
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
      this.invoiceStatus = invoiceStatus;
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
      this.files = files;
      this.requestedInvoiceDate = requestedInvoiceDate;
      this.daysToPercentRatio = daysToPercentRatio;
      this.tags = tags;
  }

  public StInvoice id(UUID id) {
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

  public StInvoice invoiceId(String invoiceId) {
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

  public StInvoice propayId(String propayId) {
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

  public StInvoice invoiceDate(Long invoiceDate) {
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

  public StInvoice dueDate(Long dueDate) {
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

  public StInvoice billTo(String billTo) {
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

  public StInvoice shipTo(String shipTo) {
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

  public StInvoice earlyPaymentDays(String earlyPaymentDays) {
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

  public StInvoice items(List<@Valid Item> items) {
    this.items = items;
    return this;
  }

  public StInvoice addItemsItem(Item itemsItem) {
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

  public StInvoice subtotal(String subtotal) {
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

  public StInvoice totalTax(String totalTax) {
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

  public StInvoice totalOrderValue(String totalOrderValue) {
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

  public StInvoice invoiceStatus(StatusEnum invoiceStatus) {
    this.invoiceStatus = invoiceStatus;
    return this;
  }

  /**
   * Get invoiceStatus
   * @return invoiceStatus
   */
  @Valid 
  @Schema(name = "InvoiceStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("InvoiceStatus")
  public StatusEnum getInvoiceStatus() {
    return invoiceStatus;
  }

  public void setInvoiceStatus(StatusEnum invoiceStatus) {
    this.invoiceStatus = invoiceStatus;
  }

  public StInvoice createdBy(String createdBy) {
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

  public StInvoice ownedBy(String ownedBy) {
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

  public StInvoice supplierId(String supplierId) {
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

  public StInvoice supplierUserEmail(String supplierUserEmail) {
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

  public StInvoice notes(String notes) {
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

  public StInvoice revision(Long revision) {
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

  public StInvoice createdOn(Long createdOn) {
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

  public StInvoice shipToAddress(AddressInfo shipToAddress) {
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

  public StInvoice updatedOn(Long updatedOn) {
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

  public StInvoice billToEntity(LegalEntityInfo billToEntity) {
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

  public StInvoice payToEntity(LegalEntityInfo payToEntity) {
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

  public StInvoice files(List<@Valid InvoiceFile> files) {
    this.files = files;
    return this;
  }

  public StInvoice addFilesItem(InvoiceFile filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<>();
    }
    this.files.add(filesItem);
    return this;
  }

  /**
   * Get files
   * @return files
   */
  @Valid 
  @Schema(name = "files", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("files")
  public List<@Valid InvoiceFile> getFiles() {
    return files;
  }

  public void setFiles(List<@Valid InvoiceFile> files) {
    this.files = files;
  }

  public StInvoice requestedInvoiceDate(Long requestedInvoiceDate) {
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

  public StInvoice daysToPercentRatio(Integer daysToPercentRatio) {
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

  public StInvoice tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public StInvoice addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  
  @Schema(name = "tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StInvoice stInvoice = (StInvoice) o;
    return Objects.equals(this.id, stInvoice.id) &&
        Objects.equals(this.invoiceId, stInvoice.invoiceId) &&
        Objects.equals(this.propayId, stInvoice.propayId) &&
        Objects.equals(this.invoiceDate, stInvoice.invoiceDate) &&
        Objects.equals(this.dueDate, stInvoice.dueDate) &&
        Objects.equals(this.billTo, stInvoice.billTo) &&
        Objects.equals(this.shipTo, stInvoice.shipTo) &&
        Objects.equals(this.earlyPaymentDays, stInvoice.earlyPaymentDays) &&
        Objects.equals(this.items, stInvoice.items) &&
        Objects.equals(this.subtotal, stInvoice.subtotal) &&
        Objects.equals(this.totalTax, stInvoice.totalTax) &&
        Objects.equals(this.totalOrderValue, stInvoice.totalOrderValue) &&
        Objects.equals(this.invoiceStatus, stInvoice.invoiceStatus) &&
        Objects.equals(this.createdBy, stInvoice.createdBy) &&
        Objects.equals(this.ownedBy, stInvoice.ownedBy) &&
        Objects.equals(this.supplierId, stInvoice.supplierId) &&
        Objects.equals(this.supplierUserEmail, stInvoice.supplierUserEmail) &&
        Objects.equals(this.notes, stInvoice.notes) &&
        Objects.equals(this.revision, stInvoice.revision) &&
        Objects.equals(this.createdOn, stInvoice.createdOn) &&
        Objects.equals(this.shipToAddress, stInvoice.shipToAddress) &&
        Objects.equals(this.updatedOn, stInvoice.updatedOn) &&
        Objects.equals(this.billToEntity, stInvoice.billToEntity) &&
        Objects.equals(this.payToEntity, stInvoice.payToEntity) &&
        Objects.equals(this.files, stInvoice.files) &&
        Objects.equals(this.requestedInvoiceDate, stInvoice.requestedInvoiceDate) &&
        Objects.equals(this.daysToPercentRatio, stInvoice.daysToPercentRatio) &&
        Objects.equals(this.tags, stInvoice.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, invoiceId, propayId, invoiceDate, dueDate, billTo, shipTo, earlyPaymentDays, items, subtotal, totalTax, totalOrderValue, invoiceStatus, createdBy, ownedBy, supplierId, supplierUserEmail, notes, revision, createdOn, shipToAddress, updatedOn, billToEntity, payToEntity, files, requestedInvoiceDate, daysToPercentRatio, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StInvoice {\n");
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
    sb.append("    invoiceStatus: ").append(toIndentedString(invoiceStatus)).append("\n");
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
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    requestedInvoiceDate: ").append(toIndentedString(requestedInvoiceDate)).append("\n");
    sb.append("    daysToPercentRatio: ").append(toIndentedString(daysToPercentRatio)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

