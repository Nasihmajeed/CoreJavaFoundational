package com.lxisoft.Game;
import java.util.ArrayList;
import java.util.Scanner;
public class Game
{
	ArrayList<Players> player = new ArrayList<Players>();
	//Board board = new Board();
	Scanner scanner = new Scanner(System.in);
	public  void details()
	{
		
		System.out.print("\n");
		System.out.print("                                                                         SNAKE AND LADDER                                                                              ");
		System.out.print("                                                                                                         --------------------------------------                                                                     ");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("\n");
		System.out.print("                                                                        WELCOME TO THE GAME                                                                              ");
		System.out.print("\n");
		System.out.print("------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
	}
	public void playersDetails()
	{
		System.out.print("TO START THE GAME PRESS 1 :");
		int a= scanner.nextInt();
		System.out.print("\n");
		if(a==1)
		{
             System.out.print("HOW MANY PLAYERS DO YOU WANT TO PLAY IN THIS BOARD :");
		     int b = scanner.nextInt(); 
		     System.out.print("\n"); 
		   for (int i=0;i<b;i++)
           {
           	  player.add(new Players());
        	  System.out.print(" ENTER THE PLAYER NAME : ");
		      player.get(i).setName(scanner.next()); 
		      System.out.print("\n");  
           }
		      System.out.print(" PLAYER NAME ARE : ");
		   for(int j=0;j<b;j++)
		   {
			    System.out.print("\n"+(j+1)+" "+player.get(j).getName());
			    System.out.print("\n");
		   }
		}
		else
		{
			System.out.print("INVALID CHOICE");
		}
		System.out.print("\n");
	}
	public void board()
	{
		int [][] roco = new int[10][10];
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				roco[0][0]=100;
				roco[0][1]=99;
				roco[0][2]=98;
				roco[0][3]=97;
				roco[0][4]=96;
				roco[0][5]=95;
				roco[0][6]=94;
				roco[0][7]=93;
				roco[0][8]=92;
				roco[0][9]=91;

				roco[1][0]=90;
				roco[1][1]=89;
				roco[1][2]=88;
				roco[1][3]=87;
				roco[1][4]=86;
				roco[1][5]=85;
				roco[1][6]=84;
				roco[1][7]=83;
				roco[1][8]=82;
				roco[1][9]=81;

				roco[2][0]=80;
				roco[2][1]=79;
				roco[2][2]=78;
				roco[2][3]=77;
				roco[2][4]=76;
				roco[2][5]=75;
				roco[2][6]=74;
				roco[2][7]=73;
				roco[2][8]=72;
				roco[2][9]=71;

				roco[3][0]=70;
				roco[3][1]=69;
				roco[3][2]=68;
				roco[3][3]=67;
				roco[3][4]=66;
				roco[3][5]=65;
				roco[3][6]=64;
				roco[3][7]=63;
				roco[3][8]=62;
				roco[3][9]=61;
                
                roco[4][0]=60;
				roco[4][1]=59;
				roco[4][2]=58;
				roco[4][3]=57;
				roco[4][4]=56;
				roco[4][5]=55;
				roco[4][6]=54;
				roco[4][7]=53;
				roco[4][8]=52;
				roco[4][9]=51;

				roco[5][0]=50;
				roco[5][1]=49;
				roco[5][2]=48;
				roco[5][3]=47;
				roco[5][4]=46;
				roco[5][5]=45;
				roco[5][6]=44;
				roco[5][7]=43;
				roco[5][8]=42;
				roco[5][9]=41;

				roco[6][0]=40;
				roco[6][1]=39;
				roco[6][2]=38;
				roco[6][3]=37;
				roco[6][4]=36;
				roco[6][5]=35;
				roco[6][6]=34;
				roco[6][7]=33;
				roco[6][8]=32;
				roco[6][9]=31;

				roco[7][0]=30;
				roco[7][1]=29;
				roco[7][2]=28;
				roco[7][3]=27;
				roco[7][4]=26;
				roco[7][5]=25;
				roco[7][6]=24;
				roco[7][7]=23;
				roco[7][8]=22;
				roco[7][9]=21;

				roco[8][0]=20;
				roco[8][1]=19;
				roco[8][2]=18;
				roco[8][3]=17;
				roco[8][4]=16;
				roco[8][5]=15;
				roco[8][6]=14;
				roco[8][7]=13;
				roco[8][8]=12;
				roco[8][9]=11;

				roco[9][0]=10;
				roco[9][1]=9;
				roco[9][2]=8;
				roco[9][3]=7;
				roco[9][4]=6;
				roco[9][5]=5;
				roco[9][6]=4;
				roco[9][7]=3;
				roco[9][8]=2;
				roco[9][9]=1;  
				System.out.print(roco[i][j]+"\t"); 
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
 
	public void planHowToPlayTheGame()
   {
 	 while(player.get(0).getPosition()<100 && player.get(1).getPosition()<100)
     	{
     		if(player.get(0).getPosition()==0 && player.get(1).getPosition()==0)
     		{
     			this.player1();
     			this.player2();
     		}
     		else if(player.get(0).getPosition()==0 && player.get(1).getPosition()>0)
     		{
     			this.player1();
     			this.player2Game();
     		}
     		else if(player.get(0).getPosition()>0 && player.get(1).getPosition()==0)
     		{
     			this.player1Game();
     			this.player2();
     		}
     		else if(player.get(0).getPosition()>0 && player.get(1).getPosition()>0)
     		{
     			this.player1Game();
     			this.player2Game();
     		}
     	}
    }
    public void finalWinner()
    {
    	if(player.get(0).getPosition()==100)
     	{
     		System.out.print("-------------------------------------------------------------------------------------------------------");
      		System.out.print("\n");
     		System.out.print("                               FINAL WINNER IS : "+player.get(0).getName()+"                           ");
     		System.out.print("\n");
     		System.out.print("-------------------------------------------------------------------------------------------------------");
      		System.out.print("\n");

     	}
     	else if(player.get(1).getPosition()==100)
     	{
     		System.out.print("-------------------------------------------------------------------------------------------------------");
      		System.out.print("\n");
     		System.out.print("                                FINAL WINNER IS : "+player.get(1).getName()+"                          ");
     		System.out.print("\n");
     		System.out.print("-------------------------------------------------------------------------------------------------------");
      		System.out.print("\n");
     	}
     	System.out.print("\n                                                  GAME OVER                                               ");
     	System.out.print("\n");
    	System.out.print("-------------------------------------------------------------------------------------------------------");
      	System.out.print("\n");
    }
 
    public void player1()
    {
    	System.out.print("\n");
    	System.out.print("-------------------------------------------------------------------------------------------------------");
    	System.out.print("\n");
    	System.out.print("TO START THE GAME PRESS 1 :");
    	System.out.print("\n");
    	int d = scanner.nextInt();
    	if(d==1)
    	{
    		System.out.print("\n ROLLING THE DICE FOR "+player.get(0).getName());
      		System.out.print("\n");
    		int h = player.get(0).random();
    		System.out.print("\n THE  DICE ROLLED AND THE VALUE IS :"+h);
    		System.out.print("\n");
    		if(h!=6)
    		{
    			System.out.print("\n"+" "+player.get(0).getName()+" "+"CAN'T ENTER THE GAME BEACAUSE HE DID GET 6 IN DICE ");
    			System.out.print("\n");
    		}
    		else
    		{
    			System.out.print("\n");
    			System.out.print("-------------------------------------------------------------------------------------------------------");
      		    System.out.print("\n");
    			System.out.print(player.get(0).getName()+" "+"HAVE JUST ENTERED INTO THE GAME");
    			System.out.print("\n");
    			System.out.print("-------------------------------------------------------------------------------------------------------");
      		    System.out.print("\n");
    			player.get(0).setPosition(1);
    			System.out.print("\n NOW PLAYER "+player.get(0).getName()+" is in "+player.get(0).getPosition()+"th POSITION");
    			System.out.print("\n");
    			System.out.print("\n PLAYER "+player.get(0).getName()+" GOT 6 SO HE/SHE WILL GET ONE MORE CHANCE PRESS 1 FOR THAT CHANCE :");
    			System.out.print("\n");
    			int f= scanner.nextInt();
    			if(f==1)
    			{
    				System.out.print("\n ROLLING THE DICE FOR "+player.get(0).getName());
      		        System.out.print("\n");
    		        int h1 = player.get(0).random();
    		        System.out.print("\n THE  DICE ROLLED AND THE VALUE IS :"+h1);
    		        System.out.print("\n");
    		        player.get(0).setPosition(player.get(0).getPosition()+h1);
    		        System.out.print("\n NOW PLAYER "+player.get(0).getName()+" is in "+player.get(0).getPosition()+"th POSITION");
    		        System.out.print("\n");
    			}
    			else
    			{
    				System.out.print("INVALID CHOICE");
    			}
    		}
    	}
    	else
    	{
    		System.out.print("INVALID CHOICE");
    	}
    }
    	public void player1Game()
    	{
    	    System.out.print("\n");
    	    System.out.print("-------------------------------------------------------------------------------------------------------"); 
    		System.out.print("\n");
    		System.out.print("\n TO START THE GAME PRESS 1 :");
    	    System.out.print("\n");
    	    int d = scanner.nextInt();
    	   if(d==1)
    	   {
    		   System.out.print("\nROLLING THE DICE FOR "+player.get(0).getName());
    		   System.out.print("\n");
    		   int h2 = player.get(0).random();
    		   System.out.print("\n THE  DICE ROLLED AND THE VALUE IS :"+h2);
    		   System.out.print("\n");
    		   player.get(0).setPosition(player.get(0).getPosition()+h2);
    		   System.out.print("\n NOW PLAYER "+player.get(0).getName()+" is in "+player.get(0).getPosition()+"th POSITION");
    		   System.out.print("\n");
    		   int e = player.get(0).getPosition();
    		   if(e<=100)
    		   {
    			  this.ladder();
    			  this.snake();
    		   }  
    		   else
    		   {
    		   	  player.get(0).setPosition(player.get(0).getPosition()-h2);
    		 	  System.out.print("\n NOW PLAYER "+player.get(0).getName()+" is in "+player.get(0).getPosition()+"th POSITION");
    		 	  System.out.print("\n"); 
    		   }
    	    }
    		else
    		{
    			System.out.print("INVALID CHOICE");
    		}
    	}
     public void player2()
     {
     	System.out.print("\n");
    	System.out.print("-------------------------------------------------------------------------------------------------------");
     	System.out.print("\n");
     	System.out.print("\n TO START THE GAME PRESS 1 :");
    	System.out.print("\n");
    	int d = scanner.nextInt();
    	if(d==1)
    	{
    		System.out.print("\n ROLLING THE DICE FOR "+player.get(1).getName());
    		System.out.print("\n");
    		int k = player.get(1).random();
    		System.out.print("\n THE  DICE ROLLED AND THE VALUE IS :"+k);
    		System.out.print("\n");
    		if(k!=6)
    		{
    			System.out.print("\n"+player.get(1).getName()+" "+" CAN'T ENTER THE GAME BEACAUSE HE DID GET 6 IN DICE ");
    			System.out.print("\n");
    		}
    		else
    		{
    			System.out.print("\n");
    			System.out.print("-------------------------------------------------------------------------------------------------------");
      		    System.out.print("\n");
    			System.out.print("\n"+player.get(1).getName()+" "+"HAVE JUST ENTERED INTO THE GAME");
    			System.out.print("\n");
    			System.out.print("-------------------------------------------------------------------------------------------------------");
      		    System.out.print("\n");
    			player.get(1).setPosition(1);
    			System.out.print("\n NOW PLAYER "+player.get(1).getName()+" is in "+player.get(1).getPosition()+"th POSITION");
    			System.out.print("\n");
    			System.out.print("\n PLAYER "+player.get(1).getName()+" GOT 6 SO HE/SHE WILL GET ONE MORE CHANCE PRESS 1 FOR THAT CHANCE :");
    			int f= scanner.nextInt();
    			if(f==1)
    			{
    				System.out.print("\n ROLLING THE DICE FOR "+player.get(1).getName());
    				System.out.print("\n");
    		        int k1 = player.get(0).random();
    		        System.out.print("\n THE  DICE ROLLED AND THE VALUE IS :"+k1);
    		        System.out.print("\n");
    		        player.get(1).setPosition(player.get(1).getPosition()+k1);
    		        System.out.print("\n NOW PLAYER "+player.get(1).getName()+" is in "+player.get(1).getPosition()+"th POSITION");
    		        System.out.print("\n");

    			}
    			else
    			{
    				System.out.print("INVALID CHOICE");
    			}
    		}
    	}
    	else
    	{
    		System.out.print("INVALID CHOICE");
    	}
     } 
     public void player2Game()
     {
     	    System.out.print("\n");
    	    System.out.print("-------------------------------------------------------------------------------------------------------");
     	    System.out.print("\n");
     	    System.out.print("\n TO START THE GAME PRESS 1 :");
    	    System.out.print("\n");
    	    int d = scanner.nextInt();
    	   if(d==1)
    	   {
    		   System.out.print("\n ROLLING THE DICE FOR "+player.get(1).getName());
      		   System.out.print("\n");
    		   int k2 = player.get(1).random();
    		   System.out.print("\n THE  DICE ROLLED AND THE VALUE IS :"+k2);
    		   System.out.print("\n");
    		   player.get(1).setPosition(player.get(1).getPosition()+k2);
    		   System.out.print("\n NOW PLAYER "+player.get(1).getName()+" is in "+player.get(1).getPosition()+"th POSITION");
    		   System.out.print("\n");
    		   int p = player.get(1).getPosition();
    		   if(p<=100)
    		   {
    			  this.ladder();
    			  this.snake();
    		   }  
    		   else
    		   {
    		   	  player.get(1).setPosition(player.get(1).getPosition()-k2);
    		 	  System.out.print("\n NOW PLAYER "+player.get(1).getName()+" is in "+player.get(1).getPosition()+"th POSITION");
    		 	  System.out.print("\n");
    		   }
    	    }
    		else
    		{
    			System.out.print("INVALID CHOICE");
    		}
     } 
     public void snake()
     {
     	for(int j=0;j<player.size();j++)
     	{
     		if(player.get(j).getPosition()== 90)
     		{
     		   System.out.print("\n");
    	       System.out.print("-------------------------------------------------------------------------------------------------------");
     	       System.out.print("\n");
     	       System.out.print("THERE IS A SNAKE IN 90TH POSITION SO IT SWALLOW YOU AND NOW YOU ARE IN 20TH POSITION");
     	       System.out.print("\n");
     	       System.out.print("-------------------------------------------------------------------------------------------------------");
     	       System.out.print("\n");
     	       player.get(j).setPosition(20);
     	       System.out.print("\n"+" "+player.get(j).getName()+" IS NOW IN "+player.get(j).getPosition()+" TH POSITION");
     	       System.out.print("\n");
     		}
     		else if(player.get(j).getPosition()== 80)
     		{
     		   System.out.print("\n");
    	       System.out.print("-------------------------------------------------------------------------------------------------------");
     	       System.out.print("\n");
     	       System.out.print("THERE IS A SNAKE IN 80TH POSITION SO IT SWALLOW YOU AND NOW YOU ARE IN 34TH POSITION");
     	       System.out.print("\n");
     	       System.out.print("-------------------------------------------------------------------------------------------------------");
     	       System.out.print("\n");
     	       player.get(j).setPosition(34);
     	       System.out.print("\n"+" "+player.get(j).getName()+" IS NOW IN "+player.get(j).getPosition()+" TH POSITION");
     	       System.out.print("\n");  
     		}
     		else if(player.get(j).getPosition()== 76)
     		{
     		   System.out.print("\n");
    	       System.out.print("-------------------------------------------------------------------------------------------------------");
     	       System.out.print("\n");
     	       System.out.print("THERE IS A SNAKE IN 76TH POSITION SO IT SWALLOW YOU AND NOW YOU ARE IN 10TH POSITION");
     	       System.out.print("\n");
     	       System.out.print("-------------------------------------------------------------------------------------------------------");
     	       System.out.print("\n");
     	       player.get(j).setPosition(10);
     	       System.out.print("\n"+" "+player.get(j).getName()+" IS NOW IN "+player.get(j).getPosition()+" TH POSITION");
     	       System.out.print("\n");
     		}
     		else if(player.get(j).getPosition()== 55)
     		{
     		   System.out.print("\n");
    	       System.out.print("-------------------------------------------------------------------------------------------------------");
     	       System.out.print("\n");
     	       System.out.print("THERE IS A SNAKE IN 55TH POSITION SO IT SWALLOW YOU AND NOW YOU ARE IN 15TH POSITION");
     	       System.out.print("\n");
     	       System.out.print("-------------------------------------------------------------------------------------------------------");
     	       System.out.print("\n");
     	       player.get(j).setPosition(15);
     	       System.out.print("\n"+" "+player.get(j).getName()+" IS NOW IN "+player.get(j).getPosition()+" TH POSITION");
     	       System.out.print("\n");
     		}
     		else if(player.get(j).getPosition()== 40)
     		{
     		   System.out.print("\n");
    	       System.out.print("-------------------------------------------------------------------------------------------------------");
     	       System.out.print("\n");
     	       System.out.print("THERE IS A SNAKE IN 40TH POSITION SO IT SWALLOW YOU AND NOW YOU ARE IN 30TH POSITION");
     	       System.out.print("\n");
     	       System.out.print("-------------------------------------------------------------------------------------------------------");
     	       System.out.print("\n");
     	       player.get(j).setPosition(30);
     	       System.out.print("\n"+" "+player.get(j).getName()+" IS NOW IN "+player.get(j).getPosition()+" TH POSITION");
    	       System.out.print("\n");
     		}
     	}
    }	
    public void ladder()
    {
    	for(int j=0;j<player.size();j++)
     	{
     		if(player.get(j).getPosition()== 10)
     		{
     		   System.out.print("\n");
    	       System.out.print("-------------------------------------------------------------------------------------------------------");
     	       System.out.print("\n");
     	       System.out.print("THERE IS A LADDER IN 10TH POSITION SO YOU CAN CLIMBE TO 56TH POSITION WITH THE HELP OF LADDER ");
     	       System.out.print("\n");
     	       System.out.print("-------------------------------------------------------------------------------------------------------");
     	       System.out.print("\n");
     	       player.get(j).setPosition(56);
     	       System.out.print("\n"+" "+player.get(j).getName()+" IS NOW IN "+player.get(j).getPosition()+" TH POSITION");
     	       System.out.print("\n");
     		}
     		else if(player.get(j).getPosition()== 26)
     		{
     		   System.out.print("\n");
    	       System.out.print("-------------------------------------------------------------------------------------------------------");
     	       System.out.print("\n");
     	       System.out.print("THERE IS A LADDER IN 26TH POSITION SO YOU CAN CLIMBE TO 72TH POSITION WITH THE HELP OF LADDER ");
     	       System.out.print("\n");
     	       System.out.print("-------------------------------------------------------------------------------------------------------");
     	       System.out.print("\n");
     	       player.get(j).setPosition(72);
     	       System.out.print("\n"+" "+player.get(j).getName()+" IS NOW IN "+player.get(j).getPosition()+" TH POSITION");
     	       System.out.print("\n");
     		}
     		else if(player.get(j).getPosition()== 43)
     		{
     		   System.out.print("\n");
    	       System.out.print("-------------------------------------------------------------------------------------------------------");
     	       System.out.print("\n");
     	       System.out.print("THERE IS A LADDER IN 43TH POSITION SO YOU CAN CLIMBE TO 86TH POSITION WITH HELP OF LADDER ");
     	       System.out.print("\n");
     	       System.out.print("-------------------------------------------------------------------------------------------------------");
     	       System.out.print("\n");
     	       player.get(j).setPosition(86);
     	       System.out.print("\n"+" "+player.get(j).getName()+" IS NOW IN "+player.get(j).getPosition()+" TH POSITION");
     	       System.out.print("\n");
     		}
     		else if(player.get(j).getPosition()== 65)
     		{
     		    System.out.print("\n");
    	       System.out.print("-------------------------------------------------------------------------------------------------------");
     	       System.out.print("\n");
     	       System.out.print("THERE IS A LADDER IN 65TH POSITION SO YOU CAN CLIMBE TO 89TH POSITION WITH THE HELP OF LADDER ");
     	       System.out.print("\n");
     	       System.out.print("-------------------------------------------------------------------------------------------------------");
     	       System.out.print("\n");
     	       player.get(j).setPosition(89);
     	       System.out.print("\n"+" "+player.get(j).getName()+" IS NOW IN "+player.get(j).getPosition()+" TH POSITION");
     	       System.out.print("\n");
     		}
     		else if(player.get(j).getPosition()== 71)
     		{
     		    System.out.print("\n");
    	       System.out.print("-------------------------------------------------------------------------------------------------------");
     	       System.out.print("\n");
     	       System.out.print("THERE IS A LADDER IN 71TH POSITION SO YOU CAN CLIMBE TO 96TH POSITION");
     	       System.out.print("\n");
     	       System.out.print("-------------------------------------------------------------------------------------------------------");
     	       System.out.print("\n");
     	       player.get(j).setPosition(96);
     	       System.out.print("\n"+" "+player.get(j).getName()+" IS NOW IN "+player.get(j).getPosition()+" TH POSITION");
     	       System.out.print("\n");
     		}
     	}
    }
}