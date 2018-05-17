package AirQualityIndex;

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
        "indexLevelName"
})
public class C6h6IndexLevel {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("indexLevelName")
    private String indexLevelName;
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

    @JsonProperty("indexLevelName")
    public String getIndexLevelName() {
        return indexLevelName;
    }

    @JsonProperty("indexLevelName")
    public void setIndexLevelName(String indexLevelName) {
        this.indexLevelName = indexLevelName;
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
        return "C6h6IndexLevel{" +
                "id=" + id +
                ", indexLevelName='" + indexLevelName + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}