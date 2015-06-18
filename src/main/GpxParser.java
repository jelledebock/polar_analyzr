package main;

import gpx10.Gpx;
import gpx11.GpxType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Created by jelle on 11.06.15.
 */
public class GpxParser {
    public File file;

    public GpxParser(File f) throws IOException {
        System.out.println("File type is "+Files.probeContentType(f.toPath()));
        this.file = f;
    }

    public GpxType parseFile() throws JAXBException {
        String version = this.getVersion();
        JAXBContext jc = JAXBContext.newInstance("gpx11");
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        JAXBElement<GpxType> root = (JAXBElement<GpxType>) unmarshaller.unmarshal(this.file);
        GpxType gpx_file = root.getValue();

        return gpx_file;
    }

    public String getVersion() {
        String version = "1.0";
        try{
            JAXBContext jc = JAXBContext.newInstance("gpx10");
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            Gpx root = (Gpx) unmarshaller.unmarshal(this.file);
        }catch (JAXBException gpx10_exception)
        {
            version = "1.1";
            try {
                JAXBContext jc = JAXBContext.newInstance("gpx11");
                Unmarshaller unmarshaller = jc.createUnmarshaller();
                JAXBElement<GpxType> root = (JAXBElement<GpxType>) unmarshaller.unmarshal(this.file);
            }catch (JAXBException gpx11_exception)
            {
                version = "unsupported";
            }

        }
        return  version;
    }
}
