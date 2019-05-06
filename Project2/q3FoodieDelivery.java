import java.util.Scanner;  
public class q3FoodieDelivery {
	/*
	 * This program helps a customer decide which subscription is best for them based on the
	 * number of food orders they make per month. 
	 */
	public static void main(String[] args) {
		
		// Variable  Declarations		
		Scanner keyboard = new Scanner(System.in);   // Keyboard input variable
		double cost1=0.00, cost2=0.00, cost3=0.00;   // The cost of Payperdelivery, OccassionalFoodie and MontrealFoodie
		double save1=0.00, save2=0.00, save3=0.00;	// save1: savings from PayPerDelivery when choosing OccassionalFoodie
													// save2: savings from PayPerDelivery when choosing MontrealFoodie
													// save3: savings from OccassionalFoodie when choosing MontrealFoodie
		
		
		// display a welcome message on the screen
		System.out.println("\n-----------------------------------------------------------");
		System.out.println("            FoodieDelivery Subscription Calculator");
		System.out.println("-----------------------------------------------------------\n");
		
		
		// prompt the user for input 
		System.out.print("Please enter the number of times a month you use food delivery services: ");
		int num = keyboard.nextInt( );

		
		//firstly calculate the cost of PayPerDelivery 
		cost1 = num*3.00;
		System.out.println("\nThe cost of Pay per delivery would be: $"+String.format("%.2f",cost1)+"/month");
		
		//compute the cost and savingd respectively according the number of times a mouth
		if(num < 5)	
			System.out.println("\n**We recommend getting the Pay per delivery.**");
		else
		{	if(num < 6)    //the speicial case when the number of times a mouth is 5
			{
				cost2 = 15.00;
				save1 = cost1-cost2;
				System.out.println("Based on your food deliveries, the cost of the OccasionalFoodie subscription would be:\n" + 
					"$"+String.format("%.2f",cost2)+"/month\n");
				System.out.println("You would save $ "+String.format("%.2f",save1)+ " from PayPerDelivery.");
				System.out.println("**We recommend getting the OccasionalFoodie subscription.**");
			}
			else
			{
				if(num < 20)  //the best financial option is OccasionalFoodie
				{	
					cost2 = 15.00+(num-6)*2.00;  // $15/month for 6 times with each additional delivery costing $2
					save1 = cost1-cost2;         
				System.out.println("Based on your food deliveries, the cost of the OccasionalFoodie subscription would be:\n" + 
						"$"+String.format("%.2f",cost2)+"/month\n");
				System.out.println("You would save $ "+String.format("%.2f",save1)+ " from PayPerDelivery.");
				System.out.println("**We recommend getting the OccasionalFoodie subscription.**");
				}
				else   //the best financial option is MontrealFoodie
				{
					cost2 = 15.00+(num-6)*2.00;
					cost3 = 30.00+(num-12)*1.50; // $30/month for 12 times with each additional delivery costing $1.50
					save2 = cost1-cost3;
					save3 = cost2-cost3;
					System.out.println("The cost of pay OccassionalFoodie would be: $"+String.format("%.2f",cost2)+"/month");
					System.out.println("Based on your food deliveries, the cost of the MontrealFoodie subscription would be:\n" + 
						"$"+String.format("%.2f",cost3)+"/month\n");
					System.out.println("You would save $ "+String.format("%.2f",save3)+ " from the OccasionalFoodie subscription and $"+String.format("%.2f",save2)+" from PayPerDelivery.");
					System.out.println("**We recommend getting the MontrealFoodie subscription.**");
				}
			}
		}
		System.out.println("\nThank you for using FoodieDelivery Subscription Calculator. Good Eats :-)!");
		
		keyboard.close(); // close the scanner object
		
		// display a closing message
		System.out.println("\n\n--------------------------------------");
		System.out.println("Thank you for using this program! ");
	}
}