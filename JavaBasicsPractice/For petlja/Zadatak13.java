package vezbanjeForrPetlje;

import java.util.Scanner;

public class Zadatak13 {

	public static void main(String[] args) {

		// Suma brojeva 1-n koji nisu deljivi sa a
		
		Scanner s = new Scanner(System.in);
		System.out.println(" Unesite do kog broja zelite da dobijete sumu ");
		int n = s.nextInt();
		System.out.println(" Unesite vrednost broja a");
		int a = s.nextInt();
		int suma = 1;
		for (int i = 1; i <= n; i++) {
			if (i % a != 0)
				suma = suma + i;
		}
		System.out.println(" Suma od broja 1 do broja " + n + " koji nisu deljivi sa " + a + " je : " + suma);

	}

}
