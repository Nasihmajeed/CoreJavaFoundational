package com.LxiSoft.Game;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Game
{
	int i,j;
	int player1=0;
	int player2=0;
	int dice=0;
	int position1=0;
	int position2=0;
	int counter1;
	int counter2;
	int row;
	int col;
	int checkInput;
	int power1;
	int power2;
	int multipower1;
	int multipower2;
	Scanner scan=new Scanner(System.in);
	Random auto =new Random();
	String [][] board=new String[10][10];
	String [][] bArray=new String[i][j];
	
	public void startGame()
	{	
		
		this.boardArray();
		do
		{
			int counter1=1;
			int counter2=1;

			for (int row =0; row < 10; row++);
			{
				for (int col=0; col < 10; col++);
				{
					if (counter1 == position1)
					{	
						System.out.println("---P1---\t"+position1);
						counter1++;
						
						position1++;

					}
					else if (counter2 == position2)
					{
						System.out.println("---P2---\t"+position2);
						counter2++;
						position1++;
					}
					else
					{
						System.out.println("----"+board[row][col]+"----");
						counter1++;
						counter2++;
						position1++;
						position2++;
				}
				}
			}
			
			do
			{
				try
				{
					 System.out.println("Press 1 to Roll the Dice: ");
					System.out.println("Player 1 :- ");
					player1 = scan.nextInt();

					if (player1 ==1)
					{
						dice = auto.nextInt(6)+1;
						System.out.println("\n Dice : " +dice);
						position1+=0;

						if (position1 ==3 )
						{
							position1 = 44;
							System.out.println("Its A ladder "+position1);

						}
						else if(position1 ==6)
						{
							position1=56;
							System.out.println("Its A ladder "+position1);		
						}
						else if(position1 ==24)
						{
							position1=24;
							System.out.println("Its A ladder "+position1);		
						}
						else if(position1 ==15)
						{
							position1=38;
							System.out.println("Its A ladder "+position1);		
						}
						else if(position1 ==24)
						{
							position1=95;
							System.out.println("Its A ladder "+position1);		
						}
						else if(position1 ==50)
						{
							position1=96;
							System.out.println("Its A ladder "+position1);		
						}
						else if (position1==70)
						{
							position1=8;
							System.out.println("Its A snake "+position1);
						}
						else if (position1==22)
						{
							position1=2;
							System.out.println("Its A snake "+position1);
						}
						else if (position1==55)
						{
							position1=19;
							System.out.println("Its A snake "+position1);
						}
						else if (position1==90)
						{
							position1=5;
							System.out.println("Its A snake "+position1);
						}
						else if (position1==66)
						{
							position1=33;
							System.out.println("Its A snake "+position1);
						}						
					
						else
						{
							System.out.println("your current position is "+position1);
						}
					
					}	
					else
					{
						System.out.println("Your current position is "+ position1);

					}

				}
				catch(Exception e )
				{
					System.out.println("your current position is "+position1);
				}

			}while(checkInput==1);

			do
			{
				try
				{
					System.out.println("\n Player 2 :- ");
					player2 = scan.nextInt();

					if (player2 ==1)
					{
						dice = auto.nextInt(6)+1;
						System.out.println("\n Dice : " +dice);
						position2+=0;

						if (position2 ==3 )
						{
							position2 = 44;
							System.out.println("Its A ladder "+position2);

						}
						else if(position2 ==6)
						{
							position2=24;
							System.out.println("Its A ladder "+position2);		
						}
						else if(position2 ==15)
						{
							position2=38;
							System.out.println("Its A ladder "+position2);		
						}
						else if(position2 ==24)
						{
							position2=95;
							System.out.println("Its A ladder "+position2);		
						}
						else if (position2==70)
						{
							position2=8;
							System.out.println("Its A snake "+position2);
						}
						else if (position2==22)
						{
							position2=2;
							System.out.println("Its A snake "+position2);
						}
						else if(position2 ==55)
						{
							position2=19;
							System.out.println("Its A ladder "+position2);		
						}
						else if(position2 ==90)
						{
							position2=5;
							System.out.println("Its A ladder "+position2);		
						}						
					
						else
						{
							System.out.println("your current position is "+position2);
						}
					
					}	
					else
					{
						System.out.println("Your current position is "+ position2);

					}

				}
				catch(Exception e )
				{
					System.out.println("your current position is "+position2);
				}

			}while(checkInput==1);


			}while (position1 <=99 && position2 <=99);

			{
				if (position1 <=99)
				{
					System.out.println("player2 wins!");
				}
				else if (position2 <=99)
				{
					System.out.println("player1 wins!");
				}

			}
			}

				public void boardArray()

	{

		board[0][0] = "00"; 
		board[0][1] = "02";
		board[0][2] = "03";
		board[0][3] = "04";
		board[0][4] = "05";
		board[0][5] = "06";
		board[0][6] = "07";
		board[0][7] = "08";
		board[0][8] = "09";
		board[0][9] = "10";

		board[1][0] = "11" ;
		board[1][1] = "12";
		board[1][2] = "13";
		board[1][3] = "14";
		board[1][4] = "15";
		board[1][5] = "16";
		board[1][6] = "17";
		board[1][7] = "18";
		board[1][8] = "19";
		board[1][9] = "20";

		board[2][0] = "21" ;
		board[2][1] = "22";
		board[2][2] = "23";
		board[2][3] = "24";
		board[2][4] = "25";
		board[2][5] = "26";
		board[2][6] = "27";
		board[2][7] = "28";
		board[2][8] = "29";
		board[2][9] = "30";

		board[3][0] = "31" ;
		board[3][1] = "32";
		board[3][2] = "33";
		board[3][3] = "34";
		board[3][4] = "35";
		board[3][5] = "36";
		board[3][6] = "37";
		board[3][7] = "38";
		board[3][8] = "39";
		board[3][9] = "40";

		board[4][0] = "41" ;
		board[4][1] = "42";
		board[4][2] = "43";
		board[4][3] = "44";
		board[4][4] = "45";
		board[4][5] = "46";
		board[4][6] = "47";
		board[4][7] = "48";
		board[4][8] = "49";
		board[4][9] = "50";

		board[5][0] = "51" ;
		board[5][1] = "52";
		board[5][2] = "53";
		board[5][3] = "54";
		board[5][4] = "55";
		board[5][5] = "56";
		board[5][6] = "57";
		board[5][7] = "58";
		board[5][8] = "59";
		board[5][9] = "60";

		board[6][0] = "61" ;
		board[6][1] = "62";
		board[6][2] = "63";
		board[6][3] = "64";
		board[6][4] = "65";
		board[6][5] = "66";
		board[6][6] = "67";
		board[6][7] = "68";
		board[6][8] = "69";
		board[6][9] = "70";

		board[7][0] = "71" ;
		board[7][1] = "72";
		board[7][2] = "73";
		board[7][3] = "74";
		board[7][4] = "75";
		board[7][5] = "76";
		board[7][6] = "77";
		board[7][7] = "78";
		board[7][8] = "79";
		board[7][9] = "80";

		board[8][0] = "81" ;
		board[8][1] = "82";
		board[8][2] = "83";
		board[8][3] = "84";
		board[8][4] = "85";
		board[8][5] = "86";
		board[8][6] = "87";
		board[8][7] = "88";
		board[8][8] = "89";
		board[8][9] = "90";

		board[9][0] = "91" ;
		board[9][1] = "92";
		board[9][2] = "93";
		board[9][3] = "94";
		board[9][4] = "95";
		board[9][5] = "96";
		board[9][6] = "97";
		board[9][7] = "98";
		board[9][8] = "99";
		board[9][9] = "100";
	}

	 
		}
			