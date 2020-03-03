package Zadatak_1_0204;

import java.util.Scanner;

public class Switch5 {

	public static void main(String[] args) {
		/* Korisnik unosi naziv meseca i program govori koliko ima meseci koji pocinju
		istim slovom */

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite naziv meseca");
		String mesec = s.next();

		switch (mesec) {
		case "januar":
		case "jun":
		case "jul":
			System.out.println("Tri meseca pocinju na slovo j");
			break;

		case "februar":
			System.out.println("Februar je jedini mesec koji pocinje na slovo f");
			break;

		case "septembar":
			System.out.println("Septembar je jedini mesec koji pocinje na slovo s");
			break;

		case "oktobar":
			System.out.println("Oktobar je jedini mesec koji pocinje na slovo o");
			break;

		case "novembar":
			System.out.println("Novembar je jedini mesec koji pocinje na slovo n");
			break;

		case "decembar":
			System.out.println("Decembar je jedini mesec koji pocinje na slovo d");
			break;

		case "mart":
		case "maj":
			System.out.println("Dva meseca pocinju na slovo m");
			break;

		case "april":
		case "avgust":
			System.out.println("Dva meseca pocinju na slovo a");
			break;

		default:
			System.out.println("Niste pravilno uneli mesec");

		}

	}

}
