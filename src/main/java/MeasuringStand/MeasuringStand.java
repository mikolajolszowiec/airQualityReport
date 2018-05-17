package MeasuringStand;

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
        "id",
        "stationId",
        "param"
})
public class MeasuringStand {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("stationId")
    private Integer stationId;
    @JsonProperty("param")
    private Param param;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("stationId")
    public Integer getStationId() {
        return stationId;
    }

    @JsonProperty("stationId")
    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    @JsonProperty("param")
    public Param getParam() {
        return param;
    }

    @JsonProperty("param")
    public void setParam(Param param) {
        this.param = param;
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
        return "MeasuringStand{" +
                "id=" + id +
                ", stationId=" + stationId +
                ", param=" + param +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}