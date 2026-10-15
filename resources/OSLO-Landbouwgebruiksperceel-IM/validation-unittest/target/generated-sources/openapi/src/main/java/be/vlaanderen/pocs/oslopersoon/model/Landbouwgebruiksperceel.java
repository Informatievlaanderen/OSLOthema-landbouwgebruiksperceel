package be.vlaanderen.pocs.oslopersoon.model;

import java.net.URI;
import java.util.Objects;
import be.vlaanderen.pocs.oslopersoon.model.Identificator;
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
 * Een landbouwgebruiksperceel is een aaneengesloten stuk grond dat door een landbouwer wordt gebruikt voor landbouwactiviteiten.
 */

@Schema(name = "Landbouwgebruiksperceel", description = "Een landbouwgebruiksperceel is een aaneengesloten stuk grond dat door een landbouwer wordt gebruikt voor landbouwactiviteiten.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-15T14:56:46.547161501+02:00[Europe/Brussels]", comments = "Generator version: 7.20.0")
public class Landbouwgebruiksperceel {

  private @Nullable URI atId;

  private String atType;

  private Identificator identificator;

  private LandbouwgebruiksperceelGebruiker gebruiker;

  public Landbouwgebruiksperceel() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Landbouwgebruiksperceel(String atType, Identificator identificator, LandbouwgebruiksperceelGebruiker gebruiker) {
    this.atType = atType;
    this.identificator = identificator;
    this.gebruiker = gebruiker;
  }

  public Landbouwgebruiksperceel atId(@Nullable URI atId) {
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

  public Landbouwgebruiksperceel atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * Object type (klasse Landbouwgebruiksperceel)
   * @return atType
   */
  @NotNull @Pattern(regexp = "^Landbouwgebruiksperceel$") 
  @Schema(name = "@type", description = "Object type (klasse Landbouwgebruiksperceel)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  public Landbouwgebruiksperceel identificator(Identificator identificator) {
    this.identificator = identificator;
    return this;
  }

  /**
   * Get identificator
   * @return identificator
   */
  @NotNull @Valid 
  @Schema(name = "identificator", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("identificator")
  public Identificator getIdentificator() {
    return identificator;
  }

  public void setIdentificator(Identificator identificator) {
    this.identificator = identificator;
  }

  public Landbouwgebruiksperceel gebruiker(LandbouwgebruiksperceelGebruiker gebruiker) {
    this.gebruiker = gebruiker;
    return this;
  }

  /**
   * Get gebruiker
   * @return gebruiker
   */
  @NotNull @Valid 
  @Schema(name = "gebruiker", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("gebruiker")
  public LandbouwgebruiksperceelGebruiker getGebruiker() {
    return gebruiker;
  }

  public void setGebruiker(LandbouwgebruiksperceelGebruiker gebruiker) {
    this.gebruiker = gebruiker;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Landbouwgebruiksperceel landbouwgebruiksperceel = (Landbouwgebruiksperceel) o;
    return Objects.equals(this.atId, landbouwgebruiksperceel.atId) &&
        Objects.equals(this.atType, landbouwgebruiksperceel.atType) &&
        Objects.equals(this.identificator, landbouwgebruiksperceel.identificator) &&
        Objects.equals(this.gebruiker, landbouwgebruiksperceel.gebruiker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atId, atType, identificator, gebruiker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Landbouwgebruiksperceel {\n");
    sb.append("    atId: ").append(toIndentedString(atId)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    identificator: ").append(toIndentedString(identificator)).append("\n");
    sb.append("    gebruiker: ").append(toIndentedString(gebruiker)).append("\n");
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

