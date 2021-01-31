package Zadatak_1_0204;

import java.util.Scanner;

public class Zadatak11 {

	public static void main(String[] args) {

// Ucitati 2 broja i ispisati koji je veci

		System.out.println("Uneti dva broja");
		Scanner s = new Scanner(System.in);
		float broj1;
		float broj2;
		broj1 = s.nextFloat();
		broj2 = s.nextFloat();
		if (broj1 > broj2) {
			System.out.println("Prvi broj je veci od drugog broja");
		} else if (broj1 < broj2) {
			System.out.println("Drugi broj je veci od prvog broja");
		} else {
			System.out.println("Prvi i drugi broj su jednaki");
		}
	}

}
