package be.vlaanderen.pocs.oslopersoon.model;

import java.net.URI;
import java.util.Objects;
import be.vlaanderen.pocs.oslopersoon.model.Contactpunt;
import be.vlaanderen.pocs.oslopersoon.model.Identificator;
import be.vlaanderen.pocs.oslopersoon.model.LandbouwActiviteit;
import be.vlaanderen.pocs.oslopersoon.model.OrganisatieLidInner;
import be.vlaanderen.pocs.oslopersoon.model.OrganisatieStatus;
import be.vlaanderen.pocs.oslopersoon.model.OrganisatieType;
import be.vlaanderen.pocs.oslopersoon.model.Rechtspersoonlijkheidtype;
import be.vlaanderen.pocs.oslopersoon.model.Rechtsvormtype;
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
 * Organisatie met een juridisch statuut vastgelegd door registratie. Vergelijk met een FormeleOrganisatie waarbij dit statuut ook op een andere manier verkregen kan zijn.
 */

@Schema(name = "GeregistreerdeOrganisatie", description = "Organisatie met een juridisch statuut vastgelegd door registratie. Vergelijk met een FormeleOrganisatie waarbij dit statuut ook op een andere manier verkregen kan zijn.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-15T14:56:46.547161501+02:00[Europe/Brussels]", comments = "Generator version: 7.20.0")
public class GeregistreerdeOrganisatie implements LandbouwgebruiksperceelGebruiker {

  private @Nullable URI atId;

  private String atType;

  @Valid
  private @Nullable List<@Valid OrganisatieStatus> status;

  private @Nullable Rechtspersoonlijkheidtype rechtspersoonlijkheid;

  private Identificator registratie;

  private @Nullable Rechtsvormtype rechtsvorm;

  private @Nullable String voorkeursnaam;

  @Valid
  private @Nullable List<@Valid OrganisatieType> type;

  @Valid
  private @Nullable List<@Valid Contactpunt> contactinfo;

  @Valid
  private @Nullable List<@Valid LandbouwActiviteit> activiteit;

  @Valid
  private @Nullable List<OrganisatieLidInner> lid;

  private @Nullable Identificator identificator;

  public GeregistreerdeOrganisatie() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GeregistreerdeOrganisatie(String atType, Identificator registratie) {
    this.atType = atType;
    this.registratie = registratie;
  }

  public GeregistreerdeOrganisatie atId(@Nullable URI atId) {
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

  public GeregistreerdeOrganisatie atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * Object type (klasse GeregistreerdeOrganisatie)
   * @return atType
   */
  @NotNull @Pattern(regexp = "^GeregistreerdeOrganisatie$") 
  @Schema(name = "@type", description = "Object type (klasse GeregistreerdeOrganisatie)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  public GeregistreerdeOrganisatie status(@Nullable List<@Valid OrganisatieStatus> status) {
    this.status = status;
    return this;
  }

  public GeregistreerdeOrganisatie addStatusItem(OrganisatieStatus statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<>();
    }
    this.status.add(statusItem);
    return this;
  }

  /**
   * Toestand van de Organisatie. Specialisatie van classificatie (naast type & activiteit). Lijst van OrganisatieStatus items.
   * @return status
   */
  @Valid @Size(min = 1) 
  @Schema(name = "status", description = "Toestand van de Organisatie. Specialisatie van classificatie (naast type & activiteit). Lijst van OrganisatieStatus items.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable List<@Valid OrganisatieStatus> getStatus() {
    return status;
  }

  public void setStatus(@Nullable List<@Valid OrganisatieStatus> status) {
    this.status = status;
  }

  public GeregistreerdeOrganisatie rechtspersoonlijkheid(@Nullable Rechtspersoonlijkheidtype rechtspersoonlijkheid) {
    this.rechtspersoonlijkheid = rechtspersoonlijkheid;
    return this;
  }

  /**
   * Get rechtspersoonlijkheid
   * @return rechtspersoonlijkheid
   */
  @Valid 
  @Schema(name = "rechtspersoonlijkheid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rechtspersoonlijkheid")
  public @Nullable Rechtspersoonlijkheidtype getRechtspersoonlijkheid() {
    return rechtspersoonlijkheid;
  }

  public void setRechtspersoonlijkheid(@Nullable Rechtspersoonlijkheidtype rechtspersoonlijkheid) {
    this.rechtspersoonlijkheid = rechtspersoonlijkheid;
  }

  public GeregistreerdeOrganisatie registratie(Identificator registratie) {
    this.registratie = registratie;
    return this;
  }

  /**
   * Get registratie
   * @return registratie
   */
  @NotNull @Valid 
  @Schema(name = "registratie", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("registratie")
  public Identificator getRegistratie() {
    return registratie;
  }

  public void setRegistratie(Identificator registratie) {
    this.registratie = registratie;
  }

  public GeregistreerdeOrganisatie rechtsvorm(@Nullable Rechtsvormtype rechtsvorm) {
    this.rechtsvorm = rechtsvorm;
    return this;
  }

  /**
   * Get rechtsvorm
   * @return rechtsvorm
   */
  @Valid 
  @Schema(name = "rechtsvorm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rechtsvorm")
  public @Nullable Rechtsvormtype getRechtsvorm() {
    return rechtsvorm;
  }

  public void setRechtsvorm(@Nullable Rechtsvormtype rechtsvorm) {
    this.rechtsvorm = rechtsvorm;
  }

  public GeregistreerdeOrganisatie voorkeursnaam(@Nullable String voorkeursnaam) {
    this.voorkeursnaam = voorkeursnaam;
    return this;
  }

  /**
   * Naam waarmee de Organisatie bij voorkeur wordt aangeduid.
   * @return voorkeursnaam
   */
  
  @Schema(name = "voorkeursnaam", description = "Naam waarmee de Organisatie bij voorkeur wordt aangeduid.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("voorkeursnaam")
  public @Nullable String getVoorkeursnaam() {
    return voorkeursnaam;
  }

  public void setVoorkeursnaam(@Nullable String voorkeursnaam) {
    this.voorkeursnaam = voorkeursnaam;
  }

  public GeregistreerdeOrganisatie type(@Nullable List<@Valid OrganisatieType> type) {
    this.type = type;
    return this;
  }

  public GeregistreerdeOrganisatie addTypeItem(OrganisatieType typeItem) {
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

  public GeregistreerdeOrganisatie contactinfo(@Nullable List<@Valid Contactpunt> contactinfo) {
    this.contactinfo = contactinfo;
    return this;
  }

  public GeregistreerdeOrganisatie addContactinfoItem(Contactpunt contactinfoItem) {
    if (this.contactinfo == null) {
      this.contactinfo = new ArrayList<>();
    }
    this.contactinfo.add(contactinfoItem);
    return this;
  }

  /**
   * Informatie zoals email, telefoon... die toelaat de Organisatie te contacteren. Lijst van Contactpunt items.
   * @return contactinfo
   */
  @Valid @Size(min = 1) 
  @Schema(name = "contactinfo", description = "Informatie zoals email, telefoon... die toelaat de Organisatie te contacteren. Lijst van Contactpunt items.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactinfo")
  public @Nullable List<@Valid Contactpunt> getContactinfo() {
    return contactinfo;
  }

  public void setContactinfo(@Nullable List<@Valid Contactpunt> contactinfo) {
    this.contactinfo = contactinfo;
  }

  public GeregistreerdeOrganisatie activiteit(@Nullable List<@Valid LandbouwActiviteit> activiteit) {
    this.activiteit = activiteit;
    return this;
  }

  public GeregistreerdeOrganisatie addActiviteitItem(LandbouwActiviteit activiteitItem) {
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

  public GeregistreerdeOrganisatie lid(@Nullable List<OrganisatieLidInner> lid) {
    this.lid = lid;
    return this;
  }

  public GeregistreerdeOrganisatie addLidItem(OrganisatieLidInner lidItem) {
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

  public GeregistreerdeOrganisatie identificator(@Nullable Identificator identificator) {
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
    GeregistreerdeOrganisatie geregistreerdeOrganisatie = (GeregistreerdeOrganisatie) o;
    return Objects.equals(this.atId, geregistreerdeOrganisatie.atId) &&
        Objects.equals(this.atType, geregistreerdeOrganisatie.atType) &&
        Objects.equals(this.status, geregistreerdeOrganisatie.status) &&
        Objects.equals(this.rechtspersoonlijkheid, geregistreerdeOrganisatie.rechtspersoonlijkheid) &&
        Objects.equals(this.registratie, geregistreerdeOrganisatie.registratie) &&
        Objects.equals(this.rechtsvorm, geregistreerdeOrganisatie.rechtsvorm) &&
        Objects.equals(this.voorkeursnaam, geregistreerdeOrganisatie.voorkeursnaam) &&
        Objects.equals(this.type, geregistreerdeOrganisatie.type) &&
        Objects.equals(this.contactinfo, geregistreerdeOrganisatie.contactinfo) &&
        Objects.equals(this.activiteit, geregistreerdeOrganisatie.activiteit) &&
        Objects.equals(this.lid, geregistreerdeOrganisatie.lid) &&
        Objects.equals(this.identificator, geregistreerdeOrganisatie.identificator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atId, atType, status, rechtspersoonlijkheid, registratie, rechtsvorm, voorkeursnaam, type, contactinfo, activiteit, lid, identificator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeregistreerdeOrganisatie {\n");
    sb.append("    atId: ").append(toIndentedString(atId)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    rechtspersoonlijkheid: ").append(toIndentedString(rechtspersoonlijkheid)).append("\n");
    sb.append("    registratie: ").append(toIndentedString(registratie)).append("\n");
    sb.append("    rechtsvorm: ").append(toIndentedString(rechtsvorm)).append("\n");
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

