package com.Lxisoft.Game;
import java.io.*;
import java.util.*;
import java.util.Random;

public class SnakesAndLadders
{
	
	int player1=0;
	int player2=0;
	int dice=0;
	int position1=0;
	int position 2=0;

	public void snakesAndladders(ArrayList be)
	{
		do
		{
			try
			{
				System.out.print("Player 1 :- ");
				player1 = scnr.nextInt();
				
				if(player1 == 1)
				{
					dice.auto.nextInt(6) + 1;
					System.out.println("Dice :- " + dice);
					position1 += dice;
					checkInput = 0;
					
					if (position == 2)
					{
						postion1 = 23;
						System.out.println("It's A ladder! go up! \nYour Position is " + position1);
						checkInput=0;
					}
					else if (position== 7 )
					{
						postion1 = 29;
						System.out.println("It's A ladder! go up! \nYour Position is " + position1);
						checkInput=0;
					
					}

					else if (position== 28 )
					{
						postion1 = 77;
						System.out.println("It's A ladder! go up! \nYour Position is " + position1);
						checkInput=0;
					
					}
					else if (position== 30 )
					{
						postion1 = 32;
						System.out.println("It's A ladder! go up! \nYour Position is " + position1);
						checkInput=0;
					
					}
					else if (position== 87 )
					{
						postion1 = 93;
						System.out.println("It's A ladder! go up! \nYour Position is " + position1);
						checkInput=0;
					
					}
					else if (position== 39 )
					{
						postion1 = 3;
						System.out.println("You bit by a snake! Go Down!\nYour Position is " + position1);
						checkInput=0;
					
					}
					else if (position== 35 )
					{
						postion1 = 5;
						System.out.println("You bit by a snake! Go Down!\nYour Position is " + position1);
						checkInput=0;
					
					}
					else if (position== 50 )
					{
						postion1 = 34;
						System.out.println("You bit by a snake! Go Down!\nYour Position is " + position1);
						checkInput=0;
					
					}
					else if (position== 89 )
					{
						postion1 = 68;
						System.out.println("You bit by a snake! Go Down!\nYour Position is " + position1);
						checkInput=0;
					
					}
					else if (position== 99 )
					{
						postion1 = 26;
						System.out.println("You bit by a snake! Go Down!\nYour Position is " + position1);
						checkInput=0;
					
					}
					else 
					{
						System.out.println("Your current position is  "+ position1);
						System.out.println("");			
					}

				}


			}
			
		}
		while(checkInput ==1);

		do
		{
			try
			{
				System.out.print("Player 2 :- ");
				player2 = scan.nextInt();
				
				if(player2 == 1)
				{
					dice.auto.nextInt(6) + 1;
					System.out.println("Dice :- " + dice);
					position2 += dice;
					checkInput = 0;
					
				if (position == 2)
					{
						postion2= 23;
						System.out.println("It's A ladder! go up! \nYour Position is " + position2);
						checkInput=0;
					}
					else if (position== 7 )
					{
						postion2 = 29;
						System.out.println("It's A ladder! go up! \nYour Position is " + position2);
						checkInput=0;
					
					}

					else if (position== 28 )
					{
						postion2= 77;
						System.out.println("It's A ladder! go up! \nYour Position is " + position2);
						checkInput=0;
					
					}
					else if (position== 30 )
					{
						postion2 = 32;
						System.out.println("It's A ladder! go up! \nYour Position is " + position2);
						checkInput=0;
					
					}
					else if (position== 87 )
					{
						postion2 = 93;
						System.out.println("It's A ladder! go up! \nYour Position is " + position2);
						checkInput=0;
					
					}
					else if (position== 39 )
					{
						postion2 = 3;
						System.out.println("You bit by a snake! Go Down!\nYour Position is " + position2);
						checkInput=0;
					
					}
					else if (position== 35 )
					{
						postion2 = 5;
						System.out.println("You bit by a snake! Go Down!\nYour Position is " + position2);
						checkInput=0;
					
					}
					else if (position== 50 )
					{
						postion2= 34;
						System.out.println("You bit by a snake! Go Down!\nYour Position is " + position2);
						checkInput=0;
					
					}
					else if (position== 89 )
					{
						postion2 = 68;
						System.out.println("You bit by a snake! Go Down!\nYour Position is " + position2);
						checkInput=0;
					
					}
					else if (position== 99 )
					{
						postion2 = 26;
						System.out.println("You bit by a snake! Go Down!\nYour Position is " + position2);
						checkInput=0;
					
					}

				}


			}
			
		}
		while(checkInput ==1);

	}


}