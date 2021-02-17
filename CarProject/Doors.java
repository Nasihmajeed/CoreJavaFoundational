import java.util.Scanner;

public class Doors
{
    String side;
    String position;
    String type;
    int n;

    Scanner s = new Scanner(System.in);

    Doors[] d1;
    Doors[] d2;
    Doors[] d3;
    Doors[] d4;

    public void doordetails(int n)
    {
        d1 = new Doors[n];
		d2 = new Doors[n];
		d3 = new Doors[n];
		d4 = new Doors[n];
		for(int i=0; i<n; i++){
			d1[i] = new Doors();
			d2[i] = new Doors();
			d3[i] = new Doors();
            d4[i] = new Doors();
            
            System.out.println("**********************");
            System.out.println("Car" + (i+1) + " Doors");
            
            System.out.println("\nDoor 1");
		    System.out.println("Side :");
		    d1[i].side = s.nextLine();
		    System.out.println("Position :");
            d1[i].position =  s.nextLine();
            System.out.println("Type :");
            d1[i].type =  s.nextLine();
            
            System.out.println("\nDoor 2");
		    System.out.println("Side :");
            d2[i].side = s.nextLine();
            System.out.println("Position :");
            d2[i].position =  s.nextLine();
		    System.out.println("Type :");
            d2[i].type =  s.nextLine();
            
            System.out.println("\nDoor 3");
		    System.out.println("Side :");
            d3[i].side = s.nextLine();
            System.out.println("Position :");
            d3[i].position =  s.nextLine();
		    System.out.println("Type :");
            d3[i].type =  s.nextLine();
            
            System.out.println("\nDoor 4");
		    System.out.println("Side :");
            d4[i].side = s.nextLine();
            System.out.println("Position :");
            d4[i].position =  s.nextLine();
		    System.out.println("Type :");
		    d4[i].type =  s.nextLine();
        }
    }
    public void printDoorDetail(int n)
    {
		
        for (int i=n;i<=n;i++) 
        {
			System.out.println("**********************");
            System.out.println("Details of car" + (i+1) + " Doors");

            System.out.println("Door 1");
            System.out.println("Side     : "+d1[i].side);
            System.out.println("Position : "+d1[i].position);
            System.out.println("Type     : "+d1[i].type);
            
            System.out.println("Door 2");
            System.out.println("Side     : "+d2[i].side);
            System.out.println("Position : "+d2[i].position);
            System.out.println("Type     : "+d2[i].type);
            
            System.out.println("Door 3");
            System.out.println("Side     : "+d3[i].side);
            System.out.println("Position : "+d3[i].position);
            System.out.println("Type     : "+d3[i].type);
            
            System.out.println("Door 4");
            System.out.println("Side     : "+d4[i].side);
            System.out.println("Position : "+d4[i].position);
			System.out.println("Type     : "+d4[i].type);
		}
    }
}      