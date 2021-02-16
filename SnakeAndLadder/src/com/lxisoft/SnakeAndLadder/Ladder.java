package com.lxisoft.SnakeAndLadder;
import com.lxisoft.SnakeAndLadder.*;
import java.util.*;
public class Ladder{
	public void easyLadderClimb(int numOfLadder){
		int[][] ladders = new ladders[numOfLadder][2];
		ladders[0][0] = 4;
		ladders[0][1] = 44;
		ladders[1][0] = 12;
		ladders[1][1] = 50;
		ladders[2][0] = 14;
		ladders[2][1] = 53;
		ladders[3][0] = 22;
		ladders[3][1] = 38;
		ladders[4][0] = 41;
		ladders[4][1] = 79;
		ladders[5][0] = 54;
		ladders[5][1] = 88;
	}
	public void hardLadderClimb(int numOfLadder){
		int[][] ladder = new ladder[numOfLadder][2];
		ladders[0][0] = 4;
		ladders[0][1] = 16;
		ladders[1][0] = 8;
		ladders[1][1] = 12;
		ladders[2][0] = 20;
		ladders[2][1] = 74;
		ladders[3][0] = 32;
		ladders[3][1] = 56;
		ladders[4][0] = 54;
		ladders[4][1] = 70;
	}
}
/*
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
	/*
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
}*/