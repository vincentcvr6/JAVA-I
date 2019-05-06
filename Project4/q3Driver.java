public class q3Driver {
	/*
	 * a driver class to test the methods of Car class
	 */
	public static void main(String[] args) {
		// display a welcome message on the screen
		System.out.println("------------------------------\n"+
						   "  Welcome to the Program\n"+
						   "------------------------------\n");
		
		Car C1 = new Car();						//create a new C1 object
		Car C2 = new Car(32000.0);				//create a new C2 object
		Car C3 = new Car(4,18000.0);			//create a new C3 object
		Car C4 = new Car(2,36000.0,"SUV");		//create a new C4 object
		
		System.out.println("Car C1: "+C1);
		System.out.println("Car C2: "+C2);
		System.out.println("Car C3: "+C3);
		System.out.println("Car 41: "+C4);
		System.out.println();
		
		//test the accessor methods
		System.out.println("Accessor Method: The cartype for car C4 is "+C4.getType()+
				", its age is "+C4.getAge()+", and it costs $"+C4.getCost()+"\n");
		//calculate the estimated price of the cars
		System.out.println("The estimated price of car C3 is $"+C3.estimatePrice());
		System.out.println("The estimated price of car C4 is $"+C4.estimatePrice());
		//test out all 5 mutator methods
		C3.setAge(5);
		System.out.println("Mutator Method: The new age for car C3 is "+C3.getAge());
		C3.setType("SUV");
		System.out.println("Mutator Method: The new cartype for car C3 is "+C3.getType());
		C3.setCost(14000.0);
		System.out.println("Mutator Method: The new cost for car C3 is "+C3.getCost());
		C3.setCost(9,9000.0);
		System.out.println("Mutator Method: The new car age is "+C3.getAge()+" and its new cost is "+C3.getCost());
		C3.setCost(14,5000.0,"Sedan");
		System.out.println("Mutator Method: The new cartype for car C3 is "+C3.getType()+", its new age is "+C3.getAge()+
							" and its cost is "+C3.getCost());
		//test method toString()
		System.out.println("toString: "+C3+"\n");	
		//test method equals()
		System.out.println("Cars C1 and C2 are equal is "+C1.equals(C2));
		System.out.println("Cars C1 and C4 are equal is "+C1.equals(C4));
		//test method isLessThan()
		System.out.println("Car C4 is less than C3 is "+C4.isLessThan(C3));	
		//test method isGreaterThan() 
		System.out.println("Car C1 is greater than C3 is "+C1.isGreaterThan(C3));
		
		// display a closing message
		System.out.println("\n\n--------------------------------------\n"+
							"Thank you for using this program! ");
	}
}
