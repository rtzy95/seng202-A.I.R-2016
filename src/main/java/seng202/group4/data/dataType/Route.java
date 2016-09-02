package seng202.group4.data.dataType;

import java.util.ArrayList;


/**
 * Created by jjg64 on 15/08/16.
 */
public class Route {
    private String airline;
    private Integer AirlineID;
    private String srcAirport;
    private Integer srcAirportID;
    private String destAirport;
    private Integer destAirportID;
    private String codeshare;
    private Integer stops;
    private double distance;
    private ArrayList<String> equipment = new ArrayList<String>();

    public Route(String airline, Integer airlineID, String srcAirport, Integer srcAirportID, String destAirport, Integer destAirportID, String codeshare, Integer stops, ArrayList<String> equipment) {
        this.airline = airline;
        this.AirlineID = airlineID;
        this.srcAirport = srcAirport;
        this.srcAirportID = srcAirportID;
        this.destAirport = destAirport;
        this.destAirportID = destAirportID;
        this.codeshare = codeshare;
        this.stops = stops;
        this.equipment = equipment;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public Integer getAirlineID() {
        return AirlineID;
    }

    public void setAirlineID(Integer airlineID) {
        AirlineID = airlineID;
    }

    public String getSrcAirport() {
        return srcAirport;
    }

    public void setSrcAirport(String srcAirport) {
        this.srcAirport = srcAirport;
    }

    public Integer getSrcAirportID() {
        return srcAirportID;
    }

    public void setSrcAirportID(Integer srcAirportID) {
        this.srcAirportID = srcAirportID;
    }

    public String getDestAirport() {
        return destAirport;
    }

    public void setDestAirport(String destAirport) {
        this.destAirport = destAirport;
    }

    public Integer getDestAirportID() {
        return destAirportID;
    }

    public void setDestAirportID(Integer destAirportID) {
        this.destAirportID = destAirportID;
    }

    public String getCodeshare() {
        return codeshare;
    }

    public void setCodeshare(String codeshare) {
        this.codeshare = codeshare;
    }

    public Integer getStops() {
        return stops;
    }

    public void setStops(Integer stops) {
        this.stops = stops;
    }

    public ArrayList<String> getEquipment() {
        return equipment;
    }

    public void setEquipment(ArrayList<String> equipment) {
        this.equipment = equipment;
    }
}
