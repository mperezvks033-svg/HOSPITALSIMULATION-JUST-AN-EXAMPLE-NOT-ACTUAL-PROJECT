package org.example;

public class Patients {

    //HAS A
    private int id = 0;
    private String chiefComplain = "";

    private String[] surgery = {"C-section open",
                                "Appendectomy open",
                                "Appendectomy laparoscopic",
                                "Cholecystectomy open",
                                "Cholecystectomy laparoscopic",
                                "Exploratory open",
                                "Exploratory laparoscopic",
                                "Bariatric open",
                                "Bariatric laparoscopic",
                                "Hernia open",
                                "Hernia laparoscopic",
                                "Splenectomy open",
                                "Splenectomy laparoscopic"
                                }; //list size = 13

    public Patients(int randomNumber){

        id = Simulation.rngNumb().nextInt(10000000,90000000);
        chiefComplain = surgery[randomNumber];

    }

    public String toString() {
        return "Patient{" +
                "id = '" + id + '\'' +
                ", chiefComplain = " + chiefComplain +
                '}';
    }

}
