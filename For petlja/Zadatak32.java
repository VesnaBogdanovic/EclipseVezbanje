package vezbanjeForrPetlje;

import java.util.Scanner;

public class Zadatak32 {

	public static void main(String[] args) {
		// Izracunati sumu 10 ucitanih brojeva sa tastature

		Scanner s = new Scanner(System.in);
		double suma = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.println(" Unesi " + i + " broj ");
			double broj = s.nextDouble();
			suma = suma + broj;
		}
		System.out.println(" Suma je : " + suma);

	}

}
