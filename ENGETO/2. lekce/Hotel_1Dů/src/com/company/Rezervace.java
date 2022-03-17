package com.engeto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Rezervace {

    List<Guest> additionalGuests = new ArrayList<>();
    LocalDate začátekPobytu;
    LocalDate konecPobytu;
    String jménoHosta;
    int cisloZarezervovanehoPokoje;
    TypeOfStay typeOfStay;

    public Rezervace(int cisloZarezervovanehoPokoje, String jménoHosta, LocalDate začátekPobytu, LocalDate konecPobytu, TypeOfStay typeOfStay){
        this.jménoHosta = jménoHosta;
        this.cisloZarezervovanehoPokoje = cisloZarezervovanehoPokoje;
        this.konecPobytu = konecPobytu;
        this.začátekPobytu = začátekPobytu;
        this.typeOfStay = typeOfStay;
    }

    public String getDescription(){
        String description = ("Číslo zarezervovaného pokoje: č." + cisloZarezervovanehoPokoje + "  Jméno hosta: " + jménoHosta + "  Čas rezervace: od " + začátekPobytu + " do " + konecPobytu + " Typ pobytu: " + typeOfStay);
        return description;
    }

    public int getCisloZarezervovanehoPokoje() {
        return cisloZarezervovanehoPokoje;
    }

    public void setCisloZarezervovanehoPokoje(int cisloZarezervovanehoPokoje) {
        this.cisloZarezervovanehoPokoje = cisloZarezervovanehoPokoje;
    }

    public String getJménoHosta() {
        return jménoHosta;
    }

    public void setJménoHosta(String jménoHosta) {
        this.jménoHosta = jménoHosta;
    }

    public LocalDate getZačátekPobytu() {
        return začátekPobytu;
    }

    public void setZačátekPobytu(LocalDate začátekPobytu) {
        this.začátekPobytu = začátekPobytu;
    }

    public LocalDate getKonecPobytu() {
        return konecPobytu;
    }

    public void setKonecPobytu(LocalDate konecPobytu) {
        this.konecPobytu = konecPobytu;
    }

    public List<Guest> getAdditionalGuests() {
        return additionalGuests;
    }

    public void setAdditionalGuests(List<Guest> additionalGuests) {
        this.additionalGuests = additionalGuests;
    }

    public TypeOfStay getTypeOfStay() {
        return typeOfStay;
    }

    public void setTypeOfStay(TypeOfStay typeOfStay) {
        this.typeOfStay = typeOfStay;
    }
}
