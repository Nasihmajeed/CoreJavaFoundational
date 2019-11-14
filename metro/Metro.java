import java.util.Scanner;
public class Metro
{
	Scanner scanner = new Scanner(System.in);
	Station[] station = new Station[5]; 
	int slNo;
	void ticketBooking()
	{
      dipartureStation();
      System.out.println("Select a Station");
      setStation();
      getStation();
      slNo = scanner.nextInt();
      arrivalStation(slNo);
      System.out.println("Select a Train");
	}

	void dipartureStation()
	{
		Station departureStation = new Station();
		departureStation.name = "PALAKKAD";
	    System.out.println(departureStation.name);
	}
	void setStation()
	{
		for(int i=0;i<5;i++)
		{
		 station[i]= new Station();	
		}
		station[0].name = "1.Trissur";
		station[1].name = "2.Ernamkulam";
		station[2].name = "3.Kollam";
		station[3].name = "4.Trivandrum";
		station[4].name = "5.Vayanad";
	}
	void getStation()
	{
        for(int i=0;i<5;i++)
		{
		System.out.println(station[i].name);
	    }
	}
	int arrivalStation(int slNo)
	{
	 int a=10;   
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
      return a;
	}
	/*void sample()
	{
		int k = arrivalStation(slNo);
		System.out.println("Return = "+k);
		Station station = new Station();
		setStation();
		station.setTrainList();
		int k = arrivalStation(int slNo);
		if(station.train[5][5].equals(k))
			
	}*/
}