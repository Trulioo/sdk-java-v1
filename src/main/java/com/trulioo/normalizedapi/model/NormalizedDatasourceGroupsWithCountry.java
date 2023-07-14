package com.trulioo.normalizedapi.model;
import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.trulioo.normalizedapi.model.NormalizedDatasourceGroupCountry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
/**
 * 
 */
@ApiModel(description = "")
public class NormalizedDatasourceGroupsWithCountry   {
  @SerializedName("Country")
  private String country = null;
  @SerializedName("Datasources")
  private List<NormalizedDatasourceGroupCountry> datasources = new ArrayList<NormalizedDatasourceGroupCountry>();
  public NormalizedDatasourceGroupsWithCountry country(String country) {
    this.country = country;
    return this;
  }
   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }
  public NormalizedDatasourceGroupsWithCountry datasources(List<NormalizedDatasourceGroupCountry> datasources) {
    this.datasources = datasources;
    return this;
  }
  public NormalizedDatasourceGroupsWithCountry addDatasourcesItem(NormalizedDatasourceGroupCountry datasourcesItem) {
    this.datasources.add(datasourcesItem);
    return this;
  }
   /**
   * Get datasources
   * @return datasources
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<NormalizedDatasourceGroupCountry> getDatasources() {
    return datasources;
  }
  public void setDatasources(List<NormalizedDatasourceGroupCountry> datasources) {
    this.datasources = datasources;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NormalizedDatasourceGroupsWithCountry normalizedDatasourceGroupsWithCountry = (NormalizedDatasourceGroupsWithCountry) o;
    return Objects.equals(this.country, normalizedDatasourceGroupsWithCountry.country) &&
        Objects.equals(this.datasources, normalizedDatasourceGroupsWithCountry.datasources);
  }
  @Override
  public int hashCode() {
    return Objects.hash(country, datasources);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NormalizedDatasourceGroupsWithCountry {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    datasources: ").append(toIndentedString(datasources)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
