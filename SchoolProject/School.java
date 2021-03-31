public class School
{
String schoolName,schoolTopperName;

float large; 

Scanner sr=new Scanner(System.in);

Standard[] std=new Standard[3];

        public void init()
		{
		std[0]=new Standard();
		std[1]=new Standard();
		std[2]=new Standard();
		}

	public void schoolName()
	{	
		System.out.println("Enter the name of your School ");
		schoolName=sr.nextLine();
		System.out.println("Name of your school is : "+schoolName);
	}

	public void displayAllDetails()
	{		
		init();
		std[0].setStandard();	
		std[0].setStudent();
		std[0].displayStandard();
		std[0].classTopperCheck();
		
		std[1].setStandard();
		std[1].setStudent();
	    std[1].displayStandard();
        std[1].classTopperCheck();
		
		std[2].setStandard();
		std[2].setStudent();
	    std[2].displayStandard();
        std[2].classTopperCheck();
	}
   public void schoolTopper()
	{	
		large=std[0].topMarks;
		
		if(std[1].topMarks>large)
		{
			large=std[1].topMarks;
			
			System.out.println("School Topper :"+std[1].classTopper+" with "+large);
		}
		else if(std[2].topMarks>large)
		{
			large=std[2].topMarks;
			System.out.println("School Topper :"+std[2].classTopper+" with "+large);
		}
		else 
		{
			System.out.println("School Topper :"+std[0].classTopper+" with "+large);
		}
	}
}