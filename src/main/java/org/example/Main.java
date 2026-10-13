package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //Just testing if it works properly
    public static void main(String[] args) {
        Patients patient = new Patients(Simulation.rngNumb().nextInt(13));

        System.out.println();
        System.out.println(patient);
    }
}