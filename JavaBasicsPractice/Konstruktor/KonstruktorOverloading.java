package konstruktor;

/*kreirati klasu  koja ima dva konstrukora. Jedan je sa dva parametra (int i, String n) a 
 *drugi sa 3 parametra (int i, String n, int a). Podaci su identifikacioni broj, ime i starost studenta 
 * Kreirati objekte 1 (2 parametra) i 2 (3 paramtera). 
 * Podatke ispisati sa istom metodom na ekran.
 */
public class KonstruktorOverloading {
	int id;
	String name;
	int age;

	KonstruktorOverloading(int i, String n) {
		id = i;
		name = n;
	}

	KonstruktorOverloading(int i, String n, int a) {
		id = i;
		name = n;
		age = a;

	}

	void ispis() {
		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String[] args) {
		KonstruktorOverloading obj1 = new KonstruktorOverloading(111, "Angela");
		KonstruktorOverloading obj2 = new KonstruktorOverloading(111, "Leonardo", 28);
		obj1.ispis();
		obj2.ispis();

	}

}
