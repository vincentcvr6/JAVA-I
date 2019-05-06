
import java.util.Scanner;  

public class assignmentLate {

	public static void main(String[] args) {
		// display a welcome message on the screen
		System.out.println("------------------------------");
		System.out.println("  Welcome to the Program");
		System.out.println("------------------------------\n");
		
		// let's declare our scanner
		Scanner keyboard = new Scanner(System.in);

		// ask the user for some input and read the user input(several strings and a number)
		System.out.print("What is your teacher's first or last name? ");
		String Instructor_name = keyboard.nextLine( );
		System.out.print("What is your name? ");
		String student_name = keyboard.nextLine( );
		System.out.print("Enter a food: ");
		String food = keyboard.nextLine( );
		System.out.print("Enter the amount of fever (between 37.0 and 40.0): ");
		double fever = keyboard.nextDouble( );
		keyboard.nextLine( );         //To get rid of '\n'
		System.out.print("Enter an animal: ");
		String animal = keyboard.nextLine( );
		System.out.print("Enter an adjective that will describe your pet: ");
		String adjective = keyboard.nextLine( );
		System.out.print("Enter a colour: ");
		String colour = keyboard.nextLine( );
	     

	    // display the text by calling variables
		System.out.print("\n\nDear professor "+Instructor_name+",\n\n" + 
						"I am sorry that I am unable to turn in my computer assignment at this time. First,\n" + 
						"I ate a rotten "+food+", which made me turn "+colour+" and extremely ill. I came down\n" + 
						"with a fever of "+fever+". Next my "+adjective+" pet "+animal+" must have smelled the\n" + 
						"remains of the "+food+" on my USB key (which is where my program was stored)\n" + 
						"because he ate it.\n" + 
						"I am currently rewriting my programs and hope you will accept my assignment late.\n\n" + 
						"Sincerely,\n" + 
						student_name+"\n");

		// display a closing message
		System.out.println("\n\n--------------------------------------");
		System.out.println("Thank you for using this program! ");
		
		keyboard.close();
	}
}