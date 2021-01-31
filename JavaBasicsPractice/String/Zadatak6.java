package vezbanja;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {

// Pogadja se zamisljena rec, kad se pogodi program se zaustavlja

		Scanner s = new Scanner(System.in);
		String rec = " ";
		rec = rec.toLowerCase();
		while (!"love".equals(rec)) {
			System.out.println(" Pogodite zamisljenu rec ");
			rec = s.nextLine();
			rec = rec.toLowerCase();
		}
		System.out.println(" Pogodili ste rec ");

	}

}
