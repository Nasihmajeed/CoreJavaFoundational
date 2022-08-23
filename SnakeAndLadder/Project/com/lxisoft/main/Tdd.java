package com.lxisoft.main;
import com.lxisoft.files.*;

public class Tdd
{
    public static void main(String [] args)    
    {                                                     
        Board board = new Board();                  //Board matter              
        
        Dice dice = new Dice();                      //Dice matter
        board.setDice(dice);
                  
        Person players[] = new Person[2];            //Person matter
        board.setPlayer(players);
        players[0] = new Person();        
        players[1] = new Person(); 

        Ladder ladders[] = new Ladder[4];            //Ladders matter
        board.setLadder(ladders);

        for(int i = 0;i < 4; i++)
        {
            ladders[i] = new Ladder();                                 
        }                                             
   
        Snake snakes[] = new Snake[4];               //Snakes matter
        board.setSnake(snakes);

        for(int j = 0;j < 4;j++)
        {
            snakes[j] = new Snake();
        }                      
            
        board.startPlaying();                                  
    }
}
