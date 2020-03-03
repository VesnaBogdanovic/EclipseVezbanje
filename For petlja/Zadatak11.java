package vezbanjeForrPetlje;

import java.util.Scanner;

public class Zadatak11 {

	public static void main(String[] args) {

		// Suma neparnih prirodnih brojeva od k-n;
		
		Scanner s = new Scanner(System.in);
		System.out.println(" Unesite od kog broja zelite da pocnete");
		int k = s.nextInt();
		System.out.println(" Unesite sa kojim brojem zelite da zavrsite");
		int n = s.nextInt();
		int suma = 0;
		for (int i = k; i <= n; i++) {
			if (i % 2 != 0)
				suma = suma + i;
		}
		System.out.println(" Suma neparnih prirodnih brojeva od broja " + k + " do broja " + n + " je : " + suma);

	}

}
