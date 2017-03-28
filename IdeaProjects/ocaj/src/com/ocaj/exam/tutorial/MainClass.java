package com.ocaj.exam.tutorial;
import java.util.*;
import java.io.*;


public class MainClass {
    public static void main(String[] args){
        //Console console = System.console();
        Scanner in = new Scanner(System.in);
        //String planet = console.readLine(" \nEnter your favorite planet: ");
        System.out.println("\nEnter your favourite planet: ");
        String planet = in.next();
        ArrayList planetList = new ArrayList();
        planetList.add(planet);
        planetList.add("Gliese 581 c");
        System.out.println(" \nTwo cool planets: " + planetList);

    }
}
