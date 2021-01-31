package Predavanja;

import java.util.Scanner;

public class PovrsinaKruga {

	public static void main(String[] args) {
		//Program racuna povrsinu kruga

		
System.out.println ("Unesi poluprecnik kruga");
Scanner s = new Scanner (System.in);
	
double r = s.nextDouble();
		
while (r<0) {  
 System.out.println("Uneli ste negativan broj");
r = s.nextDouble(); //kad ovo ne bih imala petlja se nikad ne bi zavrsila
}
System.out.println("Povrsina kruga je:" + r*r*3.14);
		
		}
	}
