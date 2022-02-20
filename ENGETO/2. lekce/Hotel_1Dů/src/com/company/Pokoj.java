package com.engeto;

public class Pokoj {
    private int cisloPokoje;
    private int cena;
    private boolean balkon;
    private  int lůžka;
    private boolean výhled;


    public Pokoj(int lůžka, boolean balkon, boolean výhled, int cena, int cisloPokoje) {
        this.balkon = balkon;
        this.cena = cena;
        this.cisloPokoje = cisloPokoje;
        this.lůžka = lůžka;
        this.výhled = výhled;

    }

    public String getDescription () {
        String description = "Číslo pokoje: " + cisloPokoje +  " počet lůžek: " + lůžka + "  cena za noc: " + cena + "  balkon: " +
                balkon + "  výhled na moře: " + výhled;
        return description;
    }

    public int getCisloPokoje() {
        return cisloPokoje;
    }

    public void setCisloPokoje(int cisloPokoje) {
        this.cisloPokoje = cisloPokoje;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getLůžka() {
        return lůžka;
    }

    public void setLůžka(int lůžka) {
        this.lůžka = lůžka;
    }

    public boolean isBalkon() {
        return balkon;
    }

    public void setBalkon(boolean balkon) {
        this.balkon = balkon;
    }

    public boolean isVýhled() {
        return výhled;
    }

    public void setVýhled(boolean výhled) {
        this.výhled = výhled;
    }
}
