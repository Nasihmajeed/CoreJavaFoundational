public class Train
{
	String name;
	int trainNumber;
	Passenger[] passenger;
	void passengerList(int noOfPassenger)
	{
		passenger = new Passenger[noOfPassenger];
		for(int i=0;i<noOfPassenger;i++)
		{
			passenger[i]= new Passenger();
		}
	}
}