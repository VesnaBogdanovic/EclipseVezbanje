package Zadatak_1_0204;

import java.util.Scanner;

public class If4 {

	public static void main(String[] args) {
		//Program za uneti broj kilograma racuna ponasanje lifta koji moze da prihvati do 640kg

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite zeljeni broj kilograma");
		double kg = s.nextDouble();
		if (kg < 640 && kg > 0) {
			System.out.println("Lift je pokrenut");
		} else if (kg == 640) {
			System.out.println("Na granici je");
		} else if (kg > 640) {
			System.out.println("Lift je preopterecen");
		}

		else {
			System.out.println("Uneli ste negativnu vrednost");
		}
	}
}
