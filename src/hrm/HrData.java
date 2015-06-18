package hrm;

/**
 * Created by jelle on 11.06.15.
 */
public class HrData {
    public int bpm;
    public double speed;
    public int cadence;
    public int altitude;
    public int power;
    public int pbpindex;

    public HrData(int bpm, double speed, int cadence, int altitude, int power, int pbpindex) {
        this.bpm = bpm;
        this.speed = speed;
        this.cadence = cadence;
        this.altitude = altitude;
        this.power = power;
        this.pbpindex = pbpindex;
    }

    public int getBpm() {
        return bpm;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getCadence() {
        return cadence;
    }

    public void setCadence(int cadence) {
        this.cadence = cadence;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPbpindex() {
        return pbpindex;
    }

    public void setPbpindex(int pbpindex) {
        this.pbpindex = pbpindex;
    }
}
