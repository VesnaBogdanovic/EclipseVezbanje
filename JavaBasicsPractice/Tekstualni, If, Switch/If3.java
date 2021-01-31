package Predavanja;

import java.util.Scanner;

public class If3 {

	public static void main(String[] args) {

		/*
		 * Traziti od korisnika da unese broj godina. Ucitati taj broj Ispisati
		 * informaciju o tome da li osoba moze ili ne moze da ide na casove voznje
		 */
		System.out.println("Uneti broj godina");
		Scanner s = new Scanner(System.in);

		int god = s.nextInt();

		if (god < 0) {
			System.out.println("Broj nije ispravno unet");
		}

		if (god >= 16) {
			System.out.println("Mozete upisati voznju");
		}

		if (god < 16) {
			System.out.println("Ne mozete upisati casove voznje");
		}
	}

}
