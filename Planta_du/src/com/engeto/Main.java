package com.engeto;


import java.time.LocalDate;


public class Main {

    public static final String FILENAME = "plants.txt";
    public static final String DELIMITER = "\t";
    private static final String OUTPUT = "vystup.txt";
    private static final String INCORECTFILE = "kvetiny-spatne-datum.txt";
    private static final String INCORECTFILE02 = "spatne-frekvence.txt";

    public static void main(String[] args) throws Exception {
        Summary plants = new Summary();
        try {
            plants.loadFromFile(INCORECTFILE02, DELIMITER);
            for (Plants plant : plants.getAllPlants()) {
                System.out.println(plant.getWateringInfo());
            }
            plants.removePlant(2);
        }catch (PlantException | IndexOutOfBoundsException e){
            System.err.println(e.getLocalizedMessage());
        }
            plants.addPlant(new Plants("Sedmikráska",6, LocalDate.now()));


            try {
                plants.saveToFile(OUTPUT, DELIMITER);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
}



