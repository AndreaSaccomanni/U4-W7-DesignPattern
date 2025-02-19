package com.example.U4_W7_DesignPattern.esercizio2.entities;

import com.example.U4_W7_DesignPattern.esercizio2.LibroComposite;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Libro {
    private double prezzo;
    private String titolo;
    private List<LibroComposite> elementi = new ArrayList<>();
    private List<String> autori;


    public Libro(String titolo, List<String> autori, double prezzo) {
        this.titolo = titolo;
        this.autori = autori;
        this.prezzo = prezzo;
    }

    public void aggiungiElemento(LibroComposite elemento) {
        elementi.add(elemento);
    }


    public void stampa() {
        System.out.println("📖 Libro: " + titolo);
        System.out.println("Autori: " + String.join(", ", autori));
        System.out.println("Prezzo: " + prezzo + "€");
        System.out.println("--- Contenuto ---");
        for (LibroComposite elemento : elementi) {
            elemento.stampa();
        }
    }

    public int getNumeroPagine() {
        return elementi.stream().mapToInt(LibroComposite::getNumeroPagine).sum();
    }

}
