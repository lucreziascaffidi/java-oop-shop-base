package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    // Variabili di istanza
    int codice;
    String nome;
    String descrizione;
    float prezzo;
    float iva;

    // Metodi

    // Costruttore
    public Prodotto(String nome, String descrizione, float prezzo, float iva) {
        Random random = new Random();
        this.codice = random.nextInt(777777);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public int generaCodice() {
        return this.codice;
    }

    public float prezzoBase() {
        return this.prezzo;
    }

    public float prezzoConIva() {
        return this.prezzo + this.prezzo * this.iva;
    }

    public String nomeProdotto() {
        return this.codice + "-" + nome;
    }

}
