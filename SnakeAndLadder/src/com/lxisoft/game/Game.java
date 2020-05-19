package com.lxisoft.game;
import java.util.*;
import java.lang.*;
import com.lxisoft.area.*;

public class Game
{
	
	
	FileReppo gameResult =new FileReppo();
	static Scanner input =new Scanner(System.in);
	Dice dice;
	Snake snake;
	Ladder ladder;

 public void startGame(ArrayList<Player> players,ArrayList<Snake>snakes,ArrayList<Ladder>ladders)
	{
		playerDetails(players);	
		selectlevel(snakes,ladders);
		playGame(players,snakes,ladders);
		System.out.println("\n\n\tWinner List Of The Games \n");
		System.out.println("*******************************************\n");
		gameResult.readResult();

	}

public void playerDetails(ArrayList<Player> players)
	{
		Collections.sort(players, new Sortbyname());

		System.out.println("\n\nPlayers Names :"); 
        for (Player player : players) { 
            System.out.println("*"+player); 
        }  
	}


public void selectlevel(ArrayList<Snake>snakes,ArrayList<Ladder>ladders)
	{
		int choise=0;
	do{
	System.out.print("\nPlease Select Your Level\n1.Normal Level\n2.Hard Level\n\n Enter Your Choise :");
	choise=input.nextInt();
	Level level;
	try	{switch(choise)
	{		
		case 1:
		level = Level.NORMAL; 
        System.out.println("\nYou Selected "+level+" Level"); 
    	snakes.remove(4);
    	snakes.remove(5);
		break;
		case 2:
		level = Level.HARD; 
        System.out.println("\nYou Selected "+level+"Level"); 
        ladders.remove(4);
        ladders.remove(5);
		break;
		default:
		System.out.println("\nPLease Select a LEvel ....."); 
		break; }}
	catch(Exception ex)
	{ System.out.println("**"+ex);}	
	}while(choise>2);

	}

public void playGame(ArrayList<Player> players,ArrayList<Snake>snakes,ArrayList<Ladder>ladders)
	{
		int temp=1;
		boolean flag=false;
	  do
	  {
	  	for(int i=0;i<players.size();i++)
		{	
			do
			{
		 		System.out.println("\n\n\n Turn is :"+players.get(i).getPlayerName());
		 		System.out.println("Press 0 to roll the Dice");
				temp=input.nextInt();
		 		if(temp==0)
		  			{
					 if(players.get(i).getPlayerPosition()==0)
					 {move(players.get(i));}
					 else
					 {move(players.get(i),snakes,ladders);}	

		  			}
		  		System.out.println("_____________________________\n");		
			}
			while(temp>0);
		}

		flag=checkWinner(players);	
	  }while(flag==false);	
	}

public boolean checkWinner(ArrayList<Player> players)
	{
		boolean flag=false;
		int index=0;
		for (int i=0;i<players.size();i++)
		{
			if(players.get(i).getPlayerStatus()== true)
			{
				flag=true;
				index=index+i;
			}	
		}

	  if(flag==true)
	  {
	  	System.out.println(players.get(index).getPlayerName()+" Winned in this Game");
	  	gameResult.writeTofile(players.get(index).getPlayerName());
	  	players.remove(index);
	  	if(players.size()>1)
	  	{
	  		System.out.print("\nDo You Want To Continue \nPress Y/N =");
	  	}
	  }
	 return flag; 	
	}


public void move(Player player)
	{
		dice=new Dice();
		int value=dice.roll();
		System.out.println("\n\nYou Got = "+value);		
		if(value==6)
		{
			System.out.println(" Congratulations "+player.getPlayerName()+" You Are In The Game");
			player.setPlayerPosition(1);
		}
	  System.out.println("Current Position is = "+player.getPlayerPosition());		
	}			

public void move(Player player,ArrayList<Snake>snakes,ArrayList<Ladder>ladders)
	{
		dice=new Dice();
		int value=dice.roll();
		System.out.println("\n\nYou Got "+value);
		int temp=value+player.getPlayerPosition();

		player.setPlayerPosition(temp);
		checkforPositionmoves(player,snakes,ladders);
		setWinner(player,value);
		System.out.println(player.getPlayerName()+"'s  Current Position is = "+player.getPlayerPosition());
	}

public void setWinner(Player player,int value)
	{
		int temp=player.getPlayerPosition();
		int position=(temp-value);
		int distance=(100-position);
		if(distance<value)
		{
			System.out.println("\n* You Need To Get less than "+distance);
			player.setPlayerPosition(position);	
		}
		else
		{
			player.setPlayerPosition(temp);	
		}
		if(temp==100)
		{
			player.setPlayerStatus(true);
		}
		
	}

public void checkforPositionmoves(Player player,ArrayList<Snake>snakes,ArrayList<Ladder>ladders)
	{
		int flag=0;
		int position=0;
		int temp=player.getPlayerPosition();
		for(int i=0;i<snakes.size();i++)
		{
			if(snakes.get(i).getHead()==temp)
			{
				flag=flag+1;
				position=snakes.get(i).getTail();
			}
		}

		for(int i=0;i<ladders.size();i++)
		{
			if(ladders.get(i).getStart()==temp)
			{
				flag=flag+2;
				position=ladders.get(i).getEnd();
			}
		}
	  changePosition(player,flag,position);
	}

public void changePosition(Player player,int flag,int position)
	{
		if(flag==1)
		{
			System.out.println("\nThere is a Snake At that Position");
			snake=new Snake();
			snake.behaviour();
			player.setPlayerPosition(position);
		}
		if(flag==2)
		{
			System.out.println("\nThere is a Ladder At that Position\n");
			ladder=new Ladder();
			ladder.behaviour();
			player.setPlayerPosition(position);
		}	
	}
}	