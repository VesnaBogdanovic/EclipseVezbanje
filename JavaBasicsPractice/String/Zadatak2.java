import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// Program daje poruku za 2 odredjene reci, a za rec kraj se zavrsava.

		Scanner s = new Scanner(System.in);
		String ime;
		String poruka1 = " happy ";
		System.out.println("Unesite reci 'choose' ili 'be', a rec 'end' za prestanak petlje");
		do {			
			ime = s.nextLine();
			switch (ime.toLowerCase()) {
			case "choose":
				System.out.println(ime + poruka1);
				break;

			case "be":
				System.out.println(ime + " kind ");
				break;

			default:
				System.out.println("Niste uneli trazeno ime");
			}
		} while (!ime.equals("end"));

	}
}