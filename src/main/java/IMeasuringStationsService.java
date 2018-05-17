import MeasuringStation.MeasuringStation;

import java.util.List;

public interface IMeasuringStationsService {

    MeasuringStation findNearestStation(Double width, Double length);
    Double distanceToStation(Double width, Double length, MeasuringStation measuringStation);
    List<MeasuringStation> findNearestStations(Double width, Double length, int count);


}
