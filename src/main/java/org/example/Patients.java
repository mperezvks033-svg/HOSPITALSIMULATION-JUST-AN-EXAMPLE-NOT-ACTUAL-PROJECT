package org.example;

public class Patients {

    //HAS A
    private int id = 0;
    private String chiefComplain = "";
    private String[] surgery = {"C-section open",
                                "C-section laparoscopic",
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
                                }; //list size = 14

    public Patients(int randomNumber){

        id++;
        chiefComplain = surgery[randomNumber];

    }


}
