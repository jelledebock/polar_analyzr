package hrm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by jelle on 11.06.15.
 */
public class Hrm {
    public String version;
    public GregorianCalendar duration;
    public double weight;
    public List<Lap> laps;
    public List<HrData> hr_data;
    public String note;
    public int max_hr;
    public int rest_hr;
    public int zone1;
    public int zone2;
    public int zone3;
    public int zone4;
    public int zone5;
    public int zone6;
    public int zone7;
    public int zone8;
    public int zone9;
    public int zone10;
    public int zone11;

    public boolean speed_available;
    public boolean cad_available;
    public boolean alt_available;
    public boolean power_available;
    public boolean pbp_available;

    public Hrm(String version, String duration, double weight, List<Lap> laps, List<HrData> hr_data, String note, int max_hr, int rest_hr, int zone1, int zone2, int zone3, int zone4, int zone5, int zone6, int zone7, int zone8, int zone9, int zone10, int zone11, boolean speed_available, boolean cad_available, boolean alt_available, boolean power_available, boolean pbp_available) throws ParseException {
        this.version = version;
        this.setDuration(duration);
        this.weight = weight;
        this.laps = laps;
        this.hr_data = hr_data;
        this.note = note;
        this.max_hr = max_hr;
        this.rest_hr = rest_hr;
        this.zone1 = zone1;
        this.zone2 = zone2;
        this.zone3 = zone3;
        this.zone4 = zone4;
        this.zone5 = zone5;
        this.zone6 = zone6;
        this.zone7 = zone7;
        this.zone8 = zone8;
        this.zone9 = zone9;
        this.zone10 = zone10;
        this.zone11 = zone11;
        this.speed_available = speed_available;
        this.cad_available = cad_available;
        this.alt_available = alt_available;
        this.power_available = power_available;
        this.pbp_available = pbp_available;
    }

    public Hrm() {
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public GregorianCalendar getDuration() {
        return duration;
    }

    public String getReadableDuration()
    {
        SimpleDateFormat duration_parser = new SimpleDateFormat("HH:mm:ss.S");
        return duration_parser.format(this.getDuration().getTime());
    }

    public void setDuration(String duration) throws ParseException {
        SimpleDateFormat duration_parser = new SimpleDateFormat("HH:mm:ss.S");
        Date duration_time = duration_parser.parse(duration);
        this.duration = (GregorianCalendar) Calendar.getInstance();
        this.duration.setTime(duration_time);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public List<Lap> getLaps() {
        return laps;
    }

    public void setLaps(List<Lap> laps) {
        this.laps = laps;
    }

    public List<HrData> getHr_data() {
        return hr_data;
    }

    public void setHr_data(List<HrData> hr_data) {
        this.hr_data = hr_data;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getMax_hr() {
        return max_hr;
    }

    public void setMax_hr(int max_hr) {
        this.max_hr = max_hr;
    }

    public int getRest_hr() {
        return rest_hr;
    }

    public void setRest_hr(int rest_hr) {
        this.rest_hr = rest_hr;
    }

    public int getZone1() {
        return zone1;
    }

    public void setZone1(int zone1) {
        this.zone1 = zone1;
    }

    public int getZone2() {
        return zone2;
    }

    public void setZone2(int zone2) {
        this.zone2 = zone2;
    }

    public int getZone3() {
        return zone3;
    }

    public void setZone3(int zone3) {
        this.zone3 = zone3;
    }

    public int getZone4() {
        return zone4;
    }

    public void setZone4(int zone4) {
        this.zone4 = zone4;
    }

    public int getZone5() {
        return zone5;
    }

    public void setZone5(int zone5) {
        this.zone5 = zone5;
    }

    public int getZone6() {
        return zone6;
    }

    public void setZone6(int zone6) {
        this.zone6 = zone6;
    }

    public int getZone7() {
        return zone7;
    }

    public void setZone7(int zone7) {
        this.zone7 = zone7;
    }

    public int getZone8() {
        return zone8;
    }

    public void setZone8(int zone8) {
        this.zone8 = zone8;
    }

    public int getZone9() {
        return zone9;
    }

    public void setZone9(int zone9) {
        this.zone9 = zone9;
    }

    public int getZone10() {
        return zone10;
    }

    public void setZone10(int zone10) {
        this.zone10 = zone10;
    }

    public int getZone11() {
        return zone11;
    }

    public void setZone11(int zone11) {
        this.zone11 = zone11;
    }

    public boolean isSpeed_available() {
        return speed_available;
    }

    public void setSpeed_available(boolean speed_available) {
        this.speed_available = speed_available;
    }

    public boolean isCad_available() {
        return cad_available;
    }

    public void setCad_available(boolean cad_available) {
        this.cad_available = cad_available;
    }

    public boolean isAlt_available() {
        return alt_available;
    }

    public void setAlt_available(boolean alt_available) {
        this.alt_available = alt_available;
    }

    public boolean isPower_available() {
        return power_available;
    }

    public void setPower_available(boolean power_available) {
        this.power_available = power_available;
    }

    public boolean isPbp_available() {
        return pbp_available;
    }

    public void setPbp_available(boolean pbp_available) {
        this.pbp_available = pbp_available;
    }

    public String toString()
    {
        return "HRFile with duration of "+this.getReadableDuration().toString()+"\n"+
                "\tuser has HR values of max = "+this.getMax_hr()+" and rest = "+this.getRest_hr()+"\n"+
                "\tzones (1-11): "+this.getZone1()+", "+this.getZone2()+", "+this.getZone3()+", "+this.getZone4()+", "
                +this.getZone5()+", "+this.getZone6()+", "+this.getZone7()+", "+this.getZone8()
                +", "+this.getZone9()+", "+this.getZone10()+", "+this.getZone11()+"\n"+
                "\tNote for this file: "+this.getNote()+"\n"+
                "\tthe following options are available: \n"+
                "\t\tSpeed: "+(this.isSpeed_available()?"yes":"no")+"\n"+
                "\t\tCadence: "+(this.isCad_available()?"yes":"no")+"\n"+
                "\t\tAltitude: "+(this.isAlt_available()?"yes" :"no")+"\n"+
                "\t\tPower: "+(this.isPower_available()?"yes":"no")+"\n"+
                "\t\tPower left right balance: "+(this.isPbp_available()?"yes":"no")+"\n"+
                this.getReadableLaps()+
                this.getReadableHrData()
                ;

    }

    private String getReadableHrData() {
        String hrdata = "\tHr data (" +this.hr_data.size()+" measurements found) : \n";

        for(int i=0; i<this.hr_data.size(); i++)
        {
            hrdata+= "\t\t"+(i+1)+") "+
                    "BPM = "+this.hr_data.get(i).getBpm()+ "\t"+
                    (this.isSpeed_available()?"Speed ="+this.hr_data.get(i).getSpeed()+ "\t":"")+
                    (this.isCad_available()?"Cadence ="+this.hr_data.get(i).getCadence()+ "\t":"")+
                    (this.isAlt_available()?"Altitude ="+this.hr_data.get(i).getAltitude()+ "\t":"")+
                    (this.isPower_available()?"Altitude ="+this.hr_data.get(i).getPower()+ "\t":"")+
                    (this.isPbp_available()?"PBP index ="+this.hr_data.get(i).getPbpindex()+ "\t":"")+'\n';

        }

        return hrdata;
    }

    public void addLap(Lap lap) {
        if(this.laps==null)
        {
            this.laps = new ArrayList<Lap>();
        }
        this.laps.add(lap);
    }

    public String getReadableLaps()
    {
        String laps = "\tLap times: \n";

        for(int i=0; i<this.laps.size(); i++)
        {
            laps += "\t\tLap "+(i+1)+"\n"+
                    "\t\t\tAccumulated time: "+this.laps.get(i).getReadableTime()+
                    "\t\t\tCurrent HR: "+this.laps.get(i).getCurrent_hr()+
                    "\t\t\tMax HR: "+this.laps.get(i).getMax_hr()+
                    "\t\t\tMin HR: "+this.laps.get(i).getMin_hr()+
                    "\t\t\tAvg HR: "+this.laps.get(i).getAvg_hr()+"\n";
        }
        return laps;
    }

    public void addHrData(HrData hrData) {
        if(this.hr_data==null)
        {
            this.hr_data = new ArrayList<HrData>();
        }
        this.hr_data.add(hrData);
    }
}

