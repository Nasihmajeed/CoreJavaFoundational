package com.lxisoft.SnakeAndLadder;
import com.lxisoft.SnakeAndLadder.*;
import java.util.*;
public class Game{
	int noOfPlayers;	
	Board bord = new Board();
	Dice dice  = new Dice();
	Snake snake = new Snake();
	Ladder ladder = new Ladder();
	ArrayList<Players> player = new ArrayList<Players>();
	enum GameLevel{
		EASY,
		HARD
	}
	GameLevel gLevel;
	public void startGame(){
		Scanner s = new Scanner(System.in);

		System.out.println("Start Game \n1.Yes \n2.No");
		int start = s.nextInt();
		if(start==1){
			System.out.println("Select the game level \n1.Easy \t2.Hard");
			int level = s.nextInt();
			if(level == 1){
				String gameLevel = "EASY";
				this.beginGame(GameLevel.valueOf(gameLevel));
			}
			else if(level == 2){
				String gameLevel = "HARD";
				this.beginGame(GameLevel.valueOf(gameLevel));
			}
		}
	}
	public void beginGame(GameLevel gLevel){
		Scanner s = new Scanner(System.in);
		switch (gLevel){
			case EASY:
			System.out.println("     ***************** SNAKE AND LADDER ****************");
			bord.setBoard();
			bord.print();
			bord.eBoardDescription();
			System.out.println("Enter number of players ");
			int numOfPlayers = s.nextInt();
			bord.addPlayer(numOfPlayers,player);
			bord.setPlayer(numOfPlayers,player);
			bord.gameDescription(player);
			this.setEasyGame();
			break;
	    	case HARD:
			System.out.println("     ***************** SNAKE AND LADDER ****************");
			bord.setBoard();
			bord.print();
			bord.hBoardDescription();
			System.out.println("Enter number of players ");
			int noOfPlayers = s.nextInt();
			bord.addPlayer(noOfPlayers,player);
			bord.setPlayer(noOfPlayers,player);
			bord.gameDescription(player);
			this.setHardGame();
			break;
			default:
			System.out.println("There is some technical issues");
			break;
		}
	}
	public void setEasyGame(){
		Scanner s = new Scanner(System.in);
		int rollAgain;
		do{			
			for(int j=0;j<player.size(); j++){
				if(player.get(j).getPosition()==0){
			       this.playerGame(j);				    
		     	}
		        else if(player.get(j).getPosition()>0){
		            this.playEasyGame(j);
		     	     
			    }
			    if(player.get(j).getPosition()>=100){
			    	this.winner(j);
			    	this.finalPosition();
			    	break;
			    }	    
			}
			System.out.println("Tap 1 for next round of rolling (To exit tap 0)");
			rollAgain = s.nextInt();
		}while(rollAgain != 0);
	}
	public void setHardGame(){
		Scanner s = new Scanner(System.in);
		int rollAgain;
		do{			
			for(int j=0;j<player.size(); j++){
				if(player.get(j).getPosition()==0){
			       this.playerGame(j);				    
		     	}
		        else if(player.get(j).getPosition()>0){
		            this.playHardGame(j);
		     	     
			    }
			    if(player.get(j).getPosition()>=100){
			    	this.winner(j);
			    	this.finalPosition();
			    	break;
			    }	    
			}
			System.out.println("Tap 1 for next round of rolling (To exit tap 0)");
			rollAgain = s.nextInt();
		}while(rollAgain != 0);
	}
	public void playerGame(int no){
		int num = dice.diceRoll()+1;
		System.out.println("====================================================================");
       	System.out.println("\n"+player.get(no).getPlayer()+" Coin : "+player.get(no).getCoin()+" Rolls the dice and gets "+num);
        if(num != 1){
	        System.out.println(player.get(no).getPlayer()+" Can not enter the match until the dice rolls to 1");
	        System.out.println("====================================================================");
   	    }
	    else{
    	    player.get(no).setPosition(1);
	   	    System.out.println(player.get(no).getPlayer()+" Enters the game and reached to "+player.get(no).getPosition());
	   	    System.out.println("====================================================================");
	   	    int p = player.get(no).getPosition();
	   	    bord.printBoard(p,no,player);
	    }
	}
	public void playEasyGame(int noP){
	    int num = dice.diceRoll()+1;
	    System.out.println("====================================================================");
	    System.out.println("\n"+player.get(noP).getPlayer()+" Coin : "+player.get(noP).getCoin()+" Rolls the dice and gets "+num);
	    if(player.get(noP).getPosition()<95){
			
	        player.get(noP).setPosition(player.get(noP).getPosition()+num);
	        System.out.println(player.get(noP).getPlayer()+" Moves to the "+player.get(noP).getPosition()+" position");
	        System.out.println("====================================================================");
	        int x = player.get(noP).getPosition();
	        if(x<=100){
     	        ladder.eLadderClimb(player);
		        snake.eSnakeBite(player);
	        }
	        bord.printBoard(x,noP,player);	
		}
		if(player.get(noP).getPosition()==95){
			if(num == 6){
				System.out.println("==> The player needs to get less than 6 <==");
			}
			else {
				player.get(noP).setPosition(player.get(noP).getPosition()+num);
	            System.out.println(player.get(noP).getPlayer()+" Moves to the "+player.get(noP).getPosition()+" position");
	            System.out.println("====================================================================");
	            int x = player.get(noP).getPosition();
	            if(x<=100){    
		            snake.eSnakeBite(player);
	            }
	            bord.printBoard(x,noP,player);
			}
		}
		else if(player.get(noP).getPosition()==97){
			if(num > 3){
				System.out.println("==> The player needs to get less than 3 <==");
			}
			else {
				player.get(noP).setPosition(player.get(noP).getPosition()+num);
	            System.out.println(player.get(noP).getPlayer()+" Moves to the "+player.get(noP).getPosition()+" position");
	            System.out.println("====================================================================");
	            int x = player.get(noP).getPosition();
	            bord.printBoard(x,noP,player);
			}
		}
		else if(player.get(noP).getPosition()==98){
			if(num > 2){
				System.out.println("==> The player needs to get less than 3 <==");
			}
			else {
				player.get(noP).setPosition(player.get(noP).getPosition()+num);
	            System.out.println(player.get(noP).getPlayer()+" Moves to the "+player.get(noP).getPosition()+" position");
	            System.out.println("====================================================================");
	            int x = player.get(noP).getPosition();
	            bord.printBoard(x,noP,player);
			}
		}
		else if(player.get(noP).getPosition()==99){
			if(num > 1){
				System.out.println("==> The player needs to get 1 <==");
			}
			else {
				player.get(noP).setPosition(player.get(noP).getPosition()+num);
	            System.out.println(player.get(noP).getPlayer()+" Moves to the "+player.get(noP).getPosition()+" position");
	            System.out.println("====================================================================");
	            int x = player.get(noP).getPosition();
	            bord.printBoard(x,noP,player);
			}
		}
	}
	public void playHardGame(int noP){
	    int num = dice.diceRoll()+1;
	    System.out.println("====================================================================");
	    System.out.println("\n"+player.get(noP).getPlayer()+" Coin : "+player.get(noP).getCoin()+" Rolls the dice and gets "+num);
	    if(player.get(noP).getPosition()<95){
			
	        player.get(noP).setPosition(player.get(noP).getPosition()+num);
	        System.out.println(player.get(noP).getPlayer()+" Moves to the "+player.get(noP).getPosition()+" position");
	        System.out.println("====================================================================");
	        int x = player.get(noP).getPosition();
	        if(x<=100){
     	        ladder.hLadderClimb(player);
		        snake.hSnakeBite(player);
	        }	
	        bord.printBoard(x,noP,player);
		}
		if(player.get(noP).getPosition()==95){
			if(num == 6){
				System.out.println("==> The player needs to get less than 6 <==");
			}
			else {
				player.get(noP).setPosition(player.get(noP).getPosition()+num);
	            System.out.println(player.get(noP).getPlayer()+" Moves to the "+player.get(noP).getPosition()+" position");
	            System.out.println("====================================================================");
	            int x = player.get(noP).getPosition();
	            bord.printBoard(x,noP,player);
	            if(x<=100){    
		            snake.hSnakeBite(player);
	            }
	            bord.printBoard(x,noP,player);
			}
		}
		else if(player.get(noP).getPosition()==97){
			if(num > 3){
				System.out.println("==> The player needs to get less than 3 <==");
			}
			else {
				player.get(noP).setPosition(player.get(noP).getPosition()+num);
	            System.out.println(player.get(noP).getPlayer()+" Moves to the "+player.get(noP).getPosition()+" position");
	            System.out.println("====================================================================");
	            int x = player.get(noP).getPosition();
	            bord.printBoard(x,noP,player);
			}
		}
		else if(player.get(noP).getPosition()==99){
			if(num > 1){
				System.out.println("==> The player needs to get 1 <==");
			}
			else {
				player.get(noP).setPosition(player.get(noP).getPosition()+num);
	            System.out.println(player.get(noP).getPlayer()+" Moves to the "+player.get(noP).getPosition()+" position");
	            System.out.println("====================================================================");
	            int x = player.get(noP).getPosition();
	            bord.printBoard(x,noP,player);
			}
		}
	}
	public void winner(int i){
		System.out.println("--------------------------------------------------");
    	System.out.println("\t\tThe Winner Is\t\t");
		
		if(player.get(i).getPosition()>=100){
			System.out.println("\t\t"+player.get(i).getPlayer()+"\t");
			System.out.println("\t\t"+player.get(i).getCoin()+"\t");
		}
		System.out.println("--------------------------------------------------");
	}
	public void finalPosition(){
	    Collections.sort(player);
	  	System.out.println(" PLAYERS FINAL POSITIONS ");
	   	System.out.println("-------------------------");
	   	for(Players pl : player){
	   		System.out.println("Player : "+pl.player+"  Coin : "+pl.coin+" Position : "+pl.position);
	  	}
	}
}