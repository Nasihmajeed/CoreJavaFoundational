package com.LxiSoft.Game;
import com.LxiSoft.Game.Animal;
import java.util.*;

public class Forest
{
    ArrayList<Animal> animals = new ArrayList<Animal>();
    public void setGame()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Animals do fight for their existance");
        System.out.println("Start Game? \n\t 1.Yes \n\t 2.No");
        int start = s.nextInt();
        if(start == 1)
        {
            this.startGame();
        }
    }
    public void startGame()
    {
        

    }
}
