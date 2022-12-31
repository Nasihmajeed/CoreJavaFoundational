package com.lxisoft.game;
import java.util.*;

public class Player 
{  
    private String name;       
    Cell currentCell = 0;
    GameState state;
    
    public String getName()
    {
        return name;          
    }
    
    public void setName(String Name)
    {
        this.name=Name;
    }    
    
    public int throwDice(Dice dice)
    {
        /*if(diceValue == 6 && onemore chance!)
        {
            //inside if, change state to gameplay.
            //insert do-while.
        }
        */
    }
}
