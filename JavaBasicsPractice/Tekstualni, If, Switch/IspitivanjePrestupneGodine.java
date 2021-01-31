package Zadatak_1_0204;

import java.util.Scanner;

public class IspitivanjePrestupneGodine {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ispituje da li je godina prestupna ili nije, sve dok
		 * korisnik za godinu ne unese broj koji nije pozitivan
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite godinu po zelji");
		int god = s.nextInt();

		while (god > 0) {
			if ((god % 4 == 0) && ((god % 100 != 0) || (god % 400 == 0))) {
				System.out.println(god + " je prestupna godina ");
				break;
			} else {
				System.out.println(god + " nije prestupna godina ");
				break;
			}
		}
	}
}
