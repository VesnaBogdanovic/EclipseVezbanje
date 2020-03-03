package Zadatak_1_0204;

import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {

		// Ucitati 3 broja i odrediti najveci broj

		System.out.println("Uneti 3 broja po zelji");
		Scanner s = new Scanner(System.in);
		float broj1;
		float broj2;
		float broj3;
		broj1 = s.nextFloat();
		broj2 = s.nextFloat();
		broj3 = s.nextFloat();
		if (broj1 > broj2 && broj1 > broj3) {
			System.out.println("Najveci broj je:" + broj1);
		} else if (broj2 > broj3) {
			System.out.println("Najveci broj je:" + broj2);
		} else {
			System.out.println("Najveci broj je:" + broj3);
		}
	}

}
