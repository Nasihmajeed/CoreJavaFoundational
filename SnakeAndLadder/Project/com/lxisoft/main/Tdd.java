package com.lxisoft.main;
import com.lxisoft.files.*;

public class Tdd
{
    public static void main(String [] args)    
    {
        Board snakeLadderGame = new Board();         //Board matter              
        
        Dice dice = new Dice();                      //Dice matter
        snakeLadderGame.setDice(dice);
                  
        Ladder ladders[] = new Ladder[4];            //Ladders matter
        snakeLadderGame.setLadder(ladders);

        for(int i = 0;i < 4; i++)
        {
            ladders[i] = new Ladder();

            ladders[i].setLadderSize(10);
        }    
        
        Person players[] = new Person[2];            //Person matter
        snakeLadderGame.setPlayer(players);

        for(int j = 0;j < 2;j++)
        {
            players[j] = new Person();             
        }
 
        Snake snakes[] = new Snake[4];              //Snakes matter
        snakeLadderGame.setSnake(snakes);

        for(int k = 0;k < 4;k++)
        {
            snakes[k] = new Snake();
        }
       
        System.out.println("\t "+"Snake And Ladder Game 0.1"+"\n");
                    
        snakeLadderGame.startPlaying();    
                         
    }
}
