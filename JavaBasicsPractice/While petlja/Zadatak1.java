package vezbanjePetlje;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// Ispis brojeva od 1-17 koji nisu deljivi sa a

		Scanner s = new Scanner(System.in);
		System.out.println(" Unesi vrednost a ");
		int a = s.nextInt();
		int i = 1;
		int n = 0;
		while (i <= 17) {
			if (i % a != 0)

				System.out.println(" Brojevi od 1-17 koji nisu deljivi sa " + a + " su : " + i);
			i++;
		}

	}

}
