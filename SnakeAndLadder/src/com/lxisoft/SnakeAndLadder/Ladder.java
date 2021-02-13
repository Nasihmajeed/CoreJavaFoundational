package com.lxisoft.SnakeAndLadder;
import com.lxisoft.SnakeAndLadder.*;
import java.util.*;
public class Ladder{
	public void eLadderClimb(ArrayList<Players> player){
		for(int i=0; i<player.size(); i++){
			if(player.get(i).getPosition()==4){
				System.out.println("--------------------------------------------------------");
				System.out.println("There is a Ladder in 4th Position ");
				int positn = player.get(i).getPosition();
				positn = positn+40;
				player.get(i).setPosition(positn);
				System.out.println(player.get(i).getPlayer()+" "+player.get(i).getCoin()+" climbs up to "+player.get(i).getPosition());
				System.out.println("--------------------------------------------------------");
			}
			else if(player.get(i).getPosition()==12){
				System.out.println("--------------------------------------------------------");
				System.out.println("There is a Ladder in 12th Position ");
				int positn = player.get(i).getPosition();
				positn = positn+38;
				player.get(i).setPosition(positn);
				System.out.println(player.get(i).getPlayer()+" "+player.get(i).getCoin()+" climbs up to "+player.get(i).getPosition());
				System.out.println("--------------------------------------------------------");
			}
			else if(player.get(i).getPosition()==14){
				System.out.println("--------------------------------------------------------");
				System.out.println("There is a Ladder in 14th Position ");
				int positn = player.get(i).getPosition();
				positn = positn+36;
				player.get(i).setPosition(positn);
				System.out.println(player.get(i).getPlayer()+" "+player.get(i).getCoin()+" climbs up to "+player.get(i).getPosition());
				System.out.println("--------------------------------------------------------");
			}
			else if(player.get(i).getPosition()==22){
				System.out.println("--------------------------------------------------------");
				System.out.println("There is a Ladder in 22th Position ");
				int positn = player.get(i).getPosition();
				positn = positn+36;
				player.get(i).setPosition(positn);
				System.out.println(player.get(i).getPlayer()+" "+player.get(i).getCoin()+" climbs up to "+player.get(i).getPosition());
				System.out.println("--------------------------------------------------------");
			}
			else if(player.get(i).getPosition()==41){
				System.out.println("--------------------------------------------------------");
				System.out.println("There is a Ladder in 41th Position ");
				int positn = player.get(i).getPosition();
				positn = positn+38;
				player.get(i).setPosition(positn);
				System.out.println(player.get(i).getPlayer()+" "+player.get(i).getCoin()+" climbs up to "+player.get(i).getPosition());
				System.out.println("--------------------------------------------------------");
			}
			else if(player.get(i).getPosition()==54){
				System.out.println("--------------------------------------------------------");
				System.out.println("There is a Ladder in 54th Position ");
				int positn = player.get(i).getPosition();
				positn = positn+34;
				player.get(i).setPosition(positn);
				System.out.println(player.get(i).getPlayer()+" "+player.get(i).getCoin()+" climbs up to "+player.get(i).getPosition());
				System.out.println("--------------------------------------------------------");
			}
		}
	}
	public void hLadderClimb(ArrayList<Players> player){
		for(int i=0; i<player.size(); i++){
			if(player.get(i).getPosition()==4){
				System.out.println("--------------------------------------------------------");
				System.out.println("There is a Ladder in 4th Position ");
				player.get(i).setPosition(16);
				System.out.println(player.get(i).getPlayer()+" "+player.get(i).getCoin()+" climbs up to "+player.get(i).getPosition());
				System.out.println("--------------------------------------------------------");
			}
			else if(player.get(i).getPosition()==8){
				System.out.println("--------------------------------------------------------");
				System.out.println("There is a Ladder in 8th Position ");
				player.get(i).setPosition(12);
				System.out.println(player.get(i).getPlayer()+" "+player.get(i).getCoin()+" climbs up to "+player.get(i).getPosition());
				System.out.println("--------------------------------------------------------");
			}
			else if(player.get(i).getPosition()==20){
				System.out.println("--------------------------------------------------------");
				System.out.println("There is a Ladder in 20th Position ");
				player.get(i).setPosition(74);
				System.out.println(player.get(i).getPlayer()+" "+player.get(i).getCoin()+" climbs up to "+player.get(i).getPosition());
				System.out.println("--------------------------------------------------------");
			}
			else if(player.get(i).getPosition()==32){
				System.out.println("--------------------------------------------------------");
				System.out.println("There is a Ladder in 32nd Position ");
				player.get(i).setPosition(56);
				System.out.println(player.get(i).getPlayer()+" "+player.get(i).getCoin()+" climbs up to "+player.get(i).getPosition());
				System.out.println("--------------------------------------------------------");
			}
			else if(player.get(i).getPosition()==70){
				System.out.println("--------------------------------------------------------");
				System.out.println("There is a Ladder in 54th Position ");
				player.get(i).setPosition(88);
				System.out.println(player.get(i).getPlayer()+" "+player.get(i).getCoin()+" climbs up to "+player.get(i).getPosition());
				System.out.println("--------------------------------------------------------");
			}
		}
	}
}