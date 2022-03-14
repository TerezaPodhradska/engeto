package com.engeto;


import java.time.LocalDate;
import java.time.format.DateTimeParseException;


public class Plants {
    public String name;
    public String notes;
    public LocalDate planted;
    public LocalDate watering;
    public int frequencyOfWatering;

    public  Plants(String name) {
        this.name = name;
        this.frequencyOfWatering = 7;
        this.planted = LocalDate.now();
    }

    public Plants(String name, String notes,int frequencyOfWatering, LocalDate planted, LocalDate watering) {
        this.name = name;
        this.notes = notes;
        this.frequencyOfWatering = frequencyOfWatering;
        this.planted = planted;
        this.watering = watering;

    }
    public Plants(String name, int frequencyOfWatering, LocalDate planted) {
        this.name = name;
        this.notes = " ";
        this.frequencyOfWatering = frequencyOfWatering;
        this.watering = LocalDate.now();
        this.planted = planted;
    }


    public static Plants parse(String text, String delimiter) throws PlantException {
        String[] items = text.split(delimiter);

        int numberOfItems = items.length;
        if (numberOfItems != 5) throw new PlantException("Špatné množství parametrů");

        String name = items[0];
        String notes = items[1];
        try {
            int frequencyOfWatering = Integer.parseInt(items[2]);
            LocalDate watering = LocalDate.parse(items[3]);
            LocalDate planted = LocalDate.parse(items[4]);

            return new Plants(name, notes, frequencyOfWatering, watering, planted);

        } catch (DateTimeParseException ex) {
        throw new PlantException("Datum posledního zalití je starší než datum zasazení květiny!");
        } catch (NumberFormatException ex) {
        throw new PlantException("Frekvence zalití je chybně zadaná!");
        }
    }


    public String getWateringInfo(){
        LocalDate recommendedDate;
        recommendedDate = watering.plusDays(frequencyOfWatering);
        return "U této květiny " + name + " je další doporučený datum zalití: " + recommendedDate;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public LocalDate getPlanted() {
        return planted;
    }

    public void setPlanted(LocalDate planted) {
        this.planted = planted;
    }

    public LocalDate getWatering() {
        return watering;
    }

    public void setWatering(LocalDate watering) throws PlantException {
        LocalDate datePlanted = getPlanted();
        if (watering.isBefore(datePlanted)) {
            throw new PlantException("Datum posledního zalití nesmí bít před jejím zasazením!");
        }
        this.watering = watering;

    }

    public int getFrequencyOfWatering() {
        return frequencyOfWatering;
    }

    public void setFrequencyOfWatering(int frequencyOfWatering) throws PlantException {
        if (frequencyOfWatering <= 0)
            throw new PlantException("Špatně zadaná frekvence");
        this.frequencyOfWatering = frequencyOfWatering;
    }

    public String outputString(String delimiter) {
        return
                getName() + delimiter + getNotes() + delimiter + getFrequencyOfWatering() + delimiter + getWatering() + delimiter + getPlanted();

    }

    public String getDescription() {
        return name + " " + notes + " " + frequencyOfWatering + " " + planted + " " + watering;
    }

}
