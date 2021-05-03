package konstruktor;

/*Kreirati konstruktor klase KonstruktorParam koji ima dva parametra. 
Moguce je imati bilo koji broj parametara u konstruktoru.*/
public class KonstruktorParam {
	String name;
	int brojStudenta;

	KonstruktorParam(String n, int id) {
		name = n;
		brojStudenta = id;

	}

	void ispis() {
		System.out.println(name + " " + brojStudenta);
	}

	public static void main(String[] args) {
		KonstruktorParam obj = new KonstruktorParam("Lucius", 111);
		KonstruktorParam obj1 = new KonstruktorParam("Eleonore", 222);
		obj.ispis();
		obj1.ispis();

	}

}
