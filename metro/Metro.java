import java.util.Scanner;
public class Metro
{
	Scanner scanner = new Scanner(System.in);
	Station[] station = new Station[5];
	int stationNo,trainNo,numberOfPassenger;
	void ticketBooking()
	{
	  /*String name;*/
      getDipartureStation();
      System.out.println("Select a Station");
      setDetails();
      getStation();
      stationNo = scanner.nextInt();
      /*name = arrivalStation(stationNo);*/
      System.out.println("Arrival Station : "+arrivalStation(stationNo));
      System.out.println("Select a Train");
      getTrain();
      trainNo = scanner.nextInt();
      System.out.println("How many passenger ?");
      numberOfPassenger= scanner.nextInt();
      setPassengers();
      System.out.println("******************");
      getDipartureStation();
      selectedStation();
      selectedTrain(stationNo,trainNo);
      /*arrivalStation();*/
      getPassengers();
      trainFair();
	}

	String setDipartureStation()
	{
		String name;
		Station departureStation = new Station();
		name = departureStation.name = "PALAKKAD";
		return name;
	}
	String getDipartureStation()
	{
		String name;
		name=setDipartureStation();
		System.out.println("Departure Station : "+name);
		return name;
	}
	void setDetails()
	{

		for(int i=0;i<5;i++)
		{
		 station[i]= new Station();
		 station[i].setTrainLists();	
		}
		station[0].name = "Trissur";
		station[0].trainFare.amount = 30;
		station[0].train[0].name = "TrissurTrain1";
		station[0].train[1].name = "TrissurTrain2";
		station[0].train[2].name = "TrissurTrain3";
		station[0].train[3].name = "TrissurTrain4";
		station[0].train[4].name = "TrissurTrain5";
		
		station[1].name = "Ernamkulam";
		station[1].trainFare.amount = 60;
		station[1].train[0].name = "ErnamkulamTrain1";
		station[1].train[1].name = "ErnamkulamTrain2";
		station[1].train[2].name = "ErnamkulamTrain3";
		station[1].train[3].name = "ErnamkulamTrain4";
		station[1].train[4].name = "ErnamkulamTrain5";
		
		station[2].name = "Kollam";
		station[2].trainFare.amount = 80;
		station[2].train[0].name = "KollamTrain1";
		station[2].train[1].name = "KollamTrain2";
		station[2].train[2].name = "KollamTrain3";
		station[2].train[3].name = "KollamTrain4";
		station[2].train[4].name = "KollamTrain5";
		
		station[3].name = "Trivandrum";
		station[3].trainFare.amount = 110;
		station[3].train[0].name = "TrivandrumTrain1";
		station[3].train[1].name = "TrivandrumTrain2";
		station[3].train[2].name = "TrivandrumTrain3";
		station[3].train[3].name = "TrivandrumTrain4";
		station[3].train[4].name = "TrivandrumTrain5";
		
		station[4].name = "Vayanad";
		station[4].trainFare.amount = 55;
		station[4].train[0].name = "VayanadTrain1";
		station[4].train[1].name = "VayanadTrain2";
		station[4].train[2].name = "VayanadTrain3";
		station[4].train[3].name = "VayanadTrain4";
		station[4].train[4].name = "VayanadTrain5";
	}
	void getStation()
	{
		int n = 1;
        for(int i=0;i<5;i++)
		{
		System.out.println(n+"."+station[i].name);
		n++;
	    }
	}
	String arrivalStation(int stationNo)
	{
	  String name = "Select a Station";
      switch(stationNo)
      {
      	case 1:
      	name = station[stationNo-1].name;
      	/*System.out.println("Arrival Station : "+name);*/
      	break;
      	case 2:
      	name = station[stationNo-1].name;
      	/*System.out.println("Arrival Station : "+name);*/
      	break;
      	case 3:
      	name = station[stationNo-1].name;
      	/*System.out.println("Arrival Station : "+name);*/
      	break;
      	case 4:
      	name = station[stationNo-1].name;
      	/*System.out.println("Arrival Station : "+name);*/
      	break;
      	case 5:
      	name = station[stationNo-1].name;
      	/*System.out.println("Arrival Station : "+name);*/
      	break;
      	default :
      	System.out.println("Not a Station");
      	break;
      }
      return name;
	}
	void getTrain()
	{
		int n = 1;
		for(int i=0;i<5;i++)
		{
			System.out.println(n+"."+station[stationNo-1].train[i].name);
			n++;
		}
	}
	void selectedTrain(int selectedStation,int selectedTrain)
	{
		System.out.println("Selected Train : "+station[selectedStation-1].train[selectedTrain-1].name);
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
		System.out.println("Arrival Station : "+station[stationNo-1].name);
	}
	void trainFair()
	{
		String arName = setDipartureStation();
		String dpname = arrivalStation(stationNo);
		System.out.println(arName+" to "+dpname+" : "+station[stationNo-1].trainFare.amount+" Rs");
	}
}