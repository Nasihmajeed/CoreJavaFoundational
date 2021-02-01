package com.LxiSoft.Game;
// import com.LxiSoft.Game.*;
import java.util.*;

public class Snake 
{
    public void bite(ArrayList<Players> player)
    {
        for(int j=0; j<player.size(); j++)
        {
            if(player.get(j).getPosition()==47)
            {
				System.out.println("--------------------------------------------------------------");
				System.out.println("                   There is a snake at 47 ");
                int place = player.get(j).getPosition();
                
				player.get(j).setPosition(26);
				System.out.println("                "+player.get(j).getPlayer()+" : "+player.get(j).getColor()+" goes down "+player.get(j).getPosition());
				System.out.println("--------------------------------------------------------------");
            }
            
            else if(player.get(j).getPosition()==49)
            {
				System.out.println("--------------------------------------------------------------");
				System.out.println("                   There is a Snake at 49 ");
				int place = player.get(j).getPosition();
				
				player.get(j).setPosition(11);
				System.out.println("                "+player.get(j).getPlayer()+" : "+player.get(j).getColor()+" goes down "+player.get(j).getPosition());
				System.out.println("--------------------------------------------------------------");
            }
            
            else if(player.get(j).getPosition()==58)
            {
				System.out.println("--------------------------------------------------------------");
				System.out.println("                   There is a Snake at 58 ");
				int place = player.get(j).getPosition();

                player.get(j).setPosition(41);
				System.out.println("                "+player.get(j).getPlayer()+" : "+player.get(j).getColor()+" goes down "+player.get(j).getPosition());
				System.out.println("--------------------------------------------------------------");
            }
            
            else if(player.get(j).getPosition()==61)
            {
				System.out.println("--------------------------------------------------------------");
				System.out.println("                   There is a Snake at 61 ");
				int place = player.get(j).getPosition();

                player.get(j).setPosition(19);
				System.out.println("                "+player.get(j).getPlayer()+" : "+player.get(j).getColor()+" goes down "+player.get(j).getPosition());
				System.out.println("--------------------------------------------------------------");
            }
            
            else if(player.get(j).getPosition()==86)
            {
				System.out.println("--------------------------------------------------------------");
				System.out.println("                   There is a Snake at 86 ");
				int place = player.get(j).getPosition();
				
				player.get(j).setPosition(24);
				System.out.println("                "+player.get(j).getPlayer()+" : "+player.get(j).getColor()+" goes down "+player.get(j).getPosition());
				System.out.println("--------------------------------------------------------------");
            }
            
            else if(player.get(j).getPosition()==93)
            {
				System.out.println("--------------------------------------------------------------");
				System.out.println("                   There is a Snake at 93 ");
				int place = player.get(j).getPosition();

                player.get(j).setPosition(73);
				System.out.println("                "+player.get(j).getPlayer()+" : "+player.get(j).getColor()+" goes down "+player.get(j).getPosition());
				System.out.println("--------------------------------------------------------------");
            }
            
            else if(player.get(j).getPosition()==95)
            {
				System.out.println("--------------------------------------------------------------");
				System.out.println("                   There is a Snake at 95 ");
				int place = player.get(j).getPosition();

                player.get(j).setPosition(75);
				System.out.println("                "+player.get(j).getPlayer()+" : "+player.get(j).getColor()+" goes down "+player.get(j).getPosition());
				System.out.println("--------------------------------------------------------------");
            }

            else if(player.get(j).getPosition()==98)
            {
				System.out.println("--------------------------------------------------------------");
				System.out.println("                   There is a Snake at 98 ");
				int place = player.get(j).getPosition();

                player.get(j).setPosition(78);
				System.out.println("                "+player.get(j).getPlayer()+" : "+player.get(j).getColor()+" goes down "+player.get(j).getPosition());
				System.out.println("--------------------------------------------------------------");
            }
		}
	}
}
