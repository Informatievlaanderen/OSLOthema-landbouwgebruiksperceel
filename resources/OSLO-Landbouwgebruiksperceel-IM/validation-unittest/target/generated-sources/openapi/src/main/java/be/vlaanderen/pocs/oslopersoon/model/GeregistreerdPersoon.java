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
 * Persoon waarvan de gegevens zijn ingeschreven in een register.
 */

@Schema(name = "GeregistreerdPersoon", description = "Persoon waarvan de gegevens zijn ingeschreven in een register.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-15T14:56:46.547161501+02:00[Europe/Brussels]", comments = "Generator version: 7.20.0")
public class GeregistreerdPersoon implements LandbouwgebruiksperceelGebruiker, OrganisatieLidInner {

  private @Nullable URI atId;

  private String atType;

  private Identificator registratie;

  private @Nullable Identificator identificator;

  private @Nullable Boolean isOverleden;

  @Valid
  private @Nullable List<String> voornaam;

  @Valid
  private @Nullable List<String> alternatieveNaam;

  private @Nullable String achternaam;

  private @Nullable Overlijden heeftOverlijden;

  private @Nullable Contactpunt contactinfo;

  public GeregistreerdPersoon() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GeregistreerdPersoon(String atType, Identificator registratie) {
    this.atType = atType;
    this.registratie = registratie;
  }

  public GeregistreerdPersoon atId(@Nullable URI atId) {
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

  public GeregistreerdPersoon atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * Object type (klasse GeregistreerdPersoon)
   * @return atType
   */
  @NotNull @Pattern(regexp = "^GeregistreerdPersoon$") 
  @Schema(name = "@type", description = "Object type (klasse GeregistreerdPersoon)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  public GeregistreerdPersoon registratie(Identificator registratie) {
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

  public GeregistreerdPersoon identificator(@Nullable Identificator identificator) {
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

  public GeregistreerdPersoon isOverleden(@Nullable Boolean isOverleden) {
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

  public GeregistreerdPersoon voornaam(@Nullable List<String> voornaam) {
    this.voornaam = voornaam;
    return this;
  }

  public GeregistreerdPersoon addVoornaamItem(String voornaamItem) {
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

  public GeregistreerdPersoon alternatieveNaam(@Nullable List<String> alternatieveNaam) {
    this.alternatieveNaam = alternatieveNaam;
    return this;
  }

  public GeregistreerdPersoon addAlternatieveNaamItem(String alternatieveNaamItem) {
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

  public GeregistreerdPersoon achternaam(@Nullable String achternaam) {
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

  public GeregistreerdPersoon heeftOverlijden(@Nullable Overlijden heeftOverlijden) {
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

  public GeregistreerdPersoon contactinfo(@Nullable Contactpunt contactinfo) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeregistreerdPersoon geregistreerdPersoon = (GeregistreerdPersoon) o;
    return Objects.equals(this.atId, geregistreerdPersoon.atId) &&
        Objects.equals(this.atType, geregistreerdPersoon.atType) &&
        Objects.equals(this.registratie, geregistreerdPersoon.registratie) &&
        Objects.equals(this.identificator, geregistreerdPersoon.identificator) &&
        Objects.equals(this.isOverleden, geregistreerdPersoon.isOverleden) &&
        Objects.equals(this.voornaam, geregistreerdPersoon.voornaam) &&
        Objects.equals(this.alternatieveNaam, geregistreerdPersoon.alternatieveNaam) &&
        Objects.equals(this.achternaam, geregistreerdPersoon.achternaam) &&
        Objects.equals(this.heeftOverlijden, geregistreerdPersoon.heeftOverlijden) &&
        Objects.equals(this.contactinfo, geregistreerdPersoon.contactinfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atId, atType, registratie, identificator, isOverleden, voornaam, alternatieveNaam, achternaam, heeftOverlijden, contactinfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeregistreerdPersoon {\n");
    sb.append("    atId: ").append(toIndentedString(atId)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    registratie: ").append(toIndentedString(registratie)).append("\n");
    sb.append("    identificator: ").append(toIndentedString(identificator)).append("\n");
    sb.append("    isOverleden: ").append(toIndentedString(isOverleden)).append("\n");
    sb.append("    voornaam: ").append(toIndentedString(voornaam)).append("\n");
    sb.append("    alternatieveNaam: ").append(toIndentedString(alternatieveNaam)).append("\n");
    sb.append("    achternaam: ").append(toIndentedString(achternaam)).append("\n");
    sb.append("    heeftOverlijden: ").append(toIndentedString(heeftOverlijden)).append("\n");
    sb.append("    contactinfo: ").append(toIndentedString(contactinfo)).append("\n");
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

