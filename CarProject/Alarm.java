class Alarm
{
int minuteSnooze=12;
//String delay="Delay";

	public void coffeeMaker(String d)
	{
		String msg=d;

		if(msg=="Delay")
		{
			System.out.println("Hey,the geek's sleeping again"+d+"the coffee for "+minuteSnooze+".");
			motorolaToaster(msg);

		}
	}

	public void motorolaToaster(String msg)
	{

	if(msg=="Delay")
		{	System.out.println("Hold the Toast");
			//String call="Call";
			nokiaNavigator("call bob,we are running late");
			wirelessCollar("Get the paper, don't except a walk");
		}

	

	}
	public void wirelessCollar(String signal)
	{

		System.out.println(signal);

	}
	public void	nokiaNavigator(String call)
	{
	System.out.println(call);
	}
	
	
}


class TestA
{
public static void main(String [] args)
{
Alarm a=new Alarm();
a.coffeeMaker("Delay");
}
}