package com.Lxisoft.Game;
import java.util.Scanner;
public class Player{
	Die die=new Die();

	private String playerName;
	public void setPlayerName(String a){
		this.playerName=a;
	}
	public String getPlayerName(){
		return playerName;
	}
	public void playGame(){
	die.randomGeneration();
	}
	

}