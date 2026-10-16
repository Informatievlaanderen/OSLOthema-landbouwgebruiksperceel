package be.vlaanderen.pocs.oslopersoon.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * String gebruikt om het object uniek te identificeren. Type van de string slaat op het identificatiesysteem (inclusief de versie ervan), de string zelf op de eigenlijke identificator.
 */

@Schema(name = "Identificator.identificator", description = "String gebruikt om het object uniek te identificeren. Type van de string slaat op het identificatiesysteem (inclusief de versie ervan), de string zelf op de eigenlijke identificator.")
@JsonTypeName("Identificator.identificator")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-16T11:39:17.103739945+02:00[Europe/Brussels]", comments = "Generator version: 7.20.0")
public class IdentificatorIdentificator {

  private String atValue;

  private @Nullable String atType;

  public IdentificatorIdentificator() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IdentificatorIdentificator(String atValue) {
    this.atValue = atValue;
  }

  public IdentificatorIdentificator atValue(String atValue) {
    this.atValue = atValue;
    return this;
  }

  /**
   * Get atValue
   * @return atValue
   */
  @NotNull 
  @Schema(name = "@value", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@value")
  public String getAtValue() {
    return atValue;
  }

  public void setAtValue(String atValue) {
    this.atValue = atValue;
  }

  public IdentificatorIdentificator atType(@Nullable String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * Get atType
   * @return atType
   */
  
  @Schema(name = "@type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@type")
  public @Nullable String getAtType() {
    return atType;
  }

  public void setAtType(@Nullable String atType) {
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
    IdentificatorIdentificator identificatorIdentificator = (IdentificatorIdentificator) o;
    return Objects.equals(this.atValue, identificatorIdentificator.atValue) &&
        Objects.equals(this.atType, identificatorIdentificator.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atValue, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentificatorIdentificator {\n");
    sb.append("    atValue: ").append(toIndentedString(atValue)).append("\n");
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

