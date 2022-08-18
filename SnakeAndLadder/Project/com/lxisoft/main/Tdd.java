package com.lxisoft.main;
import com.lxisoft.files.*;
import java.util.concurrent.*;
import static java.util.concurrent.TimeUnit.SECONDS;

public class Tdd
{
    public static void main(String [] args)    
    {
        Board board = new Board();                  //Board matter              
        
        Dice dice = new Dice();                      //Dice matter
        board.setDice(dice);
                  
        Ladder ladders[] = new Ladder[4];            //Ladders matter
        board.setLadder(ladders);

        for(int i = 0;i < 4; i++)
        {
            ladders[i] = new Ladder();

            ladders[i].setLadderSize(10);
        }    
        
        Person players[] = new Person[2];            //Person matter
        board.setPlayer(players);
        players[0] = new Person();
        players[1] = new Person();        
 
        Snake snakes[] = new Snake[4];              //Snakes matter
        board.setSnake(snakes);

        for(int k = 0;k < 4;k++)
        {
            snakes[k] = new Snake();
        }       
       
        System.out.println("\t "+"Snake And Ladder Game 0.1"+"\n");

        final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        final Runnable runnable = new Runnable() 
        {
            int countdownStarter = 3;           

            public void run() 
            {
                System.out.println(countdownStarter);
                countdownStarter--;

                if (countdownStarter < 0) 
                {
                    System.out.println("Game Starts Now!");
                    scheduler.shutdown();
                }
            }
        };
        scheduler.scheduleAtFixedRate(runnable, 0, 1, SECONDS);
        
        board.startPlaying();    
                         
    }
}
