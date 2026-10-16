package be.vlaanderen.pocs.oslopersoon.model;

import java.net.URI;
import java.util.Objects;
import be.vlaanderen.pocs.oslopersoon.model.Adres;
import be.vlaanderen.pocs.oslopersoon.model.AdresvoorstellingGemeentenaam;
import be.vlaanderen.pocs.oslopersoon.model.AdresvoorstellingLand;
import be.vlaanderen.pocs.oslopersoon.model.AdresvoorstellingStraatnaam;
import be.vlaanderen.pocs.oslopersoon.model.AdresvoorstellingVolledigAdres;
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
 * Meer leesbare voorstelling met enkel de basisgegevens van het adres, bedoeld voor het gebruik van een adres als attribuut van een ander object.
 */

@Schema(name = "Adresvoorstelling", description = "Meer leesbare voorstelling met enkel de basisgegevens van het adres, bedoeld voor het gebruik van een adres als attribuut van een ander object.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-16T11:39:17.103739945+02:00[Europe/Brussels]", comments = "Generator version: 7.20.0")
public class Adresvoorstelling {

  private @Nullable URI atId;

  private String atType;

  private @Nullable String gemeentecode;

  private @Nullable String busnummer;

  private @Nullable AdresvoorstellingGemeentenaam gemeentenaam;

  private @Nullable String huisnummer;

  private @Nullable AdresvoorstellingLand land;

  private @Nullable String postbus;

  private @Nullable String postcode;

  private @Nullable AdresvoorstellingStraatnaam straatnaam;

  private @Nullable AdresvoorstellingVolledigAdres volledigAdres;

  private @Nullable Adres verwijstNaar;

  public Adresvoorstelling() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Adresvoorstelling(String atType) {
    this.atType = atType;
  }

  public Adresvoorstelling atId(@Nullable URI atId) {
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

  public Adresvoorstelling atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * Object type (klasse Adresvoorstelling)
   * @return atType
   */
  @NotNull @Pattern(regexp = "^Adresvoorstelling$") 
  @Schema(name = "@type", description = "Object type (klasse Adresvoorstelling)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  public Adresvoorstelling gemeentecode(@Nullable String gemeentecode) {
    this.gemeentecode = gemeentecode;
    return this;
  }

  /**
   * Alfanumerieke code die de gemeente identificeert. Bijvoorbeeld: NIS-code. Afgeleid veld van de identificator van OSLO Generiek <a href=\"https://data.vlaanderen.be/ns/generiek/#Gemeente\">Gemeente</a>.
   * @return gemeentecode
   */
  
  @Schema(name = "gemeentecode", description = "Alfanumerieke code die de gemeente identificeert. Bijvoorbeeld: NIS-code. Afgeleid veld van de identificator van OSLO Generiek <a href=\"https://data.vlaanderen.be/ns/generiek/#Gemeente\">Gemeente</a>.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gemeentecode")
  public @Nullable String getGemeentecode() {
    return gemeentecode;
  }

  public void setGemeentecode(@Nullable String gemeentecode) {
    this.gemeentecode = gemeentecode;
  }

  public Adresvoorstelling busnummer(@Nullable String busnummer) {
    this.busnummer = busnummer;
    return this;
  }

  /**
   * Officieel toegekende alfanumerieke code die wordt toegevoegd aan het huisnummer om meerdere gebouweenheden, standplaatsen, ligplaatsen of percelen te onderscheiden die eenzelfde huisnummer hebben. Specialisatie van Adresvoorstelling:locatieaanduiding ten behoeve van Belgische adressen.
   * @return busnummer
   */
  
  @Schema(name = "busnummer", description = "Officieel toegekende alfanumerieke code die wordt toegevoegd aan het huisnummer om meerdere gebouweenheden, standplaatsen, ligplaatsen of percelen te onderscheiden die eenzelfde huisnummer hebben. Specialisatie van Adresvoorstelling:locatieaanduiding ten behoeve van Belgische adressen.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("busnummer")
  public @Nullable String getBusnummer() {
    return busnummer;
  }

  public void setBusnummer(@Nullable String busnummer) {
    this.busnummer = busnummer;
  }

  public Adresvoorstelling gemeentenaam(@Nullable AdresvoorstellingGemeentenaam gemeentenaam) {
    this.gemeentenaam = gemeentenaam;
    return this;
  }

  /**
   * Get gemeentenaam
   * @return gemeentenaam
   */
  @Valid 
  @Schema(name = "gemeentenaam", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gemeentenaam")
  public @Nullable AdresvoorstellingGemeentenaam getGemeentenaam() {
    return gemeentenaam;
  }

  public void setGemeentenaam(@Nullable AdresvoorstellingGemeentenaam gemeentenaam) {
    this.gemeentenaam = gemeentenaam;
  }

  public Adresvoorstelling huisnummer(@Nullable String huisnummer) {
    this.huisnummer = huisnummer;
    return this;
  }

  /**
   * Alfanumerieke code officieel toegekend aan gebouweenheden, ligplaatsen, standplaatsen of percelen. Specialisatie van Adresvoorstelling:locatieaanduiding ten behoeve van Belgische adressen.
   * @return huisnummer
   */
  
  @Schema(name = "huisnummer", description = "Alfanumerieke code officieel toegekend aan gebouweenheden, ligplaatsen, standplaatsen of percelen. Specialisatie van Adresvoorstelling:locatieaanduiding ten behoeve van Belgische adressen.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("huisnummer")
  public @Nullable String getHuisnummer() {
    return huisnummer;
  }

  public void setHuisnummer(@Nullable String huisnummer) {
    this.huisnummer = huisnummer;
  }

  public Adresvoorstelling land(@Nullable AdresvoorstellingLand land) {
    this.land = land;
    return this;
  }

  /**
   * Get land
   * @return land
   */
  @Valid 
  @Schema(name = "land", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("land")
  public @Nullable AdresvoorstellingLand getLand() {
    return land;
  }

  public void setLand(@Nullable AdresvoorstellingLand land) {
    this.land = land;
  }

  public Adresvoorstelling postbus(@Nullable String postbus) {
    this.postbus = postbus;
    return this;
  }

  /**
   * Postbusnummer in een postkantoor.
   * @return postbus
   */
  
  @Schema(name = "postbus", description = "Postbusnummer in een postkantoor.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postbus")
  public @Nullable String getPostbus() {
    return postbus;
  }

  public void setPostbus(@Nullable String postbus) {
    this.postbus = postbus;
  }

  public Adresvoorstelling postcode(@Nullable String postcode) {
    this.postcode = postcode;
    return this;
  }

  /**
   * Code waarmee het geografisch gebied dat adressen voor postale doeleinden groepeert wordt aangeduid.
   * @return postcode
   */
  
  @Schema(name = "postcode", description = "Code waarmee het geografisch gebied dat adressen voor postale doeleinden groepeert wordt aangeduid.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postcode")
  public @Nullable String getPostcode() {
    return postcode;
  }

  public void setPostcode(@Nullable String postcode) {
    this.postcode = postcode;
  }

  public Adresvoorstelling straatnaam(@Nullable AdresvoorstellingStraatnaam straatnaam) {
    this.straatnaam = straatnaam;
    return this;
  }

  /**
   * Get straatnaam
   * @return straatnaam
   */
  @Valid 
  @Schema(name = "straatnaam", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("straatnaam")
  public @Nullable AdresvoorstellingStraatnaam getStraatnaam() {
    return straatnaam;
  }

  public void setStraatnaam(@Nullable AdresvoorstellingStraatnaam straatnaam) {
    this.straatnaam = straatnaam;
  }

  public Adresvoorstelling volledigAdres(@Nullable AdresvoorstellingVolledigAdres volledigAdres) {
    this.volledigAdres = volledigAdres;
    return this;
  }

  /**
   * Get volledigAdres
   * @return volledigAdres
   */
  @Valid 
  @Schema(name = "volledigAdres", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("volledigAdres")
  public @Nullable AdresvoorstellingVolledigAdres getVolledigAdres() {
    return volledigAdres;
  }

  public void setVolledigAdres(@Nullable AdresvoorstellingVolledigAdres volledigAdres) {
    this.volledigAdres = volledigAdres;
  }

  public Adresvoorstelling verwijstNaar(@Nullable Adres verwijstNaar) {
    this.verwijstNaar = verwijstNaar;
    return this;
  }

  /**
   * Get verwijstNaar
   * @return verwijstNaar
   */
  @Valid 
  @Schema(name = "verwijstNaar", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("verwijstNaar")
  public @Nullable Adres getVerwijstNaar() {
    return verwijstNaar;
  }

  public void setVerwijstNaar(@Nullable Adres verwijstNaar) {
    this.verwijstNaar = verwijstNaar;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Adresvoorstelling adresvoorstelling = (Adresvoorstelling) o;
    return Objects.equals(this.atId, adresvoorstelling.atId) &&
        Objects.equals(this.atType, adresvoorstelling.atType) &&
        Objects.equals(this.gemeentecode, adresvoorstelling.gemeentecode) &&
        Objects.equals(this.busnummer, adresvoorstelling.busnummer) &&
        Objects.equals(this.gemeentenaam, adresvoorstelling.gemeentenaam) &&
        Objects.equals(this.huisnummer, adresvoorstelling.huisnummer) &&
        Objects.equals(this.land, adresvoorstelling.land) &&
        Objects.equals(this.postbus, adresvoorstelling.postbus) &&
        Objects.equals(this.postcode, adresvoorstelling.postcode) &&
        Objects.equals(this.straatnaam, adresvoorstelling.straatnaam) &&
        Objects.equals(this.volledigAdres, adresvoorstelling.volledigAdres) &&
        Objects.equals(this.verwijstNaar, adresvoorstelling.verwijstNaar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atId, atType, gemeentecode, busnummer, gemeentenaam, huisnummer, land, postbus, postcode, straatnaam, volledigAdres, verwijstNaar);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Adresvoorstelling {\n");
    sb.append("    atId: ").append(toIndentedString(atId)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    gemeentecode: ").append(toIndentedString(gemeentecode)).append("\n");
    sb.append("    busnummer: ").append(toIndentedString(busnummer)).append("\n");
    sb.append("    gemeentenaam: ").append(toIndentedString(gemeentenaam)).append("\n");
    sb.append("    huisnummer: ").append(toIndentedString(huisnummer)).append("\n");
    sb.append("    land: ").append(toIndentedString(land)).append("\n");
    sb.append("    postbus: ").append(toIndentedString(postbus)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    straatnaam: ").append(toIndentedString(straatnaam)).append("\n");
    sb.append("    volledigAdres: ").append(toIndentedString(volledigAdres)).append("\n");
    sb.append("    verwijstNaar: ").append(toIndentedString(verwijstNaar)).append("\n");
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

