package ai.propay.invoices.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ServiceScheduleDetails2
 */

@JsonTypeName("ServiceScheduleDetails_2")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-13T14:12:03.064836200+05:30[Asia/Calcutta]", comments = "Generator version: 7.9.0")
public class ServiceScheduleDetails2 {

  private String name;

  private String phonePrefix;

  private String phoneNumber;

  public ServiceScheduleDetails2() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public ServiceScheduleDetails2(String name, String phonePrefix, String phoneNumber) {
      this.name = name;
      this.phonePrefix = phonePrefix;
      this.phoneNumber = phoneNumber;
  }

  public ServiceScheduleDetails2 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ServiceScheduleDetails2 phonePrefix(String phonePrefix) {
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

  public ServiceScheduleDetails2 phoneNumber(String phoneNumber) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceScheduleDetails2 serviceScheduleDetails2 = (ServiceScheduleDetails2) o;
    return Objects.equals(this.name, serviceScheduleDetails2.name) &&
        Objects.equals(this.phonePrefix, serviceScheduleDetails2.phonePrefix) &&
        Objects.equals(this.phoneNumber, serviceScheduleDetails2.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, phonePrefix, phoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceScheduleDetails2 {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phonePrefix: ").append(toIndentedString(phonePrefix)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

