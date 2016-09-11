package seng202.group4.data.dataType;

/**
 * Created by jjg64 on 2/09/16.
 */
public class FlightPosition {
    private String type;
    private String ID;
    private double altitude;
    private double longitude;
    private double latitude;

    public FlightPosition(String type, String ID, double altitude, double longitude, double latitude) {
        this.type = type;
        this.ID = ID;
        this.altitude = altitude;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}