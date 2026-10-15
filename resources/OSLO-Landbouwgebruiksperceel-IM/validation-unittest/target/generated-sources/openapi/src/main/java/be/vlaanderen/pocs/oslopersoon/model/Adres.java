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
 * Informatie die toelaat om op een gestructureerde en unieke manier te verwijzen naar een gebouweenheid, een ligplaats, een standplaats of een perceel op basis van een gemeentenaam, een straatnaam, een huisnummer en eventueel een busnummer en een postcode.
 */

@Schema(name = "Adres", description = "Informatie die toelaat om op een gestructureerde en unieke manier te verwijzen naar een gebouweenheid, een ligplaats, een standplaats of een perceel op basis van een gemeentenaam, een straatnaam, een huisnummer en eventueel een busnummer en een postcode.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-15T14:56:46.547161501+02:00[Europe/Brussels]", comments = "Generator version: 7.20.0")
public class Adres {

  private @Nullable URI atId;

  private String atType;

  public Adres() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Adres(String atType) {
    this.atType = atType;
  }

  public Adres atId(@Nullable URI atId) {
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

  public Adres atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * Object type (klasse Adres)
   * @return atType
   */
  @NotNull @Pattern(regexp = "^Adres$") 
  @Schema(name = "@type", description = "Object type (klasse Adres)", requiredMode = Schema.RequiredMode.REQUIRED)
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
    Adres adres = (Adres) o;
    return Objects.equals(this.atId, adres.atId) &&
        Objects.equals(this.atType, adres.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atId, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Adres {\n");
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

