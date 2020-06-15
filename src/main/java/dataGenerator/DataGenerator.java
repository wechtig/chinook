package dataGenerator;

import entities.Track;
import org.eclipse.persistence.jpa.config.DataService;
import services.DBService;

import javax.xml.crypto.Data;
import java.nio.charset.Charset;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class DataGenerator {

    public static void main(String[] args) {

        DBService dbService = new DBService();
        dbService.saveTrack();
    }

}