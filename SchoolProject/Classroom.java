public class Classroom
{
	int std;
	String div;
	Student student=new Student(12,"ninu");
	Teacher	teacher=new Teacher("riya",34);
	public Classroom(int clStd,String clDiv)
	{
		std=clStd;
		div=clDiv;
	}
	public void print()
	{
		
		System.out.println("------------");
		System.out.println("standard:-"+std);
		System.out.println("division:-"+div);
		teacher.print();
		student.print();
	}
}