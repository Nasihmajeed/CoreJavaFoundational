package resources;

public class DisplayUtility
{
  
	public void sleepThread()
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