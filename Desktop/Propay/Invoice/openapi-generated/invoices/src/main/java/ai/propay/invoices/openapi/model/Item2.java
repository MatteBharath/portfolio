package ai.propay.invoices.openapi.model;

import java.net.URI;
import java.util.Objects;
import ai.propay.invoices.openapi.model.PurchaseTypeEnum2;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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

@Schema(name = "Item_2", description = "")
@JsonTypeName("Item_2")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-13T14:12:03.064836200+05:30[Asia/Calcutta]", comments = "Generator version: 7.9.0")
public class Item2 {

  private String name;

  private String description;

  private String productId;

  private Integer quantity;

  private String tax;

  private String unitPrice;

  private String totalPrice;

  private String category;

  private PurchaseTypeEnum2 purchaseType;

  private String shippingIncoTerms;

  private String shippingCost;

  public Item2() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public Item2(String name, String description, String productId, Integer quantity, String tax, String unitPrice, String totalPrice, String category, PurchaseTypeEnum2 purchaseType, String shippingIncoTerms, String shippingCost) {
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

  public Item2 name(String name) {
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

  public Item2 description(String description) {
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

  public Item2 productId(String productId) {
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

  public Item2 quantity(Integer quantity) {
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

  public Item2 tax(String tax) {
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

  public Item2 unitPrice(String unitPrice) {
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

  public Item2 totalPrice(String totalPrice) {
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

  public Item2 category(String category) {
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

  public Item2 purchaseType(PurchaseTypeEnum2 purchaseType) {
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
  public PurchaseTypeEnum2 getPurchaseType() {
    return purchaseType;
  }

  public void setPurchaseType(PurchaseTypeEnum2 purchaseType) {
    this.purchaseType = purchaseType;
  }

  public Item2 shippingIncoTerms(String shippingIncoTerms) {
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

  public Item2 shippingCost(String shippingCost) {
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
    Item2 item2 = (Item2) o;
    return Objects.equals(this.name, item2.name) &&
        Objects.equals(this.description, item2.description) &&
        Objects.equals(this.productId, item2.productId) &&
        Objects.equals(this.quantity, item2.quantity) &&
        Objects.equals(this.tax, item2.tax) &&
        Objects.equals(this.unitPrice, item2.unitPrice) &&
        Objects.equals(this.totalPrice, item2.totalPrice) &&
        Objects.equals(this.category, item2.category) &&
        Objects.equals(this.purchaseType, item2.purchaseType) &&
        Objects.equals(this.shippingIncoTerms, item2.shippingIncoTerms) &&
        Objects.equals(this.shippingCost, item2.shippingCost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, productId, quantity, tax, unitPrice, totalPrice, category, purchaseType, shippingIncoTerms, shippingCost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item2 {\n");
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

