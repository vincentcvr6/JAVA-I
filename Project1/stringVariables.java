
import java.util.Scanner;  

public class stringVariables {

	public static void main(String[] args) {
		// display a welcome message on the screen
		System.out.println("------------------------------");
		System.out.println("  Text Analyzer ");
		System.out.println("------------------------------\n");
		
		// let's declare our scanner
		Scanner keyboard = new Scanner(System.in);

		// ask the user for some input and read the user input
		System.out.println("Enter 2 words on one line seperated by at least one space (no white space allowed IN each word): ");
		
		String word1 = keyboard.next( );    //the first word
		String word2 = keyboard.next( );    //the second word
		int word1_length = word1.length();  //the number of characters of the first word
		int word2_length = word2.length();  //the number of characters of the second word
		char word1_1st = word1.charAt(0);                //the first character of the first word
		char word1_last = word1.charAt(word1_length-1);  //the last character of the first word
		char word2_1st = word2.charAt(0);      			//the first character of the second word
		char word2_last = word2.charAt(word2_length-1);  //the last character of the second word
		
	    // display the text 	
		System.out.println("\nFirst word you entered is <"+word1+"> which is "+word1_length+" characters long.");
		System.out.println("It starts with the character '"+word1_1st+"' and ends with the character '"+word1_last+"'\n");
		System.out.println("Second word you entered is <"+word2+"> which is "+word2_length+" characters long.");
		System.out.println("It starts with the character '"+word2_1st+"' and ends with the character '"+word2_last+"'\n");
		//using substring in the Class String to choose the strings
		System.out.println("New words: "+word2_1st+word1.substring(1, word1_length-1)+word2_last+" "+word1_1st+word2.substring(1, word2_length-1)+word1_last+"\n");

		// display a closing message
		System.out.println("Thank you for using this Text Analyzer!");
		
		keyboard.close();
	}
}