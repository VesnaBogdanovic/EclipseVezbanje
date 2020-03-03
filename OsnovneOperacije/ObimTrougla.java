package Predavanja;

import java.util.Scanner;

public class ObimTrougla {

	public static void main(String[] args) {
		//Program racuna obim trougla za unete duzine stranica
		
		System.out.println("Unesite duzine stranica");
		Scanner s = new Scanner(System.in);
		
		float a;
		float b;
		float c;
		a = s.nextFloat();
		b = s.nextFloat();
		c = s.nextFloat();
		
		float zbir = a + b + c;
		
		System.out.println("Obim trougla je : " + zbir );
	}
}