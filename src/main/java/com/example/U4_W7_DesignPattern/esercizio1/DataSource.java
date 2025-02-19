package com.example.U4_W7_DesignPattern.esercizio1;

import com.example.U4_W7_DesignPattern.esercizio1.entities.Info;
import com.example.U4_W7_DesignPattern.esercizio1.entities.UserData;

public interface DataSource {

    public UserData conversione(Info info);
}
