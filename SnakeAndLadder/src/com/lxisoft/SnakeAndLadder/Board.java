package com.lxisoft.SnakeAndLadder;
import com.lxisoft.SnakeAndLadder.*;
import java.util.*;
public class Board{
	String[][] board = new String[10][10];
	public void setBoard(){
	    board[0][0] = "  01 ";
	    board[0][1] = "  02 ";
	    board[0][2] = "  03 ";
	    board[0][3] = "  04 ";
	    board[0][4] = "  05 ";
	    board[0][5] = "  06 ";
	    board[0][6] = "  07 ";
	    board[0][7] = "  08 ";
	    board[0][8] = "  09 ";
	    board[0][9] = "  10 ";

	    board[1][0] = "  11 ";
	    board[1][1] = "  12 ";
	    board[1][2] = "  13 ";
	    board[1][3] = "  14 ";
	    board[1][4] = "  15 ";
	    board[1][5] = "  16 ";
	    board[1][6] = "  17 ";
	    board[1][7] = "  18 ";
	    board[1][8] = "  19 ";
	    board[1][9] = "  20 ";

	    board[2][0] = "  21 ";
	    board[2][1] = "  22 ";
	    board[2][2] = "  23 ";
	    board[2][3] = "  24 ";
	    board[2][4] = "  25 ";
	    board[2][5] = "  26 ";
	    board[2][6] = "  27 ";
	    board[2][7] = "  28 ";
	    board[2][8] = "  29 ";
	    board[2][9] = "  30 ";

	    board[3][0] = "  31 ";
	    board[3][1] = "  32 ";
	    board[3][2] = "  33 ";
	    board[3][3] = "  34 ";
	    board[3][4] = "  35 ";
	    board[3][5] = "  36 ";
	    board[3][6] = "  37 ";
	    board[3][7] = "  38 ";
	    board[3][8] = "  39 ";
	    board[3][9] = "  40 ";

	    board[4][0] = "  41 ";
	    board[4][1] = "  42 ";
	    board[4][2] = "  43 ";
	    board[4][3] = "  44 ";
	    board[4][4] = "  45 ";
	    board[4][5] = "  46 ";
	    board[4][6] = "  47 ";
	    board[4][7] = "  48 ";
	    board[4][8] = "  49 ";
	    board[4][9] = "  50 ";

	    board[5][0] = "  51 ";
	    board[5][1] = "  52 ";
	    board[5][2] = "  53 ";
	    board[5][3] = "  54 ";
	    board[5][4] = "  55 ";
	    board[5][5] = "  56 ";
	    board[5][6] = "  57 ";
	    board[5][7] = "  58 ";
	    board[5][8] = "  59 ";
	    board[5][9] = "  60 ";

	    board[6][0] = "  61 ";
	    board[6][1] = "  62 ";
	    board[6][2] = "  63 ";
	    board[6][3] = "  64 ";
	    board[6][4] = "  65 ";
	    board[6][5] = "  66 ";
	    board[6][6] = "  67 ";
	    board[6][7] = "  68 ";
	    board[6][8] = "  69 ";
	    board[6][9] = "  70 ";

	    board[7][0] = "  71 ";
	    board[7][1] = "  72 ";
	    board[7][2] = "  73 ";
	    board[7][3] = "  74 ";
	    board[7][4] = "  75 ";
	    board[7][5] = "  76 ";
	    board[7][6] = "  77 ";
	    board[7][7] = "  78 ";
	    board[7][8] = "  79 ";
	    board[7][9] = "  80 ";

	    board[8][0] = "  81 ";
	    board[8][1] = "  82 ";
	    board[8][2] = "  83 ";
	    board[8][3] = "  84 ";
	    board[8][4] = "  85 ";
	    board[8][5] = "  86 ";
	    board[8][6] = "  87 ";
	    board[8][7] = "  88 ";
	    board[8][8] = "  89 ";
	    board[8][9] = "  90 ";

	    board[9][0] = "  91 ";
	    board[9][1] = "  92 ";
	    board[9][2] = "  93 ";
	    board[9][3] = "  94 ";
	    board[9][4] = "  95 ";
	    board[9][5] = "  96 ";
	    board[9][6] = "  97 ";
	    board[9][7] = "  98 ";
	    board[9][8] = "  99 ";
	    board[9][9] = " 100 ";
	}
	public void eBoardDescription(){
		System.out.println("+----------------------------------------------------+");
		System.out.println("|        There are ladder :                          |");
		System.out.println("|                            in 4th position         |");
		System.out.println("|                            in 12th position        |");
		System.out.println("|                            in 14th position        |");
		System.out.println("|                            in 22th position        |");
		System.out.println("|                            in 41th position        |");
		System.out.println("+----------------------------------------------------+");
		System.out.println("|        There are snakes :                          |");
		System.out.println("|                            in 28th position        |");
		System.out.println("|                            in 37th position        |");
		System.out.println("|                            in 47th position        |");
		System.out.println("|                            in 75th position        |");
		System.out.println("|                            in 94th position        |");
		System.out.println("|                            in 96th position        |");
		System.out.println("+----------------------------------------------------+");
	}
	public void hBoardDescription(){
		System.out.println("+----------------------------------------------------+");
		System.out.println("|        There are ladder :                          |");
		System.out.println("|                            in 4th position         |");
		System.out.println("|                            in 8th position         |");
		System.out.println("|                            in 20th position        |");
		System.out.println("|                            in 32th position        |");
		System.out.println("|                            in 54th position        |");
		System.out.println("+----------------------------------------------------+");
		System.out.println("|        There are snakes :                          |");
		System.out.println("|                            in 22th position        |");
		System.out.println("|                            in 28th position        |");
		System.out.println("|                            in 30th position        |");
		System.out.println("|                            in 44th position        |");
		System.out.println("|                            in 58th position        |");
		System.out.println("|                            in 66th position        |");
		System.out.println("|                            in 72th position        |");
		System.out.println("|                            in 84th position        |");
		System.out.println("|                            in 94th position        |");
		System.out.println("|                            in 98th position        |");
		System.out.println("+----------------------------------------------------+");
	}
	public void addPlayer(int num,ArrayList<Players> player){
		for(int i=0; i<num; i++){
			player.add(new Players());
		}
	}
	public void setPlayer(int pNum,ArrayList<Players> player){
		Scanner s =new Scanner(System.in);
		for(int i=0; i<pNum; i++){
			System.out.println("Enter the name of "+(i+1)+" th player : ");
     		String pName = s.nextLine();
    	   	player.get(i).setPlayer(pName);
    		System.out.println("Enter the coin : ");
    		String pCoin = s.nextLine();
    		player.get(i).setCoin(pCoin);
    		player.get(i).setPosition(0);
    		//player.add(new Players(pName,pColor,0));
		}
	}
	public void gameDescription(ArrayList<Players> player){
		System.out.println("+------------------------------------------------------------+");
		System.out.println("|                  Game Description                          |");
		System.out.println("|                 ------------------                         |");
		System.out.println("| The game has a tottal of 100 cells.There can be any number |");
		System.out.println("| of players. Each Player can roll the Dice simontaniously , |");
		System.out.println("| the player who gets 1 will enter the match at the begening |");
		System.out.println("| There are Snakes and Ladder all around the board the player|");
		System.out.println("| who reaches 100 first will be the winner of the game.      |");
		System.out.println("|                      Players                               |");
		System.out.println("|                     ---------                              |");
		System.out.println("   "+player+"    ");
		System.out.println("+------------------------------------------------------------+");
	}
	public void print(){
		System.out.println("+-------+-------+-------+-------+-------+-------+-------+-------+-------+-------+");
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				System.out.print("|");
				System.out.print(" "+board[i][j]+" "); 	
			}
			System.out.print("|\n+-------+-------+-------+-------+-------+-------+-------+-------+-------+-------+\n");
		}
		//System.out.println("+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
	}
	public void printBoard(int index,int n,ArrayList<Players> player){
		System.out.println("+-------+-------+-------+-------+-------+-------+-------+-------+-------+-------+");
		int temp =1;
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				if(index==temp){
					System.out.print("|   "+player.get(n).getCoin()+"   ");

				}
				else{
					System.out.print("|");
				    System.out.print(" "+board[i][j]+" ");
				}
				temp++;
				 	
			}
			System.out.print("|\n+-------+-------+-------+-------+-------+-------+-------+-------+-------+-------+\n");
		}
		//System.out.println("+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
	}
}