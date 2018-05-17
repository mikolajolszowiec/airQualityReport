package MeasuringStation;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "communeName",
        "districtName",
        "provinceName"
})
public class Commune {

    @JsonProperty("communeName")
    private String communeName;
    @JsonProperty("districtName")
    private String districtName;
    @JsonProperty("provinceName")
    private String provinceName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("communeName")
    public String getCommuneName() {
        return communeName;
    }

    @JsonProperty("communeName")
    public void setCommuneName(String communeName) {
        this.communeName = communeName;
    }

    @JsonProperty("districtName")
    public String getDistrictName() {
        return districtName;
    }

    @JsonProperty("districtName")
    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    @JsonProperty("provinceName")
    public String getProvinceName() {
        return provinceName;
    }

    @JsonProperty("provinceName")
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "MeasuringStation.Commune{" +
                "communeName='" + communeName + '\'' +
                ", districtName='" + districtName + '\'' +
                ", provinceName='" + provinceName + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}