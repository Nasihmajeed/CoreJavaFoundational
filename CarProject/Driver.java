public class Driver
{
	boolean isOwnerHasLicense=true;
	public void checkLicense()
	{
		if(isOwnerHasLicense==true)
		{
			System.out.println("Owner can drive");	
		}
		else
		{
			System.out.println("only driver  can drive");	
		}
	}	
	
}