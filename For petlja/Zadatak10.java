package vezbanjeForrPetlje;

import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {

		// suma parnih prirodnih brojeva od 1-n
		Scanner s = new Scanner(System.in);
		System.out.println(" Unesite do kog broja zelite da dobijete sumu ");
		int n = s.nextInt();
		int suma = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0)
				suma = suma + i;
		}
		System.out.println(" Suma parnih brojeva, od broja 1 do broja " + n + " je : " + suma);

	}

}
