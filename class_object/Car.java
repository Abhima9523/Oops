package class_object;

public class Car {

	int noOfwheels;
	String Color;
	double Price;
	float maxSpeed;
	float fuelInLiters;
	int noOfSeats;
	
	public void drive()
	{
		System.out.println("Car is Driving");
		fuelInLiters--;
	}
	public void addFuel(float fuel)
	{
		fuelInLiters+=fuel;
	}
	 
}
