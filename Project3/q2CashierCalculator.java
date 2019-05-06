import java.util.Scanner;
public class q2CashierCalculator {
	/*
	 * This program compute the total price of some items including taxes(Tax1 & Tax2).
	 */
	public static void main(String[] args) {
		
		
		// Variable  Declarations
		int n=0, counter=0;				//The number of items,
										//the total number of invalid values 
		double [] price;				//The price of each item in the form of array
		double pi;						//The price of each item
		double subtotal=0.00; 			//the total price withour taxes
		double tax1, tax2, tax1rate, tax2rate, total;  
		final int MINNUM = 1;			//The minimum number of items is 1
		final int MAXNUM = 10;			//And the maximum number of items is 10
		final double MINPRICE = 1.00;	//The minimum price of each item is $1
		final double MAXPRICE = 1000.00;//The maximum price of each item is $1,000
		final double MINRATE = 0.00;	//The minimum tax rate for Tax1 and Tax2 is 0
		final double MAXRATE = 100.00;	//he maximum tax rate is 100
		Scanner keyboard = new Scanner(System.in);   // Keyboard input variable
		
		// display a welcome message on the screen
		System.out.println("-$-$-$--------------------------------------$-$-$-");
		System.out.println("      Welcome to Cashier Calculator Program");
		System.out.println("-$-$-$--------------------------------------$-$-$-\n");
		
		
		do
		{	// prompt the user for inputing the number of items
			System.out.print("Please enter the number of items bought [1...10]: ");
			n = keyboard.nextInt( );
			counter++;
		}while(n<MINNUM || n>MAXNUM); //making sure the validity
		counter--;					 //the number of invalid values on items
		System.out.println();
		
		
		price = new double[n];
		for(int i=1; i<=n; i++)		//outer loop for each item
		{
			do
			{	// prompt the user for inputing price for each item
				System.out.print("Please enter the price of items "+i+" [1...1000]:");
				pi = keyboard.nextDouble( );
				counter++;
			}while(pi<MINPRICE || pi>MAXPRICE); //making sure the validity
			System.out.println();
			price [i-1] = pi;    //store each price into the array
		}
		counter -= n;		//the number of invalid values on items and prices

		
		do
		{	// prompt the user for inputing the rate1
			System.out.print("Please enter the tax rate of Tax1: [0...100]");
			tax1rate = keyboard.nextDouble( );
			counter++;
		}while(tax1rate<MINRATE || tax1rate>MAXRATE);    //making sure the validity
		counter--;										//the number of invalid values
		System.out.println();
		
		
		do
		{	// prompt the user for inputing the rate2
			System.out.print("Please enter the tax rate of Tax2: [0...100]");
			tax2rate = keyboard.nextDouble( );
			counter++;
		}while(tax2rate<MINRATE || tax2rate>MAXRATE);    //making sure the validity
		counter--;										//the number of invalid values totally
		

		
		for(int j=1; j<=n; j++)
			subtotal+=price[j-1];   		 //compute the subtotal price without taxes
		tax1=subtotal*tax1rate*0.01;		 //compute tax1
		tax2=(subtotal+tax1)*tax2rate*0.01;  //compute tax2
		total=subtotal+tax1+tax2;			 //compute total price
		
		
		System.out.println("\nHere are your results");
		System.out.println("---------------------");
		System.out.println("You have entered "+counter+" invalid inputs.");
		System.out.printf("Subtotal: $ %.2f\n",subtotal);
		System.out.printf("Tax 1: $ %.2f\n",tax1);
		System.out.printf("Tax 2: $ %.2f\n",tax2);
		System.out.printf("TOTAL: $ %.2f\n",total);
		System.out.print("\nHope you shopping trip was an enjoyable one!");
		
		keyboard.close();// close the scanner object
		// display a closing message
		System.out.println("\n\n--------------------------------------");
		System.out.println("Thank you for using this program! ");
	}
}