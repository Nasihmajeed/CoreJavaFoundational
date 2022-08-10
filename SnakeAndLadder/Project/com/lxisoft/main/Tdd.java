package com.lxisoft.main;
import com.lxisoft.files.*;

public class Tdd
{
    public static void main(String [] args)    
    {
        Board snakeLadderGame = new Board();
        //snakeLadderGame.setBoard(board);     
        
        Dice dice = new Dice();
        //snakeLadderGame.setDicePoints(dice);

        Ladder ladders = new Ladder();
        //snakeLadderGame.setLadder(ladders);
        

        Person players = new Person();
        //snakeLadderGame.setPlayer(players);
 
        Snake snakes = new Snake();
        //snakeLadderGame.setSnake(snakes);
       
        System.out.println("\t "+"Snake And Ladder Game 0.1"+"\n");              
        snakeLadderGame.startPlaying();    
                         
    }
}
