import java.util.Scanner;
public class Classroom
{
	String teacher;
	int n,i,division1,division2;
	float top=0,topper=0;

    	Students[] st1 = new Students[3];
    	Students[] st2 = new Students[3];
    	Subjects[] sb1 = new Subjects[3];
    	Subjects[] sb2 = new Subjects[3];
    	public void setstudentdetails1()
    {
    	System.out.println("          ENTER THE DETAILS OF CLASS          ");

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the name of 1st Class teacher : ");
        teacher=scanner.next();
        System.out.println(" Enter the 1st Class teachers division : ");
        division1=scanner.nextInt();
        for(i=0;i<=3;i++)
        {
        	st1[i] = new Students();
        	sb1[i] = new Subjects();
      	    System.out.println(" \n           ENTER THE STUDENT DETAILS          ");

    	    System.out.println(" Enter the Name of 1st Class teachers Student : ");
    	    String name1 =scanner.next();
    	    System.out.println(" Enter the Students Reg no : ");
    	    int regno1 =scanner.nextInt();
    	    System.out.println(" Enter the mark of 1st Subject of the Student : ");
    	    sb1[i].sub1 =scanner.nextInt();
    	    System.out.println(" Enter the mark of 2nd Subject of the Student : ");
    	    sb1[i].sub2 =scanner.nextInt();
    	    System.out.println(" Enter the mark of 3rd Subject of the Student : ");
    	    sb1[i].sub3 =scanner.nextInt();
    	    st1[i].setName1(name1);
            st1[i].setRegisternumber1(regno1);
            st1[i].getName1();
            st1[i].getRegisternumber1();
        }
    }
        public void setstudentdetails2()
        {
        	System.out.println("          ENTER THE DETAILS OF CLASS          ");
        	Scanner scanner = new Scanner(System.in);
        	System.out.println(" Enter the name of 2nd Class teacher : ");
            teacher=scanner.next();    	
            System.out.println(" Enter the 2nd Class teachers division : ");
            division2=scanner.nextInt();
            for(i=0;i<=3;i++)
            {
            	st2[i] = new Students();
        	    sb2[i] = new Subjects();
        	    System.out.println(" Enter the Name of the 2nd Class teachers  Student : ");
    	        String name2 =scanner.next();
    	    	System.out.println(" Enter the Students Reg no : ");
    	    	int regno2 =scanner.nextInt();
    	    	System.out.println(" Enter the mark of 1st Subject of the Student : ");
    	    	sb2[i].sub1 =scanner.nextInt();
    	    	System.out.println(" Enter the mark of 2nd Subject of the Student : ");
    	    	sb2[i].sub2 =scanner.nextInt();
    	    	System.out.println(" Enter the mark of 3rd Subject of the Student : ");
    	    	sb2[i].sub3 =scanner.nextInt(); 
            	st2[i].setName2(name2);
            	st2[i].setRegisternumber2(regno2);
            	st2[i].getName2();
            	st2[i].getRegisternumber2();
            }
        }
        public void getstudentdetails1()
        {
        	System.out.println("           DETAILS OF 1ST CLASS          ");

        	for(i=0;i<=3;i++)
        	{
        		System.out.println(" Mark scored for 1st Subject : "+sb1[i].sub1);
    			System.out.println(" Mark scored for 2nd Subject : "+sb1[i].sub2);
    			System.out.println(" Mark scored for 3rd Subject : "+sb1[i].sub3);
    	    	sb1[i].total=sb1[i].sub1+sb1[i].sub2+sb1[i].sub3;
    			System.out.println(" Total is   : "+sb1[i].total);
    			sb1[i].percentage=sb1[i].total/3;
            	System.out.println(" Percentage is   : "+sb1[i].percentage);
            	if(sb1[i].percentage<35)
             {
            	System.out.println("               The person is FAIL                ");
             }
            	else
             {
            	System.out.println("               The person is PASS                ");
             }
        	}	
        }


             public void getstudentdetails2()
        {
        	System.out.println("           DETAILS OF 2ST CLASS          ");

        	for(i=0;i<=3;i++)
        	{
        		System.out.println(" Mark scored for 1st Subject : "+sb2[i].sub1);
    			System.out.println(" Mark scored for 2nd Subject : "+sb2[i].sub2);
    			System.out.println(" Mark scored for 3rd Subject : "+sb2[i].sub3);
    	    	sb2[i].total=sb2[i].sub1+sb2[i].sub2+sb2[i].sub3;
    			System.out.println(" Total is   : "+sb2[i].total);
    			sb2[i].percentage=sb2[i].total/3;
            	System.out.println(" Percentage is   : "+sb2[i].percentage);
            	if(sb1[i].percentage<35)
             {
            	System.out.println("               The person is FAIL                ");
             }
            	else
             {
            	System.out.println("               The person is PASS                ");
             }
        	}	
        }
            public void topper1()
            {
            	float top=0;
            	String name=null;
            	System.out.println("           TOPPER OF 1ST CLASS          ");
            	for(i=0;i<=3;i++)
            	{
            		if(sb1[i].percentage >= top)
    		     {
                    top = sb1[i].percentage;
                    name = st1[i].getName1();
    		     }
            	}
            	  System.out.println(" Highest Mark Scored in 1st Class By :"+name);
    	          System.out.println(" Percentage is          :"+top);
            }
             public void topper2()
            {
            	float top=0;
            	String name=null;
            	System.out.println("   \n        TOPPER OF 2ST CLASS          ");
            	for(i=0;i<=3;i++)
            	{
            		if(sb2[i].percentage >= top)
    		     {
                    top = sb2[i].percentage;
                    name = st2[i].getName2();
    		     }
            	}
            	  System.out.println(" Highest Mark Scored in 2nd Class By :"+name);
    	          System.out.println(" Percentage is          :"+top);
            }
             public void schooltopper()
            {
            	System.out.println("   \n        TOPPER OF THE SCHOOL         ");
            	if(topper > top)
    	     {
    		 System.out.println(" The Topper of the School is from 1st Class ");
    	     }
    	        else 
    	     {
    		 System.out.println(" The Topper of the school is from 2nd Class ");
    	     }
            }
             public void teacher(String name)
            {
              System.out.println("   \n        CLASS TEACHER OF THE TOPPER           ");
              System.out.println(" Toppers Class Teacher Name is : "+name);
              System.out.println(" \n ");
            }    
}

            
	
