package com.lxisoft.Forest;
import com.lxisoft.Forest.Forest;
import java.util.ArrayList;
import java.util.Scanner;
public class Forest
{
	ArrayList<Animals> animal = new ArrayList<Animals>();
	Scanner scanner = new Scanner(System.in);
	public void setAnimalDetails()
	{
		String name;
		int strength;
		boolean alive;
		System.out.println("			ANIMAL GAME 			");
		System.out.println(" ---------------------------------- ");
		animal.add(new Lion());
        animal.get(0).setName("Lion1");
        animal.get(0).setStrength( 100 );
        animal.get(0).setAlive(true);
        System.out.println("\n");

        animal.add(new Tiger());
        animal.get(1).setName("Tiger1");
        animal.get(1).setStrength( 90 );
        animal.get(1).setAlive(true);
        System.out.println("\n");

        animal.add(new Leopard());
        animal.get(2).setName("Leopard1");
        animal.get(2).setStrength( 80 );
        animal.get(2).setAlive(true);
        System.out.println("\n");

        animal.add(new Elephant());
        animal.get(3).setName("Elephant1");
        animal.get(3).setStrength( 98 );
        animal.get(3).setAlive(true);
        System.out.println("\n");

        animal.add(new Deer());
        animal.get(4).setName("Deer1");
        animal.get(4).setStrength( 50 );
        animal.get(4).setAlive(true);
        System.out.println("\n");

        animal.add(new Lion());
        animal.get(5).setName("Lion2");
        animal.get(5).setStrength( 95 );
        animal.get(5).setAlive(true);
        System.out.println("\n");

        animal.add(new Tiger());
        animal.get(6).setName("Tiger2");
        animal.get(6).setStrength( 85 );
        animal.get(6).setAlive(true);
        System.out.println("\n");

        animal.add(new Leopard());
        animal.get(7).setName("Leopard2");
        animal.get(7).setStrength( 75 );
        animal.get(7).setAlive(true);
        System.out.println("\n");

        animal.add(new Elephant());
        animal.get(8).setName("Elephant2");
        animal.get(8).setStrength( 94 );
        animal.get(8).setAlive(true);
        System.out.println("\n");

        animal.add(new Deer());
        animal.get(9).setName("Deer2");
        animal.get(9).setStrength( 25 );
        animal.get(9).setAlive(true);
        System.out.println("\n");
        for(int i=0;i<animal.size();i++)
        {
        	System.out.println((i+1)+" "+animal.get(i).getName()+"\n"+animal.get(i).getStrength());
        }
	}
}