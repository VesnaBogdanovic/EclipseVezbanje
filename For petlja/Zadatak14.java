package vezbanjeForrPetlje;

import java.util.Scanner;

public class Zadatak14 {

	public static void main(String[] args) {

		// Izracunati sumu prirodnih brojeva od k-n cija je cifra jedinica 8 (poslednja cifra)

		Scanner s = new Scanner(System.in);
		System.out.println(" Unesite od kog broja zelite da pocnete ");
		int k = s.nextInt();
		System.out.println(" Unesite sa kojim brojem zelite da se zavrsi ");
		int n = s.nextInt();
		int suma = 1;
		for (int i = k; i <= n; i++) {
			if (i % 10 == 8)
				suma = suma + i;
		}
		System.out.println(" Suma prirodnih brojeva u zadatom intervalu je : " + suma);

	}

}
