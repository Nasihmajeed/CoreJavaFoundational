package com.lxisoft.SnakeAndLadder;
import com.lxisoft.SnakeAndLadder.*;
import java.util.*;
public class Game{
	int noOfPlayers;
	String[][] board = new String[10][10];
	Dice dice  = new Dice();
	Snake snake = new Snake();
	Ladder ladder = new Ladder();
	ArrayList<Players> player = new ArrayList<Players>();
	public void startGame(){
		Scanner s = new Scanner(System.in);
		int replay;
		do{
			System.out.println("Start Game \n1.Yes \n2.No");
			int start = s.nextInt();
			if(start==1){
				System.out.println(" ++++++++++++++++++++ SNAKE AND LADDER +++++++++++++++++++++");
				this.setBoard();
		        this.print();
		        System.out.println("Enter the number of players : ");
		        noOfPlayers = s.nextInt();
		        this.addPlayer(noOfPlayers);
		        this.setPlayer(noOfPlayers);
		       	this.setGame(noOfPlayers);
		     
		        
		        //this.winner(noOfPlayers);
			}
			else{
				break;
			}
			System.out.println("You wanna restart \n1.yes \n0.No");
			replay = s.nextInt();
		}while(replay !=0 );
	}
	public void setBoard(){
	    board[0][0] = "100";
	    board[0][1] = " 99";
	    board[0][2] = " 98";
	    board[0][3] = " 97";
	    board[0][4] = " 96";
	    board[0][5] = " 95";
	    board[0][6] = " 94";
	    board[0][7] = " 93";
	    board[0][8] = " 92";
	    board[0][9] = " 91";

	    board[1][0] = " 81";
	    board[1][1] = " 82";
	    board[1][2] = " 83";
	    board[1][3] = " 84";
	    board[1][4] = " 85";
	    board[1][5] = " 86";
	    board[1][6] = " 87";
	    board[1][7] = " 88";
	    board[1][8] = " 89";
	    board[1][9] = " 90";

	    board[2][0] = " 80";
	    board[2][1] = " 79";
	    board[2][2] = " 78";
	    board[2][3] = " 77";
	    board[2][4] = " 76";
	    board[2][5] = " 75";
	    board[2][6] = " 74";
	    board[2][7] = " 73";
	    board[2][8] = " 72";
	    board[2][9] = " 71";

	    board[3][0] = " 61";
	    board[3][1] = " 62";
	    board[3][2] = " 63";
	    board[3][3] = " 64";
	    board[3][4] = " 65";
	    board[3][5] = " 66";
	    board[3][6] = " 67";
	    board[3][7] = " 68";
	    board[3][8] = " 69";
	    board[3][9] = " 70";

	    board[4][0] = " 60";
	    board[4][1] = " 59";
	    board[4][2] = " 58";
	    board[4][3] = " 57";
	    board[4][4] = " 56";
	    board[4][5] = " 55";
	    board[4][6] = " 54";
	    board[4][7] = " 53";
	    board[4][8] = " 52";
	    board[4][9] = " 51";

	    board[5][0] = " 41";
	    board[5][1] = " 42";
	    board[5][2] = " 43";
	    board[5][3] = " 44";
	    board[5][4] = " 45";
	    board[5][5] = " 46";
	    board[5][6] = " 47";
	    board[5][7] = " 48";
	    board[5][8] = " 49";
	    board[5][9] = " 50";

	    board[6][0] = " 40";
	    board[6][1] = " 39";
	    board[6][2] = " 38";
	    board[6][3] = " 37";
	    board[6][4] = " 36";
	    board[6][5] = " 35";
	    board[6][6] = " 34";
	    board[6][7] = " 33";
	    board[6][8] = " 32";
	    board[6][9] = " 31";

	    board[7][0] = " 21";
	    board[7][1] = " 22";
	    board[7][2] = " 23";
	    board[7][3] = " 24";
	    board[7][4] = " 25";
	    board[7][5] = " 26";
	    board[7][6] = " 27";
	    board[7][7] = " 28";
	    board[7][8] = " 29";
	    board[7][9] = " 30";

	    board[8][0] = " 20";
	    board[8][1] = " 19";
	    board[8][2] = " 18";
	    board[8][3] = " 17";
	    board[8][4] = " 16";
	    board[8][5] = " 15";
	    board[8][6] = " 14";
	    board[8][7] = " 13";
	    board[8][8] = " 12";
	    board[8][9] = " 11";

	    board[9][0] = "  1";
	    board[9][1] = "  2";
	    board[9][2] = "  3";
	    board[9][3] = "  4";
	    board[9][4] = "  5";
	    board[9][5] = "  6";
	    board[9][6] = "  7";
	    board[9][7] = "  8";
	    board[9][8] = "  9";
	    board[9][9] = " 10";
	}
	public void addPlayer(int num){
		for(int i=0; i<num; i++){
			player.add(new Players());
		}
		/*
		player.add(new Player1());
		player.add(new Player2());*/
	}
	public void setPlayer(int pNum){
		Scanner s =new Scanner(System.in);
		for(int i=0; i<pNum; i++){
			System.out.println("Enter the name of "+(i+1)+" th player : ");
     		String pName = s.nextLine();
    	   	player.get(i).setPlayer(pName);
    		System.out.println("Enter the color of coin : ");
    		String pColor = s.nextLine();
    		player.get(i).setColor(pColor);
    		player.get(i).setPosition(0);
		}
		/*
		player.get(0).setPlayer("Player-A");
		player.get(0).setColor("Red");
		player.get(0).setPosition(0);
		player.get(1).setPlayer("Player-B");
		player.get(1).setColor("Green");
		player.get(1).setPosition(0);*/
	}
	public void setGame(int pNo){
		
		for(int j=0;j<player.size(); j++){
			while(player.get(j).getPosition()<100){
				if(player.get(j).getPosition()==0){
			       this.playerGame(j);				    
				    //this.play2Game();
		     	}
		        else if(player.get(j).getPosition()>0){
			    //this.play1Game();
		            this.playGame(j);
		     	     
			    }
			    
			}
		}
		this.winner();   	

	     		/*else if(player.get(0).getPosition()>0 && player.get(1).getPosition()==0){
		    		this.player1Game();
			    	this.play2Game();
		     	}
		     	else if(player.get(0).getPosition()>0 && player.get(1).getPosition()>0){
			    	this.player1Game();
		     		this.player2Game();
			    }*/
			
	    	//break;
		

	    
		//}
		/*while(player.get(0).getPosition()<100 && player.get(1).getPosition()<100){
			if(player.get(0).getPosition()==0 && player.get(1).getPosition()==0){
				this.play1Game();
				this.play2Game();
			}
			else if(player.get(0).getPosition()==0 && player.get(1).getPosition()>0){
				this.play1Game();
				this.player2Game();
				
			}
			else if(player.get(0).getPosition()>0 && player.get(1).getPosition()==0){
				this.player1Game();
				this.play2Game();
			}
			else if(player.get(0).getPosition()>0 && player.get(1).getPosition()>0){
				this.player1Game();
				this.player2Game();
			}
		}*/
	}
	public void playerGame(int no){
		int num = dice.diceRoll()+1;
	
       	System.out.println("\n"+player.get(no).getPlayer()+" Colour : "+player.get(no).getColor()+" Rolls the dice and gets "+num);
        if(num != 1){
	        System.out.println(player.get(no).getPlayer()+" Can not enter the match until the dice rolls to 1");
   	    }
	    else{
    	    player.get(no).setPosition(1);
	   	    System.out.println(player.get(no).getPlayer()+" enters the game and reached to "+player.get(no).getPosition());
	    }
	}
	/*
	public void play2Game(){
		int num = dice.diceRoll()+1;
		System.out.println("\n"+player.get(1).getPlayer()+" Colour : "+player.get(1).getColor()+" Rolls the dice and gets "+num);
		if(num != 1){
			System.out.println(player.get(1).getPlayer()+" Can not enter the match until the dice rolls to 1");
		}
		else{
			player.get(1).setPosition(1);
			System.out.println(player.get(1).getPlayer()+" enters the game and reached to "+player.get(1).getPosition());
		}
	}*/
	public void playGame(int noP){
	    int num = dice.diceRoll()+1;
		System.out.println("\n"+player.get(noP).getPlayer()+" Colour : "+player.get(noP).getColor()+" Rolls the dice and gets "+num);
	    player.get(noP).setPosition(player.get(noP).getPosition()+num);
	    System.out.println(player.get(noP).getPlayer()+" moves to the "+player.get(noP).getPosition()+" position");
	    int x = player.get(noP).getPosition();  
	    if(x<=100){
     	    ladder.ladderClimb(player);
		    snake.snakeBite(player);
	    } 
		
	}
	/*
	public void player2Game(){
		int num = dice.diceRoll();
		System.out.println("\n"+player.get(1).getPlayer()+" Colour : "+player.get(1).getColor()+" Rolls the dice and gets "+num);
		player.get(1).setPosition(player.get(1).getPosition()+num);
		System.out.println(player.get(1).getPlayer()+" moves to the "+player.get(1).getPosition()+" position");
		int y = player.get(0).getPosition();
		if(y<=100){
			ladder.ladderClimb(player);
			snake.snakeBite(player);
		}
	}*/
	public void winner(){
		System.out.println("--------------------------------------------------");
		System.out.println("\t\tThe Winner Is\t\t");
		int i=0;
		for( ; ; ){
			if(i<=player.size()){
				if(player.get(i).getPosition()>=100){
			        System.out.println("\t\t"+player.get(i).getPlayer()+"\t");
        	        System.out.println("\t\t"+player.get(i).getColor()+"\t");
		        }
		        else{
		        	break;
		        }
		        i++;
			}
		}
   		
		/*
		if(player.get(0).getPosition()>=100){
			System.out.println("\t\t"+player.get(0).getPlayer()+"\t");
			System.out.println("\t\t"+player.get(0).getColor()+"\t");
		}
		else if(player.get(1).getPosition()>=100){
			System.out.println("\t\t"+player.get(1).getPlayer()+"\t");
			System.out.println("\t\t"+player.get(1).getColor()+"\t");
		}*/
		System.out.println("--------------------------------------------------");
	}
	public void print(){
		System.out.println("+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				System.out.print("|");
				System.out.print(" "+board[i][j]+" "); 	
			}
			System.out.print("|\n");
		}
		System.out.println("+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");

	}
}