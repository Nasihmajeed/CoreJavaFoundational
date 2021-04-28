package com.lxisoft.game;
import com.lxisoft.player.*;
import java.util.*;

public class Game{
	int val=100;
	String[][] board= new String[10][10];
	int[][] snake=new int[8][2];
	int[][] ladder=new int[8][2];
	public void boardView(){
				board[0][0]="100";
				board[0][1]="99";
				board[0][2]="98";
				board[0][3]="97";
				board[0][4]="96";
				board[0][5]="95";
				board[0][6]="94";
				board[0][7]="93";
				board[0][8]="92";
				board[0][9]="91";

				board[1][0]="90";
				board[1][1]="89";
				board[1][2]="88";
				board[1][3]="87";
				board[1][4]="86";
				board[1][5]="85";
				board[1][6]="84";
				board[1][7]="83";
				board[1][8]="82";
				board[1][9]="81";

				board[2][0]="80";
				board[2][1]="79";
				board[2][2]="78";
				board[2][3]="77";
				board[2][4]="76";
				board[2][5]="75";
				board[2][6]="74";
				board[2][7]="73";
				board[2][8]="72";
				board[2][9]="71";

				board[3][0]="70";
				board[3][1]="69";
				board[3][2]="68";
				board[3][3]="67";
				board[3][4]="66";
				board[3][5]="65";
				board[3][6]="64";
				board[3][7]="63";
				board[3][8]="62";
				board[3][9]="61";

        board[4][0]="60";
				board[4][1]="59";
				board[4][2]="58";
				board[4][3]="57";
				board[4][4]="56";
				board[4][5]="55";
				board[4][6]="54";
				board[4][7]="53";
				board[4][8]="52";
				board[4][9]="51";

				board[5][0]="50";
				board[5][1]="49";
				board[5][2]="48";
				board[5][3]="47";
				board[5][4]="46";
				board[5][5]="45";
				board[5][6]="44";
				board[5][7]="43";
				board[5][8]="42";
				board[5][9]="41";

				board[6][0]="40";
				board[6][1]="39";
				board[6][2]="38";
				board[6][3]="37";
				board[6][4]="36";
				board[6][5]="35";
				board[6][6]="34";
				board[6][7]="33";
				board[6][8]="32";
				board[6][9]="31";

				board[7][0]="30";
				board[7][1]="29";
				board[7][2]="28";
				board[7][3]="27";
				board[7][4]="26";
				board[7][5]="25";
				board[7][6]="24";
				board[7][7]="23";
				board[7][8]="22";
				board[7][9]="21";

				board[8][0]="20";
				board[8][1]="19";
				board[8][2]="18";
				board[8][3]="17";
				board[8][4]="16";
				board[8][5]="15";
				board[8][6]="14";
				board[8][7]="13";
				board[8][8]="12";
				board[8][9]="11";

				board[9][0]="10";
				board[9][1]="9";
				board[9][2]="8";
				board[9][3]="7";
				board[9][4]="6";
				board[9][5]="5";
				board[9][6]="4";
				board[9][7]="3";
				board[9][8]="2";
				board[9][9]="1";
			}

		/*for (int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				board[i][j]=String.valueOf(val);
				val--;
			}
		}*/
		//for (int i=0;i<10;i++){
			//for(int j=0;j<10;j++){
				//System.out.print("|"+board[i][j]+"|"+"\t");
			//}
			//System.out.println("\n-----------------------------------------------------------------------------");
			//System.out.print("\n");
		//}

	public void snake(){
		snake[0][0]=17;
		snake[0][1]=7;
		snake[1][0]=62;
		snake[1][1]=18;
		snake[2][0]=54;
		snake[2][1]=34;
		snake[3][0]=87;
		snake[3][1]=36;
		snake[4][0]=64;
		snake[4][1]=60;
		snake[5][0]=92;
		snake[5][1]=73;
		snake[6][0]=95;
		snake[6][1]=75;
		snake[7][0]=98;
		snake[7][1]=78;

	}
	public void ladder(){
		ladder[0][0]=1;
		ladder[0][1]=38;
		ladder[1][0]=4;
		ladder[1][1]=14;
		ladder[2][0]=9;
		ladder[2][1]=31;
		ladder[3][0]=21;
		ladder[3][1]=42;
		ladder[4][0]=28;
		ladder[4][1]=84;
		ladder[5][0]=51;
		ladder[5][1]=67;
		ladder[6][0]=71;
		ladder[6][1]=91;
		ladder[7][0]=80;
		ladder[7][1]=99;

	}
	public int randNum(){
		int random=(int)(Math.random()*7);
								return random;
	}
	public void startGame(Player p1, Player p2){
		boardView();
		ladder();
		snake();
		int position=0;
		int temp=0;
		//String player="p1";
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER 1 TO START THE GAME");
		int start= sc.nextInt();
		if(start==1){

			do{
				System.out.println("PLAYER "+p1.getName()+"s TURN");
			//	System.out.println("PLAYER TURN");
			System.out.println("ENTER 1 TO ROLL THE DICE");
			int roll=sc.nextInt();
			int dice=randNum();
		//	System.out.println(p1.name+" NOW AT POSITION "+p1.position);
			if (roll==1) {

				System.out.println("DICE IS "+dice);
				if(dice==1 && p1.getPosition()<=99)
					p1.setPosition(p1.getPosition()+1);
				else if(dice==2 && p1.getPosition()<=98 && p1.getPosition()>=1 )
					p1.setPosition(p1.getPosition()+2);
				else if(dice==3 && p1.getPosition()<=97 && p1.getPosition()>=1)
					p1.setPosition(p1.getPosition()+3);
				else if(dice==4 && p1.getPosition()<=96 && p1.getPosition()>=1 )
					p1.setPosition(p1.getPosition()+4);
				else if(dice==5 && p1.getPosition()<=95 && p1.getPosition()>=1 )
					p1.setPosition(p1.getPosition()+5);
				else if(dice==6 && p1.getPosition()<=94 && p1.getPosition()>=1 )
					p1.setPosition(p1.getPosition()+6);
					System.out.println(p1.getName()+" NOW AT POSITION "+p1.getPosition());


		for(int x=0;x<8;x++){

			//	System.out.println("TEST"+ladder[x][0]);
				if(p1.getPosition()==ladder[x][0]){
					//System.out.println("TEST");
					p1.setPosition(ladder[x][1]);
					System.out.println("CLIMBED UP A LADDER");
						System.out.println(p1.getName()+" NOW AT POSITION "+p1.getPosition());
				}
			}
		for(int x=0;x<8;x++){
					if(p1.getPosition()==snake[x][0]){
					p1.setPosition(snake[x][1]);
						System.out.println("BITTEN BY SNAKE");
							System.out.println(p1.getName()+" NOW AT POSITION "+p1.getPosition());
					}
				}
				for (int i=0;i<10;i++){
					for(int j=0;j<10;j++){
						//System.out.println(String.valueOf(position));
						if(String.valueOf(p1.getPosition()).equals(board[i][j])){
							temp=Integer.parseInt(board[i][j]);
							board[i][j]="p1";
						}
							//System.out.println(temp);
							//temp=board[i][j];
							//board[i][j]=player;
							//player=temp;
					}
			}
				for (int i=0;i<10;i++){
					for(int j=0;j<10;j++){
						System.out.print("|"+board[i][j]+"|"+"\t");
					}
					System.out.println("\n-----------------------------------------------------------------------------");
					//System.out.print("\n");
				}
			}
			if(p1.getPosition()<100){
			System.out.println("PLAYER "+p2.getName()+"s TURN");
		//	System.out.println("PLAYER TURN");
		System.out.println("ENTER 1 TO ROLL THE DICE");
		roll=sc.nextInt();
		dice=randNum();
		//System.out.println("NOW AT POSITION "+p2.position);
		if (roll==1) {

			System.out.println("DICE IS "+dice);
			if(dice==1 && p2.getPosition()<=99)
				p2.setPosition(p2.getPosition()+1);
			else if(dice==2 && p2.getPosition()<=98 && p2.getPosition()>=1)
				p2.setPosition(p2.getPosition()+2);
			else if(dice==3 && p2.getPosition()<=97 && p2.getPosition()>=1)
				p2.setPosition(p2.getPosition()+3);
			else if(dice==4 && p2.getPosition()<=96 && p2.getPosition()>=1)
				p2.setPosition(p2.getPosition()+4);
			else if(dice==5 && p2.getPosition()<=95 && p2.getPosition()>=1)
				p2.setPosition(p2.getPosition()+5);
			else if(dice==6 && p2.getPosition()<=94 && p2.getPosition()>=1)
				p2.setPosition(p2.getPosition()+6);
				System.out.println(p2.getName() +" NOW AT POSITION "+p2.getPosition());

	   for(int x=0;x<8;x++){

		//	System.out.println("TEST"+ladder[x][0]);
			if(p2.getPosition()==ladder[x][0]){
				//System.out.println("TEST");
				p2.setPosition(ladder[x][1]);
				System.out.println("CLIMBED UP A LADDER");
					System.out.println(p2.getName()+" NOW AT POSITION "+p2.getPosition());
			}
		}
	for(int x=0;x<8;x++){
				if(p2.getPosition()==snake[x][0]){
				p2.setPosition(snake[x][1]);
					System.out.println("BITTEN BY SNAKE");
						System.out.println(p2.getName()+" NOW AT POSITION "+p2.getPosition());
				}
			}
			for (int i=0;i<10;i++){
				for(int j=0;j<10;j++){
					//System.out.println(String.valueOf(position));
					if(String.valueOf(p2.getPosition()).equals(board[i][j]))
						board[i][j]="p2";
						//System.out.println(board[i][j]);
				}
		}
		/*for (int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				//System.out.println(String.valueOf(position));
				if(String.valueOf(p1.position).equals(board[i][j])){
					//temp=Integer.parseInt(board[i][j]);
					board[i][j]=String.valueOf(temp);
						System.out.println(board[i][j]);
				}
			}
		}*/
			for (int i=0;i<10;i++){
				for(int j=0;j<10;j++){
					System.out.print("|"+board[i][j]+"|"+"\t");
				}
				System.out.println("\n-----------------------------------------------------------------------------");
				//System.out.print("\n");
			}
			boardView();
		}
	}
}while(p1.getPosition()<100 && p2.getPosition()<100);
		//System.out.println("NOW AT POSITION "+p1.position);
		if(p1.getPosition()>=100)
		System.out.println(p1.getName()+" WINS");
		else if(p2.getPosition()>=100)
			System.out.println(p2.getName()+" WINS");

	}
}
}
