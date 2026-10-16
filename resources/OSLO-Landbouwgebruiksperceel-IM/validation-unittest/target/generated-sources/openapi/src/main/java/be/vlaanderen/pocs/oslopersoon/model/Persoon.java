package be.vlaanderen.pocs.oslopersoon.model;

import java.net.URI;
import java.util.Objects;
import be.vlaanderen.pocs.oslopersoon.model.Contactpunt;
import be.vlaanderen.pocs.oslopersoon.model.Identificator;
import be.vlaanderen.pocs.oslopersoon.model.Overlijden;
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
 * Natuurlijk persoon.
 */

@Schema(name = "Persoon", description = "Natuurlijk persoon.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-16T11:39:17.103739945+02:00[Europe/Brussels]", comments = "Generator version: 7.20.0")
public class Persoon implements LandbouwgebruiksperceelGebruiker, OrganisatieLidInner {

  private @Nullable URI atId;

  private String atType;

  private @Nullable Boolean isOverleden;

  @Valid
  private @Nullable List<String> voornaam;

  @Valid
  private @Nullable List<String> alternatieveNaam;

  private @Nullable String achternaam;

  private @Nullable Overlijden heeftOverlijden;

  private @Nullable Contactpunt contactinfo;

  private @Nullable Identificator identificator;

  public Persoon() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Persoon(String atType) {
    this.atType = atType;
  }

  public Persoon atId(@Nullable URI atId) {
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

  public Persoon atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * Object type (klasse Persoon)
   * @return atType
   */
  @NotNull @Pattern(regexp = "^Persoon$") 
  @Schema(name = "@type", description = "Object type (klasse Persoon)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  public Persoon isOverleden(@Nullable Boolean isOverleden) {
    this.isOverleden = isOverleden;
    return this;
  }

  /**
   * Aanduiding of de persoon overleden is of niet. Afgeleid veld van OSLO Persoon <a href=\"https://data.vlaanderen.be/ns/persoon#heeftOverlijden\">heeftOverlijden</a>. Dit veld werd specifiek toegevoegd aan het implementatiemodel wegens de noodzakelijkheden rond gegevenscherming die het reguliere gebruik van heeftOverlijden verhinderen.
   * @return isOverleden
   */
  
  @Schema(name = "isOverleden", description = "Aanduiding of de persoon overleden is of niet. Afgeleid veld van OSLO Persoon <a href=\"https://data.vlaanderen.be/ns/persoon#heeftOverlijden\">heeftOverlijden</a>. Dit veld werd specifiek toegevoegd aan het implementatiemodel wegens de noodzakelijkheden rond gegevenscherming die het reguliere gebruik van heeftOverlijden verhinderen.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isOverleden")
  public @Nullable Boolean getIsOverleden() {
    return isOverleden;
  }

  public void setIsOverleden(@Nullable Boolean isOverleden) {
    this.isOverleden = isOverleden;
  }

  public Persoon voornaam(@Nullable List<String> voornaam) {
    this.voornaam = voornaam;
    return this;
  }

  public Persoon addVoornaamItem(String voornaamItem) {
    if (this.voornaam == null) {
      this.voornaam = new ArrayList<>();
    }
    this.voornaam.add(voornaamItem);
    return this;
  }

  /**
   * Naam die een Persoon bij geboorte wordt gegeven. Onderscheidt de Persoon van de andere personen in de familie. Lijst van String items.
   * @return voornaam
   */
  @Size(min = 1) 
  @Schema(name = "voornaam", description = "Naam die een Persoon bij geboorte wordt gegeven. Onderscheidt de Persoon van de andere personen in de familie. Lijst van String items.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("voornaam")
  public @Nullable List<String> getVoornaam() {
    return voornaam;
  }

  public void setVoornaam(@Nullable List<String> voornaam) {
    this.voornaam = voornaam;
  }

  public Persoon alternatieveNaam(@Nullable List<String> alternatieveNaam) {
    this.alternatieveNaam = alternatieveNaam;
    return this;
  }

  public Persoon addAlternatieveNaamItem(String alternatieveNaamItem) {
    if (this.alternatieveNaam == null) {
      this.alternatieveNaam = new ArrayList<>();
    }
    this.alternatieveNaam.add(alternatieveNaamItem);
    return this;
  }

  /**
   * Alternatief voor de volledige naam van de Persoon. Bijvoorbeeld pseudoniem. Lijst van String items.
   * @return alternatieveNaam
   */
  @Size(min = 1) 
  @Schema(name = "alternatieveNaam", description = "Alternatief voor de volledige naam van de Persoon. Bijvoorbeeld pseudoniem. Lijst van String items.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alternatieveNaam")
  public @Nullable List<String> getAlternatieveNaam() {
    return alternatieveNaam;
  }

  public void setAlternatieveNaam(@Nullable List<String> alternatieveNaam) {
    this.alternatieveNaam = alternatieveNaam;
  }

  public Persoon achternaam(@Nullable String achternaam) {
    this.achternaam = achternaam;
    return this;
  }

  /**
   * Gedeelte van de volledige naam van de Persoon ontvangen van de vorige generatie. Ook wel familienaam genoemd omdat de achternaam een familiale verwantschap aanduidt.
   * @return achternaam
   */
  
  @Schema(name = "achternaam", description = "Gedeelte van de volledige naam van de Persoon ontvangen van de vorige generatie. Ook wel familienaam genoemd omdat de achternaam een familiale verwantschap aanduidt.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("achternaam")
  public @Nullable String getAchternaam() {
    return achternaam;
  }

  public void setAchternaam(@Nullable String achternaam) {
    this.achternaam = achternaam;
  }

  public Persoon heeftOverlijden(@Nullable Overlijden heeftOverlijden) {
    this.heeftOverlijden = heeftOverlijden;
    return this;
  }

  /**
   * Get heeftOverlijden
   * @return heeftOverlijden
   */
  @Valid 
  @Schema(name = "heeftOverlijden", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("heeftOverlijden")
  public @Nullable Overlijden getHeeftOverlijden() {
    return heeftOverlijden;
  }

  public void setHeeftOverlijden(@Nullable Overlijden heeftOverlijden) {
    this.heeftOverlijden = heeftOverlijden;
  }

  public Persoon contactinfo(@Nullable Contactpunt contactinfo) {
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

  public Persoon identificator(@Nullable Identificator identificator) {
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
    Persoon persoon = (Persoon) o;
    return Objects.equals(this.atId, persoon.atId) &&
        Objects.equals(this.atType, persoon.atType) &&
        Objects.equals(this.isOverleden, persoon.isOverleden) &&
        Objects.equals(this.voornaam, persoon.voornaam) &&
        Objects.equals(this.alternatieveNaam, persoon.alternatieveNaam) &&
        Objects.equals(this.achternaam, persoon.achternaam) &&
        Objects.equals(this.heeftOverlijden, persoon.heeftOverlijden) &&
        Objects.equals(this.contactinfo, persoon.contactinfo) &&
        Objects.equals(this.identificator, persoon.identificator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atId, atType, isOverleden, voornaam, alternatieveNaam, achternaam, heeftOverlijden, contactinfo, identificator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Persoon {\n");
    sb.append("    atId: ").append(toIndentedString(atId)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    isOverleden: ").append(toIndentedString(isOverleden)).append("\n");
    sb.append("    voornaam: ").append(toIndentedString(voornaam)).append("\n");
    sb.append("    alternatieveNaam: ").append(toIndentedString(alternatieveNaam)).append("\n");
    sb.append("    achternaam: ").append(toIndentedString(achternaam)).append("\n");
    sb.append("    heeftOverlijden: ").append(toIndentedString(heeftOverlijden)).append("\n");
    sb.append("    contactinfo: ").append(toIndentedString(contactinfo)).append("\n");
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

