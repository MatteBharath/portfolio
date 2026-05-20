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
 * InvoiceFile
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-03T16:59:44.174379100+05:30[Asia/Calcutta]", comments = "Generator version: 7.9.0")
public class InvoiceFile {

  private String filename;

  private String url;

  @Valid
  private List<String> tags = new ArrayList<>();

  public InvoiceFile() {
    super();
  }

  /**
   * Constructor with all args parameters
   */
  public InvoiceFile(String filename, String url, List<String> tags) {
      this.filename = filename;
      this.url = url;
      this.tags = tags;
  }

  public InvoiceFile filename(String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * Name of the file
   * @return filename
   */
  
  @Schema(name = "filename", description = "Name of the file", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public InvoiceFile url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL where the file can be downloaded
   * @return url
   */
  
  @Schema(name = "url", description = "URL where the file can be downloaded", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public InvoiceFile tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public InvoiceFile addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Array of tags
   * @return tags
   */
  
  @Schema(name = "tags", description = "Array of tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    InvoiceFile invoiceFile = (InvoiceFile) o;
    return Objects.equals(this.filename, invoiceFile.filename) &&
        Objects.equals(this.url, invoiceFile.url) &&
        Objects.equals(this.tags, invoiceFile.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, url, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceFile {\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

