public class TDD
{
public static void main(String[] args)
{

School school1=new School();
school1.schoolDisplay();	

//creating 3 student objects 	
Student s[ ]=new Student[3];
s[0]=new Student();
s[1]=new Student();
s[2]=new Student();

//class in which he/she studies
Standard standard=new Standard();
standard.studentStandard();

//marks of 3 subjects of student 1
s[0].physics=55;
s[0].chemistry=60;
s[0].maths=65.5;
s[0].totalMarks();

//marks of 3 subjects of student 1
s[1].physics=30;
s[1].chemistry=70;
s[1].maths=85.5;
s[1].totalMarks();

//marks of 3 subjects of student 1
s[2].physics=95;
s[2].chemistry=90;
s[2].maths=98;
s[2].totalMarks();


Teacher teach=new Teacher();
teach.teacherDetails();
teach.topperDetails();


	
}
}