package com.lxisoft.snakeandladder;
import java.util.Scanner;
public class Snake{


		public void gameMechanism(){

			if(players[0].die.randomGeneration()==1){
				System.out.println("\nPLAYER ONE ENTERS THE GAME AND IS IN FIRST POSITION");
				Board[1]=i;
				System.out.println("\n"+players[0].die.randomGeneration());
				int increment=0+players[0].die.randomGeneration();
				Board[increment]=i;
				System.out.println("\n NOW PLAYER1 IS IN "+increment);

			}
			else{

				System.out.println("\nDIE ROLLING FOR PLAYER2");
				System.out.println(players[1].die.randomGeneration());
				
				if(players[1].die.randomGeneration()==1){
					System.out.println("\nPLAYER TWO ENTERS THE GAME AND IS IN FIRST POSITION");
					Board[1]=j;
					System.out.println("\n"+players[1].die. randomGeneration());
					int increment=0+players[1].die.randomGeneration();
					Board[increment]=j;
					System.out.println("\n NOW PLAYER2 IS IN "+increment);
			

				}
			}

	

	}
	

}
