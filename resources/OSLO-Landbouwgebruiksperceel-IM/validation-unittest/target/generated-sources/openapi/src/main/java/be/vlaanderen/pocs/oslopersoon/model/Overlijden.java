package be.vlaanderen.pocs.oslopersoon.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Het doodgaan van een Persoon.
 */

@Schema(name = "Overlijden", description = "Het doodgaan van een Persoon.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-15T14:56:46.547161501+02:00[Europe/Brussels]", comments = "Generator version: 7.20.0")
public class Overlijden {

  private @Nullable URI atId;

  private String atType;

  public Overlijden() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Overlijden(String atType) {
    this.atType = atType;
  }

  public Overlijden atId(@Nullable URI atId) {
    this.atId = atId;
    return this;
  }

  /**
   * Get atId
   * @return atId
   */
  @Valid 
  @Schema(name = "@id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@id")
  public @Nullable URI getAtId() {
    return atId;
  }

  public void setAtId(@Nullable URI atId) {
    this.atId = atId;
  }

  public Overlijden atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * Object type (klasse Overlijden)
   * @return atType
   */
  @NotNull @Pattern(regexp = "^Overlijden$") 
  @Schema(name = "@type", description = "Object type (klasse Overlijden)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Overlijden overlijden = (Overlijden) o;
    return Objects.equals(this.atId, overlijden.atId) &&
        Objects.equals(this.atType, overlijden.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atId, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Overlijden {\n");
    sb.append("    atId: ").append(toIndentedString(atId)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

