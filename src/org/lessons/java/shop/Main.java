package org.lessons.java.shop;

public class Main {

    public static void main(String[] args) {

        //Creo prodotto numero 1
        Prodotto prodotto1 = new Prodotto("Laptop", "Un laptop potente e leggero", 1200.00f, 0.22f);

        System.out.println(prodotto1.descrizione);
        // Test delle funzionalità
        System.out.println("Il codice prodotto è " + prodotto1.codice);
        System.out.println("Il prezzo del prodotto è " + prodotto1.prezzoBase() + " €");
        System.out.println("Il prezzo del prodotto compreso di IVA è " + prodotto1.prezzoConIva() + " €");
        System.out.println("Il nome del prodotto esteso è " + prodotto1.nomeProdotto());

        //Creo prodotto numero 2
        Prodotto prodotto2 = new Prodotto("Smartphone", "Lo smartphone più bello di tutti", 3000.00f, 0.22f);

        System.out.println(prodotto2.descrizione);

        // Test delle funzionalità
        System.out.println("Il codice prodotto è " + prodotto2.codice);
        System.out.println("Il prezzo del prodotto è " + prodotto2.prezzoBase() + " €");
        System.out.println("Il prezzo del prodotto compreso di IVA è " + prodotto2.prezzoConIva() + " €");
        System.out.println("Il nome del prodotto esteso è " + prodotto2.nomeProdotto());

    }
}
