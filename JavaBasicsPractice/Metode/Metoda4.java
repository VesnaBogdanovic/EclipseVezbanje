package metode;

/*Main poziva metod ispis i prenosi 3 imena (Nikola, Minja, Mirna) pri svakom pozivu metoda ispisa po 
 * jedno ime. 
Metod ispisa se izvodi 3 puta i svaki put ispisuje novo ime.*/
public class Metoda4 {

	public static void main(String[] args) {
		ispis("Nikola");
		ispis("Minja");
		ispis("Mirna");
	}

	public static void ispis(String ime) {
		System.out.println("Zdravo " + ime);
	}
}
