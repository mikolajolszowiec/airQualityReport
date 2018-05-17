import AirQualityIndex.AirQualityIndex;
import MeasurementData.MeasurementData;
import MeasuringStand.MeasuringStand;

import java.util.ArrayList;
import java.util.List;

public class AirReport {

    private Double distance;
    private List<MeasuringStand> measuringStands;
    private List<MeasurementData> measurementDataList;
    private AirQualityIndex airQualityIndex;

    public AirReport(Double distance) {
        this.distance = distance;
        measuringStands = new ArrayList<>();
        measurementDataList = new ArrayList<>();
    }

    public AirReport(Double distance, AirQualityIndex airQualityIndex) {
        this.distance = distance;
        this.airQualityIndex = airQualityIndex;
        measuringStands = new ArrayList<>();
        measurementDataList = new ArrayList<>();
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public void addMeasuringStand(MeasuringStand measuringStand)
    {
        measuringStands.add(measuringStand);
    }

    public void addMeasurementData(MeasurementData measurementData)
    {
        measurementDataList.add(measurementData);
    }

    public AirQualityIndex getAirQualityIndex() {
        return airQualityIndex;
    }

    public void setAirQualityIndex(AirQualityIndex airQualityIndex) {
        this.airQualityIndex = airQualityIndex;
    }

    @Override
    public String toString() {
        return "AirReport{" +
                "distance=" + distance +
                ", measuringStands=" + measuringStands +
                ", measurementDataList=" + measurementDataList +
                ", airQualityIndex=" + airQualityIndex +
                '}';
    }
}
