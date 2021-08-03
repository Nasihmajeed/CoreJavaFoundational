package com.lxisoft.resources;

public class DisplayUtility
{
	public void sleepStatement()
     {
        try{
              Thread.sleep(2000);
               }
        catch(InterruptedException e)
            {
          Thread.currentThread().interrupt();
            }
     }
	
}