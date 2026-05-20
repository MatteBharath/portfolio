package ai.propay.invoices.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * LegalEntityInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-03T16:59:44.174379100+05:30[Asia/Calcutta]", comments = "Generator version: 7.9.0")
public class LegalEntityInfo {

  private UUID id;

  private String legalEntityName;

  private String country;

  private String address;

  private String taxId;

  private String taxType;

  private String taxCountry;

  private String city;

  private String zipCode;

  private Boolean isChargeVat;

  private String phonePrefix;

  private String phoneNumber;

  private String state;

  private Long revision;

  public LegalEntityInfo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LegalEntityInfo(String legalEntityName, String country, String taxId) {
    this.legalEntityName = legalEntityName;
    this.country = country;
    this.taxId = taxId;
  }

  /**
   * Constructor with all args parameters
   */
  public LegalEntityInfo(UUID id, String legalEntityName, String country, String address, String taxId, String taxType, String taxCountry, String city, String zipCode, Boolean isChargeVat, String phonePrefix, String phoneNumber, String state, Long revision) {
      this.id = id;
      this.legalEntityName = legalEntityName;
      this.country = country;
      this.address = address;
      this.taxId = taxId;
      this.taxType = taxType;
      this.taxCountry = taxCountry;
      this.city = city;
      this.zipCode = zipCode;
      this.isChargeVat = isChargeVat;
      this.phonePrefix = phonePrefix;
      this.phoneNumber = phoneNumber;
      this.state = state;
      this.revision = revision;
  }

  public LegalEntityInfo id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Legal Entity Id
   * @return id
   */
  @Valid 
  @Schema(name = "id", description = "Legal Entity Id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public LegalEntityInfo legalEntityName(String legalEntityName) {
    this.legalEntityName = legalEntityName;
    return this;
  }

  /**
   * Legal Entity Name
   * @return legalEntityName
   */
  @NotNull 
  @Schema(name = "legalEntityName", description = "Legal Entity Name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("legalEntityName")
  public String getLegalEntityName() {
    return legalEntityName;
  }

  public void setLegalEntityName(String legalEntityName) {
    this.legalEntityName = legalEntityName;
  }

  public LegalEntityInfo country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Country Code
   * @return country
   */
  @NotNull 
  @Schema(name = "country", description = "Country Code", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public LegalEntityInfo address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Office Addresses
   * @return address
   */
  
  @Schema(name = "address", description = "Office Addresses", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public LegalEntityInfo taxId(String taxId) {
    this.taxId = taxId;
    return this;
  }

  /**
   * Tax IDs
   * @return taxId
   */
  @NotNull 
  @Schema(name = "taxId", description = "Tax IDs", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("taxId")
  public String getTaxId() {
    return taxId;
  }

  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }

  public LegalEntityInfo taxType(String taxType) {
    this.taxType = taxType;
    return this;
  }

  /**
   * Doing Business As
   * @return taxType
   */
  
  @Schema(name = "taxType", description = "Doing Business As", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxType")
  public String getTaxType() {
    return taxType;
  }

  public void setTaxType(String taxType) {
    this.taxType = taxType;
  }

  public LegalEntityInfo taxCountry(String taxCountry) {
    this.taxCountry = taxCountry;
    return this;
  }

  /**
   * Get taxCountry
   * @return taxCountry
   */
  
  @Schema(name = "taxCountry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taxCountry")
  public String getTaxCountry() {
    return taxCountry;
  }

  public void setTaxCountry(String taxCountry) {
    this.taxCountry = taxCountry;
  }

  public LegalEntityInfo city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
   */
  
  @Schema(name = "city", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public LegalEntityInfo zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

  /**
   * Get zipCode
   * @return zipCode
   */
  
  @Schema(name = "zipCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("zipCode")
  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public LegalEntityInfo isChargeVat(Boolean isChargeVat) {
    this.isChargeVat = isChargeVat;
    return this;
  }

  /**
   * Get isChargeVat
   * @return isChargeVat
   */
  
  @Schema(name = "isChargeVat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isChargeVat")
  public Boolean getIsChargeVat() {
    return isChargeVat;
  }

  public void setIsChargeVat(Boolean isChargeVat) {
    this.isChargeVat = isChargeVat;
  }

  public LegalEntityInfo phonePrefix(String phonePrefix) {
    this.phonePrefix = phonePrefix;
    return this;
  }

  /**
   * Get phonePrefix
   * @return phonePrefix
   */
  
  @Schema(name = "phonePrefix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phonePrefix")
  public String getPhonePrefix() {
    return phonePrefix;
  }

  public void setPhonePrefix(String phonePrefix) {
    this.phonePrefix = phonePrefix;
  }

  public LegalEntityInfo phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
   */
  
  @Schema(name = "phoneNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public LegalEntityInfo state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  
  @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public LegalEntityInfo revision(Long revision) {
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
    LegalEntityInfo legalEntityInfo = (LegalEntityInfo) o;
    return Objects.equals(this.id, legalEntityInfo.id) &&
        Objects.equals(this.legalEntityName, legalEntityInfo.legalEntityName) &&
        Objects.equals(this.country, legalEntityInfo.country) &&
        Objects.equals(this.address, legalEntityInfo.address) &&
        Objects.equals(this.taxId, legalEntityInfo.taxId) &&
        Objects.equals(this.taxType, legalEntityInfo.taxType) &&
        Objects.equals(this.taxCountry, legalEntityInfo.taxCountry) &&
        Objects.equals(this.city, legalEntityInfo.city) &&
        Objects.equals(this.zipCode, legalEntityInfo.zipCode) &&
        Objects.equals(this.isChargeVat, legalEntityInfo.isChargeVat) &&
        Objects.equals(this.phonePrefix, legalEntityInfo.phonePrefix) &&
        Objects.equals(this.phoneNumber, legalEntityInfo.phoneNumber) &&
        Objects.equals(this.state, legalEntityInfo.state) &&
        Objects.equals(this.revision, legalEntityInfo.revision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, legalEntityName, country, address, taxId, taxType, taxCountry, city, zipCode, isChargeVat, phonePrefix, phoneNumber, state, revision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalEntityInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    legalEntityName: ").append(toIndentedString(legalEntityName)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
    sb.append("    taxCountry: ").append(toIndentedString(taxCountry)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    isChargeVat: ").append(toIndentedString(isChargeVat)).append("\n");
    sb.append("    phonePrefix: ").append(toIndentedString(phonePrefix)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

