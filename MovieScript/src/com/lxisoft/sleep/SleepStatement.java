public class SleepStatement
{
	

public void SleepThread()
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