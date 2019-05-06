import java.util.Scanner;  
public class q1Version1 {

	public static void main(String[] args) {
		
		// Keyboard input variable
		Scanner keyboard = new Scanner(System.in);   
		
		// display a welcome message on the screen
		System.out.println("------------------------------");
		System.out.println("  Welcome to the Program");
		System.out.println("------------------------------\n");
		
		// ask the user for input 
		System.out.print("Please enter the day of the week as a number (1-7): ");
		int num = keyboard.nextInt( );
		
		//output by using nested if-else
		if(num == 1)
			System.out.print("It's Monday! It's a weekday!");
		else
		{
			if(num == 2)
				System.out.print("It's Tuesday! It's a weekday!");
			else
			{
				if(num == 3)
					System.out.print("It's Wednesday! It's a weekday!");
				else
				{
					if(num == 4)
						System.out.print("It's Thursday! It's a weekday!");
					else
					{
						if(num == 5)
							System.out.print("It's Friday! It's a weekday!");
						else
						{
							if(num == 6)
								System.out.print("It's Saturday! It's the weekend!");
							else
							{
								if(num == 7)
									System.out.print("It's Sunday! It's the weekend!");
								else
									System.out.print("That's not a valid day!");
							}
						}
					}
				}
			}
		}
		
		keyboard.close(); // close the scanner object
		
		// display a closing message
		System.out.println("\n\n--------------------------------------");
		System.out.println("Thank you for using this program! ");
	}
}