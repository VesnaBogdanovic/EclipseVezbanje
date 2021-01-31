package vezbanjeForrPetlje;

import java.util.Scanner;

public class Zadatak33 {

	public static void main(String[] args) {
		// Suma n ucitanih brojeva sa tastature

		Scanner s = new Scanner(System.in);
		System.out.println(" Unesi koliko brojeva zelis da uneses ");
		int n = s.nextInt();
		int suma = 0;
		for (int i = 1; i <= n; i++) {
			System.out.println(" Unesi " + i + " broj ");
			int broj = s.nextInt();
			suma = suma + broj;
		}
		System.out.println(" Suma je : " + suma);

	}

}
