import java.util.*;
public class SNL
{
	public static void main(String [] args)
	{
		int player1=0, player2=0;
		int dice=0;
		int position1=0, position2=0;
		int power1=0, power2=0;
		int multipower1=0, multipower2=0;
		int checkInput=0;

		Scanner scan = new Scanner(System.in);
		Random auto = new Random();
		String[][] board=new String[10][10];


		board[0][0] = "01"; 
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


		do  
		{
			System.out.println("-----------------------------");
			System.out.println("-------Snake And Ladder------");
			System.out.println("-----------------------------");				
			
			int counter1=1, counter2=1;
			for (int row =0; row<10; row++)
			{
				for (int col=0; col<10; col++)
				{

					if (counter1==position1)
					{
						System.out.println("| P1 |");
					}
					else if (counter2==position2)
					{
						System.out.println("| P2 |");
					}
					else
					{
						System.out.println("| " + board[row][col]+  "|" );
					}
					counter1++;
					counter2++;
				}
				System.out.println("\n-----------------------");
			}
			System.out.println("|--------------Snake And Ladder---------------|");
			System.out.println("|---------------------------------------------|");
			snakeandladder();
			currentpower();
			instruction();

			do
			{
				try
				{
					System.out.println("-- Player 1--");
					player1=scan.nextInt();
					if(player1==1)
					{
						dice = auto.nextInt(6)+1;
						System.out.println("Dice :- "+dice );
						checkInput=0;

						if (position1==3)
						{
							position1 = 44;
							System.out.println("Its a ladder go up \n your new position is "+position1);
							checkInput=0;
						}
						else if (position1==10)
						{
							position1=58;
							System.out.println("Its a ladder go up \n your new position is "+position1);
							checkInput=0;
						}
						else if (position1==26)
						{
							position1=88;
							System.out.println("Its a ladder go up \n your new position is "+position1);
							checkInput=0;
						}
						else if (position1==60)
						{
							position1=10;
							System.out.println("Its a Snake go down \n your new position is "+position1);
							checkInput=0;
						}
						else if (position1==70)
						{
							position1=29;
							System.out.println("Its a Snake go down \n your new position is "+position1);
							checkInput=0;
						}
						else if (position1==80)
						{
							position1=50;
							System.out.println("Its a Snake go down \n your new position is "+position1);
							checkInput=0;
						}
						else if (position1==7)
						{
							power1++;
							System.out.println("yeh, you got a power \n your current position is "+position1);
							checkInput=0;
						}
						else if (position1==17)
						{
							power1++;
							System.out.println("yeh, you got a power \n your current position is "+position1);
							checkInput=0;
						}

						else if (position1==27)
						{
							power1++;
							System.out.println("yeh, you got a power \n your current position is "+position1);
							checkInput=0;
						}
						else
						{
							System.out.println("Your current position is "+ power1);
							checkInput=0;

						}


					}
					else if (player1==2)
					{
						if(power1>0)
						{
							multipower1 = 5+ power1;
							position2 -= multipower1;
							System.out.println("oh you use your power");
							power1-=power1;
							System.out.println("your current power is "+power1);
							System.out.println("");
							checkInput=0;

						}
						else
						{
							System.out.println("Oops! you don't have enough power ");
							checkInput=1;

						}

					}
					//else 
					//{
					//	System.out.println("please choose only one");
					//	checkInput=1;

					//}
					if(position1<0)
						{
							position1=0;
							System.out.println("your current position is "+ position1);
						}
						
				}
				catch(Exception e )
						{
							System.out.println("please choose only one");
							checkInput=1;
							scan.nextInt();
						}
			}
			while (checkInput==1);
			do
			{
				try
				{
					System.out.println("-- Player 2 --");
					player1=scan.nextInt();
					if(player2==1)
					{
						dice = auto.nextInt(6)+1;
						System.out.println("Dice :- "+dice );
						checkInput=0;

						if (position2==3)
						{
							position2 = 44;
							System.out.println("Its a ladder go up \n your new position is "+position2);
							checkInput=0;
						}
						else if (position2==10)
						{
							position2=58;
							System.out.println("Its a ladder go up \n your new position is "+position2);
							checkInput=0;
						}
						else if (position2==26)
						{
							position2=88;
							System.out.println("Its a ladder go up \n your new position is "+position2);
							checkInput=0;
						}
						else if (position2==60)
						{
							position2=10;
							System.out.println("Its a Snake go down \n your new position is "+position2);
							checkInput=0;
						}
						else if (position2==70)
						{
							position2=29;
							System.out.println("Its a Snake go down \n your new position is "+position2);
							checkInput=0;
						}
						else if (position2==80)
						{
							position2=50;
							System.out.println("Its a Snake go down \n your new position is "+position2);
							checkInput=0;
						}
						else if (position2==7)
						{
							power2++;
							System.out.println("yeh, you got a power \n your current position is "+position2);
							checkInput=0;
						}
						else if (position2==17)
						{
							power2++;
							System.out.println("yeh, you got a power \n your current position is "+position2);
							checkInput=0;
						}

						else if (position2==27)
						{
							power2++;
							System.out.println("yeh, you got a power \n your current position is "+position2);
							checkInput=0;
						}
						else
						{
							System.out.println("Your current position is "+ power2);
							checkInput=0;

						}


					}
					else if (player2==2)
					{
						if(power1>0)
						{
							multipower2 = 5+ power2;
							position1 -= multipower2;
							System.out.println("oh you use your power");
							power2-=power2;
							System.out.println("your current power is "+power2);
							System.out.println("");
							checkInput=0;

						}
						else
						{
							System.out.println("Oops! you don't have enough power ");
							checkInput=1;

						}

					}
					else 
					{
						System.out.println("please choose only one");
						checkInput=1;

					}
					if(position2<0)
						{
							position2=0;
							System.out.println("your current position is "+ position2);
						}
						
				}
				catch(Exception e )
						{
							System.out.println("please choose only one");
							checkInput=1;
							scan.nextInt();
						}
			}
			while (checkInput==1);
		}
		while(position1<=99 && position2 <=99);
		{
			if (position1<= 100)
			{
				System.out.println("Player 2 wins");
			} 
			else if(position2<=100)
			{
				System.out.println("Player 1 wins");

			}
		}	

	}
	public static void snakeandladder()
	{
		System.out.println("Game rules");
	}
	public static void currentpower()
	{
		System.out.println("current powers");	
	}
	public static void instruction()
	{
		System.out.println("Instructions");
	}
}