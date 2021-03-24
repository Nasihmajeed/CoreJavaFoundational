import java.util.List;
import java .util.ArrayList;

public class Call
{
	public void execute()
	{
Student student1=new Student();
Student student2=new Student();
Student student3=new Student();

Standard standard=new Standard();

List<Student> students=new ArrayList<Student>();

students.add(student1);
students.add(student2);
students.add(student3);

students.get(0).studentName();
students.get(0).studentMarks();
standard.studentStandard();

students.get(1).studentName();
students.get(1).studentMarks();
standard.studentStandard();

students.get(2).studentName();
students.get(2).studentMarks();
standard.studentStandard();
	}
	
public void details()
{

Teacher teacher=new Teacher();
teacher.teacherName();
teacher.totalMarks();
}

}