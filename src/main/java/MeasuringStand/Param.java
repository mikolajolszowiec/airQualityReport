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
        "paramName",
        "paramFormula",
        "paramCode",
        "idParam"
})
public class Param {

    @JsonProperty("paramName")
    private String paramName;
    @JsonProperty("paramFormula")
    private String paramFormula;
    @JsonProperty("paramCode")
    private String paramCode;
    @JsonProperty("idParam")
    private Integer idParam;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("paramName")
    public String getParamName() {
        return paramName;
    }

    @JsonProperty("paramName")
    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    @JsonProperty("paramFormula")
    public String getParamFormula() {
        return paramFormula;
    }

    @JsonProperty("paramFormula")
    public void setParamFormula(String paramFormula) {
        this.paramFormula = paramFormula;
    }

    @JsonProperty("paramCode")
    public String getParamCode() {
        return paramCode;
    }

    @JsonProperty("paramCode")
    public void setParamCode(String paramCode) {
        this.paramCode = paramCode;
    }

    @JsonProperty("idParam")
    public Integer getIdParam() {
        return idParam;
    }

    @JsonProperty("idParam")
    public void setIdParam(Integer idParam) {
        this.idParam = idParam;
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
        return "Param{" +
                "paramName='" + paramName + '\'' +
                ", paramFormula='" + paramFormula + '\'' +
                ", paramCode='" + paramCode + '\'' +
                ", idParam=" + idParam +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}