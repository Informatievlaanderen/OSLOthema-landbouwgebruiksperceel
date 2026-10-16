package be.vlaanderen.pocs.oslopersoon.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Naam waarmee de Organisatie bij voorkeur wordt aangeduid.
 */

@Schema(name = "Organisatie.voorkeursnaam", description = "Naam waarmee de Organisatie bij voorkeur wordt aangeduid.")
@JsonTypeName("Organisatie.voorkeursnaam")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-16T11:39:17.103739945+02:00[Europe/Brussels]", comments = "Generator version: 7.20.0")
public class OrganisatieVoorkeursnaam {

  private String atValue;

  private String atLanguage;

  public OrganisatieVoorkeursnaam() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OrganisatieVoorkeursnaam(String atValue, String atLanguage) {
    this.atValue = atValue;
    this.atLanguage = atLanguage;
  }

  public OrganisatieVoorkeursnaam atValue(String atValue) {
    this.atValue = atValue;
    return this;
  }

  /**
   * Get atValue
   * @return atValue
   */
  @NotNull 
  @Schema(name = "@value", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@value")
  public String getAtValue() {
    return atValue;
  }

  public void setAtValue(String atValue) {
    this.atValue = atValue;
  }

  public OrganisatieVoorkeursnaam atLanguage(String atLanguage) {
    this.atLanguage = atLanguage;
    return this;
  }

  /**
   * Get atLanguage
   * @return atLanguage
   */
  @NotNull @Pattern(regexp = "^nl$") 
  @Schema(name = "@language", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@language")
  public String getAtLanguage() {
    return atLanguage;
  }

  public void setAtLanguage(String atLanguage) {
    this.atLanguage = atLanguage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganisatieVoorkeursnaam organisatieVoorkeursnaam = (OrganisatieVoorkeursnaam) o;
    return Objects.equals(this.atValue, organisatieVoorkeursnaam.atValue) &&
        Objects.equals(this.atLanguage, organisatieVoorkeursnaam.atLanguage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atValue, atLanguage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganisatieVoorkeursnaam {\n");
    sb.append("    atValue: ").append(toIndentedString(atValue)).append("\n");
    sb.append("    atLanguage: ").append(toIndentedString(atLanguage)).append("\n");
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

