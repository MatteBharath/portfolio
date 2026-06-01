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
 * ShippingDetails
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-13T14:12:03.064836200+05:30[Asia/Calcutta]", comments = "Generator version: 7.9.0")
public class ShippingDetails {

  private String trackingNumber;

  private String deliveryPartner;

  public ShippingDetails() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public ShippingDetails(String trackingNumber, String deliveryPartner) {
      this.trackingNumber = trackingNumber;
      this.deliveryPartner = deliveryPartner;
  }

  public ShippingDetails trackingNumber(String trackingNumber) {
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

  public ShippingDetails deliveryPartner(String deliveryPartner) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingDetails shippingDetails = (ShippingDetails) o;
    return Objects.equals(this.trackingNumber, shippingDetails.trackingNumber) &&
        Objects.equals(this.deliveryPartner, shippingDetails.deliveryPartner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackingNumber, deliveryPartner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingDetails {\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    deliveryPartner: ").append(toIndentedString(deliveryPartner)).append("\n");
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

