package com.lxisoft.game;
import java.util.*;
import java.lang.*;
import com.lxisoft.area.*;

public class Game
{
	
	
	FileReppo gameResult =new FileReppo();
	static Scanner input =new Scanner(System.in);
	ArrayList<Player> players = new ArrayList<Player>();
	PlayBoard playBoard = new PlayBoard();
	Ladder ladder;
	Snake snake;
	Dice dice;
public void creatGame()
	{
		playBoard.createBoard();
	}
 public void playGame(ArrayList<Snake>snakes,ArrayList<Ladder>ladders,ArrayList<Cell>cells)
	{
		creatPlayers();
		playerDetails(players);	
		selectlevel(snakes,ladders);
		startGame(snakes,ladders,cells);
		System.out.println("\n\n\tWinner List Of The Games \n");
		System.out.println("*******************************************\n");
		gameResult.readResult();

	}

public void creatPlayers()
	{
		boolean flag=false;
		int i=0;
		System.out.print("\nHow Many Playes You Want to add :");
		int choise=input.nextInt();

		do
		{
			System.out.print("\nEnter the Name Of "+ (i+1) +" Player : ");
			String name=input.next();
			System.out.print("\nEnter the Coin Symbol Of "+ (i+1) +" Player : ");
			String coin=input.next();
			for(int j=0;j<players.size();j++)
			{
				if(name.equals(players.get(j).getPlayerName()))
				{	flag=true;	}
				else
				{	flag=false;	}
			}
		  if(flag==true)
		  {	System.out.print("\nThe Enterd Name is Already used \n Please Choose Another one ");  }	

		  else
		  {
		  	players.add(new Player());
		  	players.get(i).setPlayerName(name);
		  	players.get(i).setCoin(coin);
		  	players.get(i).setPlayerPosition(0);
		  	players.get(i).setPlayerStatus(false);
		  	// System.out.print("\n Player Added ");
		  	// System.out.print(players.size());
		  	i++;
		  }

		}
		while(i<choise);
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

public void startGame(ArrayList<Snake>snakes,ArrayList<Ladder>ladders,ArrayList<Cell>cells)
	{
		int temp=1;
		boolean flag=false;
	  do
	  {
	  	//System.out.println(players.size());
	  	for(int i=0;i<players.size();i++)
		{	do
			{	
				playBoard.setPlayersPosition(players,cells);
				playBoard.showPlayBoard(cells,snakes,ladders);	
		 		System.out.println("\n\n\n Turn is :"+players.get(i).getPlayerName());
		 		System.out.println("Press 0 to roll the Dice");
				temp=input.nextInt();
		 		if(temp==0)
		  			{
					 if(players.get(i).getPlayerPosition()==0)
					 { move(players.get(i)); }
					 else
					 { move(players.get(i),snakes,ladders); }	

		  			}
		  		//System.out.println("_____________________________\n");		
			}
			while(temp>0);
		}

		flag=checkWinner();	
	  }while(flag==false);	
	}

public boolean checkWinner()
	{
		boolean flag=false;
		int index=0;
		for (int i=0;i<players.size();i++)
		{
			if(players.get(i).getPlayerStatus()== true)
			{	flag=true;
				index=index+i;	}	
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
 		{	System.out.println("\n* You Need To Get less than "+distance);
			player.setPlayerPosition(position);	 }

		else
		{	player.setPlayerPosition(temp);	 }

		if(temp==100)
		{	player.setPlayerStatus(true);    }
		
	}

public void checkforPositionmoves(Player player,ArrayList<Snake>snakes,ArrayList<Ladder>ladders)
	{
		int flag=0;
		int position=0;
		int temp=player.getPlayerPosition();
		for(int i=0;i<snakes.size();i++)
		{
			if(snakes.get(i).getHead()==temp)
			{	flag=flag+1;
				position=snakes.get(i).getTail();
			}
		}

		for(int i=0;i<ladders.size();i++)
		{
			if(ladders.get(i).getStart()==temp)
			{	flag=flag+2;
				position=ladders.get(i).getEnd();
			}
		}

		playBoard.changePosition(player,flag,position);
	}


}	