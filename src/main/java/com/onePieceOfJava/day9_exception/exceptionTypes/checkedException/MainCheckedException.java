package com.onePieceOfJava.day9_exception.exceptionTypes.checkedException;

import java.io.FileNotFoundException;

public class MainCheckedException {
    public static void main(String[] args) throws FileNotFoundException {
        CheckException.readFile("C:\\Users\\MUGIWARA\\Downloads\\One Piece of Java Tutorial\\Employee.xlsx");
        CheckException.connectToDatabase();
    }
}
