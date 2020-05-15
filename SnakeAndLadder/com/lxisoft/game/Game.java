package com.lxisoft.game;
import java.util.*;
import java.lang.*;
import com.lxisoft.area.*;

public class Game
{
	
	
	//FileReppo gameResult =new FileReppo();
	static Scanner input =new Scanner(System.in);
	Dice dice;
	Snake snake;
	Ladder ladder;
 public void startGame(ArrayList<Player> players,ArrayList<Snake>snakes,ArrayList<Ladder>ladders)
	{
		playerDetails(players);	
		selectlevel(snakes,ladders);
		playGame(players,snakes,ladders);

	}

public void playerDetails(ArrayList<Player> players)
	{
		Collections.sort(players, new Sortbyname());

		 System.out.println("\n\nPlayers name:\n"); 
        for (Player player : players) { 
            System.out.println(player); 
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
        System.out.println("You Selected "+level+"Level"); 
    	snakes.remove(4);
    	snakes.remove(5);
		break;
		case 2:
		level = Level.HARD; 
        System.out.println("You Selected "+level+"Level"); 
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
		
		for(int i=0;i<players.size();i++)
		{	
			do
			{
		 		System.out.println(" Turn is :"+players.get(i).getPlayerName());
		 		System.out.println("Press 0 to roll the Dice");
				temp=input.nextInt();
		 		if(temp==0)
		  			{
					 if(players.get(i).getPlayerPosition()==0)
					 {move(players.get(i));}
					 else
					 {move(players.get(i),snakes,ladders);}	

		  			}	
			}
			while(temp>0);
		}	
	}

public void move(Player player)
	{
		dice=new Dice();
		int value=dice.roll();
		if(value==6)
		{
			player.setPlayerPosition(1);
		}
	  System.out.println(player.getPlayerName()+"Corrent Position is = "+player.getPlayerPosition());		
	}			

public void move(Player player,ArrayList<Snake>snakes,ArrayList<Ladder>ladders)
	{
		dice=new Dice();
		int value=dice.roll();
		int temp=value+player.getPlayerPosition();			
		player.setPlayerPosition(temp);
		checkforPositionmoves(player,snakes,ladders);
		System.out.println(player.getPlayerName()+"Corrent Position is = "+player.getPlayerPosition());
	}


public void checkforPositionmoves(Player player,ArrayList<Snake>snakes,ArrayList<Ladder>ladders)
	{
		int flag=0;
		int position;
		int temp=value+player.getPlayerPosition();
		for(int i=0;i<snakes.size();i++)
		{
			if(snakes.get(i)getHead()==temp)
			{
				flag=flag+1;
				position=snakes.get(i)getTail();
			}
		}

		for(int i=0;i<ladders.size();i++)
		{
			if(ladders.get(i).getStart()==temp)
			{
				flag=flag+2;
				position=ladders.get(i)getEnd();
			}
		}
	  changePosition(player,flag,index);
	}

public void changePosition(Payer player,int flag,int position)
	{
		if(flag==1)
		{
			System.out.println("Ther is a Snake At that Position");
			snake=new Snake();
			snake.behaviour();
			player.setPlayerPosition(position);
		}
		if(flag==2)
		{
			System.out.println("There is a Ladder At that Position");
			ladder=new Ladder();
			ladder.behaviour();
			player.setPlayerPosition(position);
		}	
	}
}	