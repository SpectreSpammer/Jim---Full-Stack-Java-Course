package com.onePieceOfJava.day9_exception.exceptionTypes.checkedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class CheckException {

    //method that declares a checked exception
    public static void readFile(String path) throws FileNotFoundException {
        File file = new File(path);

        new Scanner(file);
    }

    // method that catches a checked exception
    public static void connectToDatabase(){
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/db","user","password");
        }catch(SQLException sql){
            System.out.println("Database connection failed:" + sql.getMessage());
        }catch (Exception e){
            System.out.println("An unexpected occured: " + e.getMessage());
        }
    }

}
