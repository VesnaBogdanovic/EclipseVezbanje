package vezbanja;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		

		/* Program ucitava dvocifreni broj i ispisuje proizvod cifara i kolicnik prve i
		 druge cifre */

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite dvocifreni broj");
		int a = s.nextInt();

		int x, y, proizvod, kolicnik;
		x = a / 10;
		y = a % 10;
		proizvod = x * y;
		kolicnik = x / y;
		System.out.println(" Proizvod cifara je : " + proizvod);
		System.out.println(" Kolicnik cifara je : " + kolicnik);

	}

}
