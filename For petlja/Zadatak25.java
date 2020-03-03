package vezbanjeForrPetlje;

import java.util.Scanner;

public class Zadatak25 {

	public static void main(String[] args) {
		// Prebrojati neparne prirodne brojeve u intervalu od k-n

		Scanner s = new Scanner(System.in);
		System.out.println(" Unesi broj kojim zelis da interval pocne ");
		int k = s.nextInt();
		System.out.println(" Unesi broj kojim zelis da se interval zavrsi");
		int n = s.nextInt();
		int brojac = 0;
		for (int i = k; i <= n; i++) {
			if (i % 2 != 0)
				brojac = brojac + 1;
		}
		System.out.println(" Od broja " + k + " do broja " + n + " ima neparnih brojeva : " + brojac);

	}

}
