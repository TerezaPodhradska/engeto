package com.engeto;

public enum TypeOfStay {

        WORKING("pracovní"), RECREATIONAL("rekreační");  //Definice noveho typu

        String description;

        TypeOfStay(String description) {
            this.description = description;
        }


        //aby se výčtový typp zobrazoval jinak
        @Override
        public String toString() {
            return description;
        }

    }

