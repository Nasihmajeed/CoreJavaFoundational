public class Classroom
{
	String division;
	int strength;
	Teacher teacher=new Teacher("manju");
	Students student=new Students("sharath",1);
	
	public Classroom(String div,int stren)
	{
		division=div;
		strength=stren;
	}
	
	public void printdetail()
	{
		
		System.out.println("div :"+division);
		System.out.println("strength :"+strength);
		teacher.printdetail();
		student.printdetail();
	}

}