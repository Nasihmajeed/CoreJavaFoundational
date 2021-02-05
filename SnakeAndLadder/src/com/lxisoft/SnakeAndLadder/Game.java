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
	public void startGame(){
		Scanner s = new Scanner(System.in);

		System.out.println("Start Game \n1.Yes \n2.No");
		int start = s.nextInt();
		if(start==1){
			System.out.println(" ++++++++++++++++++++ SNAKE AND LADDER +++++++++++++++++++++");
			bord.setBoard();
	        bord.print();
	        System.out.println("Enter the number of players : ");
	        noOfPlayers = s.nextInt();
	        bord.addPlayer(noOfPlayers,player);
	        bord.setPlayer(noOfPlayers,player);
	       	this.setGame();
		    //this.winner(noOfPlayers);
		}
	}
	
	public void setGame(){
		Scanner s = new Scanner(System.in);
		//int j;
		int rollAgain;
		do{
			
			for(int j=0;j<player.size(); j++){
				if(player.get(j).getPosition()==0){
			       this.playerGame(j);				    
				    //this.play2Game();
		     	}
		        else if(player.get(j).getPosition()>0){
			    //this.play1Game();
		            this.playGame(j);
		     	     
			    }
			    if(player.get(j).getPosition()>=100){
			    	this.winner(j);
			    	break;
			    }	    
			}
			System.out.println("Tap 1 for next round of rolling (To exit tap 0)");
			rollAgain = s.nextInt();
			//this.winner(j);
		}while(rollAgain != 0);
	}
	public void playerGame(int no){
		int num = dice.diceRoll()+1;
		System.out.println("====================================================================");
       	System.out.println("\n"+player.get(no).getPlayer()+" Colour : "+player.get(no).getColor()+" Rolls the dice and gets "+num);
        if(num != 1){
	        System.out.println(player.get(no).getPlayer()+" Can not enter the match until the dice rolls to 1");
	        System.out.println("====================================================================");
   	    }
	    else{
    	    player.get(no).setPosition(1);
	   	    System.out.println(player.get(no).getPlayer()+" Enters the game and reached to "+player.get(no).getPosition());
	   	    System.out.println("====================================================================");
	    }
	}
	public void playGame(int noP){
	    int num = dice.diceRoll()+1;
	    System.out.println("====================================================================");
	    System.out.println("\n"+player.get(noP).getPlayer()+" Colour : "+player.get(noP).getColor()+" Rolls the dice and gets "+num);
	    if(player.get(noP).getPosition()<95){
			
	        player.get(noP).setPosition(player.get(noP).getPosition()+num);
	        System.out.println(player.get(noP).getPlayer()+" Moves to the "+player.get(noP).getPosition()+" position");
	        System.out.println("====================================================================");
	        int x = player.get(noP).getPosition();
	        if(x<=100){
     	        ladder.ladderClimb(player);
		        snake.snakeBite(player);
	        }	
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
		            snake.snakeBite(player);
	            }
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
			}
		}
	}
	public void winner(int i){
		System.out.println("--------------------------------------------------");
    	System.out.println("\t\tThe Winner Is\t\t");
		
		if(player.get(i).getPosition()>=100){
			System.out.println("\t\t"+player.get(i).getPlayer()+"\t");
			System.out.println("\t\t"+player.get(i).getColor()+"\t");
		}
		System.out.println("--------------------------------------------------");
	}
	
}