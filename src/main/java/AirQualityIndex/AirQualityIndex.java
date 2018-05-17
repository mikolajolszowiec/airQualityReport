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
        "stCalcDate",
        "stIndexLevel",
        "stSourceDataDate",
        "so2CalcDate",
        "so2IndexLevel",
        "so2SourceDataDate",
        "no2CalcDate",
        "no2IndexLevel",
        "no2SourceDataDate",
        "coCalcDate",
        "coIndexLevel",
        "coSourceDataDate",
        "pm10CalcDate",
        "pm10IndexLevel",
        "pm10SourceDataDate",
        "pm25CalcDate",
        "pm25IndexLevel",
        "pm25SourceDataDate",
        "o3CalcDate",
        "o3IndexLevel",
        "o3SourceDataDate",
        "c6h6CalcDate",
        "c6h6IndexLevel",
        "c6h6SourceDataDate",
        "stIndexStatus",
        "stIndexCrParam"
})
public class AirQualityIndex {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("stCalcDate")
    private String stCalcDate;
    @JsonProperty("stIndexLevel")
    private StIndexLevel stIndexLevel;
    @JsonProperty("stSourceDataDate")
    private String stSourceDataDate;
    @JsonProperty("so2CalcDate")
    private String so2CalcDate;
    @JsonProperty("so2IndexLevel")
    private So2IndexLevel so2IndexLevel;
    @JsonProperty("so2SourceDataDate")
    private String so2SourceDataDate;
    @JsonProperty("no2CalcDate")
    private String no2CalcDate;
    @JsonProperty("no2IndexLevel")
    private No2IndexLevel no2IndexLevel;
    @JsonProperty("no2SourceDataDate")
    private String no2SourceDataDate;
    @JsonProperty("coCalcDate")
    private String coCalcDate;
    @JsonProperty("coIndexLevel")
    private CoIndexLevel coIndexLevel;
    @JsonProperty("coSourceDataDate")
    private String coSourceDataDate;
    @JsonProperty("pm10CalcDate")
    private String pm10CalcDate;
    @JsonProperty("pm10IndexLevel")
    private Pm10IndexLevel pm10IndexLevel;
    @JsonProperty("pm10SourceDataDate")
    private String pm10SourceDataDate;
    @JsonProperty("pm25CalcDate")
    private String pm25CalcDate;
    @JsonProperty("pm25IndexLevel")
    private Object pm25IndexLevel;
    @JsonProperty("pm25SourceDataDate")
    private Object pm25SourceDataDate;
    @JsonProperty("o3CalcDate")
    private String o3CalcDate;
    @JsonProperty("o3IndexLevel")
    private O3IndexLevel o3IndexLevel;
    @JsonProperty("o3SourceDataDate")
    private String o3SourceDataDate;
    @JsonProperty("c6h6CalcDate")
    private String c6h6CalcDate;
    @JsonProperty("c6h6IndexLevel")
    private C6h6IndexLevel c6h6IndexLevel;
    @JsonProperty("c6h6SourceDataDate")
    private String c6h6SourceDataDate;
    @JsonProperty("stIndexStatus")
    private Boolean stIndexStatus;
    @JsonProperty("stIndexCrParam")
    private String stIndexCrParam;
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

    @JsonProperty("stCalcDate")
    public String getStCalcDate() {
        return stCalcDate;
    }

    @JsonProperty("stCalcDate")
    public void setStCalcDate(String stCalcDate) {
        this.stCalcDate = stCalcDate;
    }

    @JsonProperty("stIndexLevel")
    public StIndexLevel getStIndexLevel() {
        return stIndexLevel;
    }

    @JsonProperty("stIndexLevel")
    public void setStIndexLevel(StIndexLevel stIndexLevel) {
        this.stIndexLevel = stIndexLevel;
    }

    @JsonProperty("stSourceDataDate")
    public String getStSourceDataDate() {
        return stSourceDataDate;
    }

    @JsonProperty("stSourceDataDate")
    public void setStSourceDataDate(String stSourceDataDate) {
        this.stSourceDataDate = stSourceDataDate;
    }

    @JsonProperty("so2CalcDate")
    public String getSo2CalcDate() {
        return so2CalcDate;
    }

    @JsonProperty("so2CalcDate")
    public void setSo2CalcDate(String so2CalcDate) {
        this.so2CalcDate = so2CalcDate;
    }

    @JsonProperty("so2IndexLevel")
    public So2IndexLevel getSo2IndexLevel() {
        return so2IndexLevel;
    }

    @JsonProperty("so2IndexLevel")
    public void setSo2IndexLevel(So2IndexLevel so2IndexLevel) {
        this.so2IndexLevel = so2IndexLevel;
    }

    @JsonProperty("so2SourceDataDate")
    public String getSo2SourceDataDate() {
        return so2SourceDataDate;
    }

    @JsonProperty("so2SourceDataDate")
    public void setSo2SourceDataDate(String so2SourceDataDate) {
        this.so2SourceDataDate = so2SourceDataDate;
    }

    @JsonProperty("no2CalcDate")
    public String getNo2CalcDate() {
        return no2CalcDate;
    }

    @JsonProperty("no2CalcDate")
    public void setNo2CalcDate(String no2CalcDate) {
        this.no2CalcDate = no2CalcDate;
    }

    @JsonProperty("no2IndexLevel")
    public No2IndexLevel getNo2IndexLevel() {
        return no2IndexLevel;
    }

    @JsonProperty("no2IndexLevel")
    public void setNo2IndexLevel(No2IndexLevel no2IndexLevel) {
        this.no2IndexLevel = no2IndexLevel;
    }

    @JsonProperty("no2SourceDataDate")
    public String getNo2SourceDataDate() {
        return no2SourceDataDate;
    }

    @JsonProperty("no2SourceDataDate")
    public void setNo2SourceDataDate(String no2SourceDataDate) {
        this.no2SourceDataDate = no2SourceDataDate;
    }

    @JsonProperty("coCalcDate")
    public String getCoCalcDate() {
        return coCalcDate;
    }

    @JsonProperty("coCalcDate")
    public void setCoCalcDate(String coCalcDate) {
        this.coCalcDate = coCalcDate;
    }

    @JsonProperty("coIndexLevel")
    public CoIndexLevel getCoIndexLevel() {
        return coIndexLevel;
    }

    @JsonProperty("coIndexLevel")
    public void setCoIndexLevel(CoIndexLevel coIndexLevel) {
        this.coIndexLevel = coIndexLevel;
    }

    @JsonProperty("coSourceDataDate")
    public String getCoSourceDataDate() {
        return coSourceDataDate;
    }

    @JsonProperty("coSourceDataDate")
    public void setCoSourceDataDate(String coSourceDataDate) {
        this.coSourceDataDate = coSourceDataDate;
    }

    @JsonProperty("pm10CalcDate")
    public String getPm10CalcDate() {
        return pm10CalcDate;
    }

    @JsonProperty("pm10CalcDate")
    public void setPm10CalcDate(String pm10CalcDate) {
        this.pm10CalcDate = pm10CalcDate;
    }

    @JsonProperty("pm10IndexLevel")
    public Pm10IndexLevel getPm10IndexLevel() {
        return pm10IndexLevel;
    }

    @JsonProperty("pm10IndexLevel")
    public void setPm10IndexLevel(Pm10IndexLevel pm10IndexLevel) {
        this.pm10IndexLevel = pm10IndexLevel;
    }

    @JsonProperty("pm10SourceDataDate")
    public String getPm10SourceDataDate() {
        return pm10SourceDataDate;
    }

    @JsonProperty("pm10SourceDataDate")
    public void setPm10SourceDataDate(String pm10SourceDataDate) {
        this.pm10SourceDataDate = pm10SourceDataDate;
    }

    @JsonProperty("pm25CalcDate")
    public String getPm25CalcDate() {
        return pm25CalcDate;
    }

    @JsonProperty("pm25CalcDate")
    public void setPm25CalcDate(String pm25CalcDate) {
        this.pm25CalcDate = pm25CalcDate;
    }

    @JsonProperty("pm25IndexLevel")
    public Object getPm25IndexLevel() {
        return pm25IndexLevel;
    }

    @JsonProperty("pm25IndexLevel")
    public void setPm25IndexLevel(Object pm25IndexLevel) {
        this.pm25IndexLevel = pm25IndexLevel;
    }

    @JsonProperty("pm25SourceDataDate")
    public Object getPm25SourceDataDate() {
        return pm25SourceDataDate;
    }

    @JsonProperty("pm25SourceDataDate")
    public void setPm25SourceDataDate(Object pm25SourceDataDate) {
        this.pm25SourceDataDate = pm25SourceDataDate;
    }

    @JsonProperty("o3CalcDate")
    public String getO3CalcDate() {
        return o3CalcDate;
    }

    @JsonProperty("o3CalcDate")
    public void setO3CalcDate(String o3CalcDate) {
        this.o3CalcDate = o3CalcDate;
    }

    @JsonProperty("o3IndexLevel")
    public O3IndexLevel getO3IndexLevel() {
        return o3IndexLevel;
    }

    @JsonProperty("o3IndexLevel")
    public void setO3IndexLevel(O3IndexLevel o3IndexLevel) {
        this.o3IndexLevel = o3IndexLevel;
    }

    @JsonProperty("o3SourceDataDate")
    public String getO3SourceDataDate() {
        return o3SourceDataDate;
    }

    @JsonProperty("o3SourceDataDate")
    public void setO3SourceDataDate(String o3SourceDataDate) {
        this.o3SourceDataDate = o3SourceDataDate;
    }

    @JsonProperty("c6h6CalcDate")
    public String getC6h6CalcDate() {
        return c6h6CalcDate;
    }

    @JsonProperty("c6h6CalcDate")
    public void setC6h6CalcDate(String c6h6CalcDate) {
        this.c6h6CalcDate = c6h6CalcDate;
    }

    @JsonProperty("c6h6IndexLevel")
    public C6h6IndexLevel getC6h6IndexLevel() {
        return c6h6IndexLevel;
    }

    @JsonProperty("c6h6IndexLevel")
    public void setC6h6IndexLevel(C6h6IndexLevel c6h6IndexLevel) {
        this.c6h6IndexLevel = c6h6IndexLevel;
    }

    @JsonProperty("c6h6SourceDataDate")
    public String getC6h6SourceDataDate() {
        return c6h6SourceDataDate;
    }

    @JsonProperty("c6h6SourceDataDate")
    public void setC6h6SourceDataDate(String c6h6SourceDataDate) {
        this.c6h6SourceDataDate = c6h6SourceDataDate;
    }

    @JsonProperty("stIndexStatus")
    public Boolean getStIndexStatus() {
        return stIndexStatus;
    }

    @JsonProperty("stIndexStatus")
    public void setStIndexStatus(Boolean stIndexStatus) {
        this.stIndexStatus = stIndexStatus;
    }

    @JsonProperty("stIndexCrParam")
    public String getStIndexCrParam() {
        return stIndexCrParam;
    }

    @JsonProperty("stIndexCrParam")
    public void setStIndexCrParam(String stIndexCrParam) {
        this.stIndexCrParam = stIndexCrParam;
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
        return "AirQualityIndex{" +
                "id=" + id +
                ", stCalcDate='" + stCalcDate + '\'' +
                ", stIndexLevel=" + stIndexLevel +
                ", stSourceDataDate='" + stSourceDataDate + '\'' +
                ", so2CalcDate='" + so2CalcDate + '\'' +
                ", so2IndexLevel=" + so2IndexLevel +
                ", so2SourceDataDate='" + so2SourceDataDate + '\'' +
                ", no2CalcDate=" + no2CalcDate +
                ", no2IndexLevel=" + no2IndexLevel +
                ", no2SourceDataDate='" + no2SourceDataDate + '\'' +
                ", coCalcDate='" + coCalcDate + '\'' +
                ", coIndexLevel=" + coIndexLevel +
                ", coSourceDataDate='" + coSourceDataDate + '\'' +
                ", pm10CalcDate='" + pm10CalcDate + '\'' +
                ", pm10IndexLevel=" + pm10IndexLevel +
                ", pm10SourceDataDate='" + pm10SourceDataDate + '\'' +
                ", pm25CalcDate='" + pm25CalcDate + '\'' +
                ", pm25IndexLevel=" + pm25IndexLevel +
                ", pm25SourceDataDate=" + pm25SourceDataDate +
                ", o3CalcDate='" + o3CalcDate + '\'' +
                ", o3IndexLevel=" + o3IndexLevel +
                ", o3SourceDataDate='" + o3SourceDataDate + '\'' +
                ", c6h6CalcDate='" + c6h6CalcDate + '\'' +
                ", c6h6IndexLevel=" + c6h6IndexLevel +
                ", c6h6SourceDataDate='" + c6h6SourceDataDate + '\'' +
                ", stIndexStatus=" + stIndexStatus +
                ", stIndexCrParam='" + stIndexCrParam + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}