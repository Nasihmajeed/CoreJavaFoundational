import java.util.Scanner;
public class Metro
{
	Scanner scanner = new Scanner(System.in);
	Station[] station = new Station[5];
	int stationNo,trainNo,numberOfPassenger;
	void ticketBooking()
	{
	  setDetails();
      setDipartureStation();
      System.out.println("Select Arrival Station");
      getStation(); 
      stationNo = scanner.nextInt();
      System.out.println("Arrival Station : "+arrivalStation(stationNo));
      System.out.println("Select a Train");
      getTrain();
      trainNo = scanner.nextInt();
      System.out.println("How many passenger ?");
      numberOfPassenger= scanner.nextInt();
      setPassengers();
      print();
	}

	void print()
	{
	  System.out.println("******************");
	  /*int slNo = setDipartureStation();
	  getDipartureStation(slNo);*/
      selectedStation();
      selectedTrain(stationNo,trainNo);
      getPassengers();
      /*trainFair();*/
      System.out.println("******************");
	}
	int setDipartureStation()
	{
		String name;
		int n = 1,slNo;
		System.out.println("Select Departure Station");
		for(int i = 0;i<5;i++)
		{
			System.out.println(n+"."+station[i].departureStationName);
			n++;
		}
		slNo = scanner.nextInt();
		System.out.println("Departure Station : "+getDipartureStation(slNo));
		return slNo;
	}
	String getDipartureStation(int departureStation)
	{
		String name = "hgsh";
	      switch(departureStation)
	      {
	      	case 1:
	      	name = station[departureStation-1].departureStationName;
	      	break;
	      	case 2:
	      	name = station[departureStation-1].departureStationName;
	      	break;
	      	case 3:
	      	name = station[departureStation-1].departureStationName;
	      	break;
	      	case 4:
	      	name = station[departureStation-1].departureStationName;
	      	break;
	      	case 5:
	      	name = station[departureStation-1].departureStationName;
	      	break;
	      	default :
	      	System.out.println("Not a Station");
	      	break;
	      }
      return name;
	}
	void setDetails()
	{

		for(int i=0;i<5;i++)
		{
		 station[i]= new Station();
		 station[i].setTrainLists();	
		}
		station[0].departureStationName = "Palakkad";
		station[0].arrivalStationName = "Trissur";
		station[0].trainFare.amount = 30;
		station[0].train[0].name = "TrissurTrain1";
		station[0].train[1].name = "TrissurTrain2";
		station[0].train[2].name = "TrissurTrain3";
		station[0].train[3].name = "TrissurTrain4";
		station[0].train[4].name = "TrissurTrain5";
		
		station[1].departureStationName = "Coimbatore";
		station[1].arrivalStationName = "Ernamkulam";
		station[1].trainFare.amount = 60;
		station[1].train[0].name = "ErnamkulamTrain1";
		station[1].train[1].name = "ErnamkulamTrain2";
		station[1].train[2].name = "ErnamkulamTrain3";
		station[1].train[3].name = "ErnamkulamTrain4";
		station[1].train[4].name = "ErnamkulamTrain5";
		
		station[2].departureStationName = "Kasarkode";
		station[2].arrivalStationName = "Kollam";
		station[2].trainFare.amount = 80;
		station[2].train[0].name = "KollamTrain1";
		station[2].train[1].name = "KollamTrain2";
		station[2].train[2].name = "KollamTrain3";
		station[2].train[3].name = "KollamTrain4";
		station[2].train[4].name = "KollamTrain5";
		
		station[3].departureStationName = "Kozhikode";
		station[3].arrivalStationName = "Trivandrum";
		station[3].trainFare.amount = 110;
		station[3].train[0].name = "TrivandrumTrain1";
		station[3].train[1].name = "TrivandrumTrain2";
		station[3].train[2].name = "TrivandrumTrain3";
		station[3].train[3].name = "TrivandrumTrain4";
		station[3].train[4].name = "TrivandrumTrain5";
		
		station[4].departureStationName = "Malapuram";
		station[4].arrivalStationName = "Vayanad";
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
				System.out.println(n+"."+station[i].arrivalStationName);
				n++;
		    }
	}
	String arrivalStation(int stationNo)
	{
	  String name = "Select a Station";
	      switch(stationNo)
	      {
	      	case 1:
	      	name = station[stationNo-1].arrivalStationName;
	      	break;
	      	case 2:
	      	name = station[stationNo-1].arrivalStationName;
	      	break;
	      	case 3:
	      	name = station[stationNo-1].arrivalStationName;
	      	break;
	      	case 4:
	      	name = station[stationNo-1].arrivalStationName;
	      	break;
	      	case 5:
	      	name = station[stationNo-1].arrivalStationName;
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
		System.out.println("Arrival Station : "+station[stationNo-1].arrivalStationName);
	}
	/*void trainFair()
	{
		String arName = getDipartureStation(setDipartureStation());
		String dpname = arrivalStation(stationNo);
		System.out.println(arName+" to "+dpname+" : "+station[stationNo-1].trainFare.amount+" Rs");
	}*/
}