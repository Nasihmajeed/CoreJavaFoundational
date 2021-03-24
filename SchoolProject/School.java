public class School
{
String schoolName;

float large; //for printing the large marks



Standard[] x=new Standard[3];


	public void schoolName(String schoolName)
	{	
		this.schoolName=schoolName;
		System.out.println("The School name is: "+schoolName);
	}

	public void examinationResults()
	{
		
		
		
		x[0]=new Standard();
		x[1]=new Standard();
		x[2]=new Standard();
		
		
		x[0].setStandard();
		
		x[0].setStudent();
		
		
	
		 x[0].displayStandard();

		x[0].findClassToppers();
		
		
		//Class 9
		
		
		x[1].setStandard();
		
		x[1].setStudent();
		
		
	
		 x[1].displayStandard();

		x[1].findClassToppers();
		
		
		//class 8
		
		
		x[2].setStandard();
		
		x[2].setStudent();
		
		
	
		 x[2].displayStandard();

		x[2].findClassToppers();
		
		
		
	
	
		
	}


	public void schoolTopper()
	{	System.out.println("----------School  Topper --------------");
		large=x[0].topMarks;
		
		if(x[1].topMarks>large)
		{
			large=x[1].topMarks;
			
			System.out.println("School Topper :"+x[1].classTopper+" with "+large);
		}
		else if(x[2].topMarks>large)
		{
			large=x[2].topMarks;
			System.out.println("School Topper :"+x[2].classTopper+" with "+large);
		}
		else{
			System.out.println("School Topper :"+x[0].classTopper+" with "+large);
		}
	}

}