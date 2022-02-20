package com.engeto;

import java.util.ArrayList;
import java.util.List;



public class DataRezervací {
    List<Rezervace> rezerve = new ArrayList<>();


    public void addRezervaci(Rezervace rezervace){
        rezerve.add(rezervace);
    }

    public void printRezervace() {
        for(Rezervace rezervace : rezerve){
            System.out.println(rezervace.getDescription());
        }
    }
}
