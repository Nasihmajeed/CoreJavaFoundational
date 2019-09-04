
import java.util.Scanner;
public class Forest
{
	int number;
	String name;
	
	Animal[] animals=new Animal[3];
	Scanner sc=new Scanner(System.in);
    Animal lion;
    Animal fox;
    Animal tiger;
	public void forestDetails()
{

		System.out.println("\n");
		System.out.println("          Gavi Forest             ");
		System.out.println("****************************************");
        System.out.println("\n");
 }
        public void animalDetails()
        {
		 	lion=new Lion();
		 	lion.number=1;
         	lion.name="Lion";
         	lion.strength=89;
         	animals[0]=lion;
         	System.out.println(animals[0].number);
         	System.out.println("animal name is :" +animals[0].name);
         	System.out.println("strength is    :" +animals[0].strength);

	     	fox=new Fox();
	     	fox.number=2;
         	fox.name="Fox";
         	fox.strength=59;
         
            animals[1]=fox;
            System.out.println("\n");
            System.out.println(animals[1].number);
            System.out.println("animal name is :" +animals[1].name);
            System.out.println("strength is    :" +animals[1].strength);

	     	tiger=new Tiger();
	    	tiger.number=3;
         	tiger.name="Tiger";
         	tiger.strength=78;
         
         		animals[2]=tiger;
         		System.out.println("\n");
         		System.out.println(animals[2].number);
		 		System.out.println("animal name is :" +animals[2].name);
         		System.out.println("strenth is     :" +animals[2].strength);
	     		System.out.println("\n");
	 }
	     public void meet()
	     {
	     		System.out.println("Enter your choices here :" );
	     		number=sc.nextInt();
	     	     if(number==1)
	     	{
	     		System.out.println("animal name is :" +animals[0].name);
                System.out.println("strength is    :" +animals[0].strength);
}

else if(number==2)
{
			 System.out.println("animal name is :" +animals[1].name);
             System.out.println("strength is    :" +animals[1].strength);
}
else
{
	         System.out.println("animal name is :" +animals[2].name);
             System.out.println("strenth is     :" +animals[2].strength);
	    
}
            System.out.println("\n");
	     	number=sc.nextInt();
	     	System.out.println("\n");
	     	
			if(number==1)
	     	{
	     		System.out.println("animal name is :" +animals[0].name);
                System.out.println("strength is    :" +animals[0].strength);
}
else if(number==2)
{
			 System.out.println("animal name is :" +animals[1].name);
             System.out.println("strength is    :" +animals[1].strength);
}
else
{
	     	System.out.println("animal name is :" +animals[2].name);
         	System.out.println("strenth is     :" +animals[2].strength);
}
}

		public void fight()
		{
				System.out.println("\n");
            	System.out.println("----------GAME STARTED-----------");
            	System.out.println("\n");
            	System.out.println("Animals started fighting.");


 
		}
         
     }
 

		



	