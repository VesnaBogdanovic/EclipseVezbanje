package vezbanja;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		/*
		 * Napisati program za izracunavanje na osnovu vrednosti k :k (y); 1(y=k+2); 2
		 * (y=k-2); 3(y=k*2);
		 */

		Scanner s = new Scanner(System.in);
		System.out.println(" Unesite 1,2 ili 3 ");
		int k = s.nextInt();
		int y;
		switch (k) {
		case 1:
			y = k + 2;
			System.out.println(y);
			break;
		case 2:
			y = k - 2;
			System.out.println(y);
			break;
		case 3:
			y = k * 2;
			System.out.println(y);
			break;
		default:
			System.out.println(" Niste uneli dobru vrednost");
		}

	}

}
