package vezbanjeForrPetlje;

import java.util.Scanner;

public class Zadatak20 {

	public static void main(String[] args) {
		// Izracunati sumu i proizvod prirodnih brojeva od k do n

		Scanner s = new Scanner(System.in);
		System.out.println(" Unesi broj od kog zelis da se krene ");
		int k = s.nextInt();
		System.out.println(" Unesi broj kojim zelis da se zavrsi ");
		int n = s.nextInt();
		int proizvod = 1;
		int suma = 1;

		for (int i = k; i <= n; i++) {
			proizvod = proizvod * i;
			suma = suma + i;
		}
		System.out.println(" Proizvod unetih brojeva je: " + proizvod + "," + " suma unetih brojeva je: " + suma);

	}

}
