package tests;

import gpx11.GpxType;
import hrm.Hrm;
import hrm.HrmParser;
import main.GpxParser;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;

/**
 * Created by jelle on 11.06.15.
 */
public class TestFile {
    public static void main(String[] args){
        File v11 = new File("/home/jelle/IdeaProjects/GPXAnalyze/gpx_test.gpx");
        File v10 = new File("/home/jelle/IdeaProjects/GPXAnalyze/version10.gpx");
        File hrm1 = new File("/home/jelle/IdeaProjects/GPXAnalyze/Testdata/training_1.hrm");
        File hrm3 = new File("/home/jelle/IdeaProjects/GPXAnalyze/Testdata/training_3.hrm");

        try {
            GpxParser gpxpv11 = new GpxParser(v11);
            GpxParser gpxpv10 = new GpxParser(v10);
            HrmParser hrmparser1 = new HrmParser(hrm1);
            HrmParser hrmparser3 = new HrmParser(hrm3);

            System.out.println("The version of the first file ("+v11.getName()+") is "+gpxpv11.getVersion());
            System.out.println("The version of the second file ("+v10.getName()+") is "+gpxpv10.getVersion());

            Hrm hrm_obj = hrmparser1.parse();
            System.out.println(hrm_obj.toString());

            Hrm hrm_obj3 = hrmparser3.parse();
            System.out.println(hrm_obj3.toString());
        } catch (IOException e) {
            System.out.println("Bummer... An file error has occurred");
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Bummer... An file error has occurred");
            e.printStackTrace();
        }
    }
}
