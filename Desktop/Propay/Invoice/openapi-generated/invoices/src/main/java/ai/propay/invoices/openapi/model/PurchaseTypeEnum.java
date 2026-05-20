package ai.propay.invoices.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets PurchaseTypeEnum
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-03T16:59:44.174379100+05:30[Asia/Calcutta]", comments = "Generator version: 7.9.0")
public enum PurchaseTypeEnum {
  
  PRODUCT(0),
  
  SERVICE(1);

  private Integer value;

  PurchaseTypeEnum(Integer value) {
    this.value = value;
  }

  @JsonValue
  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PurchaseTypeEnum fromValue(Integer value) {
    for (PurchaseTypeEnum b : PurchaseTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

