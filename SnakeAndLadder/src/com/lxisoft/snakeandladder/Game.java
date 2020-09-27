package com.lxisoft.snakeandladder;
import java.util.Scanner;
public class Game{

	String playerName;
	Board board=new Board();//no need for board this is done in diaplay class
	Display display=new Display();
	int[][] BoardArray = new int[100][2];
	Scanner scanner=new Scanner(System.in);
	int i,j;
	int a,b,a1,b1;
	int counter= 100;
	int iteration=-1; 
	Player[] players;


	public void userInterface(){


		System.out.println("************************************************************************************************");
        System.out.println("************************************************************************************************");
        System.out.println("************************************************************************************************");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                SNAKE AND LADDER                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                      GAME                                            *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("*****                                                                                      *****");
        System.out.println("************************************************************************************************");
        System.out.println("************************************************************************************************");
        System.out.println("************************************************************************************************");

       
		
	}//method1


	public void dieRolling(){
		System.out.println("\n--------------------------------------------------------------------------------------");
		System.out.println("\n--------------------------------------------------------------------------------------");
		System.out.println("\n PRESS Y TO CONTINUE");//game start cheyumbo chodikan
		char x= scanner.next().charAt(0);// chodich chodich kalikan
		if(x=='Y'){//game start cheyumbo chodikan

			System.out.println("\nHow many players");
			int count=scanner.nextInt();
			System.out.println("\n THERE ARE "+count+	"PLAYERS");
			players=new Player[count];
			for(int i=0;i<players.length;i++){
				players[i]=new Player();

				 display.boardPrinting();

			}//for
		}//if
	
	

	}//method2	

}//class