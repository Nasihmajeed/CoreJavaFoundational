package com.lxisoft.SnakeAndLadder;
import com.lxisoft.SnakeAndLadder.*;
import java.util.*;
public class Players{
	String player;
	String color;
	int position;
	/*public void palyerDetails(int n, ArraList<Players> player){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name of the player : ");
		String pName = s.nextLine();
		player.get(n).setPlayer(pName);
		System.out.println("Enter the color of coin : ");
		String pColor = s.nextLine();
		player.get(n).setColor(pColor);
		player.get(n).setPosition(0);
	}*/

	public void setPlayer(String name){
		this.player = name; 
	} 
	public String getPlayer(){
		return player;
	}
	public void setColor(String colr){
		this.color = colr;
	}
	public String getColor(){
		return color;
	}
	public void setPosition(int post){
		this.position = post;
	}
	public int getPosition(){
		return position;
	}
}