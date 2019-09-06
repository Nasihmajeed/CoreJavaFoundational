import java.util.Random;
import java.util.Scanner;
public class Forest
{
	int number;
	String name;
	int number1,number2,number3;
	
	Animal[] animals=new Animal[3];
	//Animal[] choices=new Animal[3];
	Scanner sc=new Scanner(System.in);
    Random r=new Random();
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
                meet(animals);
	 }
     public int GenerateRandom()
     {
            int random=(int)(Math.random()*3);
                return random;

     }
	     public void meet(Animal[] animals)
	     {
	     
	           
	     		
	     		System.out.println("Enter your first choice here :" );
	     		number1=sc.nextInt();
                System.out.println("your enemy is" );
                int randomNumber=GenerateRandom();
                fight(animals,number1,randomNumber);
                
        //         for(int i=0;i<3;i++)
        //         {
        //             if(number1==animals[i].number)
                
	     		// animals[number1].animalDetails();
	     		// choices[0]=animals[number1];

	     }		
	     		
		public void fight(Animal[] animals, int num,int rands)
		{
			String winner;
			int energy;
				System.out.println("\n");
            	System.out.println("----------GAME STARTED-----------");
            	System.out.println("\n");
            	System.out.println("Animals started fighting.");
                for(int i=0;i<animals.length;i++)
                {
                 if(animals[num].strength>animals[rands].strength)
                 {
                 	               	animals[num].strength=animals[rands].strength/2;
                 	               	System.out.println("winner of the fight is:"+animals[num].name); 
                 	               	System.out.println("now the strength is:"+animals[num].strength);

                 	               	winner=animals[num].name;
                 	               	energy=animals[rands].strength;

  
		}
         else
         {
         	System.out.println("winner of the fight is:"+animals[rands].name);   

         	animals[rands].strength=animals[rands].strength/2;
         	System.out.println("now the strength is:"+animals[rands].strength);
         	winner=animals[rands].name;
         	energy=animals[rands].strength;
      	
         }
         System.out.println("\n");

           	System.out.println("choose another fighter:");
           	number3=GenerateRandom();
           	 animals[number3].animalDetails();
			//choices[2]=animals[number3];
}
}
           	/*for(int i=0;i<3;i++)
	     		{

	     	     if(choices[2]==animals[i])
	     	     {
      					System.out.println("animal name is :" +animals[i].name);
     					System.out.println("strength is    :" +animals[i].strength);
                 }
                 else if(choices[2]==animals[i])
	     	     {
      					System.out.println("animal name is :" +animals[i].name);
     					System.out.println("strength is    :" +animals[i].strength);
                 
                    	System.out.println("\n");

                }

            	}
            	System.out.println("----SECOND LEVEL GAME----");
                    if(energy>choices[2].strength)
                    {
                    		System.out.println("winner is:" +winner);
                    	 	System.out.println("energy level  is:" +energy/2);
                    	 	energy=energy/2;



                    }
                    else
                    {
                    		System.out.println("winner is:" +choices[2].name);
                    		System.out.println("now the energy level is:" +choices[2].strength/2);
                    		choices[2].strength=choices[2].strength/2;
                    }*/
	     	
			}



                 	
        
     
 
 

 

		



	