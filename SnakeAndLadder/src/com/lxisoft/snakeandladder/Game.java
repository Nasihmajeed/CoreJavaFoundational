package com.lxisoft.snakeandladder;
import java.util.Scanner;
public class Game{

	//Player[] players;
	//Snakes[] snakes;
	//Ladder[] ladders;

	public void startGame(){
		System.out.println("IF YOU WANT TO START PRESS Y");
		Scanner scanner=new Scanner(System.in);
		char c = scanner.next().charAt(0);
		if(c== 'Y'){
			System.out.println("WELCOME TO THE GAME");

		}

	} 

	
}