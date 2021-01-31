package vezbanja;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {

// Ucitati 2 broja, ispisati manji pa veci

		Scanner s = new Scanner(System.in);
		System.out.println(" Unesite 2 broja");
		float broj1 = s.nextFloat();
		float broj2 = s.nextFloat();
		if (broj1 > broj2) {
			System.out.println(broj2 + "," + broj1);
		} else {
			System.out.println(broj1 + "," + broj2);
		}

	}

}
