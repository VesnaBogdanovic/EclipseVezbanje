package vezbanjeForrPetlje;

import java.util.Scanner;

public class Zadatak23 {

	public static void main(String[] args) {
		// Prebrojati neparne prirodne brojeve od 20-n

		Scanner s = new Scanner(System.in);
		System.out.println(" Unesi vrednost n ");
		int n = s.nextInt();
		int brojac = 0;
		for (int i = 20; i <= n; i++)
			if (i % 2 != 0) {
				brojac = brojac + 1;
			}
		System.out.println(" Neparnih brojeva od 20 do " + n + " ima : " + brojac);

	}
}