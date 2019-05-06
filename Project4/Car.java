public class Car {
/* 
 * This program defines a class to store information about a car
 */
	// variables of the class
	private int age;					//the age of the car
	private String type;				//the type of the car
	private double cost;				//the cost of the car
	
	public Car()						//constructor with no argument
	{
		age=0;
		type="sedan";
		cost=32000.0;
	}
	
	public Car(double cost)			//constructor with one argument
	{
		age=0;
		type="sedan";
		this.cost=cost;
	}
	
	public Car(int age, double cost) 	//constructor with two argument
	{
		this.age=age;
		type="sedan";
		this.cost=cost;
	}
	
	public Car(int age, double cost, String type)	////constructor with three argument
	{
		this.age=age;
		this.type=type;
		this.cost=cost;
	}
	
	public int getAge()				//accessor method to return age
	{
		return age;
	}
	
	public String getType()			//accessor method to return type
	{
		return type;
	}
	
	public double getCost()			//accessor method to return cost
	{
		return cost;
	}
	
	public void setAge(int newage)  		//mutator method to set age
	{
		age=newage;
	}
	
	public void setType(String newtype)	//mutator method to set type
	{
		type=newtype;
	}
	
	public void setCost(double newcost)	//mutator method to set cost
	{
		cost=newcost;
	}
	
	public void setCost(int newage, double newcost)	//mutator method to set age and cost
	{
		age=newage;
		cost=newcost;
	}
	
	public void setCost(int newage, double newcost, String newtype)
	{												//mutator method to set age, cost and type
		age=newage;
		cost=newcost;
		type=newtype;
	}
	
	public double estimatePrice()		//returns the cost of a car based on type and age
	{
		double cost_est=0.0;
		final double COST_SEDAN=32000.0; 	//the fixed base price for sedan
		final double COST_SUV=45000.0;		//the fixed base price for SUV
		switch(type)
		{ 
			case "sedan":			//compute the depreciation
			{
					cost_est=COST_SEDAN*(1-age*0.1);		
				if(age>5)
					cost_est=cost_est*(1-(age-5)*0.05);	
				break;
			}
			case "SUV":				//compute the depreciation
			{	if(type.equals("SUV"))
				{
						cost_est=COST_SUV*(1-age*0.08);	
					if(age>5)
						cost_est=cost_est*(1-(age-5)*0.04); 
				}
				break;
			}
		}
		return cost_est;
	}
	
	public String toString() 		//A toString() method that returns 
									//the type of the car as well as it’s age and cost
	{
		return("This car is type "+type+". Its age is "+age+
				" and costs $"+cost);
	}
	
	public boolean equals(Car otherCar)		//An equals() method to test for equality 
											//of two objects of class car based on type and age
	{
		return((type.equals(otherCar.type)) && (age==otherCar.age));
	}
	
	public boolean isLessThan(Car otherCar)	//compare between the prices 
	{
		return(cost<otherCar.cost);
	}
	
	public boolean isGreaterThan(Car otherCar)	//compare between the prices 
	{
		return(cost>otherCar.cost);
	}
}