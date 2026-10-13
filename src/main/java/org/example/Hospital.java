package org.example;

public class Hospital {

    private Patients [] listOfPatients;

    public Hospital(int numOfPatients){

        listOfPatients = new Patients[numOfPatients];
        initialPatientsSetUp();

    }

    private void initialPatientsSetUp(){

        for(int i = 0; i < listOfPatients.length; i++){
            listOfPatients[i] = new Patients(Simulation.rngNumb().nextInt(listOfPatients.length));
        }

    }

}
