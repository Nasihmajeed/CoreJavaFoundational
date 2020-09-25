public class Students
{

   String name;
   int regno,i;
   
     public void setName(String n)
     {  
      for(i=0;i<=3;i++)
       {
       	name=n;
       }
       
     }
     public String getName()
     {
      for(i=0;i<=3;i++)
      {
      	System.out.println(" Name of the Student is  :"+name);
      }
      return name; 
     }

      public void setRegisternumber(int r)
      {
      	for(i=0;i<=3;i++)
  		{
         regno = r;
  		}
      }

      public int getRegisternumber()
      {
      	for(i=0;i<=3;i++)
      	{
      		System.out.println(" Register number of the Student is  :"+regno);
      	}
      	return regno; 
      }        
}
