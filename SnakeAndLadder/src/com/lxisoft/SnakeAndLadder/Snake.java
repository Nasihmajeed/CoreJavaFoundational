package com.lxisoft.SnakeAndLadder;
import com.lxisoft.SnakeAndLadder.*;
import java.util.*;
public class Snake{
	public void snakeBite(ArrayList<Players> player){
		for(int j=0; j<player.size(); j++){
			if(player.get(j).getPosition()==28){
				System.out.println("--------------------------------------------------------");
				System.out.println("There is a Snake in 28th Position ");
				int place = player.get(j).getPosition();
				//place = place-18;
				player.get(j).setPosition(10);
				System.out.println(player.get(j).getPlayer()+" "+player.get(j).getColor()+" get swallowed to "+player.get(j).getPosition());
				System.out.println("--------------------------------------------------------");
			}
			else if(player.get(j).getPosition()==37){
				System.out.println("--------------------------------------------------------");
				System.out.println("There is a Snake in 37th Position ");
				int place = player.get(j).getPosition();
				//place = place-18;
				player.get(j).setPosition(3);
				System.out.println(player.get(j).getPlayer()+" "+player.get(j).getColor()+" climbs up to "+player.get(j).getPosition());
				System.out.println("--------------------------------------------------------");
			}
			else if(player.get(j).getPosition()==47){
				System.out.println("--------------------------------------------------------");
				System.out.println("There is a Snake in 47th Position ");
				int place = player.get(j).getPosition();
				//place = place-18;
				player.get(j).setPosition(16);
				System.out.println(player.get(j).getPlayer()+" "+player.get(j).getColor()+" climbs up to "+player.get(j).getPosition());
				System.out.println("--------------------------------------------------------");
			}
			else if(player.get(j).getPosition()==75){
				System.out.println("--------------------------------------------------------");
				System.out.println("There is a Snake in 75th Position ");
				int place = player.get(j).getPosition();
				//place = place-18;
				player.get(j).setPosition(32);
				System.out.println(player.get(j).getPlayer()+" "+player.get(j).getColor()+" climbs up to "+player.get(j).getPosition());
				System.out.println("--------------------------------------------------------");
			}
			else if(player.get(j).getPosition()==94){
				System.out.println("--------------------------------------------------------");
				System.out.println("There is a Snake in 94th Position ");
				int place = player.get(j).getPosition();
				//place = place-18;
				player.get(j).setPosition(71);
				System.out.println(player.get(j).getPlayer()+" "+player.get(j).getColor()+" climbs up to "+player.get(j).getPosition());
				System.out.println("--------------------------------------------------------");
			}
			else if(player.get(j).getPosition()==96){
				System.out.println("--------------------------------------------------------");
				System.out.println("There is a Snake in 96th Position ");
				int place = player.get(j).getPosition();
				//place = place-18;
				player.get(j).setPosition(42);
				System.out.println(player.get(j).getPlayer()+" "+player.get(j).getColor()+" climbs up to "+player.get(j).getPosition());
				System.out.println("--------------------------------------------------------");
			}
		}
	}
}