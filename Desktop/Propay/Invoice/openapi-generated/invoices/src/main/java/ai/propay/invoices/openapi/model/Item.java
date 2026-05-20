package ai.propay.invoices.openapi.model;

import java.net.URI;
import java.util.Objects;
import ai.propay.invoices.openapi.model.PurchaseTypeEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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

@Schema(name = "Item", description = "")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-03T16:59:44.174379100+05:30[Asia/Calcutta]", comments = "Generator version: 7.9.0")
public class Item {

  private String name;

  private String description;

  private String productId;

  private Integer quantity;

  private String tax;

  private String unitPrice;

  private String totalPrice;

  private String category;

  private PurchaseTypeEnum purchaseType;

  private String shippingIncoTerms;

  private String shippingCost;

  public Item() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public Item(String name, String description, String productId, Integer quantity, String tax, String unitPrice, String totalPrice, String category, PurchaseTypeEnum purchaseType, String shippingIncoTerms, String shippingCost) {
      this.name = name;
      this.description = description;
      this.productId = productId;
      this.quantity = quantity;
      this.tax = tax;
      this.unitPrice = unitPrice;
      this.totalPrice = totalPrice;
      this.category = category;
      this.purchaseType = purchaseType;
      this.shippingIncoTerms = shippingIncoTerms;
      this.shippingCost = shippingCost;
  }

  public Item name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the Item
   * @return name
   */
  
  @Schema(name = "name", description = "Name of the Item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Item description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the Item
   * @return description
   */
  
  @Schema(name = "description", description = "Description of the Item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Item productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Id of the Product
   * @return productId
   */
  
  @Schema(name = "productId", description = "Id of the Product", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("productId")
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public Item quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Quantity of the Item requested
   * @return quantity
   */
  
  @Schema(name = "quantity", description = "Quantity of the Item requested", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Item tax(String tax) {
    this.tax = tax;
    return this;
  }

  /**
   * Tax for the item
   * @return tax
   */
  @Pattern(regexp = "^\\d+(\\.\\d{1,2})?$") 
  @Schema(name = "tax", example = "0.00", description = "Tax for the item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tax")
  public String getTax() {
    return tax;
  }

  public void setTax(String tax) {
    this.tax = tax;
  }

  public Item unitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  /**
   * Get unitPrice
   * @return unitPrice
   */
  
  @Schema(name = "unitPrice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unitPrice")
  public String getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
  }

  public Item totalPrice(String totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

  /**
   * Total price of the Item (unit price * quantity)
   * @return totalPrice
   */
  @Pattern(regexp = "^\\d+(\\.\\d{1,2})?$") 
  @Schema(name = "totalPrice", example = "0.00", description = "Total price of the Item (unit price * quantity)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalPrice")
  public String getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(String totalPrice) {
    this.totalPrice = totalPrice;
  }

  public Item category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
   */
  
  @Schema(name = "category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Item purchaseType(PurchaseTypeEnum purchaseType) {
    this.purchaseType = purchaseType;
    return this;
  }

  /**
   * Get purchaseType
   * @return purchaseType
   */
  @Valid 
  @Schema(name = "purchaseType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purchaseType")
  public PurchaseTypeEnum getPurchaseType() {
    return purchaseType;
  }

  public void setPurchaseType(PurchaseTypeEnum purchaseType) {
    this.purchaseType = purchaseType;
  }

  public Item shippingIncoTerms(String shippingIncoTerms) {
    this.shippingIncoTerms = shippingIncoTerms;
    return this;
  }

  /**
   * Get shippingIncoTerms
   * @return shippingIncoTerms
   */
  
  @Schema(name = "shippingIncoTerms", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shippingIncoTerms")
  public String getShippingIncoTerms() {
    return shippingIncoTerms;
  }

  public void setShippingIncoTerms(String shippingIncoTerms) {
    this.shippingIncoTerms = shippingIncoTerms;
  }

  public Item shippingCost(String shippingCost) {
    this.shippingCost = shippingCost;
    return this;
  }

  /**
   * Get shippingCost
   * @return shippingCost
   */
  
  @Schema(name = "shippingCost", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shippingCost")
  public String getShippingCost() {
    return shippingCost;
  }

  public void setShippingCost(String shippingCost) {
    this.shippingCost = shippingCost;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.name, item.name) &&
        Objects.equals(this.description, item.description) &&
        Objects.equals(this.productId, item.productId) &&
        Objects.equals(this.quantity, item.quantity) &&
        Objects.equals(this.tax, item.tax) &&
        Objects.equals(this.unitPrice, item.unitPrice) &&
        Objects.equals(this.totalPrice, item.totalPrice) &&
        Objects.equals(this.category, item.category) &&
        Objects.equals(this.purchaseType, item.purchaseType) &&
        Objects.equals(this.shippingIncoTerms, item.shippingIncoTerms) &&
        Objects.equals(this.shippingCost, item.shippingCost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, productId, quantity, tax, unitPrice, totalPrice, category, purchaseType, shippingIncoTerms, shippingCost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    purchaseType: ").append(toIndentedString(purchaseType)).append("\n");
    sb.append("    shippingIncoTerms: ").append(toIndentedString(shippingIncoTerms)).append("\n");
    sb.append("    shippingCost: ").append(toIndentedString(shippingCost)).append("\n");
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

