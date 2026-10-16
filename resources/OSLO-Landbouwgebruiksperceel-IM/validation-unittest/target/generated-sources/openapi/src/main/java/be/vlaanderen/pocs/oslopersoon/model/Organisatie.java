package be.vlaanderen.pocs.oslopersoon.model;

import java.net.URI;
import java.util.Objects;
import be.vlaanderen.pocs.oslopersoon.model.Contactpunt;
import be.vlaanderen.pocs.oslopersoon.model.Identificator;
import be.vlaanderen.pocs.oslopersoon.model.LandbouwActiviteit;
import be.vlaanderen.pocs.oslopersoon.model.OrganisatieLidInner;
import be.vlaanderen.pocs.oslopersoon.model.OrganisatieType;
import be.vlaanderen.pocs.oslopersoon.model.OrganisatieVoorkeursnaam;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Een aantal mensen georganiseerd in een gemeenschap of andere sociale, commerciële of politieke structuur. De groep heeft een gemeenschappelijk doel of bestaansreden die de individuele leden ervan overstijgt en kan handelen als agent. Een Organisatie heeft dikwijls een hiërarchische structuur.
 */

@Schema(name = "Organisatie", description = "Een aantal mensen georganiseerd in een gemeenschap of andere sociale, commerciële of politieke structuur. De groep heeft een gemeenschappelijk doel of bestaansreden die de individuele leden ervan overstijgt en kan handelen als agent. Een Organisatie heeft dikwijls een hiërarchische structuur.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-16T11:39:17.103739945+02:00[Europe/Brussels]", comments = "Generator version: 7.20.0")
public class Organisatie implements LandbouwgebruiksperceelGebruiker {

  private @Nullable URI atId;

  private String atType;

  private @Nullable OrganisatieVoorkeursnaam voorkeursnaam;

  @Valid
  private @Nullable List<@Valid OrganisatieType> type;

  private @Nullable Contactpunt contactinfo;

  @Valid
  private @Nullable List<@Valid LandbouwActiviteit> activiteit;

  @Valid
  private @Nullable List<OrganisatieLidInner> lid;

  private @Nullable Identificator identificator;

  public Organisatie() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Organisatie(String atType) {
    this.atType = atType;
  }

  public Organisatie atId(@Nullable URI atId) {
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

  public Organisatie atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * Object type (klasse Organisatie)
   * @return atType
   */
  @NotNull @Pattern(regexp = "^Organisatie$") 
  @Schema(name = "@type", description = "Object type (klasse Organisatie)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  public Organisatie voorkeursnaam(@Nullable OrganisatieVoorkeursnaam voorkeursnaam) {
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
  public @Nullable OrganisatieVoorkeursnaam getVoorkeursnaam() {
    return voorkeursnaam;
  }

  public void setVoorkeursnaam(@Nullable OrganisatieVoorkeursnaam voorkeursnaam) {
    this.voorkeursnaam = voorkeursnaam;
  }

  public Organisatie type(@Nullable List<@Valid OrganisatieType> type) {
    this.type = type;
    return this;
  }

  public Organisatie addTypeItem(OrganisatieType typeItem) {
    if (this.type == null) {
      this.type = new ArrayList<>();
    }
    this.type.add(typeItem);
    return this;
  }

  /**
   * Soort organisatie. Specialisatie van classificatie (naast activiteit & status). Lijst van OrganisatieType items.
   * @return type
   */
  @Valid @Size(min = 1) 
  @Schema(name = "type", description = "Soort organisatie. Specialisatie van classificatie (naast activiteit & status). Lijst van OrganisatieType items.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable List<@Valid OrganisatieType> getType() {
    return type;
  }

  public void setType(@Nullable List<@Valid OrganisatieType> type) {
    this.type = type;
  }

  public Organisatie contactinfo(@Nullable Contactpunt contactinfo) {
    this.contactinfo = contactinfo;
    return this;
  }

  /**
   * Get contactinfo
   * @return contactinfo
   */
  @Valid 
  @Schema(name = "contactinfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactinfo")
  public @Nullable Contactpunt getContactinfo() {
    return contactinfo;
  }

  public void setContactinfo(@Nullable Contactpunt contactinfo) {
    this.contactinfo = contactinfo;
  }

  public Organisatie activiteit(@Nullable List<@Valid LandbouwActiviteit> activiteit) {
    this.activiteit = activiteit;
    return this;
  }

  public Organisatie addActiviteitItem(LandbouwActiviteit activiteitItem) {
    if (this.activiteit == null) {
      this.activiteit = new ArrayList<>();
    }
    this.activiteit.add(activiteitItem);
    return this;
  }

  /**
   * Type activiteit die door de Organisatie wordt uitgeoefend. Lijst van LandbouwActiviteit items.
   * @return activiteit
   */
  @Valid @Size(min = 1) 
  @Schema(name = "activiteit", description = "Type activiteit die door de Organisatie wordt uitgeoefend. Lijst van LandbouwActiviteit items.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activiteit")
  public @Nullable List<@Valid LandbouwActiviteit> getActiviteit() {
    return activiteit;
  }

  public void setActiviteit(@Nullable List<@Valid LandbouwActiviteit> activiteit) {
    this.activiteit = activiteit;
  }

  public Organisatie lid(@Nullable List<OrganisatieLidInner> lid) {
    this.lid = lid;
    return this;
  }

  public Organisatie addLidItem(OrganisatieLidInner lidItem) {
    if (this.lid == null) {
      this.lid = new ArrayList<>();
    }
    this.lid.add(lidItem);
    return this;
  }

  /**
   * Agent die lid is van een Organisatie. Lijst van Persoon items.
   * @return lid
   */
  @Valid @Size(min = 1) 
  @Schema(name = "lid", description = "Agent die lid is van een Organisatie. Lijst van Persoon items.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lid")
  public @Nullable List<OrganisatieLidInner> getLid() {
    return lid;
  }

  public void setLid(@Nullable List<OrganisatieLidInner> lid) {
    this.lid = lid;
  }

  public Organisatie identificator(@Nullable Identificator identificator) {
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
  public @Nullable Identificator getIdentificator() {
    return identificator;
  }

  public void setIdentificator(@Nullable Identificator identificator) {
    this.identificator = identificator;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organisatie organisatie = (Organisatie) o;
    return Objects.equals(this.atId, organisatie.atId) &&
        Objects.equals(this.atType, organisatie.atType) &&
        Objects.equals(this.voorkeursnaam, organisatie.voorkeursnaam) &&
        Objects.equals(this.type, organisatie.type) &&
        Objects.equals(this.contactinfo, organisatie.contactinfo) &&
        Objects.equals(this.activiteit, organisatie.activiteit) &&
        Objects.equals(this.lid, organisatie.lid) &&
        Objects.equals(this.identificator, organisatie.identificator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atId, atType, voorkeursnaam, type, contactinfo, activiteit, lid, identificator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organisatie {\n");
    sb.append("    atId: ").append(toIndentedString(atId)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    voorkeursnaam: ").append(toIndentedString(voorkeursnaam)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    contactinfo: ").append(toIndentedString(contactinfo)).append("\n");
    sb.append("    activiteit: ").append(toIndentedString(activiteit)).append("\n");
    sb.append("    lid: ").append(toIndentedString(lid)).append("\n");
    sb.append("    identificator: ").append(toIndentedString(identificator)).append("\n");
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

