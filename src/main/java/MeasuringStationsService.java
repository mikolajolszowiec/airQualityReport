import MeasuringStation.MeasuringStation;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MeasuringStationsService implements IMeasuringStationsService {

    private List<MeasuringStation> measuringStationsList;

    public MeasuringStationsService(List<MeasuringStation> stacjePomiaroweList) {
        this.measuringStationsList = stacjePomiaroweList;
    }

    public List<MeasuringStation> getMeasuringStationsList() {
        return measuringStationsList;
    }

    public void setMeasuringStationsList(List<MeasuringStation> measuringStationsList) {
        this.measuringStationsList = measuringStationsList;
    }

    @Override
    public MeasuringStation findNearestStation(Double width, Double length)
    {
        MeasuringStation measuringStationReturn = null;
        Double najmniejszaOdległość= Double.MAX_VALUE;
        for(MeasuringStation stacja: measuringStationsList)
        {
            if(distanceToStation(width, length, stacja)<najmniejszaOdległość)
            {
                najmniejszaOdległość = distanceToStation(width, length, stacja);
                measuringStationReturn = stacja;
            }
        }

        return measuringStationReturn;
    }

    @Override
    public Double distanceToStation(Double width, Double length, MeasuringStation measuringStation) {
        return Math.sqrt((Math.pow(width-Double.valueOf(measuringStation.getGegrLat()),2)+
                ((Math.cos((Double.valueOf(measuringStation.getGegrLat())*Math.PI)/180.0d)*Math.pow(length-Double.valueOf(measuringStation.getGegrLon()),2)))))*(40075.704d/360.0d);
    }

    @Override
    public List<MeasuringStation> findNearestStations(Double width, Double length, int count)
    {
        return this.measuringStationsList.stream()
                .sorted(Comparator.comparing(e->this.distanceToStation(width,length,e)))
                //.sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()).subList(0,count);
    }
}
