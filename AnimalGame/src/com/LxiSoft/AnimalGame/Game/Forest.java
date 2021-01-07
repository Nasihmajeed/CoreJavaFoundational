package com.LxiSoft.AnimalGame;
import com.LxiSoft.AnimalGame.Game;
import java.util.*;
public class Forest{
	String forestName;
	public void setGame(){
		Scanner s = new Scanner(System.in);
		forestName = "JUMANJI";
		System.out.println(forestName+" is a forest full of vigourous animals. They fight for their life and their existence");
		System.out.println("Do you want to start the game 1.Yes 0.Exit");
		int start = s.nextInt();
		if(start == 1)
			this.animalGame();
	}
	public void animalGame(){

	}
}