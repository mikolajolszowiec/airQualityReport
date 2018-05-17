import AirQualityIndex.AirQualityIndex;
import MeasurementData.MeasurementData;
import MeasuringStand.MeasuringStand;
import MeasuringStation.MeasuringStation;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import java.io.IOException;
import java.util.*;

public class AirServiceManager
{

    private final String allStationsAdressAPI = "http://api.gios.gov.pl/pjp-api/rest/station/findAll/";
    private final String measureStandAdressAPI = "http://api.gios.gov.pl/pjp-api/rest/station/sensors/";
    private final String measureStandDataAdressAPI = "http://api.gios.gov.pl/pjp-api/rest/data/getData/";
    private final String airQuailityAdressAPI = "http://api.gios.gov.pl/pjp-api/rest/aqindex/getIndex/";


    public AirServiceManager() {

    }

    public void getAirRaport(Double width, Double length)
    {
        Map<MeasuringStation,AirReport> reportsMap = new HashMap<>();
        MeasuringStationsService measuringStationsService = loadMeasuringStations();
        List<MeasuringStation> measuringStationList = measuringStationsService.findNearestStations(width, length, 8);
        measuringStationList.stream().forEach(System.out::println);
        System.out.println();

        for(MeasuringStation measuringStation: measuringStationList)
            reportsMap.put(measuringStation,
                    new AirReport(measuringStationsService.distanceToStation(width, length, measuringStation), loadAirQualityIndex(Integer.valueOf(measuringStation.getId()))));


        for (MeasuringStation measuringStation: measuringStationList)
        {
            AirReport airReport =  reportsMap.get(measuringStation);
            for(MeasuringStand measuringStand: loadMeasuringStands(Integer.valueOf(measuringStation.getId())))
            {
                airReport.addMeasuringStand(measuringStand);
                airReport.addMeasurementData(loadMeasurementData(Integer.valueOf(measuringStand.getId())));
            }
        }

        reportsMap.entrySet().stream().forEach(System.out::println);
    }

    private MeasuringStationsService loadMeasuringStations()
    {
        Client client = Client.create();
        WebResource webResource =
                client.resource(allStationsAdressAPI);

        ClientResponse clientResponse =
                webResource.get(ClientResponse.class);

        if (clientResponse.getStatus() != 200)
        {
            System.out.println(clientResponse.toString());
            throw new RuntimeException("Blad HTTP numer: "+clientResponse.getStatus());
        }

        String jsonnData = clientResponse.getEntity(String.class);

        ObjectMapper objectMapper = new ObjectMapper();

        MeasuringStation[] measuringStation = null;

        try {
            measuringStation = objectMapper.readValue(jsonnData, MeasuringStation[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new MeasuringStationsService(Arrays.asList(measuringStation));
    }


    private MeasuringStand[] loadMeasuringStands(int measuringStationID)
    {
        Client client = Client.create();
        WebResource webResource =
                client.resource(measureStandAdressAPI+measuringStationID);

        ClientResponse clientResponse =
                webResource.get(ClientResponse.class);

        if (clientResponse.getStatus() != 200)
        {
            System.out.println(clientResponse.toString());
            throw new RuntimeException("Blad HTTP numer: "+clientResponse.getStatus());
        }

        String jsonnData = clientResponse.getEntity(String.class);

        ObjectMapper objectMapper = new ObjectMapper();

        MeasuringStand[] measuringStands = null;

        try {
            measuringStands = objectMapper.readValue(jsonnData, MeasuringStand[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return measuringStands;
    }

    private MeasurementData loadMeasurementData(int measuringSensorID)
    {
        Client client = Client.create();
        WebResource webResource =
                client.resource(measureStandDataAdressAPI+measuringSensorID);

        ClientResponse clientResponse =
                webResource.get(ClientResponse.class);

        if (clientResponse.getStatus() != 200)
        {
            System.out.println(clientResponse.toString());
            throw new RuntimeException("Blad HTTP numer: "+clientResponse.getStatus());
        }

        String jsonnData = clientResponse.getEntity(String.class);
        //System.out.println(jsonnData);

        ObjectMapper objectMapper = new ObjectMapper();

        MeasurementData measurementData = null;

        try {
            measurementData = objectMapper.readValue(jsonnData, MeasurementData.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return measurementData;
    }

    private AirQualityIndex loadAirQualityIndex(int measuringStationID)
    {
        Client client = Client.create();
        WebResource webResource =
                client.resource(airQuailityAdressAPI+measuringStationID);

        ClientResponse clientResponse =
                webResource.get(ClientResponse.class);

        if (clientResponse.getStatus() != 200)
        {
            System.out.println(clientResponse.toString());
            throw new RuntimeException("Blad HTTP numer: "+clientResponse.getStatus());
        }

        String jsonnData = clientResponse.getEntity(String.class);
        //System.out.println(jsonnData);

        ObjectMapper objectMapper = new ObjectMapper();

        AirQualityIndex airQualityIndex = null;

        try {
            airQualityIndex = objectMapper.readValue(jsonnData, AirQualityIndex.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return airQualityIndex;
    }

}
