package ai.propay.invoices.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GetInvoiceByPopayIdRequest
 */

@JsonTypeName("getInvoiceByPopayId_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-07T17:45:21.474572500+05:30[Asia/Calcutta]", comments = "Generator version: 7.9.0")
public class GetInvoiceByPopayIdRequest {

  @Valid
  private List<org.springframework.core.io.Resource> files = new ArrayList<>();

  @Valid
  private List<String> tags = new ArrayList<>();

  public GetInvoiceByPopayIdRequest() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public GetInvoiceByPopayIdRequest(List<org.springframework.core.io.Resource> files, List<String> tags) {
      this.files = files;
      this.tags = tags;
  }

  public GetInvoiceByPopayIdRequest files(List<org.springframework.core.io.Resource> files) {
    this.files = files;
    return this;
  }

  public GetInvoiceByPopayIdRequest addFilesItem(org.springframework.core.io.Resource filesItem) {
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
  public List<org.springframework.core.io.Resource> getFiles() {
    return files;
  }

  public void setFiles(List<org.springframework.core.io.Resource> files) {
    this.files = files;
  }

  public GetInvoiceByPopayIdRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public GetInvoiceByPopayIdRequest addTagsItem(String tagsItem) {
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
    GetInvoiceByPopayIdRequest getInvoiceByPopayIdRequest = (GetInvoiceByPopayIdRequest) o;
    return Objects.equals(this.files, getInvoiceByPopayIdRequest.files) &&
        Objects.equals(this.tags, getInvoiceByPopayIdRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(files, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInvoiceByPopayIdRequest {\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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

