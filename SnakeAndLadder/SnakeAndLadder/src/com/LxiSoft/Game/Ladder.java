package com.LxiSoft.Game;
// import com.LxiSoft.Game.*;
import java.util.*;

public class Ladder 
{
    public void climb(ArrayList<Players> player)
    {
        for(int i=0; i<player.size(); i++)
        {
            if(player.get(i).getPosition()==4)
            {
				System.out.println("--------------------------------------------------------------");
				System.out.println("                   There is a Ladder at 4");
				int positn = player.get(i).getPosition();
				positn = positn+10;
				player.get(i).setPosition(positn);
				System.out.println("                "+player.get(i).getPlayer()+" : "+player.get(i).getColor()+" climbs to "+player.get(i).getPosition());
				System.out.println("--------------------------------------------------------------");
            }
            
            else if(player.get(i).getPosition()==9)
            {
				System.out.println("--------------------------------------------------------------");
				System.out.println("                   There is a Ladder at 9 ");
				int positn = player.get(i).getPosition();
				positn = positn+22;
				player.get(i).setPosition(positn);
				System.out.println("                "+player.get(i).getPlayer()+" : "+player.get(i).getColor()+" climbs to "+player.get(i).getPosition());
				System.out.println("--------------------------------------------------------------");
            }
            
            else if(player.get(i).getPosition()==20)
            {
				System.out.println("--------------------------------------------------------------");
				System.out.println("                   There is a Ladder at 20 ");
				int positn = player.get(i).getPosition();
				positn = positn+17;
				player.get(i).setPosition(positn);
				System.out.println("                "+player.get(i).getPlayer()+" : "+player.get(i).getColor()+" climbs to "+player.get(i).getPosition());
				System.out.println("--------------------------------------------------------------");
            }
            
            else if(player.get(i).getPosition()==28)
            {
				System.out.println("--------------------------------------------------------------");
				System.out.println("                   There is a Ladder at 28 ");
				int positn = player.get(i).getPosition();
				positn = positn+56;
				player.get(i).setPosition(positn);
				System.out.println("                "+player.get(i).getPlayer()+" : "+player.get(i).getColor()+" climbs to "+player.get(i).getPosition());
				System.out.println("--------------------------------------------------------------");
            }
            
            else if(player.get(i).getPosition()==36)
            {
				System.out.println("--------------------------------------------------------------");
				System.out.println("                   There is a Ladder at 36 ");
				int positn = player.get(i).getPosition();
				positn = positn+21;
				player.get(i).setPosition(positn);
				System.out.println("                "+player.get(i).getPlayer()+" : "+player.get(i).getColor()+" climbs to "+player.get(i).getPosition());
				System.out.println("--------------------------------------------------------------");
            }
            
            else if(player.get(i).getPosition()==51)
            {
				System.out.println("--------------------------------------------------------------");
				System.out.println("                   There is a Ladder at 51 ");
				int positn = player.get(i).getPosition();
				positn = positn+22;
				player.get(i).setPosition(positn);
				System.out.println("                "+player.get(i).getPlayer()+" : "+player.get(i).getColor()+" climbs to "+player.get(i).getPosition());
				System.out.println("--------------------------------------------------------------");
            }
            
            else if(player.get(i).getPosition()==71)
            {
				System.out.println("--------------------------------------------------------------");
				System.out.println("                   There is a Ladder at 71 ");
				int positn = player.get(i).getPosition();
				positn = positn+21;
				player.get(i).setPosition(positn);
				System.out.println("                "+player.get(i).getPlayer()+" : "+player.get(i).getColor()+" climbs to "+player.get(i).getPosition());
				System.out.println("--------------------------------------------------------------");
            }

            else if(player.get(i).getPosition()==80)
            {
				System.out.println("--------------------------------------------------------------");
				System.out.println("                   There is a Ladder at 80 ");
				int positn = player.get(i).getPosition();
				positn = positn+19;
				player.get(i).setPosition(positn);
				System.out.println("                "+player.get(i).getPlayer()+" : "+player.get(i).getColor()+" climbs to "+player.get(i).getPosition());
				System.out.println("--------------------------------------------------------------");
            }
		}
	}
}
