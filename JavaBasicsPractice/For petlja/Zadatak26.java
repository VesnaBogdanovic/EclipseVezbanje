package vezbanjeForrPetlje;

import java.util.Scanner;

public class Zadatak26 {

	public static void main(String[] args) {
		// Prirodni brojevi u intervalu od k-n koji su deljivi sa a

		Scanner s = new Scanner(System.in);
		System.out.println(" Unesi broj kojim zelis da interval pocne ");
		int k = s.nextInt();
		System.out.println(" Unesi broj kojim zelis da interval zavrsi ");
		int n = s.nextInt();
		int brojac = 0;
		System.out.println(" Unesi vrednost broja a ");
		int a = s.nextInt();
		for (int i = k; i <= n; i++) {
			if (i % a == 0)
				brojac = brojac + 1;
		}
		System.out.println(" Brojevi deljivi brojem " + a + " su : " + brojac);
	}

}
