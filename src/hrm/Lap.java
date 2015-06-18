package hrm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by jelle on 11.06.15.
 */
public class Lap {
    public GregorianCalendar time;
    public int current_hr;
    public int min_hr;
    public int avg_hr;
    public int max_hr;

    public Lap(String time, int current_hr, int min_hr, int avg_hr, int max_hr) throws ParseException {
        this.setTime(time);
        this.current_hr = current_hr;
        this.min_hr = min_hr;
        this.avg_hr = avg_hr;
        this.max_hr = max_hr;
    }

    public GregorianCalendar getTime() {
        return time;
    }

    public void setTime(String time) throws ParseException {
        SimpleDateFormat duration_parser = new SimpleDateFormat("HH:mm:ss.S");
        Date duration_time = duration_parser.parse(time);
        this.time = (GregorianCalendar) Calendar.getInstance();
        this.time.setTime(duration_time);
    }

    public int getCurrent_hr() {
        return current_hr;
    }

    public void setCurrent_hr(int current_hr) {
        this.current_hr = current_hr;
    }

    public int getMin_hr() {
        return min_hr;
    }

    public void setMin_hr(int min_hr) {
        this.min_hr = min_hr;
    }

    public int getAvg_hr() {
        return avg_hr;
    }

    public void setAvg_hr(int avg_hr) {
        this.avg_hr = avg_hr;
    }

    public int getMax_hr() {
        return max_hr;
    }

    public void setMax_hr(int max_hr) {
        this.max_hr = max_hr;
    }

    public String getReadableTime() {
        SimpleDateFormat duration_parser = new SimpleDateFormat("HH:mm:ss.S");
        return duration_parser.format(this.getTime().getTime());
    }
}
