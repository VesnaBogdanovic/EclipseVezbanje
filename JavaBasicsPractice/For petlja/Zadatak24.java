package vezbanjeForrPetlje;

import java.util.Scanner;

public class Zadatak24 {

	public static void main(String[] args) {
		// Prebrojati prirodne brojeve u intervalu iod 1-n koji nisu deljivi sa a

		Scanner s = new Scanner(System.in);
		System.out.println(" Unesite do kog broja zelite interval");
		int n = s.nextInt();
		System.out.println(" Unesite vrednost a");
		int a = s.nextInt();
		int brojac = 0;
		for (int i = 1; i <= n; i++) {
			if (i % a != 0)
				brojac = brojac + 1;
		}
		System.out.println("Prirodnih brojeva u intervalu od 1 do " + n + " ima : " + brojac);

	}

}
