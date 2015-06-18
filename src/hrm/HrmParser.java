package hrm;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.DoubleSummaryStatistics;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * Created by jelle on 11.06.15.
 */
public class HrmParser {
    public File hrm_file;

    public HrmParser(File hrm_file) {
        this.hrm_file = hrm_file;
    }

    public Hrm parse() throws IOException, ParseException {
        Hrm data = new Hrm();

        data=getGeneralInfo(data);
        data=getNote(data);
        data=getHRZones(data);
        data=getLaps(data);
        data=getHrData(data);

        return data;
    }

    private Hrm getHrData(Hrm data) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(this.hrm_file));

        String line = reader.readLine();

        while (!line.equals("[HRData]"))
        {
            line = reader.readLine();
        }
        //Read first hr data line
        line=reader.readLine();

        while (!line.isEmpty()) {
            String[] parsed_line = line.replaceAll("\\s+", " ").split(" ");
            int index = 0;

            int hr = Integer.parseInt(parsed_line[index]);
            index++;
            double speed = Double.parseDouble(parsed_line[index]) / 10;
            index++;
            int cad = 0;
            if (data.isCad_available()) {
                cad = Integer.parseInt(parsed_line[index]);
                index++;
            }
            int alt = 0;
            if (data.isAlt_available()) {
                alt = Integer.parseInt(parsed_line[index]);
                index++;
            }
            int power = 0;
            if (data.isPower_available()) {
                power = Integer.parseInt(parsed_line[index]);
                index++;
            }
            int pbp = 0;
            if (data.isPbp_available()) {
                pbp = Integer.parseInt(parsed_line[index]);
                index++;
            }

            HrData hrData = new HrData(hr, speed, cad, alt, power, pbp);

            data.addHrData(hrData);
            line = reader.readLine();
        }

        return data;
    }

    private Hrm getLaps(Hrm data) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new FileReader(this.hrm_file));

        String line = reader.readLine();
        while (!line.equals("[IntTimes]"))
        {
            line = reader.readLine();
        }

        //Read first interval line
        line=reader.readLine();

        while (!line.isEmpty())
        {
            String[] parsed_line = line.replaceAll("\\s+", " ").split(" ");
            //First line
            Lap lap = new Lap(parsed_line[0],Integer.parseInt(parsed_line[1]),Integer.parseInt(parsed_line[2]),Integer.parseInt(parsed_line[3]),Integer.parseInt(parsed_line[4]));

            data.addLap(lap);
            //Skip 4 other lines
            line = reader.readLine();
            line = reader.readLine();
            line = reader.readLine();
            line = reader.readLine();
            //Read following lap or end of intervals
            line = reader.readLine();
        }
        return data;
    }

    private Hrm checkAvailability(Hrm data, String mask) {
        data.setSpeed_available(Integer.parseInt(mask.substring(0,1))==1?true:false);
        data.setCad_available(Integer.parseInt(mask.substring(1, 2)) == 1 ? true : false);
        data.setAlt_available(Integer.parseInt(mask.substring(2, 3)) == 1 ? true : false);
        data.setPower_available(Integer.parseInt(mask.substring(3, 4)) == 1 ? true : false);
        data.setPbp_available(Integer.parseInt(mask.substring(4,5))==1?true:false);

        return data;
    }

    private Hrm getNote(Hrm data) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(this.hrm_file));

        String line = reader.readLine();
        while (!line.equals("[Note]"))
        {
            line = reader.readLine();
        }
        data.setNote(reader.readLine());

        return data;
    }

    private Hrm getHRZones(Hrm data) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(this.hrm_file));

        String line = reader.readLine();
        while (!line.equals("[HRZones]"))
        {
            line = reader.readLine();
        }
        //Zone 1
        data.setZone1(Integer.parseInt(reader.readLine()));
        //Zone 2
        data.setZone2(Integer.parseInt(reader.readLine()));
        //Zone 3
        data.setZone3(Integer.parseInt(reader.readLine()));
        //Zone 4
        data.setZone4(Integer.parseInt(reader.readLine()));
        //Zone 5
        data.setZone5(Integer.parseInt(reader.readLine()));
        //Zone 6
        data.setZone6(Integer.parseInt(reader.readLine()));
        //Zone 7
        data.setZone7(Integer.parseInt(reader.readLine()));
        //Zone 8
        data.setZone8(Integer.parseInt(reader.readLine()));
        //Zone 9
        data.setZone9(Integer.parseInt(reader.readLine()));
        //Zone 10
        data.setZone10(Integer.parseInt(reader.readLine()));
        //Zone 11
        data.setZone11(Integer.parseInt(reader.readLine()));

        return data;
    }

    private Hrm getGeneralInfo(Hrm data) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new FileReader(this.hrm_file));

        String line = reader.readLine();
        if(line.equals("[Params]"))
        {
                //Version not needed
                reader.readLine();
                //Monitor not needed
                reader.readLine();
                //Smode pass mask to another function
                data=this.checkAvailability(data, reader.readLine().substring(6));
                //Date not needed
                reader.readLine();
                //Starttime not needed
                reader.readLine();
                //Duration
                data.setDuration(reader.readLine().substring(7));
                //Interval not needed
                reader.readLine();
                //Upper,lower stuff not needed
                reader.readLine();
                reader.readLine();
                reader.readLine();
                reader.readLine();
                reader.readLine();
                reader.readLine();
                //Timer not needed
                reader.readLine();
                reader.readLine();
                reader.readLine();
                //Activelimit not needed
                reader.readLine();
                //Maxhr
                data.setMax_hr(Integer.parseInt(reader.readLine().substring(6)));
                //Resthr
                data.setRest_hr(Integer.parseInt(reader.readLine().substring(7)));
                //Startdelay not needed
                reader.readLine();
                //VO2max not needed
                reader.readLine();
                //Weight
                data.setWeight(Double.parseDouble(reader.readLine().substring(7)));
        }

        return data;
    }
}
