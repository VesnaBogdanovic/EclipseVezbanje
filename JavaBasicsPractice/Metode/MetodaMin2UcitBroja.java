package metode;

import java.util.Scanner;

/*	Napisati metod za nalazenje minimuma od dva ucitana broja (a, b) sa tastature. 
Izvrsiti pridruzivanja vrijednosti metoda varijbali c.*/
public class MetodaMin2UcitBroja {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite 2 broja");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c;
		c = min(a, b);
		System.out.println(" Od 2 uneta broja min je " + c);

	}

	static double min(double a, double b) {
		double min;
		if (a > b)
			min = b;
		else if (a < b)
			min = a;
		else
			min = a = b;
		return min;
	}
}
