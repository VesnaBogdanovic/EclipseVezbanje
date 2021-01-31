package vezbanja;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
		//Program racuna sumu 2 broja

	Scanner s = new Scanner ( System.in);
	System.out.println( " Unesite 2 broja ");
	int broj1 = s.nextInt();
	int broj2 = s.nextInt();
	int suma = broj1 + broj2;
	System.out.println(" Suma 2 broja je : " + suma );
	}

}
