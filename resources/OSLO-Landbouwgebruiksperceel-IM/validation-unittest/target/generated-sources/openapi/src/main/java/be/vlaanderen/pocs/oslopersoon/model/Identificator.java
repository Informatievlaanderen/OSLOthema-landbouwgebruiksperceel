package be.vlaanderen.pocs.oslopersoon.model;

import java.net.URI;
import java.util.Objects;
import be.vlaanderen.pocs.oslopersoon.model.IdentificatorIdentificator;
import be.vlaanderen.pocs.oslopersoon.model.LandbouwgebruiksperceelGebruiker;
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
 * Informatie gebruikt om een object uniek te identificeren.
 */

@Schema(name = "Identificator", description = "Informatie gebruikt om een object uniek te identificeren.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-16T11:39:17.103739945+02:00[Europe/Brussels]", comments = "Generator version: 7.20.0")
public class Identificator {

  private @Nullable URI atId;

  private String atType;

  private @Nullable IdentificatorIdentificator identificator;

  private @Nullable LandbouwgebruiksperceelGebruiker toegekendDoor;

  public Identificator() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Identificator(String atType) {
    this.atType = atType;
  }

  public Identificator atId(@Nullable URI atId) {
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

  public Identificator atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * Object type (klasse Identificator)
   * @return atType
   */
  @NotNull @Pattern(regexp = "^Identificator$") 
  @Schema(name = "@type", description = "Object type (klasse Identificator)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  public Identificator identificator(@Nullable IdentificatorIdentificator identificator) {
    this.identificator = identificator;
    return this;
  }

  /**
   * Get identificator
   * @return identificator
   */
  @Valid 
  @Schema(name = "identificator", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("identificator")
  public @Nullable IdentificatorIdentificator getIdentificator() {
    return identificator;
  }

  public void setIdentificator(@Nullable IdentificatorIdentificator identificator) {
    this.identificator = identificator;
  }

  public Identificator toegekendDoor(@Nullable LandbouwgebruiksperceelGebruiker toegekendDoor) {
    this.toegekendDoor = toegekendDoor;
    return this;
  }

  /**
   * Get toegekendDoor
   * @return toegekendDoor
   */
  @Valid 
  @Schema(name = "toegekendDoor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("toegekendDoor")
  public @Nullable LandbouwgebruiksperceelGebruiker getToegekendDoor() {
    return toegekendDoor;
  }

  public void setToegekendDoor(@Nullable LandbouwgebruiksperceelGebruiker toegekendDoor) {
    this.toegekendDoor = toegekendDoor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Identificator identificator = (Identificator) o;
    return Objects.equals(this.atId, identificator.atId) &&
        Objects.equals(this.atType, identificator.atType) &&
        Objects.equals(this.identificator, identificator.identificator) &&
        Objects.equals(this.toegekendDoor, identificator.toegekendDoor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atId, atType, identificator, toegekendDoor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Identificator {\n");
    sb.append("    atId: ").append(toIndentedString(atId)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    identificator: ").append(toIndentedString(identificator)).append("\n");
    sb.append("    toegekendDoor: ").append(toIndentedString(toegekendDoor)).append("\n");
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

