package Predavanja;

import java.util.Scanner;

public class Switch6 {

	public static void main(String[] args) {

		/*
		 * Program od korisnika trazi da unese 2 broja, nakon toga i broj koji
		 * predstavlja operaciju koju zeli, sve dok ne unese broj 5
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println(" Unesi dva broja po zelji ");
		double broj1 = sc.nextDouble();
		double broj2 = sc.nextDouble();
		System.out.println(" Unesi operaciju: 1 za sabiranje, 2 za oduzimanje, 3 za mnozenje, 4 za deljenje ");
		int op = sc.nextInt();
		double rez = 0;

		while (op != 5) {

			switch (op) {
			case 1:
				rez = broj1 + broj2;
				break;

			case 2:
				rez = broj1 - broj2;
				break;

			case 3:
				rez = broj1 * broj2;
				break;

			case 4:
				if (broj2 != 0)
					rez = broj1 / broj2;

				else {
					System.out.println("Ne mozete deliti nulom");

				}
				break;

			default:
				System.out.println("Greska u izboru operacije");
			}
			System.out.println(" Rezultat je " + rez);
			broj1 = sc.nextDouble();
			broj2 = sc.nextDouble();
			op = sc.nextInt();
		}
	}
}
