package com.engeto;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Summary {

    private List<Plants> plantsList = new ArrayList<>();

    public void addPlant(Plants plants) {
        plantsList.add(plants);
    }

    public Plants Plants (int order) {
        return plantsList.get(order);

    }

    public void removePlant(int order) {
        plantsList.remove(order);

    }

    public void loadFromFile(String filename, String delimiter) throws PlantException {
        try (
                Scanner scanner = new Scanner(new BufferedReader(new FileReader(filename)))) {

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    try {
                        this.addPlant(Plants.parse(line, delimiter));
                    } catch (PlantException e) {
                        throw new PlantException("Chybný soubor!");
                    }
                }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

        public void saveToFile(String filename, String delimiter) throws Exception {
        try (PrintWriter writer =
                     new PrintWriter(new FileWriter(filename))
        ) {
            for (Plants plant : plantsList) {
                String plantAsFileLine = plant.outputString(delimiter);
                writer.println(plantAsFileLine);
            }
        } catch (IOException e) {
            throw new PlantException("Chyba");
        }
    }


    public List<Plants> getAllPlants() {
        return new ArrayList<>(plantsList);
    }

}





