import java.util.Scanner;
public class Metro
{
	Scanner scanner = new Scanner(System.in);
	Station[] station = new Station[5];
	int slNo,stnNo,a,numberOfPassenger;
	void ticketBooking()
	{
      setDipartureStation();
      System.out.println("Select a Station");
      setDetails();
      getStation();
      slNo = scanner.nextInt();
      arrivalStation(slNo);
      System.out.println("Select a Train");
      getTrain();
      stnNo = scanner.nextInt();
      System.out.println("How many passenger ?");
      numberOfPassenger= scanner.nextInt();
      setPassengers();
      getDipartureStation();
      selectedStation();
      arrivalStation();
      getPassengers();
	}

	String setDipartureStation()
	{
		String name;
		Station departureStation = new Station();
		name = departureStation.name = "PALAKKAD";
		return name;
	}
	void getDipartureStation()
	{
		setDipartureStation();
		System.out.println("Departure Station : "+setDipartureStation());
	}
	void setDetails()
	{

		for(int i=0;i<5;i++)
		{
		 station[i]= new Station();
		 station[i].setTrainLists();	
		}
		station[0].name = "1.Trissur";
		station[0].train[0].name = "TrissurTrain1";
		station[0].train[1].name = "TrissurTrain2";
		station[0].train[2].name = "TrissurTrain3";
		station[0].train[3].name = "TrissurTrain4";
		station[0].train[4].name = "TrissurTrain5";
		
		station[1].name = "2.Ernamkulam";
		station[1].train[0].name = "ErnamkulamTrain1";
		station[1].train[1].name = "ErnamkulamTrain2";
		station[1].train[2].name = "ErnamkulamTrain3";
		station[1].train[3].name = "ErnamkulamTrain4";
		station[1].train[4].name = "ErnamkulamTrain5";
		
		station[2].name = "3.Kollam";
		station[2].train[0].name = "KollamTrain1";
		station[2].train[1].name = "KollamTrain2";
		station[2].train[2].name = "KollamTrain3";
		station[2].train[3].name = "KollamTrain4";
		station[2].train[4].name = "KollamTrain5";
		
		station[3].name = "4.Trivandrum";
		station[3].train[0].name = "TrivandrumTrain1";
		station[3].train[1].name = "TrivandrumTrain2";
		station[3].train[2].name = "TrivandrumTrain3";
		station[3].train[3].name = "TrivandrumTrain4";
		station[3].train[4].name = "TrivandrumTrain5";
		
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
		int n = 1;
		for(int i=0;i<5;i++)
		{
			System.out.println(n+"."+station[a].train[i].name);
			n++;
		}
	}
	void arrivalStation()
	{
		arrivalStation(stnNo);
		System.out.println("Selected Train : "+station[a].train[stnNo].name);
	}
	void setPassengers()
	{

		System.out.println("Enter"+ numberOfPassenger +"Passenger Details");
		for(int i=0;i<numberOfPassenger;i++)
		{
			station[i].setPassengerList(numberOfPassenger);
			System.out.print("Passenger Name : ");
			station[i].train[i].passenger[i].name = scanner.next();
			System.out.print("Passenger Age : ");
			station[i].train[i].passenger[i].age = scanner.nextInt();
		}
	}
	void getPassengers()
	{
		for(int i=0;i<numberOfPassenger;i++)
		{
			System.out.println("Passenger Name : "+station[i].train[i].passenger[i].name);
			System.out.println("Passenger Age  : "+station[i].train[i].passenger[i].age);
		}
	}
	void selectedStation()
	{
		System.out.println("Arrival Station : "+station[a].name);
	}
}