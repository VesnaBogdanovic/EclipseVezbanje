import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// Unose se 2 reci po zelji i dobijamo poruku da li su te 2 reci jednake ili nisu

		Scanner s = new Scanner(System.in);
		System.out.println(" Unesite 2 reci po zelji ");

		String a = s.next();
		String b = s.next();

		if (a.equals(b)) {
			System.out.println(" Jednaki su... ");
		} else {
			System.out.println(" Nisu jednaki ");
		}
	}

}
