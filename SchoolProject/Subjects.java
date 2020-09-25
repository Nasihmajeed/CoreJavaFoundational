public class Subjects
{
    int sub1;
    int sub2;
    int sub3;
    int total;
    int percentage;
    int i;
    public void Subjectsmark()
    {
    	for(i=0;i<=3;i++)
    	{
    		System.out.println(" Mark scored for 1st Subject : "+sub1);
    		System.out.println(" Mark scored for 2nd Subject : "+sub2);
    		System.out.println(" Mark scored for 3rd Subject : "+sub3);	
    	}
    }
    public void Total()
    {
    	for(i=0;i<=3;i++)
    	{
    		total=sub1+sub2+sub3;
    		System.out.println(" Total is   : "+total);
    	}
    }
    public void Percentage()
    {
    	for(i=0;i<=3;i++)
    	{ 
    		percentage=total/3;
            System.out.println(" Percentage is   : "+percentage);
            if(percentage<35)
            {
            	System.out.println("               The person is FAIL                ");
            }
            else
            {
            	System.out.println("               The person is PASS                ");
            }
    	}
    }
    public void Topper()
    {   
    	float top = percentage;
    	String name = null;
    	for(i=0;i<=3;i++)
    	{   
    		if(percentage<top)
    		{
              top = percentage;
              name = getName();
    		}
    	}
    	System.out.println(" Highest Mark Scored By :"+name);
    	System.out.println(" Percentage is          :"+top);
    }
    public void ClassTeacherofthetopper(String name)
    {
     System.out.print(" Toppers Class Teacher Name is : "+name);
    }
}