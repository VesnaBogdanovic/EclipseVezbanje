package Zadatak_1_0204;

import java.util.Scanner;

public class MeniZaSamousluznuKasu {

	public static void main(String[] args) {
		/*
		 * meni za samousluznu kasu, 0-izlaz iz programa; 1-dodavanje cene proizvoda na
		 * racun (ubacivanje u potrosacku korpu) ako korisnik unese 1, program pita
		 * korisnika da unese cenu proizvoda i ta cena se dodaje na racun u prodavnici
		 * 2- naplata racuna-program pita korisnika da unese kolicinu novca za naplatu
		 * racuna ako korisnik unese vrednost manju od vrednosti racuna,potrebno je da
		 * se ispise greska, bez umanjenja racuna i da se ponovo ispise meni ako
		 * korisnik unese vrednost vecu ili jednaku od cene racuna ispisuje se kusur i
		 * racun se ponovo postavlja na nulu zatim se ponovo ispisuje meni
		 */
		Scanner s = new Scanner(System.in);
		int izbor;
		float racun = 0;
		do {
			System.out.println(
					" Uneti 0 za izlaz iz programa, 1 za dodavanje cene proizvoda na racun, 2 za naplatu racuna");
			izbor = s.nextInt();
			switch (izbor) {
			case 0:
				System.out.println(" Hvala na kupovini ");
				break;

			case 1:
				System.out.println(" Unesite cenu proizvoda");
				float cena = s.nextFloat();
				if (cena > 0) {
					racun = racun + cena;
				} else
					System.out.println(" Uneli ste pogresan iznos , iznos mora biti veci od nule ");
				break;

			case 2:

				System.out.println(" Unesite kolicinu novca za naplatu racuna");
				float novac = s.nextFloat();
				if (novac >= racun) {
					
					System.out.println(" Uspesno ste zavrsili kupovinu , vas kusur je " + (novac - racun ));
				}

				else
					System.out.println(" Iznos novca mora biti veci od racuna, nemate dovoljno novca na racunu ");
				break;

			default:
				System.out.println(" Lose ste izabrali opciju ");
			}

		} while (izbor != 0);
	}
}
