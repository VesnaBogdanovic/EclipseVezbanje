package Predavanja;

import java.util.Scanner;

public class Zadatak9 {

	public static void main(String[] args) {
		/*
		 * Kazem korisniku koliko brojeva zeli da sabere (npr ako zeli 3 broja kaze : 3)
		 * i onda izracunam zbir tih brojeva
		 */

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite koliko brojeva zelite da sabirate");
		int n;
		n = s.nextInt();
		if (n > 0) {
			int br;

			int suma = 0;
			for (int i = 0; i < n; i = i + 1) {
				System.out.println(" Unesite " + (i + 1) + " broj ");
				br = s.nextInt();
				suma = suma + br;
			}
			System.out.println(" Suma unetih brojeva je " + suma);

		} else {
			System.out.println("Uneli ste negativan broj");
		}
	}
}