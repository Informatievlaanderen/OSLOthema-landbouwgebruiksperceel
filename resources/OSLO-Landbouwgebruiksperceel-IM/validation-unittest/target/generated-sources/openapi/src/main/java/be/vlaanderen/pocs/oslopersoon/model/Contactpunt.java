package be.vlaanderen.pocs.oslopersoon.model;

import java.net.URI;
import java.util.Objects;
import be.vlaanderen.pocs.oslopersoon.model.Adresvoorstelling;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Informatie zoals email, telefoon, adres die toelaat om iemand of iets te contacteren.
 */

@Schema(name = "Contactpunt", description = "Informatie zoals email, telefoon, adres die toelaat om iemand of iets te contacteren.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-15T14:56:46.547161501+02:00[Europe/Brussels]", comments = "Generator version: 7.20.0")
public class Contactpunt {

  private @Nullable URI atId;

  private String atType;

  private @Nullable String email;

  @Valid
  private @Nullable List<String> telefoon;

  private @Nullable Adresvoorstelling adres;

  public Contactpunt() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Contactpunt(String atType) {
    this.atType = atType;
  }

  public Contactpunt atId(@Nullable URI atId) {
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

  public Contactpunt atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * Object type (klasse Contactpunt)
   * @return atType
   */
  @NotNull @Pattern(regexp = "^Contactpunt$") 
  @Schema(name = "@type", description = "Object type (klasse Contactpunt)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  public Contactpunt email(@Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * Email-adres waarnaar men kan mailen.
   * @return email
   */
  
  @Schema(name = "email", description = "Email-adres waarnaar men kan mailen.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public @Nullable String getEmail() {
    return email;
  }

  public void setEmail(@Nullable String email) {
    this.email = email;
  }

  public Contactpunt telefoon(@Nullable List<String> telefoon) {
    this.telefoon = telefoon;
    return this;
  }

  public Contactpunt addTelefoonItem(String telefoonItem) {
    if (this.telefoon == null) {
      this.telefoon = new ArrayList<>();
    }
    this.telefoon.add(telefoonItem);
    return this;
  }

  /**
   * Telefoonnummer waarop men kan bellen. Lijst van Literal items.
   * @return telefoon
   */
  @Size(min = 1) 
  @Schema(name = "telefoon", description = "Telefoonnummer waarop men kan bellen. Lijst van Literal items.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("telefoon")
  public @Nullable List<String> getTelefoon() {
    return telefoon;
  }

  public void setTelefoon(@Nullable List<String> telefoon) {
    this.telefoon = telefoon;
  }

  public Contactpunt adres(@Nullable Adresvoorstelling adres) {
    this.adres = adres;
    return this;
  }

  /**
   * Get adres
   * @return adres
   */
  @Valid 
  @Schema(name = "adres", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adres")
  public @Nullable Adresvoorstelling getAdres() {
    return adres;
  }

  public void setAdres(@Nullable Adresvoorstelling adres) {
    this.adres = adres;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contactpunt contactpunt = (Contactpunt) o;
    return Objects.equals(this.atId, contactpunt.atId) &&
        Objects.equals(this.atType, contactpunt.atType) &&
        Objects.equals(this.email, contactpunt.email) &&
        Objects.equals(this.telefoon, contactpunt.telefoon) &&
        Objects.equals(this.adres, contactpunt.adres);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atId, atType, email, telefoon, adres);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contactpunt {\n");
    sb.append("    atId: ").append(toIndentedString(atId)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    telefoon: ").append(toIndentedString(telefoon)).append("\n");
    sb.append("    adres: ").append(toIndentedString(adres)).append("\n");
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

