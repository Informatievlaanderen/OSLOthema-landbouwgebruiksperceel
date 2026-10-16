package be.vlaanderen.pocs.oslopersoon.model;

import java.net.URI;
import java.util.Objects;
import be.vlaanderen.pocs.oslopersoon.model.ConceptVoorkeursnaam;
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
 * Enumeratie van OrganisatieStatus
 */

@Schema(name = "OrganisatieStatus", description = "Enumeratie van OrganisatieStatus")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-16T11:39:17.103739945+02:00[Europe/Brussels]", comments = "Generator version: 7.20.0")
public class OrganisatieStatus {

  private URI atId;

  private @Nullable String atType;

  private @Nullable String code;

  private @Nullable ConceptVoorkeursnaam voorkeursnaam;

  public OrganisatieStatus() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OrganisatieStatus(URI atId) {
    this.atId = atId;
  }

  public OrganisatieStatus atId(URI atId) {
    this.atId = atId;
    return this;
  }

  /**
   * Get atId
   * @return atId
   */
  @NotNull @Valid 
  @Schema(name = "@id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@id")
  public URI getAtId() {
    return atId;
  }

  public void setAtId(URI atId) {
    this.atId = atId;
  }

  public OrganisatieStatus atType(@Nullable String atType) {
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

  public OrganisatieStatus code(@Nullable String code) {
    this.code = code;
    return this;
  }

  /**
   * De waarde van de code van het Concept.
   * @return code
   */
  
  @Schema(name = "code", description = "De waarde van de code van het Concept.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public @Nullable String getCode() {
    return code;
  }

  public void setCode(@Nullable String code) {
    this.code = code;
  }

  public OrganisatieStatus voorkeursnaam(@Nullable ConceptVoorkeursnaam voorkeursnaam) {
    this.voorkeursnaam = voorkeursnaam;
    return this;
  }

  /**
   * Get voorkeursnaam
   * @return voorkeursnaam
   */
  @Valid 
  @Schema(name = "voorkeursnaam", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("voorkeursnaam")
  public @Nullable ConceptVoorkeursnaam getVoorkeursnaam() {
    return voorkeursnaam;
  }

  public void setVoorkeursnaam(@Nullable ConceptVoorkeursnaam voorkeursnaam) {
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
    OrganisatieStatus organisatieStatus = (OrganisatieStatus) o;
    return Objects.equals(this.atId, organisatieStatus.atId) &&
        Objects.equals(this.atType, organisatieStatus.atType) &&
        Objects.equals(this.code, organisatieStatus.code) &&
        Objects.equals(this.voorkeursnaam, organisatieStatus.voorkeursnaam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atId, atType, code, voorkeursnaam);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganisatieStatus {\n");
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

