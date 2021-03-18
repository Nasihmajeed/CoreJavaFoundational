public class Driver
{
	boolean license;
	public void checkLicense(boolean lic)
	{
		if(license==lic)
		{
			System.out.println("Driver is eligible to drive the car");
		}
		else
		{
			System.out.println("Driver is not at all eligible to drive the car");
		}
	}
}