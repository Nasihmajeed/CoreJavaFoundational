public class Station
{
	String name;
    Train[] train = new Train[5];
	 void setTrainLists()
	 {
	 	for(int i=0;i<5;i++)
	 	{	
	 		train[i]= new Train();	
	 	}
	 }
	 void setPassengerList(int numberOfPassenger)
	 {
	 	setTrainLists();
	 	for(int i=0;i<numberOfPassenger;i++)
	 	{
	 	  train[i].passengerList(numberOfPassenger);
	    }
	 }
}	