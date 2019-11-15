public class Train
{
	String name;
	int trainNumber,numberOfPassenger;
	Passenger[] passenger = new Passenger[5];
	void passengerList()
	{
		for(int i=0;i<5;i++)
		{
			passenger[i]= new Passenger();
		}
	}
}