package com.Lxisoft.Game;
import java.util.*;
public class Player
{
	Dice dice=new Dice();

	private String playerName;
	public void setPlayerName(String a){
		this.playerName=a;
	}
	public String getPlayerName(){
		return playerName;
	}
	public void playGame(){
	dice.randomGeneration();
	}
	

}