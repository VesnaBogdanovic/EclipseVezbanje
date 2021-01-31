package Zadatak_1_0204;

import java.util.Scanner;

public class If5 {

	public static void main(String[] args) {

		// Zelim da korisnik dobije ocenu za ukucan broj poena

		System.out.println("Unesi broj poena");
		Scanner s = new Scanner(System.in);
		float poeni = s.nextFloat();

		if (poeni >= 90 && poeni <= 100) {
			System.out.println("Dobili ste ocenu 10");
		} else if (poeni >= 80 && poeni < 90) {
			System.out.println("Dobili ste ocenu 9");
		} else if (poeni >= 70 && poeni < 80) {
			System.out.println("Dobili ste ocenu 8");
		} else if (poeni >= 60 && poeni < 70) {
			System.out.println("Dobili ste ocenu 7");
		} else if (poeni >= 50 && poeni < 60) {
			System.out.println("Dobili ste ocenu 6");
		} else if (poeni < 50 && poeni >= 0) {
			System.out.println("Dobili ste ocenu 5");
		} else {
			System.out.println("Uneli ste pogresan unos");

		}

	}

}
