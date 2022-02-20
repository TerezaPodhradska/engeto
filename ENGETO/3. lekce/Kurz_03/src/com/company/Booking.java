package com.company;

public class Booking {
    private String nameOfGuest;
    private TypeOfStay typeOfStay;

    public Booking(String nameOfGuest, TypeOfStay typeOfStay) {
        this.nameOfGuest = nameOfGuest;
        this.typeOfStay = typeOfStay;
    }

    public String getNameOfGuest() {
        return nameOfGuest;
    }

    public void setNameOfGuest(String nameOfGuest) {
        this.nameOfGuest = nameOfGuest;
    }

    public TypeOfStay getTypeOfStay() {
        return typeOfStay;
    }

    public void setTypeOfStay(TypeOfStay typeOfStay) {
        this.typeOfStay = typeOfStay;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "nameOfGuest='" + nameOfGuest + '\'' +
                ", typeOfStay=" + typeOfStay +
                '}';
    }
}
