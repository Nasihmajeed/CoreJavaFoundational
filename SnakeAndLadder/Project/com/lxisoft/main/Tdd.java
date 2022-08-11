package com.lxisoft.main;
import com.lxisoft.files.*;

public class Tdd
{
    public static void main(String [] args)    
    {
        Board snakeLadderGame = new Board();
        snakeLadderGame.setBoard(board);     
        
        Dice dice = new Dice();
        snakeLadderGame.setDicePoints(dice);

        Ladder ladder[] = new Ladder[4];
        snakeLadderGame.setLadder(ladders);

        for(int i = 0;i < 4; i++)
        {
            Ladder ladders[i] = new Ladder();

            ladder[i].setLadderSize(10);
        }    
        

        Person players = new Person();
        snakeLadderGame.setPlayer(players);
 
        Snake snakes = new Snake();
        snakeLadderGame.setSnake(snakes);
       
        System.out.println("\t "+"Snake And Ladder Game 0.1"+"\n");              
        snakeLadderGame.startPlaying();    
                         
    }
}
