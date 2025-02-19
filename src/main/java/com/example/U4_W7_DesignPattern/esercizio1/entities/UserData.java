package com.example.U4_W7_DesignPattern.esercizio1.entities;

import com.example.U4_W7_DesignPattern.esercizio1.DataSource;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserData {

    private String nomeCompleto;
    private int eta;


    public void setData(DataSource ds, Info info) {
        UserData data = ds.conversione(info);
        this.nomeCompleto = data.getNomeCompleto();
        this.eta = data.getEta();
    }
}
