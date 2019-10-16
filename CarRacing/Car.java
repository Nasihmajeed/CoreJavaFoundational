import java.util.Scanner;
public class Car
{
	String color;
	String company;
	Car[] cars=new Car[10];
	Scanner sc=new Scanner(System.in);

	public void carDetails()
	{
		for(int i=0;i<10;i++)
		{
			
			System.out.println("enter car color: ");
			color=sc.next();

			System.out.println("enter the company: ");
			company=sc.next();



		/*cars[10]=new Car();
		int i=0;

		System.out.println(".........CARS.........");
		
        Car vaganar=new Car();
		cars[0].color="red";
		cars[0].company="vaganar";
		cars[0]=vaganar;
		cars[i]=cars[0];

        Car toyota=new Car();
		cars[1].color="white";
		cars[1].company="toyota";
		cars[1]=toyota;
		cars[i]=cars[1];


        Car suzuki=new Car();
		cars[2].color="black";
		cars[2].company="suzuki";
		cars[i]=cars[2];

        Car swift=new Car();
		cars[3].color="yellow";
		cars[3].company="swift";
		cars[i]=cars[3];


        Car maruti=new Car();
		cars[4].color="grey";
		cars[4].company="maruti";
		cars[i]=cars[4];

        Car bentz=new Car();
		cars[5].color="black";
		cars[5].company="bentz";
		cars[i]=cars[5];


        Car od=new Car();
	    cars[6].color="white";
		cars[6].company="od";
		cars[i]=cars[6];

        Car bmw=new Car();
		cars[7].color="red";
		cars[7].company="bmw";
		cars[i]=cars[7];

        Car jeep=new Car();
		cars[8].color="blue";
		cars[8].company="jeep";
		cars[i]=cars[8];

        Car sports=new Car();
		cars[9].color="green";
		cars[9].company="sports";
		cars[i]=cars[9];*/
	}
}
	

	public void printDetails()
	{

		for(int i=0;i<10;i++)
		{
		    System.out.println("color   :   "+color);
			System.out.println("company :   "+company);

		}

	}
}

	//public void abstract startRace();*/
	
//}


