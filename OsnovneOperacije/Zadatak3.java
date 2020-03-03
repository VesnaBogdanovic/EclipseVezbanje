package vezbanja;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

// Ucitati 4cifreni broj. Izdvojiti i sabrati mu cifre

		Scanner s = new Scanner(System.in);
		System.out.println(" Unesite cetvorocifreni broj ");
		int broj = s.nextInt();
		int cifra1;
		int cifra2;
		int cifra3;
		int cifra4;
		int ostatak;
		cifra1 = broj % 10; // cifra jedinica,ostatak deljenja sa 10
		ostatak = broj / 10; // broj n podeliti sa 10
		cifra2 = ostatak / 10; // cifra desetica je ostatak deljenja sa 10 umanjenog broja
		ostatak = ostatak / 10; // broj n podeliti sa 10
		cifra3 = ostatak / 10; // celobrojni ostatak stotine
		ostatak = ostatak / 10; // broj n podeliti sa 10
		cifra4 = ostatak % 10; // celobrojni ostatak hiljade
		// poslednju cifru mozemo dobiti i celobrojnim deljenjem bez umanjenja
		System.out.println("cifra4:" + cifra4 + "cifra3:" + cifra3 + "cifra2:" + cifra2 + "cifra1" + cifra1);

	}
}
