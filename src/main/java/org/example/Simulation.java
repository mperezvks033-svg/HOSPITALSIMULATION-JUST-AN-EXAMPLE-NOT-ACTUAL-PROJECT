package org.example;

import java.util.Random;

public class Simulation {

    int numOfPatients = 0; //default value, would change according to the size the Simulation wants to create
    Hospital initialSetUp = new Hospital(numOfPatients);

     public static Random rngNumb(){

        Random rng = new Random();
        return rng;
    }


}
