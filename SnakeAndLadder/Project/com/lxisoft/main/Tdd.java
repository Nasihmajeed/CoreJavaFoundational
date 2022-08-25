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
            ladders[i].setLocationOne(4);
            ladders[i].setLocationTwo(6);
            ladders[i].setLocationThree(8);
            ladders[i].setLocationFour(10);                                 
        }                                                   
   
        Snake snakes[] = new Snake[4];               //Snakes matter
        board.setSnake(snakes);

        for(int i = 0;i < 4;i++)
        {
            snakes[i] = new Snake();
            snakes[i].setLocationOne(6);
            snakes[i].setLocationTwo(9);
            snakes[i].setLocationThree(11);
            snakes[i].setLocationFour(13);    
        }                      
            
        board.startPlaying();                                  
    }
}
