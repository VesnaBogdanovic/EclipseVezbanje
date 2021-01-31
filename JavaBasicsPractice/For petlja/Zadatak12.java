package vezbanjeForrPetlje;

import java.util.Scanner;

public class Zadatak12 {

	public static void main(String[] args) {
		// Suma prirodnih brojeva od 1-n koji su deljivi sa 3 i sa 7

		Scanner s = new Scanner(System.in);
		System.out.println(" Unesite do kog broja zelite da dobijete sumu ");
		int n = s.nextInt();
		int suma = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 7 == 0)
				suma = suma + i;
		}
		System.out.println("Suma od broja 1 do broja " + n + " je : " + suma);

	}

}
