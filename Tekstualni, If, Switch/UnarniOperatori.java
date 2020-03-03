package Zadatak_1_0204;

public class UnarniOperatori {
// Vezbam unarne operatore,postfiksne i prefiksne
	public static void main(String[] args) {
	int b = 4;
	int c = 8;
	int a = b++ + c++ + --b;
	/* prvo procitam b, pa uvecam b za 1; procitam c, pa uvecam c za 1; zatim umanjim b,pa ga ucitam
	 * tako da su mi vrednosti: a=16; b=4; c=9;
	*/
	int a1 = 2;
	int b1 =4;
	int c1 = b1++ + a1++ - a1--;
	/* prvo procitam b,pa ga uvecam za 1; procitam a, pa uvecam za 1; procitam a ,pa umanjim za 1;
	 * vrednosti su: a=2; b=5; c=3;
	 */
	int a2 = 2;
	int b2 = 4;
	int c2 = ++a2 - ++b2 + --a2;
	/* prvo uvecavam a,pa ga procitam;uvecavam b,pa ga procitam;smanjujem a,pa ga procitam
	 * vrednosti su: a=2;b=5;c=0
	 */

	int a3 =2;
	int b3 = 4;
	int c3 = ++a3 + ++b3 - --b3;
	/*  uvecavam a, pa ga procitam; uvecavam b,pa ga procitam; smanjujem b,pa ga procitam
	 * vrednosti su: a=3;b=4;c=4;
	 */
	
	int a4 = 2;
	int b4 = 4;
	int c4 = a4-- + b4-- + --a4;
	/*  citam a,pa smanjujem; citam b ,pa smanjujem;smanjujem a ,pa ga citam;
	 * vrednosti su: a=0;b=3;c=6;
	 */
	 int a5 = 2;
	 int b5 = 4;
	 int c5 = a5-- - b5-- - ++a5;
	 /* citam a, pa ga smanjujem;citam b pa ga smanjujem; povecavam a pa ga citam;
	  * vrednosti su : a=2; b=3; c=-4;
	  */
	
	int a6 = 2;
	int b6 = 4;
	int c6 = --a6 - --b6 + a6++;
	/* smanjujem a,pa ga citam;smanjujem b,pa ga citam;  citam a, pa ga povecavam;
	 * vrednosti su : a=2;b=3;c=-1;
	 */
	 
	 int a7 = 2;
	 int b7 = 4;
	 int c7 = --a7 - --b7 + a7--;
	 /*  smanjujem a,pa ga ucitavam; smanjujem b,pa ga ucitavam; ucitavam a,pa ga smanjujem;
	  * vrednosti su : a = 0; b = 3; c = -1;
	  */
	 
	
	}

}
