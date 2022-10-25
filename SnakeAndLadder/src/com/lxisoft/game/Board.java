package com.lxisoft.game;   
import java.util.*;

public class Board
{   
    Locationcell[] locationCell;         

    Scanner sc = new Scanner(System.in);     
    Random rand = new Random();
    
    int randomDicePoint = rand.nextInt(7);
    String gameMode;    
    String xPress;
    int startGame = 1;
    int endGame = 100;    

    public LocationCell[] getLocationCell()
    {
        return locationCell;
    }       

    public void setLocationCell(LocationCell[] LocationCell)
    {
        this.locationCell = LocationCell;
    }
    
    public void startPlaying()
    {  
        
        
        }
    }
                    
    
}
