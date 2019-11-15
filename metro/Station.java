public class Station
{
	String name;
    Train[] train = new Train[5];
	 void setTrainLists()
	 {
	 	for(int i=0;i<5;i++)
	 	{	
	 		train[i]= new Train();
	 		train[i].passengerList();	
	 	}
	 }	
}	