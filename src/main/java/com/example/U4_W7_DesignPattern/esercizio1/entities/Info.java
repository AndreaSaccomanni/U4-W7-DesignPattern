package com.example.U4_W7_DesignPattern.esercizio1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Info {

    private String nome;
    private String cognome;
    private LocalDate dataDiNascita;


}
