package com.example.U4_W7_DesignPattern.esercizio1.entities;

import com.example.U4_W7_DesignPattern.esercizio1.DataSource;

import java.time.LocalDate;
import java.time.Period;

public class Adapter implements DataSource {


    @Override
    public UserData conversione(Info info){
        UserData userData = new UserData();
        userData.setNomeCompleto(info.getNome() + " " + info.getCognome());
        userData.setEta(Period.between(info.getDataDiNascita(), LocalDate.now()).getYears());
        return userData;
    }


}
