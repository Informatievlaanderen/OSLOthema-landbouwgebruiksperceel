package be.vlaanderen.pocs.oslopersoon.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
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
 * Meer gedetailleerde beschrijving van de fout in een HTTP response.
 */

@Schema(name = "Problemdetail", description = "Meer gedetailleerde beschrijving van de fout in een HTTP response.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-15T14:56:46.547161501+02:00[Europe/Brussels]", comments = "Generator version: 7.20.0")
public class Problemdetail {

  private @Nullable URI atId;

  private String atType;

  private String detail;

  private @Nullable URI instance;

  private @Nullable BigDecimal status;

  private String title;

  private URI type;

  public Problemdetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Problemdetail(String atType, String detail, String title, URI type) {
    this.atType = atType;
    this.detail = detail;
    this.title = title;
    this.type = type;
  }

  public Problemdetail atId(@Nullable URI atId) {
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

  public Problemdetail atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * Object type (klasse Problemdetail)
   * @return atType
   */
  @NotNull @Pattern(regexp = "^Problemdetail$") 
  @Schema(name = "@type", description = "Object type (klasse Problemdetail)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  public Problemdetail detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Mensleesbare beschrijving van de fout.
   * @return detail
   */
  @NotNull 
  @Schema(name = "detail", description = "Mensleesbare beschrijving van de fout.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("detail")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public Problemdetail instance(@Nullable URI instance) {
    this.instance = instance;
    return this;
  }

  /**
   * Verwijzing naar de instantie van het object waarop de fout betrekking heeft. Bijvoorbeeld: de verwijzing naar de request.
   * @return instance
   */
  @Valid 
  @Schema(name = "instance", description = "Verwijzing naar de instantie van het object waarop de fout betrekking heeft. Bijvoorbeeld: de verwijzing naar de request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instance")
  public @Nullable URI getInstance() {
    return instance;
  }

  public void setInstance(@Nullable URI instance) {
    this.instance = instance;
  }

  public Problemdetail status(@Nullable BigDecimal status) {
    this.status = status;
    return this;
  }

  /**
   * HTTP foutcode. Zoals beschreven in <a href=\"https://www.rfc-editor.org/rfc/rfc7231\">RFC7231</a>. Bijvoorbeeld: 404 voor \"Not Found\".
   * @return status
   */
  @Valid 
  @Schema(name = "status", description = "HTTP foutcode. Zoals beschreven in <a href=\"https://www.rfc-editor.org/rfc/rfc7231\">RFC7231</a>. Bijvoorbeeld: 404 voor \"Not Found\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable BigDecimal getStatus() {
    return status;
  }

  public void setStatus(@Nullable BigDecimal status) {
    this.status = status;
  }

  public Problemdetail title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Korte mensleesbare beschrijving van de fout.
   * @return title
   */
  @NotNull 
  @Schema(name = "title", description = "Korte mensleesbare beschrijving van de fout.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Problemdetail type(URI type) {
    this.type = type;
    return this;
  }

  /**
   * Aard van de fout.
   * @return type
   */
  @NotNull @Valid 
  @Schema(name = "type", description = "Aard van de fout.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public URI getType() {
    return type;
  }

  public void setType(URI type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Problemdetail problemdetail = (Problemdetail) o;
    return Objects.equals(this.atId, problemdetail.atId) &&
        Objects.equals(this.atType, problemdetail.atType) &&
        Objects.equals(this.detail, problemdetail.detail) &&
        Objects.equals(this.instance, problemdetail.instance) &&
        Objects.equals(this.status, problemdetail.status) &&
        Objects.equals(this.title, problemdetail.title) &&
        Objects.equals(this.type, problemdetail.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atId, atType, detail, instance, status, title, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Problemdetail {\n");
    sb.append("    atId: ").append(toIndentedString(atId)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

