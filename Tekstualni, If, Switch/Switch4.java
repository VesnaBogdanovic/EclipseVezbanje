package Predavanja;

import java.util.Scanner;

public class Switch4 {

	public static void main(String[] args) {

		// Ucitati naziv meseca , i koliko taj mesec ima dana

		System.out.println("Unesite mesec");
		Scanner s = new Scanner(System.in);
		String mesec = s.next();

		switch (mesec) {
		case "januar":
		case "mart":
		case "maj":
		case "jul":
		case "avgust":
		case "oktobar":
		case "decembar":

			System.out.println("31");
			break;

		case "februar":
			System.out.println("28");
			break;

		case "april":
		case "jun":
		case "septembar":
		case "novembar":
			System.out.println("30");
			break;

		}

	}

}
