
package com.lxisoft.ui_elements ;

public class ConsoleElements
{
	public static void clearScreen()
	{
		try
		{	
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		}

		catch(Exception E)
		{
			System.out.println(E);
		}	
	}

	public static void delayPrintTime(int time)
	{
		try
        {
            Thread.sleep(time);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
	}
}