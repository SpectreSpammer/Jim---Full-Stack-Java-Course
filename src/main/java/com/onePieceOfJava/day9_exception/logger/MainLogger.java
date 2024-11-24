package com.onePieceOfJava.day9_exception.logger;

import java.util.logging.Level;
import java.util.logging.Logger;


public class MainLogger {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(MainLogger.class.getName());

        //set logger level
        logger.setLevel(Level.ALL);

        logger.severe("This is a severe  message");
        logger.warning("This is a warning  message");
        logger.info("This is a informational  message");
        logger.config("This is a configuration  message");
        logger.fine("This is a fine  message");
        logger.finer("This is a finer  message");
        logger.finest("This is a finest  message");

        String name = "Jimson";
        int age = 30;
        logger.log(Level.INFO,"User {0} is {1} years old", new Object[]{name,age});

        //logging exception using log
        try{
            int result = 10/0;
            System.out.println(result);
        }catch (ArithmeticException ae){
            logger.log(Level.SEVERE,"An error occured:", ae);
        }
    }
}
