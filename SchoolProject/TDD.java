class TDD
{
	public static void main(String [] args)
	{
		Standard x=new Standard();
		
		
	Student []s =new Student[3];
		s[0]=new Student();
		s[1]=new Student();
		s[2]=new Student();
		
	
	
	

		//student details of class 10
		
		System.out.println("-------------------");
		s[0].studentName="Abhi";
		s[0].maths=50;
		s[0].english=55;
		s[0].science=40;

		//display marks
		s[0].display(s[0]);
		
		//total marks
		s[0].marksTotal();
		
		System.out.println("-------------------");
		
		
		System.out.println("-------------------");
		s[1].studentName="Sankar";
		s[1].maths=51;
		s[1].english=65;
		s[1].science=20;

		//display marks
		s[1].display(s[1]);
		
		//total marks
		s[1].marksTotal();
		
		System.out.println("-------------------");
		
		
		s[2].studentName="Yuvraj";
		s[2].maths=90;
		s[2].english=45;
		s[2].science=80;
System.out.println("-------------------");
		//display marks
		s[2].display(s[2]);
		
		//total marks
		s[2].marksTotal();
		
		System.out.println("-------------------");
		
		//classTeacher details
		ClassTeacher c=new ClassTeacher();
		c.classTeacherName="Smitha";
		System.out.println("-------------------");
		c.classTeacherDisplay();
		
		System.out.println("-------------------");
		//check passed or failed for student 1
		c.checkMarks(s[0]);
		
		System.out.println("-------------------");
		//check passed or failed for student 2
		c.checkMarks(s[1]);
		
		System.out.println("-------------------");
		//check passed or failed for student 2
		c.checkMarks(s[2]);
		
		
		System.out.println("-------------------");
		// find Topper
		
	String classTopper=c.topper(s);
		
		x.classTopper=classTopper;
		x.standard="X";
		x.findClassToppers();
		
		
		
		
	
	
			
		



	}
}