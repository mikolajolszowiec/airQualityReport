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
        "id",
        "stationName",
        "gegrLat",
        "gegrLon",
        "city",
        "addressStreet"
})
public class MeasuringStation {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("stationName")
    private String stationName;
    @JsonProperty("gegrLat")
    private String gegrLat;
    @JsonProperty("gegrLon")
    private String gegrLon;
    @JsonProperty("city")
    private City city;
    @JsonProperty("addressStreet")
    private Object addressStreet;
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

    @JsonProperty("stationName")
    public String getStationName() {
        return stationName;
    }

    @JsonProperty("stationName")
    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    @JsonProperty("gegrLat")
    public String getGegrLat() {
        return gegrLat;
    }

    @JsonProperty("gegrLat")
    public void setGegrLat(String gegrLat) {
        this.gegrLat = gegrLat;
    }

    @JsonProperty("gegrLon")
    public String getGegrLon() {
        return gegrLon;
    }

    @JsonProperty("gegrLon")
    public void setGegrLon(String gegrLon) {
        this.gegrLon = gegrLon;
    }

    @JsonProperty("city")
    public City getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(City city) {
        this.city = city;
    }

    @JsonProperty("addressStreet")
    public Object getAddressStreet() {
        return addressStreet;
    }

    @JsonProperty("addressStreet")
    public void setAddressStreet(Object addressStreet) {
        this.addressStreet = addressStreet;
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
        return "MeasuringStation.MeasuringStation{" +
                "id=" + id +
                ", stationName='" + stationName + '\'' +
                ", gegrLat='" + gegrLat + '\'' +
                ", gegrLon='" + gegrLon + '\'' +
                ", city=" + city +
                ", addressStreet=" + addressStreet +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}