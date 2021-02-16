package com.lxisoft.SnakeAndLadder;
import com.lxisoft.SnakeAndLadder.*;
import java.util.*;
public class Snake{
	public void setEasySnakes(int numOfSnakes){
		int[][] snakes = new snakes[numOfSnakes][2];
		snakes[0][0] = 28;
		snakes[0][1] = 10;
		snakes[1][0] = 37;
		snakes[1][1] = 3;
		snakes[2][0] = 47;
		snakes[2][1] = 16;
		snakes[3][0] = 75;
		snakes[3][1] = 32;
		snakes[4][0] = 94;
		snakes[4][1] = 71;
		snakes[5][0] = 96;
		snakes[5][1] = 42;		
	}
	public void setHardSnakes(int numOfSnakes){
		int[][] snakes = new snakes[numOfSnakes][2];
		snakes[0][0] = 22;
		snakes[0][1] = 2;
		snakes[1][0] = 28;
		snakes[1][1] = 6;
		snakes[2][0] = 30;
		snakes[2][1] = 10;
		snakes[3][0] = 44;
		snakes[3][1] = 26;
		snakes[4][0] = 58;
		snakes[4][1] = 42;
		snakes[5][0] = 66;
		snakes[5][1] = 14;
		snakes[6][0] = 72;
		snakes[6][1] = 50;
		snakes[7][0] = 84;
		snakes[7][1] = 62;
		snakes[8][0] = 94;
		snakes[8][1] = 64;
		snakes[9][0] = 96;
		snakes[9][1] = 82;
		snakes[10][0] = 98;
		snakes[10][1] = 78;
	}
}
/*	
	public void hSnakeBite(ArrayList<Players> player){
		for(int j=0; j<player.size(); j++){
			if(player.get(j).getPosition()==22){
				System.out.println("--------------------------------------------------------");
				System.out.println("There is a Snake in 22nd Position ");
				int place = player.get(j).getPosition();
				//place = place-18;
				player.get(j).setPosition(2);
				System.out.println(player.get(j).getPlayer()+" "+player.get(j).getCoin()+" get swallowed to "+player.get(j).getPosition());
				System.out.println("--------------------------------------------------------");
			}
			else if(player.get(j).getPosition()==28){
				System.out.println("--------------------------------------------------------");
				System.out.println("There is a Snake in 28th Position ");
				int place = player.get(j).getPosition();
				//place = place-18;
				player.get(j).setPosition(6);
				System.out.println(player.get(j).getPlayer()+" "+player.get(j).getCoin()+" get swallowed to "+player.get(j).getPosition());
				System.out.println("--------------------------------------------------------");
			}
			else if(player.get(j).getPosition()==30){
				System.out.println("--------------------------------------------------------");
				System.out.println("There is a Snake in 30th Position ");
				int place = player.get(j).getPosition();
				//place = place-18;
				player.get(j).setPosition(10);
				System.out.println(player.get(j).getPlayer()+" "+player.get(j).getCoin()+" get swallowed to "+player.get(j).getPosition());
				System.out.println("--------------------------------------------------------");
			}
			else if(player.get(j).getPosition()==44){
				System.out.println("--------------------------------------------------------");
				System.out.println("There is a Snake in 44th Position ");
				int place = player.get(j).getPosition();
				//place = place-18;
				player.get(j).setPosition(26);
				System.out.println(player.get(j).getPlayer()+" "+player.get(j).getCoin()+" get swallowed to "+player.get(j).getPosition());
				System.out.println("--------------------------------------------------------");
			}
			else if(player.get(j).getPosition()==58){
				System.out.println("--------------------------------------------------------");
				System.out.println("There is a Snake in 58th Position ");
				int place = player.get(j).getPosition();
				//place = place-18;
				player.get(j).setPosition(42);
				System.out.println(player.get(j).getPlayer()+" "+player.get(j).getCoin()+" get swallowed to "+player.get(j).getPosition());
				System.out.println("--------------------------------------------------------");
			}
			else if(player.get(j).getPosition()==66){
				System.out.println("--------------------------------------------------------");
				System.out.println("There is a Snake in 66th Position ");
				int place = player.get(j).getPosition();
				//place = place-18;
				player.get(j).setPosition(14);
				System.out.println(player.get(j).getPlayer()+" "+player.get(j).getCoin()+" get swallowed to "+player.get(j).getPosition());
				System.out.println("--------------------------------------------------------");
			}
			else if(player.get(j).getPosition()==72){
				System.out.println("--------------------------------------------------------");
				System.out.println("There is a Snake in 72th Position ");
				int place = player.get(j).getPosition();
				//place = place-18;
				player.get(j).setPosition(50);
				System.out.println(player.get(j).getPlayer()+" "+player.get(j).getCoin()+" get swallowed to "+player.get(j).getPosition());
				System.out.println("--------------------------------------------------------");
			}
			else if(player.get(j).getPosition()==84){
				System.out.println("--------------------------------------------------------");
				System.out.println("There is a Snake in 84th Position ");
				int place = player.get(j).getPosition();
				//place = place-18;
				player.get(j).setPosition(62);
				System.out.println(player.get(j).getPlayer()+" "+player.get(j).getCoin()+" get swallowed to "+player.get(j).getPosition());
				System.out.println("--------------------------------------------------------");
			}
			else if(player.get(j).getPosition()==94){
				System.out.println("--------------------------------------------------------");
				System.out.println("There is a Snake in 94th Position ");
				int place = player.get(j).getPosition();
				//place = place-18;
				player.get(j).setPosition(64);
				System.out.println(player.get(j).getPlayer()+" "+player.get(j).getCoin()+" get swallowed to "+player.get(j).getPosition());
				System.out.println("--------------------------------------------------------");
			}
			else if(player.get(j).getPosition()==96){
				System.out.println("--------------------------------------------------------");
				System.out.println("There is a Snake in 96th Position ");
				int place = player.get(j).getPosition();
				//place = place-18;
				player.get(j).setPosition(82);
				System.out.println(player.get(j).getPlayer()+" "+player.get(j).getCoin()+" get swallowed to "+player.get(j).getPosition());
				System.out.println("--------------------------------------------------------");
			}
			else if(player.get(j).getPosition()==98){
				System.out.println("--------------------------------------------------------");
				System.out.println("There is a Snake in 98th Position ");
				int place = player.get(j).getPosition();
				//place = place-18;
				player.get(j).setPosition(78);
				System.out.println(player.get(j).getPlayer()+" "+player.get(j).getCoin()+" get swallowed to "+player.get(j).getPosition());
				System.out.println("--------------------------------------------------------");
			}
		}
	}
}
/*
public void eSnakeBite(ArrayList<Players> player){
		for(int j=0; j<player.size(); j++){
			if(player.get(j).getPosition()==28){
				System.out.println("--------------------------------------------------------");
				System.out.println("There is a Snake in 28th Position ");
				int place = player.get(j).getPosition();
				//place = place-18;
				player.get(j).setPosition(10);
				System.out.println(player.get(j).getPlayer()+" "+player.get(j).getCoin()+" get swallowed to "+player.get(j).getPosition());
				System.out.println("--------------------------------------------------------");
			}
			else if(player.get(j).getPosition()==37){
				System.out.println("--------------------------------------------------------");
				System.out.println("There is a Snake in 37th Position ");
				int place = player.get(j).getPosition();
				//place = place-18;
				player.get(j).setPosition(3);
				System.out.println(player.get(j).getPlayer()+" "+player.get(j).getCoin()+" get swallowed to "+player.get(j).getPosition());
				System.out.println("--------------------------------------------------------");
			}
			else if(player.get(j).getPosition()==47){
				System.out.println("--------------------------------------------------------");
				System.out.println("There is a Snake in 47th Position ");
				int place = player.get(j).getPosition();
				//place = place-18;
				player.get(j).setPosition(16);
				System.out.println(player.get(j).getPlayer()+" "+player.get(j).getCoin()+" get swallowed to "+player.get(j).getPosition());
				System.out.println("--------------------------------------------------------");
			}
			else if(player.get(j).getPosition()==75){
				System.out.println("--------------------------------------------------------");
				System.out.println("There is a Snake in 75th Position ");
				int place = player.get(j).getPosition();
				//place = place-18;
				player.get(j).setPosition(32);
				System.out.println(player.get(j).getPlayer()+" "+player.get(j).getCoin()+" get swallowed to "+player.get(j).getPosition());
				System.out.println("--------------------------------------------------------");
			}
			else if(player.get(j).getPosition()==94){
				System.out.println("--------------------------------------------------------");
				System.out.println("There is a Snake in 94th Position ");
				int place = player.get(j).getPosition();
				//place = place-18;
				player.get(j).setPosition(71);
				System.out.println(player.get(j).getPlayer()+" "+player.get(j).getCoin()+" get swallowed to "+player.get(j).getPosition());
				System.out.println("--------------------------------------------------------");
			}
			else if(player.get(j).getPosition()==96){
				System.out.println("--------------------------------------------------------");
				System.out.println("There is a Snake in 96th Position ");
				int place = player.get(j).getPosition();
				//place = place-18;
				player.get(j).setPosition(42);
				System.out.println(player.get(j).getPlayer()+" "+player.get(j).getCoin()+" get swallowed to "+player.get(j).getPosition());
				System.out.println("--------------------------------------------------------");
			}
		}
	}*/