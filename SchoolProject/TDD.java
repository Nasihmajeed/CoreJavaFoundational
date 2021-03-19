import java.util.Arrays;
class TDD{
	public static void main(String[] args){
		School sh= new School();
		Teacher t=new Teacher();
		Marks[] m= new Marks[3];
		Student[] s= new Student[3];
		m[0]=new Marks();
		m[1]=new Marks();
		m[2]=new Marks();
		s[0]=new Student();
		s[1]=new Student();
		s[2]=new Student();
		sh.SchoolDetails();
		t.TeacherName=t.teacherName();
		s[0].StudentName=s[0].Input();
		m[0].english=m[0].English();
		m[0].maths=m[0].Maths();
		m[0].science=m[0].Science();
		m[0].total=m[0].Total();
		s[1].StudentName=s[1].Input();
		m[1].english=m[1].English();
		m[1].maths=m[1].Maths();
		m[1].science=m[1].Science();
		m[1].total=m[1].Total();
		s[2].StudentName=s[2].Input();
		m[2].english=m[2].English();
		m[2].maths=m[2].Maths();
		m[2].science=m[2].Science();
		m[2].total=m[2].Total();
		
		System.out.println("TEACHER'S NAME IS : "+t.TeacherName);
		System.out.println("FIRST STUDENT IS :"+s[0].StudentName);
		System.out.println("MARKS IN ENGLISH :"+m[0].english);
		System.out.println("MARKS IN SCIENCE :"+m[0].science);
        System.out.println("MARKS IN MATHS   :"+m[0].maths);
		System.out.println("TOTAL MARKS OF   :"+s[0].StudentName+" IS " +m[0].total);
		System.out.println("SECOND STUDENT IS:"+s[1].StudentName);
		System.out.println("MARKS IN ENGLISH :"+m[1].english);
		System.out.println("MARKS IN SCIENCE :"+m[1].science);
        System.out.println("MARKS IN MATHS   :"+m[1].maths);
		System.out.println("TOTAL MARKS OF   :"+s[1].StudentName+" IS " +m[1].total);
		System.out.println("THIRD STUDENT IS :"+s[2].StudentName);
		System.out.println("MARKS IN ENGLISH :"+m[2].english);
		System.out.println("MARKS IN SCIENCE :"+m[2].science);
        System.out.println("MARKS IN MATHS   :"+m[2].maths);
		System.out.println("TOTAL MARKS OF   :"+s[2].StudentName+" IS " +m[2].total);
		
		
		}
}