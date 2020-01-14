class Tdd
{
	public static void main(String args[])
	{
		School s = new School();
		s.name = "ABC";
		ClassRoom r1 = new ClassRoom();
		r1.nameOfTeacher = "divya";
		r1.noOfstudents = 25;
		
		s.cr1 = r1;
		System.out.println(s.cr1.nameOfTeacher);
		System.out.println(s.cr1.noOfstudents);
		
		ClassRoom r2 = new ClassRoom();
		r2.noOfstudents = 35;
		r2.nameOfTeacher = "Maya";
		
		s.cr2 = r2;
		System.out.println(s.cr2.nameOfTeacher);
		System.out.println(s.cr2.noOfstudents);
		
		
		
		
	}
}