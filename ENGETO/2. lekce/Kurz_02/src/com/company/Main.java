package com.engeto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        /* STATIC => třídní metoda
                 lze volat, ikyž nemáme žádný objekt */
        InvoiceItem invoiceItem = new InvoiceItem("okurka", 3,4, BigDecimal.valueOf(10));

        // můžeme vyvolávat i vícekrát:
           // InvoiceItem invoiceItem2 = new InvoiceItem();

        // ZAPOUZŘENÍ
        // špatne: invoiceItem.description = "Rohlik";  // => kvuli tomu že je hodnota private, nemůžeme vytisknout
       // invoiceItem.quality = -10; // => hodnota není private, můžeme ji "vyvolat"


        invoiceItem.setDescription("Rohlik");
        invoiceItem.setQuality(10);
        System.out.println(invoiceItem.getDescription() + "ks");


        List<InvoiceItem> items = new ArrayList<>();




        System.out.println(items.size());
        InvoiceItem firstItemOfList = items.get(0);




        // ...
        items = new LinkedList<>();
        items = new Vector<>();

        List<String> names = new ArrayList<>();
        List<Double> weights = new ArrayList<>();





    }



}
