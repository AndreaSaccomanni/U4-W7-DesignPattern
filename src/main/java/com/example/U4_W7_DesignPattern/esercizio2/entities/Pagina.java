package com.example.U4_W7_DesignPattern.esercizio2.entities;

import com.example.U4_W7_DesignPattern.esercizio2.LibroComposite;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pagina implements LibroComposite {
    private String contenuto;


    @Override
    public void stampa() {
        System.out.println("Contenuto della pagine: " + this.contenuto);
    }

    @Override
    public int getNumeroPagine() {
        return 1;
    }
}
