package be.vlaanderen.pocs.oslopersoon.model;

import java.net.URI;
import java.util.Objects;
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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-15T14:56:46.547161501+02:00[Europe/Brussels]", comments = "Generator version: 7.20.0")
public class OrganisatieStatus {

  private URI atId;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganisatieStatus organisatieStatus = (OrganisatieStatus) o;
    return Objects.equals(this.atId, organisatieStatus.atId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganisatieStatus {\n");
    sb.append("    atId: ").append(toIndentedString(atId)).append("\n");
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

