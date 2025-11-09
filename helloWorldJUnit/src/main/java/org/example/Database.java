package org.example;

import java.util.logging.Logger;

public class Database {
    private  static final Logger LOGGER = Logger.getLogger(Database.class.getName());

    public static void startConnection(){
        LOGGER.info("Connection started");
    }
    public static void shutdownConnection(){
        LOGGER.info("Connection finalized");
    }

    public static void insertData(Person deivene){
        LOGGER.info("inseriu dados");
    }
    public static void deletData(Person deivene){
        LOGGER.info("excluiu dados");
    }
}
