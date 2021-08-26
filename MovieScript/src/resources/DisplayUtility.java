package resources;

public class DisplayUtility
{
  
	public void pauseScreen()
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