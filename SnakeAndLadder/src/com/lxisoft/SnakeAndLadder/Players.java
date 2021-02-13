package com.lxisoft.SnakeAndLadder;
import com.lxisoft.SnakeAndLadder.*;
import java.util.*;
public class Players implements Comparable<Players>{
	String player;
	String coin;
	int position;
	
	public void setPlayer(String name){
		this.player = name; 
	} 
	public String getPlayer(){
		return player;
	}
	public void setCoin(String con){
	    this.coin = con;
	}
	public String getCoin(){
		return coin;
	}
	public void setPosition(int post){
		this.position = post;
	}
	public int getPosition(){
		return position;
	}
	public String toString(){
		return this.player+" \tDice : "+this.coin;
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