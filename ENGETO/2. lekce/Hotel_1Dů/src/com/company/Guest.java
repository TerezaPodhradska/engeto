package com.engeto;

import java.time.LocalDate;

public class Guest {
    private String jméno;
    private String přímení;
    private LocalDate datumNarození;

    public Guest(String jméno, String přímení, LocalDate datumNarození ) {
        this.jméno = jméno;
        this.přímení = přímení;
        this.datumNarození = datumNarození;
    }


    public String getDescription () {
        String description = "Jméno hosta: " + jméno +" " + přímení  + "  Datum narození: " + datumNarození;
        return description;
    }


    public String getJmeno() {
        return jméno;
    }

    public void setJmeno(String jmeno) {
        this.jméno = jmeno;
    }

    public String getPřímení() {
        return přímení;
    }

    public void setPřímení(String přímení) {
        this.přímení = přímení;
    }

    public LocalDate getDatumNarození() {
        return datumNarození;
    }

    public void setDatumNarození(LocalDate datumNarození) {
        this.datumNarození = datumNarození;
    }




}
