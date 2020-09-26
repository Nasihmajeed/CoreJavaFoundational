public class Students
{

   String name,nam;
   int regno;
   int sub1;
   int sub2;
   int sub3;
   int total;
   int percentage;
   int i;

   
     public void setName1(String n)
     {  
       {
       	name=n;
       }
       
     }
     public String getName1()
     {

      {
      	System.out.println(" Name of the Student is  :"+name);
      }
      return name; 
     }

      public void setRegisternumber1(int r)
      {
  		{
         regno = r;
  		}
      }

      public int getRegisternumber1()
      {
      	{
      		System.out.println(" Register number of the Student is  :"+regno);
      	}
      	return regno; 
      }    

    public void Subjectsmarktotalpercentagetopper1()
     { 
    	    Subjects[] sb1 = new Subjects[3];
    		sb1[i]=new Subjects();
    		System.out.println(" Mark scored for 1st Subject : "+sub1);
    		System.out.println(" Mark scored for 2nd Subject : "+sub2);
    		System.out.println(" Mark scored for 3rd Subject : "+sub3);
    	    total=sub1+sub2+sub3;
    		System.out.println(" Total is   : "+total);
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
      	    float top = 0;
    	    String name =null;
    	    for(i=0;i<=3;i++)
    	    {   
    		if(percentage>=top)
    		{
              top = percentage;
              name = getName1();
    		}
    	    }
    	System.out.println(" Highest Mark Scored in 1st Class By :"+name);
    	System.out.println(" Percentage is          :"+top);
    }
  



     public void setName2(String n)
     {  
       	nam=n;
     }
     public String getName2()
     {

      {
      	System.out.println(" Name of the Student is  :"+nam);
      }
      return nam; 
     }

      public void setRegisternumber2(int r)
      {
         regno = r;
      }
      public int getRegisternumber2()
      {
      		System.out.println(" Register number of the Student is  :"+regno);
      	return regno; 
      }    
    public void Subjectsmarktotalpercentagetopper2()
    {
    	    Subjects[] sb2 = new Subjects[3];
    		sb2[i]=new Subjects();
    		System.out.println(" Mark scored for 1st Subject : "+sub1);
    		System.out.println(" Mark scored for 2nd Subject : "+sub2);
    		System.out.println(" Mark scored for 3rd Subject : "+sub3);	
      		total=sub1+sub2+sub3;
    		System.out.println(" Total is   : "+total);
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
    	    float top = 0;
     	    String name =null;
    	  	for(i=0;i<=3;i++)
    	    {
    		if(percentage>=top)
    		{
              top = percentage;
              name = getName2();
    		}
            }
    	    System.out.println(" Highest Mark Scored  in 2nd Class By :"+nam);
    	    System.out.println(" Percentage is          :"+top);
    }
   
    public void Topperoftheschool()
    {
    	float topper = 0;
    	float top = 0;
    	if(topper > top)
    	{
    		System.out.println(" The Topper of the School is from 1st Class and his name is "+name);
    	}
    	else 
    	{
    		System.out.println(" The Topper of the school is from 2nd Class and his name is " +nam);
    	}
    }

     public void ClassTeacherofthetopper(String name)
    {
     System.out.println(" Toppers Class Teacher Name is : "+name);
     System.out.println(" \n ");
    }    
}
