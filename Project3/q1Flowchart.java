import java.util.Scanner;
public class q1Flowchart {
	/*
	 * Based on the flowchart, this program outputs the Fibonacci number which means
	 * that every number after the first two is the sum of the two preceding ones.
	 */
	public static void main(String[] args) {
		
		// Variable  Declarations	
		Scanner keyboard = new Scanner(System.in);   // Keyboard input variable
		boolean repeat=false;						// for judging user's input
		String userinput;							
		
		
		// display a welcome message on the screen
		System.out.println("----------------------------------------------------");
		System.out.println("    Welcome to The Program");
		System.out.println("----------------------------------------------------");
		
		
		do {	//outer loop for user's wanting to continue
			int i=1, j=1, k=1,output=0;					// the variables for loops
			// prompt the user for input 
			System.out.println("Please enter the number of sequences");
			int n = keyboard.nextInt( );
			
			//creating the Fibonacci number
			if(n>=0);        
			else
				n=1;					// limiting n to be positive integer
			for(i=1;i<=n;i++)		// inner loop
			{
				if(i==1)				// the first Fibonacci number is 1
					System.out.print("\nThe results is: \n"+j);
				else
				{
					if(i==2)			// the second Fibonacci number is 1
						System.out.print(","+k);
					else
					{
						output=j+k; // the sum of the two preceding ones
						System.out.print(","+output);
						k=j;			// transfer data
						j=output;	// transfer data
					}
				}
			}
			// prompt the user for input 
			do   // ask the user if s/he wants to continue
			{
				System.out.println("\n\nDo you want to repeat?(Yes/No)");
				userinput=keyboard.next();
				switch(userinput)
				{
					case "Yes": repeat=true;
					break;
					case "No": repeat=false;
					break;
					default: break;
				}	
			}// until the use input valid "Yes" or "No"
			while( !userinput.equals("Yes") && !userinput.equals("No"));
			System.out.println("");
		}while(repeat); 	//when input is "Yes", continue the program
							//when input is "No", end the program
		
		keyboard.close();    // close the scanner object
		// display a closing message
		System.out.println("Thank you for choosing the program, have a nice day!");
	}
}