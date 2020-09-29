package com.Lxisoft.Game;
import java.util.Scanner;
public class Player
{
	Dice die=new Dice();

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