package Zadatak_1_0204;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Program unosi i sabira brojeve dok se ne unese negativan broj. I ispisuje
		 * zbir pozitivnih brojeva. Primer-ako korisnik unese 1253-1, program treba da
		 * ispise 11
		 */
	Scanner s = new Scanner ( System.in);
	System.out.println( " Program sabira sve unete pozitivne brojeve. Za izlazak iz programa unesi negativan broj.");
	int broj, zbir = 0;
	broj = s.nextInt();
	while ( broj >= 0 ) {
		zbir = zbir + broj;
		broj = s.nextInt();
	}
	System.out.println( " Zbir unesenih pozitivnih brojeva je : " + zbir );
	}
	
	}

	
