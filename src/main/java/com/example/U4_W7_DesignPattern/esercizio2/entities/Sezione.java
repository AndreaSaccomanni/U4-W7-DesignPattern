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
public class Sezione implements LibroComposite {
    private String titolo;
    private List<LibroComposite> elementi = new ArrayList<>();

    public Sezione(String titolo) {
        this.titolo = titolo;
    }

    public void aggiungiElemento(LibroComposite elemento) {
        elementi.add(elemento);
    }

    @Override
    public void stampa() {
        System.out.println("Sezione: " + titolo);
        for (LibroComposite elemento : elementi) {
            elemento.stampa();
        }
    }

    @Override
    public int getNumeroPagine() {
        return elementi.stream().mapToInt(LibroComposite::getNumeroPagine).sum();
    }
}

