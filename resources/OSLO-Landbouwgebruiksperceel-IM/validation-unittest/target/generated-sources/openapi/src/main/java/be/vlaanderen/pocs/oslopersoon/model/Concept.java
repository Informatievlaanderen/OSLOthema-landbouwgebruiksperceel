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
 * Concept is een idee of code.
 */

@Schema(name = "Concept", description = "Concept is een idee of code.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-15T14:56:46.547161501+02:00[Europe/Brussels]", comments = "Generator version: 7.20.0")
public class Concept {

  private @Nullable URI atId;

  private String atType;

  private String code;

  private @Nullable String voorkeursnaam;

  public Concept() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Concept(String atType, String code) {
    this.atType = atType;
    this.code = code;
  }

  public Concept atId(@Nullable URI atId) {
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

  public Concept atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * Object type (klasse Concept)
   * @return atType
   */
  @NotNull @Pattern(regexp = "^Concept$") 
  @Schema(name = "@type", description = "Object type (klasse Concept)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  public Concept code(String code) {
    this.code = code;
    return this;
  }

  /**
   * De waarde van de code van het Concept.
   * @return code
   */
  @NotNull 
  @Schema(name = "code", description = "De waarde van de code van het Concept.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Concept voorkeursnaam(@Nullable String voorkeursnaam) {
    this.voorkeursnaam = voorkeursnaam;
    return this;
  }

  /**
   * De naam van het Concept.
   * @return voorkeursnaam
   */
  
  @Schema(name = "voorkeursnaam", description = "De naam van het Concept.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("voorkeursnaam")
  public @Nullable String getVoorkeursnaam() {
    return voorkeursnaam;
  }

  public void setVoorkeursnaam(@Nullable String voorkeursnaam) {
    this.voorkeursnaam = voorkeursnaam;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Concept concept = (Concept) o;
    return Objects.equals(this.atId, concept.atId) &&
        Objects.equals(this.atType, concept.atType) &&
        Objects.equals(this.code, concept.code) &&
        Objects.equals(this.voorkeursnaam, concept.voorkeursnaam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atId, atType, code, voorkeursnaam);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Concept {\n");
    sb.append("    atId: ").append(toIndentedString(atId)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    voorkeursnaam: ").append(toIndentedString(voorkeursnaam)).append("\n");
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

