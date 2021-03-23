public class TDD
{
public static void main(String[] args) 
{

School school1=new School();
school1.schoolDisplay();	

Student student1=new Student();
Student student2=new Student();
Student student3=new Student();

List<Student> students=new ArrayList<Student>();
students.add(student1);
students.add(student2);
students.add(student3);


Standard standard=new Standard();
standard.studentStandard();

Teacher teacher=new Teacher();
teacher.teacherDetails();
teacher.studentDetails();


}
}