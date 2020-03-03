import java.util.Scanner;

public class Zadatak5 {
// Unosim reci sve dok ne unesem rec stop

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String Word;
		System.out.println("Enter a word or type stop to quit the program.");
		Word = in.next();
		while (!Word.equals("stop"))
		{
System.out.println("Word is: " + Word); // prints the word the user entered
	System.out.println("Enter a word or type stop to quit the program.");
		Word = in.next(); //waits for user to input more information
		
		}	
	}

}