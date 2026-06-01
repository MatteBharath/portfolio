package ai.propay.invoices.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * FileTags
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-03T16:59:44.174379100+05:30[Asia/Calcutta]", comments = "Generator version: 7.9.0")
public class FileTags {

  @Valid
  private List<List<String>> fileTags = new ArrayList<>();

  private Long revision;

  public FileTags() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public FileTags(List<List<String>> fileTags, Long revision) {
      this.fileTags = fileTags;
      this.revision = revision;
  }

  public FileTags fileTags(List<List<String>> fileTags) {
    this.fileTags = fileTags;
    return this;
  }

  public FileTags addFileTagsItem(List<String> fileTagsItem) {
    if (this.fileTags == null) {
      this.fileTags = new ArrayList<>();
    }
    this.fileTags.add(fileTagsItem);
    return this;
  }

  /**
   * Get fileTags
   * @return fileTags
   */
  @Valid 
  @Schema(name = "fileTags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fileTags")
  public List<List<String>> getFileTags() {
    return fileTags;
  }

  public void setFileTags(List<List<String>> fileTags) {
    this.fileTags = fileTags;
  }

  public FileTags revision(Long revision) {
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
    FileTags fileTags = (FileTags) o;
    return Objects.equals(this.fileTags, fileTags.fileTags) &&
        Objects.equals(this.revision, fileTags.revision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileTags, revision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileTags {\n");
    sb.append("    fileTags: ").append(toIndentedString(fileTags)).append("\n");
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

