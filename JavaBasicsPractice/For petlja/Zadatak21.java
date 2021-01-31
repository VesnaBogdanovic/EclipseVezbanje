package vezbanjeForrPetlje;

import java.util.Scanner;

public class Zadatak21 {

	public static void main(String[] args) {
		// Prebrojati prirodne bojeve u intervalu 1-5 koji su deljivi sa a

		Scanner s = new Scanner(System.in);

		System.out.println(" Unesi vrednost a ");
		int brojac = 0;
		int a = s.nextInt();
		for (int i = 1; i <= 5; i++) {
			if (i % a == 0)
				brojac = brojac + 1;
		}
		System.out.println(" Brojeva deljivih  sa " + a + " ima : " + brojac);
	}
}
