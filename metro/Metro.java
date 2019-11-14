import java.util.Scanner;
public class Metro
{
	Scanner scanner = new Scanner(System.in);
	Station[] station = new Station[5];
	int slNo,a,numberOfPassengers;
	void ticketBooking()
	{
      dipartureStation();
      System.out.println("Select a Station");
      setStation();
      getStation();
      slNo = scanner.nextInt();
      arrivalStation(slNo);
      System.out.println("Select a Train");
      getTrain();
      System.out.println("How many passenger ?");
      numberOfPassengers = scanner.nextInt();
	}

	void dipartureStation()
	{
		Station departureStation = new Station();
		departureStation.name = "PALAKKAD";
	    System.out.println("Departure Station : "+departureStation.name);
	}
	void setStation()
	{

		for(int i=0;i<5;i++)
		{
		 station[i]= new Station();	
		}
		station[0].setTrainLists();
		station[0].name = "1.Trissur";
		station[0].train[0].name = "TrissurTrain1";
		station[0].train[1].name = "TrissurTrain2";
		station[0].train[2].name = "TrissurTrain3";
		station[0].train[3].name = "TrissurTrain4";
		station[0].train[4].name = "TrissurTrain5";
		
		station[1].setTrainLists();
		station[1].name = "2.Ernamkulam";
		station[1].train[0].name = "ErnamkulamTrain1";
		station[1].train[1].name = "ErnamkulamTrain2";
		station[1].train[2].name = "ErnamkulamTrain3";
		station[1].train[3].name = "ErnamkulamTrain4";
		station[1].train[4].name = "ErnamkulamTrain5";
		
		station[2].setTrainLists();
		station[2].name = "3.Kollam";
		station[2].train[0].name = "KollamTrain1";
		station[2].train[1].name = "KollamTrain2";
		station[2].train[2].name = "KollamTrain3";
		station[2].train[3].name = "KollamTrain4";
		station[2].train[4].name = "KollamTrain5";
		
		station[3].setTrainLists();
		station[3].name = "4.Trivandrum";
		station[3].train[0].name = "TrivandrumTrain1";
		station[3].train[1].name = "TrivandrumTrain2";
		station[3].train[2].name = "TrivandrumTrain3";
		station[3].train[3].name = "TrivandrumTrain4";
		station[3].train[4].name = "TrivandrumTrain5";
		
		station[4].setTrainLists();
		station[4].name = "5.Vayanad";
		station[4].train[0].name = "VayanadTrain1";
		station[4].train[1].name = "VayanadTrain2";
		station[4].train[2].name = "VayanadTrain3";
		station[4].train[3].name = "VayanadTrain4";
		station[4].train[4].name = "VayanadTrain5";
	}
	void getStation()
	{
        for(int i=0;i<5;i++)
		{
		System.out.println(station[i].name);
	    }
	}
	void arrivalStation(int slNo)
	{

      switch(slNo)
      {
      	case 1:
      	System.out.println("Arrival Station : Trissur");
      	a=0;
      	break;
      	case 2:
      	System.out.println("Arrival Station : Ernamkulam");
      	a=1;
      	break;
      	case 3:
      	System.out.println("Arrival Station : Kollam");
      	a=2;
      	break;
      	case 4:
      	System.out.println("Arrival Station : Trivandrum");
      	a=3;
      	break;
      	case 5:
      	System.out.println("Arrival Station : Vayanad");
      	a=4;
      	break;
      }
	}
	void getTrain()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(station[a].train[i].name);
		}
	}
}