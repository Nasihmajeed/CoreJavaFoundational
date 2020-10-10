package com.lxisoft.Game;
import java.util.ArrayList;
import java.util.Scanner;

public class Board
{
    ArrayList<Player> player = new ArrayList<Player>();
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
}