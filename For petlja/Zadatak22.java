package vezbanjeForrPetlje;

import java.util.Scanner;

public class Zadatak22 {

	public static void main(String[] args) {
		// Prebrojati prirodne brojeve od 1-n

		Scanner s = new Scanner(System.in);
		System.out.println(" Unesi vrednost n");
		int n = s.nextInt();
		int brojac = 0;
		for (int i = 1; i <= n; i++) {
			brojac = brojac + 1;
		}
		System.out.println(" Brojeva od 1 do " + n + " ima : " + brojac);

	}

}
