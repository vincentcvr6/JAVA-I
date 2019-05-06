import java.util.Scanner;
public class raceLane1 {
	/* 
	 * This program uses the Car class to simulate the situation where two cars collides
	 */
	
	public static void main(String[] args) 
	{
		// display a welcome message on the screen
		System.out.println("------------------------------\n"+
						   "  Welcome to the Program\n"+
						   "------------------------------\n");
		
		String model1, model2;							//the model of the first car, the second car
		int location1, location2;						//the location of the first car, the second car
		int  maxSpeed1, maxSpeed2;						//the max speed of the first car, the second car
		Scanner keyboard = new Scanner(System.in);   	// Keyboard input variable

		
		// prompt the user for input 
		System.out.println("Please enter the model of the first car");
		model1 = keyboard.nextLine();
		System.out.println("Please enter the location of the first car");
		location1 = keyboard.nextInt();
		System.out.println("Please enter the speed of the first car");
		maxSpeed1 = keyboard.nextInt();
		Car C1 = new Car(model1, location1, maxSpeed1);		//create a new C1 object
	
		
		keyboard.nextLine();									//To go to the next line
		// prompt the user for input 
		System.out.println("Please enter the model of the second car");
		model2 = keyboard.nextLine();
		System.out.println("Please enter the location of the second car");
		location2 = keyboard.nextInt();
		System.out.println("Please enter the speed of the second car");
		maxSpeed2 = keyboard.nextInt();
		Car C2 = new Car(model2, location2, maxSpeed2);		//create a new C2 object
	
		
		System.out.println(C1);			//Call the toString() method to check C1's state
		System.out.println(C2);			//Call the toString() method to check C2's state
		
		if(C1.getLocation()<=C2.getLocation())	//Determine which car is to the left of the other car 
			C2.turnAround();						//based on their location，and turn the car on the right around
		else
			C1.turnAround();
		
		System.out.println(C1);	
		System.out.println(C2);	
		C1.go();					//set C1's state to that it is moving
		C2.go();					//set C2's state to that it is moving
		System.out.println(C1);	
		System.out.println(C2);	

		
		if(C1.getLocation()<C2.getLocation())			//two cars keep moving until they collide
		{												//the case when C1 is on the left of C2
			do											
			{
				C1.move();
				C2.move();
				System.out.println(C1);	
				System.out.println(C2);	
			}while(C1.getLocation()<C2.getLocation());
				System.out.println("Boom!!");
		}
		else
			if(C1.getLocation()>C2.getLocation())		//the case when C2 is on the left of C1
			{
				do
				{
					C1.move();
					C2.move();
					System.out.println(C1);	
					System.out.println(C2);	
				}while(C1.getLocation()>C2.getLocation());
					System.out.println("Boom!!");
			}
			else
				if(C1.getLocation()==C2.getLocation())	//the case when C1 and C2 are in the same location
					System.out.println("Boom!!");
				
		keyboard.close();      // close the scanner object
		// display a closing message
		System.out.println("\n\n--------------------------------------\n"+
							"Thank you for using this program! ");
	}

}

