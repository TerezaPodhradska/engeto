package com.engeto;

import java.math.BigDecimal;

public class InvoiceItem { // Název třídy píšeme PascalCase

    // vytvořením třídy- specifikujeme co s čím budeme dělat
    //  do třídy zapisujeme metody, které pak můžeme vyvolávat

        private String description;
        private int quantity;
        private BigDecimal price;
        private double weight;

        // místo private lze: public, protected nebo nic
        // Private => atribut přístupný pouze pro tuto třídu,
        // aby se dal používat i jinde> díky přístupové hodnotě
        // většinou se používá private

    /*  KONSTRUKTOR
    *       = speciální metoda, zavolaná kdykoliv vyvoláme new InoviceItem()
    */


    /*  chceme do metody přidat hodnotu, se kterou pak může pracovat
    public InvoiceItem(String description) {
        setDescription(description);
    }
    InvoiceItem invoiceItem = new InvoiceItem("rohlik");
    */

    /* díky generate ~ get ~ getter setter
        Metoda => operace, kterou smíme provádět s objekty třídy InovaceItem
               => také pro ně platí private a public (jen moje metoda, nebo i pro ostatni)
               =>Zápis:
                    1. přístupová hodnota ()
                    2. návratová hodnota (String, int,..)
    */

    public InvoiceItem(String description, int quantity, double weight, BigDecimal price )
    {
        this.description = description;
        this.quantity = quantity;
        this.weight = weight;
        this.price = price;

    }

    public  InvoiceItem(String description, BigDecimal price) {
        // zavolam jiný konstruktor, ale doplním hodnoty
        this("rohlik", 1, 3, BigDecimal.valueOf(4));
        // omezení: volání jiného konstruktotu musí být první řádek konstruktoru

    }

    //GETTER
    public String getDescription() {
        // zde je napsáno, co se má stát
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuality() {
        return quantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //SETTER
    public void setQuality(int quality) {
        this.quantity = quality;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setDescription(String descriptionValue) {
        // descriprion je "parametr metody" => volatel musí do závorky něco napsat
        this.description = descriptionValue;
         // this. odkazuje na atributy teto třídy
    }
    public  BigDecimal totalPrice() {
        return price.multiply(BigDecimal.valueOf(quantity));
    }

}

