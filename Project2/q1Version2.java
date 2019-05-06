import java.util.Scanner;  
public class q1Version2 {
	/*
	 * This program corresponds to the numner input by outputing what day of the week 
     * and whether it is a weekday or weekend. 
	 */
	public static void main(String[] args) {
		
		// Keyboard input variable
		Scanner keyboard = new Scanner(System.in);   
		
		// display a welcome message on the screen
		System.out.println("------------------------------");
		System.out.println("  Welcome to the Program");
		System.out.println("------------------------------\n");
		
		// prompt ask the user for input 
		System.out.print("Please enter the day of the week as a number (1-7): ");
		int num = keyboard.nextInt( );
		
		//output by using switch
		switch(num)
		{
			case 1: System.out.print("It's Monday! It's a weekday!");
				break;
			case 2: System.out.print("It's Tuesday! It's a weekday!");
				break;
			case 3: System.out.print("It's Wednesday! It's a weekday!");
				break;
			case 4: System.out.print("It's Thursday! It's a weekday!");
				break;
			case 5: System.out.print("It's Friday! It's a weekday!");
				break;
			case 6: System.out.print("It's Saturday! It's the weekend!");
				break;
			case 7: System.out.print("It's Sunday! It's the weekend!");
				break;
			default: System.out.print("That's not a valid day!");
		}
		
		keyboard.close(); // close the scanner object
		
		// display a closing message
		System.out.println("\n\n--------------------------------------");
		System.out.println("Thank you for using this program! ");
	}
}