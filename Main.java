package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void mainEnum(String[] args) {
        TypeOfStay type; //deklerace nové proměnné
        TypeOfStay type1 = TypeOfStay.RECREATIONAL;

        System.out.println(type1);

        Booking booking1 = new Booking("Jatoslav Kokos", TypeOfStay.WORKING);
        System.out.println(booking1.getNameOfGuest()+" "+booking1.getTypeOfStay());

        System.out.println(booking1);
    }
    public static void main(String[] args) {


        //02-----------------------------------------------------------------

        List<Integer> listOfInts = new ArrayList<>();
        listOfInts.add(0);
        listOfInts.add(14);

        // cyklus for ... předem daný počet opakování akce:
        int numbersOfInterations =40;
        for (int i = 0; i < numbersOfInterations  ; i++) {        //zkratka: fori
            //kod, kteterý se má opakovat
            //Double rand100to200 = Math.random()*100 + 100;
            int ints100to200 = (int) Math.floor(Math.random()*100 + 100);
            listOfInts.add(ints100to200);
        }

        for (int i = listOfInts.size()-1; i >= 0; i--) {
            System.out.println(listOfInts.get(i)+" ");
        }

        //FOREACH cyklus
        for (Integer integer : listOfInts) {
            System.out.println(listOfInts.get(integer)+" ");
        }
             //pomocí streamu
        listOfInts.forEach(System.out::println);
        listOfInts.forEach(d -> System.out.println(d+" "));

        // SČÍTÁNÍ hodnot
        listOfInts = Arrays.asList(10, 12, 8, 27);
        Integer result = 0;
        for (Integer i: listOfInts) {
             //result = result + i;
            result += i;
        }
              // pomocí streamů
        listOfInts.stream().reduce(0, Integer:: sum);


        // Podmíněnž příkaz
         System.out.println("=========");
         double vstup = Math.random();
         String greeting;
         if (vstup >= 18) {
             greeting = "Dobrý den";
         } else {
             greeting = "Ahoj";
         }
         System.out.println(greeting);

         if ("Ahoj".equals(greeting)) {
             System.out.println("Opačně");
         } else {
             System.out.println(" Jsem tu !");
         }

         if (greeting != null) {       //vnořování podmínek
             if(greeting.equals("Ahoj")) {
                 System.out.println(" Jestli ti můžu tykat..");
             }
         }

         String name = "Karel";
         if ("Karel".equals(name)) {
             System.out.println("čégo karle");
         } else if ("Adéla".equals(name)) {
             System.out.println("čego áďo");
         } else {
             System.out.println("kdo ses");
         }

         int mark = 3;
         String resultt;
         switch (mark) {
             case 1:
               resultt = "amazing";
               break;
             case 2:
               resultt = "almost amazing";
               break;
             default:
                 resultt = "no jo no";
                 break;
         }
        System.out.println(resultt);

         switch (mark){
             case 1 -> resultt = "amazing";
             case 2 -> resultt = "almost amazing";
             default -> resultt = "no jo no";
         }

    }
}
