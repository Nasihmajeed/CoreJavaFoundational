package com.lxisoft.Game;
import java.util.ArrayList;
import java.util.Scanner;

public class Board
{
    ArrayList<Player> player = new ArrayList<Player>();
    ArrayList<Dice> d = new ArrayList<Dice>();
    Scanner scanner = new Scanner(System.in);

    public void playerName()
    {
    	System.out.println("\nHow many players: ");
    	int b = scanner.nextInt();
    	for(int i=0;i<b;i++)
    	{
    		player.add(new Player());
    		System.out.println("\nEnter the name: ");
    		player.get(i).setName(scanner.next()); 
    	}
    	 System.out.println("\nPlayers are: ");
    	 System.out.println();
    	 for(int j=0;j<player.size();j++)
    	 {
    	 	System.out.println(j+1+" "+player.get(j).getName());
    	 }
    }

    public void setDice()
    {
    	d.add(new Dice());
        d.get(0).setNumber(1);
        d.add(new Dice());
        d.get(1).setNumber(2);
        d.add(new Dice());
        d.get(2).setNumber(3);
        d.add(new Dice());
        d.get(3).setNumber(4);
        d.add(new Dice());
        d.get(4).setNumber(5);
        d.add(new Dice());
        d.get(5).setNumber(6);        
    }
}