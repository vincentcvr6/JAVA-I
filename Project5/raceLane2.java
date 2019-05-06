import java.util.Scanner;
public class raceLane2 {

	public static void main(String[] args) {
		
		
		// display a welcome message on the screen
		System.out.println("------------------------------\n"+
						   "  Welcome to the Program\n"+
						   "------------------------------\n");
		Scanner keyboard = new Scanner(System.in);  // Keyboard input variable
		int car_number, laps, maxSpeed;				// the number of cars, the number of laps, the max speed
		String model;								// the type of the car
		int winner_number=0;						// the number of winners
		int crashed_number=0;						// the number of crashed cars
		int current_car_number=0;					// the number of cars that are still racing
		boolean crashDetection = false;				// the status of entering into crash detection(a car enters the second lap)
		boolean crashed_3 = false;					// the status of a crash happening 

		// prompt the user for input 
		System.out.println("How many cars are going to race:");
		car_number = keyboard.nextInt();
		System.out.println("How many laps:");
		laps = keyboard.nextInt();

		
		Car[] cars = new Car[car_number];			//the array of cars
		Car[] cars_winners = new Car[car_number];		//the array of winners of cars 

		
		for(int i=0; i<car_number; i++)				//store the information of cars from user's input
		{
			keyboard.nextLine();									//To go to the next line
			System.out.println("Please enter the model of car "+i);
			model = keyboard.nextLine();
			System.out.println("Please enter the max speed of the car "+i);
			maxSpeed = keyboard.nextInt();
			cars[i] = new Car(model, maxSpeed);
			cars_winners[i] = new Car("TBA", maxSpeed); 			
		}
		

		
		current_car_number=car_number;								//the number of current cars when the race starts
		while((current_car_number!=0) && (winner_number!=3))		//all cars keeps racing until three cars finish the race 
		{															//or all cars have crashed
			current_car_number=car_number-winner_number-crashed_number;
			for(int i=0; i<car_number; i++)
			{
				if(!cars[i].getWin()&&!cars[i].getCrashed())			//a car keeps racing until it crashes or wins
				{
					cars[i].accelerate();							//a car accelerate to its maximum speed
					cars[i].move();
					if(cars[i].getLocation()>(100*laps))				//when a car finished the race
					{
						winner_number++;
						cars[i].setWin(true);						//set the car be the status of winning
						cars_winners[winner_number-1]=cars[i];		//store the winning information into the array
						current_car_number=car_number-winner_number-crashed_number;
						if((winner_number==3)||(current_car_number==0))	//when three cars finish the race or all cars have crashed, end this loop
						{
							current_car_number=0;
							break;
						}
						cars[i].stop();								//a car stops when it finishes the race
					}
					if(cars[i].getLocation()>100)					//crash detection starts as soon as a car enters the second lap
						crashDetection=true;
				}
			}
			for(int i=0; i<car_number;i++)							//display the status of each car
				System.out.println(cars[i]);	
			if(crashDetection)			
			{
				for(int j=0; j<car_number; j++)						//detect if there are three cars at the same location
				{
					if(cars[j].getCrashed())
						break;
					for(int k=j+1; k<car_number; k++)
					{	
						if(cars[k].getCrashed())
							break;
						if(cars[j].getLocation()==cars[k].getLocation())
						{
							for(int n=k+1; n<car_number; n++)
							{	
								if(cars[n].getCrashed())
									break;
								if(cars[k].getLocation()==cars[n].getLocation())
								{	
									for(int m=0; m<car_number; m++)	//all cars stops when a crash is detected
										cars[m].stop();
									crashed_3=true;					//tag the status of crashed
									cars[j].setCrashed(true);		//set the three cars be crashed
									cars[k].setCrashed(true);
									cars[n].setCrashed(true);
									System.out.println("The following cars got crashed:"); //
									System.out.println(cars[j]);	
									System.out.println(cars[k]);	
									System.out.println(cars[n]);	
									break;
								}
							}
						}
					}
				}	
			}
			
			if(crashDetection)
			{
				if(crashed_3)
				{
					crashed_number+=3;								//record the number of crashed cars
					System.out.println("Num of crashed cars: "+3);
					crashed_3=false;
					if(crashed_number==car_number)
						{
							System.out.println("All cars are crashed.");	//indicate that all cars got crashed
							System.exit(0);								//end this program without outputting information about winners
						}
				}
				else
					System.out.println("Num of crashed cars: "+0);
				current_car_number=car_number-winner_number-crashed_number;
				System.out.println("Num of current cars in race: "+current_car_number);
			}
		}
		
		System.out.println("The winners are:");						//display the last winning cars
		for(int i=0; i<winner_number; i++)
			System.out.println(cars_winners[i]);	
		
		
		keyboard.close();      // close the scanner object
		// display a closing message
		System.out.println("\n\n--------------------------------------\n"+
							"Thank you for using the program! ");
	}
}
