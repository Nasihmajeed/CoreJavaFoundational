public class Standard
{
	String standard;
	
	String classTopper;	
	
	ClassTeacher c=new ClassTeacher();
	
	
	
	//classTopper=topper.topperName;
	
	public void displayStandard()
	{	System.out.println("-------------------");
		System.out.println(standard+" th Standard");
		System.out.println("-------------------");
	}
	
	public void findClassToppers()
	{	
		System.out.println("-------------------");
		System.out.println("Topper of class :"+standard+" classTopper: "+classTopper);
		
		
		
		
		
	}
	
	
	
	
	
}