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
 * Event
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-03T16:59:44.174379100+05:30[Asia/Calcutta]", comments = "Generator version: 7.9.0")
public class Event {

  private UUID id;

  private Long revision;

  private Long eventCreatedOn;

  private String eventType;

  public Event() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public Event(UUID id, Long revision, Long eventCreatedOn, String eventType) {
      this.id = id;
      this.revision = revision;
      this.eventCreatedOn = eventCreatedOn;
      this.eventType = eventType;
  }

  public Event id(UUID id) {
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

  public Event revision(Long revision) {
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

  public Event eventCreatedOn(Long eventCreatedOn) {
    this.eventCreatedOn = eventCreatedOn;
    return this;
  }

  /**
   * Get eventCreatedOn
   * @return eventCreatedOn
   */
  
  @Schema(name = "eventCreatedOn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventCreatedOn")
  public Long getEventCreatedOn() {
    return eventCreatedOn;
  }

  public void setEventCreatedOn(Long eventCreatedOn) {
    this.eventCreatedOn = eventCreatedOn;
  }

  public Event eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * Get eventType
   * @return eventType
   */
  
  @Schema(name = "eventType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eventType")
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.id, event.id) &&
        Objects.equals(this.revision, event.revision) &&
        Objects.equals(this.eventCreatedOn, event.eventCreatedOn) &&
        Objects.equals(this.eventType, event.eventType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, revision, eventCreatedOn, eventType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    eventCreatedOn: ").append(toIndentedString(eventCreatedOn)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
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

