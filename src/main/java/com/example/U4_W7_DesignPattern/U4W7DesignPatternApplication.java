package com.example.U4_W7_DesignPattern;

import com.example.U4_W7_DesignPattern.esercizio1.entities.Adapter;
import com.example.U4_W7_DesignPattern.esercizio1.entities.Info;
import com.example.U4_W7_DesignPattern.esercizio1.entities.UserData;
import com.example.U4_W7_DesignPattern.esercizio1.DataSource;
import com.example.U4_W7_DesignPattern.esercizio2.entities.Libro;
import com.example.U4_W7_DesignPattern.esercizio2.entities.Pagina;
import com.example.U4_W7_DesignPattern.esercizio2.entities.Sezione;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Arrays;

@SpringBootApplication
public class U4W7DesignPatternApplication {

	public static void main(String[] args) {

		// --------- ESERCIZIO 1 -------------------
		SpringApplication.run(U4W7DesignPatternApplication.class, args);

		Info info = new Info("Mario", "Rossi", LocalDate.of(1995, 2, 10));

		DataSource adapter = new Adapter();
		UserData userData = adapter.conversione(info);

		System.out.println("Nome Completo: " + userData.getNomeCompleto() + "\n"+
				"Età: " + userData.getEta());


		// --------- ESERCIZIO 2 -------------------

		Pagina p1 = new Pagina("Pagina 1");
		Pagina p2 = new Pagina("Pagina 2");
		Pagina p3 = new Pagina("Pagina 3");
		Pagina p4 = new Pagina("Pagina 4");

		Sezione s1 = new Sezione("Capitolo 1");
		s1.aggiungiElemento(p1);
		s1.aggiungiElemento(p2);

		Sezione s2 = new Sezione("Capitolo 2");
		s2.aggiungiElemento(p3);
		s2.aggiungiElemento(p4);

		Libro l1 = new Libro("Libro 1", Arrays.asList("Autore 1", "Autore 2"), 25);
		l1.aggiungiElemento(s1);
		l1.aggiungiElemento(s2);

		System.out.println("LIBRO INTERO:");
		l1.stampa();

		System.out.println("NUMERO PAGINE DEL LIBRO:");
		System.out.println("Il numero totale delle pagine è: " + l1.getNumeroPagine());

		System.out.println("NUMERO DELLE PAGINE PER OGNI SEZIONE: ");
		System.out.println("Il numero totale delle pagine della Sezione 1 è: " + s1.getNumeroPagine());
		System.out.println("Il numero totale delle pagine della Sezione 2 è: " + s1.getNumeroPagine());

		System.out.println("CONTENUTO DELLA PAGINA 1:");
		p1.stampa();
		System.out.println("CONTENUTO DELLA PAGINA 2:");
		p2.stampa();
		System.out.println("CONTENUTO DELLA PAGINA 3:");
		p3.stampa();
		System.out.println("CONTENUTO DELLA PAGINA 4:");
		p4.stampa();


	}

}
