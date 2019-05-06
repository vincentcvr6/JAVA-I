import java.util.Scanner;  
public class q2Speeding {
	/* 
	 * This program helps determine the penalty for a driver who is speeding 
	 * and output the number of demerit points
	 */
	public static void main(String[] args) {
		
		// Variable  Declarations
		Scanner keyboard = new Scanner(System.in);  // Keyboard input variable
		int demerit_point =0;                       // demerit points for penalty
		

		// display a welcome message on the screen
		System.out.println("------------------------------------------------------------");
		System.out.println("              SpeedyFine Calculator");
		System.out.println("----------------------------------------------------------\n");
		

		// prompt the user for input 
		System.out.print("How fast was the driver going? ");
		int speed = keyboard.nextInt( );

		
		//determine and compute by using nested if-else
		if(speed <= 100)
			System.out.print("The driver was not speeding. ");
		else
		{	
			if(speed >= 160)
				System.out.print("The fine is $520 and the driver loses his license. ");
			else
			{
				if(speed < 110)
					System.out.println("The fine is $65. ");
				else 
				{
					if(speed < 120)
					{
						System.out.println("The fine is $120 and the driver gets 2 demerit points! ");
						demerit_point = 2;
					}
					else
					{
						if(speed < 140)
						{
							System.out.println("The fine is $240 and the driver gets 5 demerit points! ");
							demerit_point = 5;
						}
						else
						{
							if(speed < 160)
								System.out.println("The fine is $360 and the driver gets 7 demerit points! ");
								demerit_point = 7;
						}
					}
				}
				
				//After determining that the driver was speeding and if they have not yet lost their license
				//ask the user how many demerit points the driver originally had.
				System.out.print("How many demerit points did the driver have prior to being stopped? ");
				int prior_demerit_point = keyboard.nextInt( );  //demerit points the driver originally had
				if(prior_demerit_point >= 12)
					System.out.print("The driver has "+prior_demerit_point+" demerit points and loses his license. ");
				else
				{
					demerit_point += prior_demerit_point;  //demerit points the driver originally had + the ones for penalty
					if(demerit_point >=12)
						System.out.print("The driver has "+demerit_point+" demerit points and loses his license. ");
					else
						System.out.print("The driver now has "+demerit_point+" demerit points.");
				}
			}
		}
		
		keyboard.close();// close the scanner object
		
		// display a closing message
		System.out.println("\n\n\n\n\n--------------------------------------");
		System.out.println("Thank you for using this program! ");
	}
}