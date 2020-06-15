package services;


import entities.Genre;
import entities.Track;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class DBService {
    private static final String persistenceUnitName = "projdb";

    private static EntityManagerFactory factory;
    private static EntityManager manager;
    private static EntityTransaction transaction;

    public DBService() {
        factory = Persistence.createEntityManagerFactory(persistenceUnitName);
        manager = factory.createEntityManager();
        transaction = manager.getTransaction();
    }

    public void saveTrack() {
        transaction.begin();
        for (int i = 16001; i < 17000; i++) {
            byte[] array = new byte[8]; // length is bounded by 7
            new Random().nextBytes(array);
            String name = "Track" + i;
            String composer = "Composer" + i;
            int randomNum = ThreadLocalRandom.current().nextInt(10000, 90000);
            int bytes = ThreadLocalRandom.current().nextInt(10000, 90000);
            double randomValue = 1 + (30- 1) * ThreadLocalRandom.current().nextDouble();


            Track newTrack = new Track(i, name, 347, 2, new Genre(2, "Jazz"), composer, randomNum, bytes, randomValue, true, java.util.UUID.randomUUID()+"", 1, LocalDate.of(2019, 12, 12));
            manager.persist(newTrack);
        }
        transaction.commit();
    }
}
