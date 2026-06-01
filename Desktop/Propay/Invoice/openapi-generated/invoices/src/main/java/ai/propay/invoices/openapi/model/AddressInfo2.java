package ai.propay.invoices.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AddressInfo2
 */

@JsonTypeName("AddressInfo_2")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-13T14:12:03.064836200+05:30[Asia/Calcutta]", comments = "Generator version: 7.9.0")
public class AddressInfo2 {

  private UUID id;

  private String addressName;

  private String addressLine1;

  private String addressLine2;

  private String addressLine3;

  private String locality;

  private String state;

  private String country;

  private String zipCode;

  private Long revision;

  public AddressInfo2() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AddressInfo2(String addressLine1, String locality, String state, String country, String zipCode) {
    this.addressLine1 = addressLine1;
    this.locality = locality;
    this.state = state;
    this.country = country;
    this.zipCode = zipCode;
  }

  /**
   * Constructor with all args parameters
   */
  public AddressInfo2(UUID id, String addressName, String addressLine1, String addressLine2, String addressLine3, String locality, String state, String country, String zipCode, Long revision) {
      this.id = id;
      this.addressName = addressName;
      this.addressLine1 = addressLine1;
      this.addressLine2 = addressLine2;
      this.addressLine3 = addressLine3;
      this.locality = locality;
      this.state = state;
      this.country = country;
      this.zipCode = zipCode;
      this.revision = revision;
  }

  public AddressInfo2 id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @Valid 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public AddressInfo2 addressName(String addressName) {
    this.addressName = addressName;
    return this;
  }

  /**
   * Office Address Name
   * @return addressName
   */
  
  @Schema(name = "addressName", description = "Office Address Name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("addressName")
  public String getAddressName() {
    return addressName;
  }

  public void setAddressName(String addressName) {
    this.addressName = addressName;
  }

  public AddressInfo2 addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

  /**
   * Address Line 2
   * @return addressLine1
   */
  @NotNull 
  @Schema(name = "addressLine1", description = "Address Line 2", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("addressLine1")
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public AddressInfo2 addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

  /**
   * Address Line 3
   * @return addressLine2
   */
  
  @Schema(name = "addressLine2", description = "Address Line 3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("addressLine2")
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public AddressInfo2 addressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
    return this;
  }

  /**
   * Get addressLine3
   * @return addressLine3
   */
  
  @Schema(name = "addressLine3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("addressLine3")
  public String getAddressLine3() {
    return addressLine3;
  }

  public void setAddressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
  }

  public AddressInfo2 locality(String locality) {
    this.locality = locality;
    return this;
  }

  /**
   * City
   * @return locality
   */
  @NotNull 
  @Schema(name = "locality", description = "City", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("locality")
  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public AddressInfo2 state(String state) {
    this.state = state;
    return this;
  }

  /**
   * State
   * @return state
   */
  @NotNull 
  @Schema(name = "state", description = "State", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public AddressInfo2 country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Country
   * @return country
   */
  @NotNull 
  @Schema(name = "country", description = "Country", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public AddressInfo2 zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  /**
   * Zip Code
   * @return zipCode
   */
  @NotNull 
  @Schema(name = "zipCode", description = "Zip Code", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("zipCode")
  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public AddressInfo2 revision(Long revision) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressInfo2 addressInfo2 = (AddressInfo2) o;
    return Objects.equals(this.id, addressInfo2.id) &&
        Objects.equals(this.addressName, addressInfo2.addressName) &&
        Objects.equals(this.addressLine1, addressInfo2.addressLine1) &&
        Objects.equals(this.addressLine2, addressInfo2.addressLine2) &&
        Objects.equals(this.addressLine3, addressInfo2.addressLine3) &&
        Objects.equals(this.locality, addressInfo2.locality) &&
        Objects.equals(this.state, addressInfo2.state) &&
        Objects.equals(this.country, addressInfo2.country) &&
        Objects.equals(this.zipCode, addressInfo2.zipCode) &&
        Objects.equals(this.revision, addressInfo2.revision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, addressName, addressLine1, addressLine2, addressLine3, locality, state, country, zipCode, revision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressInfo2 {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    addressName: ").append(toIndentedString(addressName)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    addressLine3: ").append(toIndentedString(addressLine3)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
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

