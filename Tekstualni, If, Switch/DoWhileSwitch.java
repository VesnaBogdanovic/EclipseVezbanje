import java.util.Scanner;

public class DoWhileSwitch {

	public static void main(String[] args) {

/* Korisnik unosom odredjenog broja bira sledece opcije: 1.Provera stanja (Pri pokretanju je 0) 2.Podizanje novca
3.Uplata novca 0- Kraj-da se program zavrsi */

		Scanner s = new Scanner(System.in);
		int izbor;
		float stanje = 0;
		do {
			System.out.println(" Uneti 1 za proveru stanja, 2 za podizanje novca, 3 za uplatu, 0 za izlaz ");
			izbor = s.nextInt();
			switch (izbor) {
			case 1:
				System.out.println(" Stanje je " + stanje + ".");
				break;

			case 2:
				if (stanje > 0) {
					System.out.println(" Koliko novca zelite da podignete? ");
					int iznos = s.nextInt();
					if (iznos > 0) {
						if (iznos < stanje) {
							stanje = stanje - iznos;
							System.out.println(" Uspesno ste podignuli novac! ");
						} else {
							System.out.println(" Nemate dovoljno novca na racunu");
						}
					} else {
						System.out.println(" Iznos ne sme biti negativan ");
					}
				}
				else {
					System.out.println(" Nemate sredstva na racunu ");
				}
				break;

			case 3:
				System.out.println(" Koliko novca zelite da uplatite? ");
				int uplata = s.nextInt();
				if (uplata > 0) {
					stanje = stanje + uplata;
				} else
					System.out.println(" Greska!Iznos mora biti veci od nule ");
				break;

			case 0:
				System.out.println(" Hvala sto ste koristili nase usluge ");
				break;

			default:
				System.out.println(" Los unos opcije ");
			}

		} while (izbor != 0);

	}
}