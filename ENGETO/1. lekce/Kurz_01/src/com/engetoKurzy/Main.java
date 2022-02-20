package com.engeto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        //proměnná (variable)
        // DatovýTyp název Proměnne :

        String item; // Deklaroval jsem textovou proměnnou
        // Vytvořil x Deklaroval
        item = "Zrcátko";

        System.out.println(item);

        int // integer celé číslo
            // Názvy proměnných ~ camelCase

        numberOfPieces = 10;

        int numberOfStudents = 4;

        byte b = 1;// -128 až 127

        short s = 40; // 16-bit, -32,728 až 32,767

        long l = 36500; // větší int

        float fl = 0; // max 4 desetina místa

        double d = 0.34; // čísla s desetinou čárkou (12 míst)

        boolean isDiscounted = true;  // true or false

        char character ='A', digit = 'S', sign = '.' ; //  jedno písmeno, znak

        numberOfPieces = (int) d; // přeměna double na int

        String text = "Karel Dvořak";
        LocalDate date = LocalDate.of(2022,4,5);


        double price = 0.1;
        for (int i = 0; i < 10; i++) {
            price += 0.1;
        }

        System.out.println(price);
        BigDecimal price1 = BigDecimal.valueOf(0.1);
         for (int i = 0; i < 10; i++) {
             price1 = price1.add(BigDecimal.valueOf(0.1));
         }
        System.out.println(price1);

         int cislo;
         Integer cisloObjektove;

         double totalPrice = price + numberOfPieces;
         double pricePerItem = totalPrice / numberOfPieces;

         String message = "Celková cena";
    }
}
