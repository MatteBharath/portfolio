package ai.propay.invoices.openapi.model;

import java.net.URI;
import java.util.Objects;
import ai.propay.invoices.openapi.model.AddressInfo;
import ai.propay.invoices.openapi.model.Item;
import ai.propay.invoices.openapi.model.LegalEntityInfo;
import ai.propay.invoices.openapi.model.OrderFile;
import ai.propay.invoices.openapi.model.PayTo;
import ai.propay.invoices.openapi.model.ServiceScheduleDetails;
import ai.propay.invoices.openapi.model.ShippingDetails;
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
 * CustomerTenantPurchaseOrder
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-13T14:12:03.064836200+05:30[Asia/Calcutta]", comments = "Generator version: 7.9.0")
public class CustomerTenantPurchaseOrder {

  private UUID id;

  private String poId;

  private String propayId;

  private String supplierId;

  private String supplierUserEmail;

  private Long createdOn;

  private String totalTax;

  @Valid
  private List<@Valid Item> items = new ArrayList<>();

  private String totalOrderValue;

  private String currency;

  private String createdBy;

  private String ownedBy;

  private String approvedBy;

  private Long promisedDate;

  private Long deliveredDate;

  private String shipTo;

  private String billTo;

  private String paymentTerms;

  private String termsAndConditions;

  private String notes;

  private StatusEnum orderStatus;

  @Valid
  private List<@Valid OrderFile> files = new ArrayList<>();

  @Valid
  private List<String> tags = new ArrayList<>();

  private Long revision;

  private String trackingNumber;

  private String deliveryPartner;

  private ShippingDetails shippingDetails;

  private ServiceScheduleDetails serviceScheduleDetails;

  private PayTo payTo;

  private AddressInfo shipToAddress;

  private LegalEntityInfo billToEntity;

  private LegalEntityInfo payToEntity;

  public CustomerTenantPurchaseOrder() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public CustomerTenantPurchaseOrder(UUID id, String poId, String propayId, String supplierId, String supplierUserEmail, Long createdOn, String totalTax, List<@Valid Item> items, String totalOrderValue, String currency, String createdBy, String ownedBy, String approvedBy, Long promisedDate, Long deliveredDate, String shipTo, String billTo, String paymentTerms, String termsAndConditions, String notes, StatusEnum orderStatus, List<@Valid OrderFile> files, List<String> tags, Long revision, String trackingNumber, String deliveryPartner, ShippingDetails shippingDetails, ServiceScheduleDetails serviceScheduleDetails, PayTo payTo, AddressInfo shipToAddress, LegalEntityInfo billToEntity, LegalEntityInfo payToEntity) {
      this.id = id;
      this.poId = poId;
      this.propayId = propayId;
      this.supplierId = supplierId;
      this.supplierUserEmail = supplierUserEmail;
      this.createdOn = createdOn;
      this.totalTax = totalTax;
      this.items = items;
      this.totalOrderValue = totalOrderValue;
      this.currency = currency;
      this.createdBy = createdBy;
      this.ownedBy = ownedBy;
      this.approvedBy = approvedBy;
      this.promisedDate = promisedDate;
      this.deliveredDate = deliveredDate;
      this.shipTo = shipTo;
      this.billTo = billTo;
      this.paymentTerms = paymentTerms;
      this.termsAndConditions = termsAndConditions;
      this.notes = notes;
      this.orderStatus = orderStatus;
      this.files = files;
      this.tags = tags;
      this.revision = revision;
      this.trackingNumber = trackingNumber;
      this.deliveryPartner = deliveryPartner;
      this.shippingDetails = shippingDetails;
      this.serviceScheduleDetails = serviceScheduleDetails;
      this.payTo = payTo;
      this.shipToAddress = shipToAddress;
      this.billToEntity = billToEntity;
      this.payToEntity = payToEntity;
  }

  public CustomerTenantPurchaseOrder id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the Purchase Request
   * @return id
   */
  @Valid 
  @Schema(name = "id", description = "Unique identifier for the Purchase Request", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public CustomerTenantPurchaseOrder poId(String poId) {
    this.poId = poId;
    return this;
  }

  /**
   * Purchase Request ID
   * @return poId
   */
  
  @Schema(name = "poId", description = "Purchase Request ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("poId")
  public String getPoId() {
    return poId;
  }

  public void setPoId(String poId) {
    this.poId = poId;
  }

  public CustomerTenantPurchaseOrder propayId(String propayId) {
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

  public CustomerTenantPurchaseOrder supplierId(String supplierId) {
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

  public CustomerTenantPurchaseOrder supplierUserEmail(String supplierUserEmail) {
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

  public CustomerTenantPurchaseOrder createdOn(Long createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * Date when the purchase order was created
   * @return createdOn
   */
  
  @Schema(name = "createdOn", description = "Date when the purchase order was created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdOn")
  public Long getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(Long createdOn) {
    this.createdOn = createdOn;
  }

  public CustomerTenantPurchaseOrder totalTax(String totalTax) {
    this.totalTax = totalTax;
    return this;
  }

  /**
   * Tax value of all the items
   * @return totalTax
   */
  @Pattern(regexp = "^\\d+(\\.\\d{1,2})?$") 
  @Schema(name = "totalTax", example = "0.00", description = "Tax value of all the items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalTax")
  public String getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(String totalTax) {
    this.totalTax = totalTax;
  }

  public CustomerTenantPurchaseOrder items(List<@Valid Item> items) {
    this.items = items;
    return this;
  }

  public CustomerTenantPurchaseOrder addItemsItem(Item itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
   */
  @Valid 
  @Schema(name = "items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<@Valid Item> getItems() {
    return items;
  }

  public void setItems(List<@Valid Item> items) {
    this.items = items;
  }

  public CustomerTenantPurchaseOrder totalOrderValue(String totalOrderValue) {
    this.totalOrderValue = totalOrderValue;
    return this;
  }

  /**
   * Total amount of the purchase order
   * @return totalOrderValue
   */
  @Pattern(regexp = "^\\d+(\\.\\d{2})?$") 
  @Schema(name = "totalOrderValue", example = "0.00", description = "Total amount of the purchase order", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalOrderValue")
  public String getTotalOrderValue() {
    return totalOrderValue;
  }

  public void setTotalOrderValue(String totalOrderValue) {
    this.totalOrderValue = totalOrderValue;
  }

  public CustomerTenantPurchaseOrder currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency of the totalAmount
   * @return currency
   */
  
  @Schema(name = "currency", description = "Currency of the totalAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public CustomerTenantPurchaseOrder createdBy(String createdBy) {
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

  public CustomerTenantPurchaseOrder ownedBy(String ownedBy) {
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

  public CustomerTenantPurchaseOrder approvedBy(String approvedBy) {
    this.approvedBy = approvedBy;
    return this;
  }

  /**
   * Person who approved the purchase order
   * @return approvedBy
   */
  
  @Schema(name = "approvedBy", description = "Person who approved the purchase order", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("approvedBy")
  public String getApprovedBy() {
    return approvedBy;
  }

  public void setApprovedBy(String approvedBy) {
    this.approvedBy = approvedBy;
  }

  public CustomerTenantPurchaseOrder promisedDate(Long promisedDate) {
    this.promisedDate = promisedDate;
    return this;
  }

  /**
   * Expected delivery date of the items
   * @return promisedDate
   */
  
  @Schema(name = "promisedDate", description = "Expected delivery date of the items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("promisedDate")
  public Long getPromisedDate() {
    return promisedDate;
  }

  public void setPromisedDate(Long promisedDate) {
    this.promisedDate = promisedDate;
  }

  public CustomerTenantPurchaseOrder deliveredDate(Long deliveredDate) {
    this.deliveredDate = deliveredDate;
    return this;
  }

  /**
   * Actual delivery date
   * @return deliveredDate
   */
  
  @Schema(name = "deliveredDate", description = "Actual delivery date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deliveredDate")
  public Long getDeliveredDate() {
    return deliveredDate;
  }

  public void setDeliveredDate(Long deliveredDate) {
    this.deliveredDate = deliveredDate;
  }

  public CustomerTenantPurchaseOrder shipTo(String shipTo) {
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

  public CustomerTenantPurchaseOrder billTo(String billTo) {
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

  public CustomerTenantPurchaseOrder paymentTerms(String paymentTerms) {
    this.paymentTerms = paymentTerms;
    return this;
  }

  /**
   * Payment terms agreed upon
   * @return paymentTerms
   */
  
  @Schema(name = "paymentTerms", description = "Payment terms agreed upon", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentTerms")
  public String getPaymentTerms() {
    return paymentTerms;
  }

  public void setPaymentTerms(String paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

  public CustomerTenantPurchaseOrder termsAndConditions(String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
    return this;
  }

  /**
   * Terms and conditions of the purchase
   * @return termsAndConditions
   */
  
  @Schema(name = "termsAndConditions", description = "Terms and conditions of the purchase", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("termsAndConditions")
  public String getTermsAndConditions() {
    return termsAndConditions;
  }

  public void setTermsAndConditions(String termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
  }

  public CustomerTenantPurchaseOrder notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Additional notes or comments
   * @return notes
   */
  
  @Schema(name = "notes", description = "Additional notes or comments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public CustomerTenantPurchaseOrder orderStatus(StatusEnum orderStatus) {
    this.orderStatus = orderStatus;
    return this;
  }

  /**
   * Get orderStatus
   * @return orderStatus
   */
  @Valid 
  @Schema(name = "orderStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderStatus")
  public StatusEnum getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(StatusEnum orderStatus) {
    this.orderStatus = orderStatus;
  }

  public CustomerTenantPurchaseOrder files(List<@Valid OrderFile> files) {
    this.files = files;
    return this;
  }

  public CustomerTenantPurchaseOrder addFilesItem(OrderFile filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<>();
    }
    this.files.add(filesItem);
    return this;
  }

  /**
   * List of files associated with the purchase order
   * @return files
   */
  @Valid 
  @Schema(name = "files", description = "List of files associated with the purchase order", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("files")
  public List<@Valid OrderFile> getFiles() {
    return files;
  }

  public void setFiles(List<@Valid OrderFile> files) {
    this.files = files;
  }

  public CustomerTenantPurchaseOrder tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CustomerTenantPurchaseOrder addTagsItem(String tagsItem) {
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

  public CustomerTenantPurchaseOrder revision(Long revision) {
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

  public CustomerTenantPurchaseOrder trackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    return this;
  }

  /**
   * Get trackingNumber
   * @return trackingNumber
   */
  
  @Schema(name = "trackingNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trackingNumber")
  public String getTrackingNumber() {
    return trackingNumber;
  }

  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  public CustomerTenantPurchaseOrder deliveryPartner(String deliveryPartner) {
    this.deliveryPartner = deliveryPartner;
    return this;
  }

  /**
   * Get deliveryPartner
   * @return deliveryPartner
   */
  
  @Schema(name = "deliveryPartner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deliveryPartner")
  public String getDeliveryPartner() {
    return deliveryPartner;
  }

  public void setDeliveryPartner(String deliveryPartner) {
    this.deliveryPartner = deliveryPartner;
  }

  public CustomerTenantPurchaseOrder shippingDetails(ShippingDetails shippingDetails) {
    this.shippingDetails = shippingDetails;
    return this;
  }

  /**
   * Get shippingDetails
   * @return shippingDetails
   */
  @Valid 
  @Schema(name = "shippingDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shippingDetails")
  public ShippingDetails getShippingDetails() {
    return shippingDetails;
  }

  public void setShippingDetails(ShippingDetails shippingDetails) {
    this.shippingDetails = shippingDetails;
  }

  public CustomerTenantPurchaseOrder serviceScheduleDetails(ServiceScheduleDetails serviceScheduleDetails) {
    this.serviceScheduleDetails = serviceScheduleDetails;
    return this;
  }

  /**
   * Get serviceScheduleDetails
   * @return serviceScheduleDetails
   */
  @Valid 
  @Schema(name = "serviceScheduleDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceScheduleDetails")
  public ServiceScheduleDetails getServiceScheduleDetails() {
    return serviceScheduleDetails;
  }

  public void setServiceScheduleDetails(ServiceScheduleDetails serviceScheduleDetails) {
    this.serviceScheduleDetails = serviceScheduleDetails;
  }

  public CustomerTenantPurchaseOrder payTo(PayTo payTo) {
    this.payTo = payTo;
    return this;
  }

  /**
   * Get payTo
   * @return payTo
   */
  @Valid 
  @Schema(name = "payTo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("payTo")
  public PayTo getPayTo() {
    return payTo;
  }

  public void setPayTo(PayTo payTo) {
    this.payTo = payTo;
  }

  public CustomerTenantPurchaseOrder shipToAddress(AddressInfo shipToAddress) {
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

  public CustomerTenantPurchaseOrder billToEntity(LegalEntityInfo billToEntity) {
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

  public CustomerTenantPurchaseOrder payToEntity(LegalEntityInfo payToEntity) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerTenantPurchaseOrder customerTenantPurchaseOrder = (CustomerTenantPurchaseOrder) o;
    return Objects.equals(this.id, customerTenantPurchaseOrder.id) &&
        Objects.equals(this.poId, customerTenantPurchaseOrder.poId) &&
        Objects.equals(this.propayId, customerTenantPurchaseOrder.propayId) &&
        Objects.equals(this.supplierId, customerTenantPurchaseOrder.supplierId) &&
        Objects.equals(this.supplierUserEmail, customerTenantPurchaseOrder.supplierUserEmail) &&
        Objects.equals(this.createdOn, customerTenantPurchaseOrder.createdOn) &&
        Objects.equals(this.totalTax, customerTenantPurchaseOrder.totalTax) &&
        Objects.equals(this.items, customerTenantPurchaseOrder.items) &&
        Objects.equals(this.totalOrderValue, customerTenantPurchaseOrder.totalOrderValue) &&
        Objects.equals(this.currency, customerTenantPurchaseOrder.currency) &&
        Objects.equals(this.createdBy, customerTenantPurchaseOrder.createdBy) &&
        Objects.equals(this.ownedBy, customerTenantPurchaseOrder.ownedBy) &&
        Objects.equals(this.approvedBy, customerTenantPurchaseOrder.approvedBy) &&
        Objects.equals(this.promisedDate, customerTenantPurchaseOrder.promisedDate) &&
        Objects.equals(this.deliveredDate, customerTenantPurchaseOrder.deliveredDate) &&
        Objects.equals(this.shipTo, customerTenantPurchaseOrder.shipTo) &&
        Objects.equals(this.billTo, customerTenantPurchaseOrder.billTo) &&
        Objects.equals(this.paymentTerms, customerTenantPurchaseOrder.paymentTerms) &&
        Objects.equals(this.termsAndConditions, customerTenantPurchaseOrder.termsAndConditions) &&
        Objects.equals(this.notes, customerTenantPurchaseOrder.notes) &&
        Objects.equals(this.orderStatus, customerTenantPurchaseOrder.orderStatus) &&
        Objects.equals(this.files, customerTenantPurchaseOrder.files) &&
        Objects.equals(this.tags, customerTenantPurchaseOrder.tags) &&
        Objects.equals(this.revision, customerTenantPurchaseOrder.revision) &&
        Objects.equals(this.trackingNumber, customerTenantPurchaseOrder.trackingNumber) &&
        Objects.equals(this.deliveryPartner, customerTenantPurchaseOrder.deliveryPartner) &&
        Objects.equals(this.shippingDetails, customerTenantPurchaseOrder.shippingDetails) &&
        Objects.equals(this.serviceScheduleDetails, customerTenantPurchaseOrder.serviceScheduleDetails) &&
        Objects.equals(this.payTo, customerTenantPurchaseOrder.payTo) &&
        Objects.equals(this.shipToAddress, customerTenantPurchaseOrder.shipToAddress) &&
        Objects.equals(this.billToEntity, customerTenantPurchaseOrder.billToEntity) &&
        Objects.equals(this.payToEntity, customerTenantPurchaseOrder.payToEntity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, poId, propayId, supplierId, supplierUserEmail, createdOn, totalTax, items, totalOrderValue, currency, createdBy, ownedBy, approvedBy, promisedDate, deliveredDate, shipTo, billTo, paymentTerms, termsAndConditions, notes, orderStatus, files, tags, revision, trackingNumber, deliveryPartner, shippingDetails, serviceScheduleDetails, payTo, shipToAddress, billToEntity, payToEntity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerTenantPurchaseOrder {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    poId: ").append(toIndentedString(poId)).append("\n");
    sb.append("    propayId: ").append(toIndentedString(propayId)).append("\n");
    sb.append("    supplierId: ").append(toIndentedString(supplierId)).append("\n");
    sb.append("    supplierUserEmail: ").append(toIndentedString(supplierUserEmail)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    totalOrderValue: ").append(toIndentedString(totalOrderValue)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    ownedBy: ").append(toIndentedString(ownedBy)).append("\n");
    sb.append("    approvedBy: ").append(toIndentedString(approvedBy)).append("\n");
    sb.append("    promisedDate: ").append(toIndentedString(promisedDate)).append("\n");
    sb.append("    deliveredDate: ").append(toIndentedString(deliveredDate)).append("\n");
    sb.append("    shipTo: ").append(toIndentedString(shipTo)).append("\n");
    sb.append("    billTo: ").append(toIndentedString(billTo)).append("\n");
    sb.append("    paymentTerms: ").append(toIndentedString(paymentTerms)).append("\n");
    sb.append("    termsAndConditions: ").append(toIndentedString(termsAndConditions)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    deliveryPartner: ").append(toIndentedString(deliveryPartner)).append("\n");
    sb.append("    shippingDetails: ").append(toIndentedString(shippingDetails)).append("\n");
    sb.append("    serviceScheduleDetails: ").append(toIndentedString(serviceScheduleDetails)).append("\n");
    sb.append("    payTo: ").append(toIndentedString(payTo)).append("\n");
    sb.append("    shipToAddress: ").append(toIndentedString(shipToAddress)).append("\n");
    sb.append("    billToEntity: ").append(toIndentedString(billToEntity)).append("\n");
    sb.append("    payToEntity: ").append(toIndentedString(payToEntity)).append("\n");
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

