package com.lxisoft.SnakeAndLadder;
import com.lxisoft.SnakeAndLadder.*;
import java.util.*;
public class Players implements Comparable<Players>{
	String player;
	String color;
	int position;
	
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
	public String toString(){
		return this.player+" \tDice : "+this.color;
	}
	public int compareTo(Players p){
		if(position==p.position){
			return 0;
		}
		else if(position<p.position){
			return 1;
		}
		else {
			return -1;
		}
	}
}