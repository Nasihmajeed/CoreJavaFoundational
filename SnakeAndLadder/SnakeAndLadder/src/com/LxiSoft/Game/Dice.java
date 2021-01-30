package com.LxiSoft.Game;
// import com.LxiSoft.Game.Game;
import java.util.*;

public class Dice 
{
    Random random = new Random();
    public int diceRoll()
    {
		int side = random.nextInt(6);
        return side;
    }
}
