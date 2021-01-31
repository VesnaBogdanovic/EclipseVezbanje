package vezbanjeForrPetlje;

import java.util.Scanner;

public class Zadatak30 {

	public static void main(String[] args) {
		// Izracunati aritmeticku sredinu prirodnih brojeva od 1-n koji nisu deljivi sa a

		Scanner s = new Scanner(System.in);
		System.out.println(" Unesi broj kojim zelis da se interval zavrsi ");
		int n = s.nextInt();
		System.out.println(" Unesi vrednost a");
		int a = s.nextInt();
		int suma = 0;
		int as;
		int brojac = 0;
		for (int i = 1; i <= n; i++) {
			if (i % a != 0)
				suma = suma + i;
			brojac = brojac + 1;
		}
		as = suma / brojac;
		System.out.println(" Artmeticka sredina brojeva od 1 do " + n + " koji nisu deljivi sa " + a + " je : " + as);
	}
}