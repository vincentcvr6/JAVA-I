public class Car {
	/* 
	 * This program defines a class named Car to store information about a car
	 */
	
	// variables of the class
	private String model;			//the type of the car
	private int location;			//the location of the car
	private int currentSpeed;		//the current speed of the car
	private boolean movingForward;	//add or subtract the current speed of the car
	private int maxSpeed;			//the max speed of the car
	private boolean win=false;		//the status of winning
	private boolean crashed=false;	//the status of crashed
	
	public Car(String model, int location, int maxSpeed) 		//the default constructor that takes three 
	{
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.location = location;
		movingForward = true;
		currentSpeed = 0;
	}
	
	public Car(String model, int maxSpeed) 		//the constructor that takes only two parameters 
	{
		this.model = model;
		this.maxSpeed = maxSpeed;
		location = 0;
		movingForward = true;
		currentSpeed = 0;
	}
	
	public String getModel()				//the accessor method to return model
	{
		return model;
	}
	
	public boolean getDirection()		//the accessor method to return movingForward
	{
		return movingForward;
	}
	
	public int getLocation()				//the accessor method to return location
	{
		return location;
	}
	
	public int getSpeed()				//the accessor method to return current speed
	{
		return currentSpeed;
	}
	
	public boolean getWin()				//the accessor method to return the status of winning
	{
		return win;
	}
	
	public void setWin(boolean win)		//the mutator method to set the status of winning
	{
		this.win=win;
	}
	
	public boolean getCrashed()			//the accessor method to return the status of crashed	
	{
		return crashed;
	}
	
	public void setCrashed(boolean crashed)	//the mutator method to set the status of crashed
	{
		this.crashed=crashed;
	}
	
	public void go()			//set the currentSpeed of the object to be the object’s maxSpeed
	{
		currentSpeed = maxSpeed;
	}
	
	public void stop()					//set the currentSpeed of the Car object to be 0
	{
		currentSpeed = 0;
	}
	
	public void turnAround()
	{
		movingForward = !movingForward;	 //change the boolean variable movingForward
	}
	
	public void move()					//the move method to change the location property according to direction
	{
		if(movingForward)
			location += currentSpeed;
		else
			location -= currentSpeed;
	}
	
	public String toString()			//the method toString() which return a string representation of a Car object
	{	
		if(movingForward)
		{
			if(currentSpeed>0)
				return(model+" Located at: "+location+", facing forward and moving at "+currentSpeed+" speed");
			else
				return(model+" Located at: "+location+", facing forwards, not moving");
		}
		else
			{
			if(currentSpeed>0)
				return(model+" Located at: "+location+", facing backward and moving at "+currentSpeed+" speed");
			else
				return(model+" Located at: "+location+", facing backward, not moving");
			}
	}
	
	public void accelerate()			//the method to increase speed
	{
		if(currentSpeed == maxSpeed);
		else
			currentSpeed++;
	}
	
	public void brake()				//the method to decrease speed
	{
		if(currentSpeed == 0);
		else
			currentSpeed--;
	}
	
	public void changeTo(Car another)			//the method to swap two objects
	{
		this.model = another.model;
		this.maxSpeed = another.maxSpeed;
		this.location = another.location;
		this.movingForward = another.movingForward;
		this.currentSpeed = another.currentSpeed;
	}
	
}

