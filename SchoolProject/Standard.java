public class Standard
{
	String standard;
	
	String classTopper;	
	
	int i;
	
	ClassTeacher c=new ClassTeacher();
	Student s=new Student();  
	ArrayList<Student> st=new ArrayList<Student>();
	
	st.add(s);
	
	/*s[0]=new Student();
	s[1]=new Student();
	s[2]=new Student();*/
	
	
	
	//classTopper=topper.topperName;


	public void setStudent(String studentName)
	{
		
			s.setName(studentName);
		
	}
	public void setStudentMarks(float maths,float science,float english)
	{
		s.setMarks(maths,science,english);
		
	}
	

	


	public void displayStandard()
	{	System.out.println("-------------------");
		System.out.println(standard+" th Standard");
		System.out.println("-------------------");
		s.displayStudentDetails(s);
		c.checkMarks(s);
			
		
		
			
		
	}
	
	public void findClassToppers()
	{	
		System.out.println("-------------------");
		//classTopper=s.topper(Student s[]);
		System.out.println("Topper of class :"+standard+" classTopper: "+classTopper);
		
		
		
		
		
	}
	
	
	
	
	
}