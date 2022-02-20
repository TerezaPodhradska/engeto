package com.engeto;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Guest guest01 = new Guest("Adéla", "Malíková", LocalDate.of (1993 ,3 ,13 ));

        Guest guest02 = new Guest("Jana", "Dvořáčka", LocalDate.of(1995, 5, 5));

        System.out.println(guest01.getDescription());
        System.out.println(guest02.getDescription());

        Pokoj pokoj01 = new Pokoj(1, true, true, 1000, 01);
        Pokoj pokoj02 = new Pokoj(1, true, true, 1000, 02);
        Pokoj pokoj03 = new Pokoj(3, false, true, 2400, 03);

        System.out.println(pokoj01.getDescription());
        System.out.println(pokoj02.getDescription());
        System.out.println(pokoj03.getDescription());

        Rezervace rezervace01 = new Rezervace(1,"Adéla Malíková", LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), TypeOfStay.WORKING);
        Rezervace rezervace02 = new Rezervace(3,"Adéla Malíková, Jana Dvořáčková", LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), TypeOfStay.RECREATIONAL);

        System.out.println(rezervace01.getDescription());
        System.out.println(rezervace02.getDescription());

        DataRezervací dataRezervací= new DataRezervací();

        dataRezervací.addRezervaci(rezervace01);

        dataRezervací.addRezervaci(rezervace02);

        dataRezervací.printRezervace();
    }
}
