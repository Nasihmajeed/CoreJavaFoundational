package com.lxisoft.Game;
import java.util.ArrayList;
import java.util.Scanner;

public class Board
{
    ArrayList<Player> player = new ArrayList<Player>();
    ArrayList<Dice> dice = new ArrayList<Dice>();
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
    	dice.add(new Dice());
        dice.get(0).setNumber(1);
        dice.add(new Dice());
        dice.get(1).setNumber(2);
        dice.add(new Dice());
        dice.get(2).setNumber(3);
        dice.add(new Dice());
        dice.get(3).setNumber(4);
        dice.add(new Dice());
        dice.get(4).setNumber(5);
        dice.add(new Dice());
        dice.get(5).setNumber(6);        
    }
}