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
 * PostInvoiceByPopayIdRequest
 */

@JsonTypeName("postInvoiceByPopayId_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-08T10:21:02.422056300+05:30[Asia/Calcutta]", comments = "Generator version: 7.9.0")
public class PostInvoiceByPopayIdRequest {

  @Valid
  private List<List<String>> files = new ArrayList<>();

  @Valid
  private List<String> tags = new ArrayList<>();

  public PostInvoiceByPopayIdRequest() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public PostInvoiceByPopayIdRequest(List<List<String>> files, List<String> tags) {
      this.files = files;
      this.tags = tags;
  }

  public PostInvoiceByPopayIdRequest files(List<List<String>> files) {
    this.files = files;
    return this;
  }

  public PostInvoiceByPopayIdRequest addFilesItem(List<String> filesItem) {
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
  public List<List<String>> getFiles() {
    return files;
  }

  public void setFiles(List<List<String>> files) {
    this.files = files;
  }

  public PostInvoiceByPopayIdRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public PostInvoiceByPopayIdRequest addTagsItem(String tagsItem) {
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
    PostInvoiceByPopayIdRequest postInvoiceByPopayIdRequest = (PostInvoiceByPopayIdRequest) o;
    return Objects.equals(this.files, postInvoiceByPopayIdRequest.files) &&
        Objects.equals(this.tags, postInvoiceByPopayIdRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(files, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostInvoiceByPopayIdRequest {\n");
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

