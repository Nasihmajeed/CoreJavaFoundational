import java.util.Arrays;
class TDDcheck{
	float largest;
	public static void main(String[] args){
		
		School sh= new School();
		School [] st= new School[3];
		Teacher[] t=new Teacher[3];
		Marks[] m= new Marks[3];
		Student[] s= new Student[3];
		m[0]=new Marks();
		m[1]=new Marks();
		m[2]=new Marks();
		s[0]=new Student();
		s[1]=new Student();
		s[2]=new Student();
		st[0]=new School();
		st[1]=new School();
		st[2]=new School();
		sh.SchoolDetails();
		st[0].std=8;
		st[1].std=9;
		st[2].std=10;
		t[0]=new Teacher();
		t[1]=new Teacher();
		t[2]=new Teacher();
        
		for(int i=0;i<3;i++){
		t[i].TeacherName=t[i].teacherName();
		
		for(int j=0;j<3;j++){
		s[j].StudentName=s[j].Input();
		m[j].english=m[j].English();
		m[j].maths=m[j].Maths();
		m[j].science=m[j].Science();
		m[j].total=m[j].Total();
		
		}
		}
		for(int i=0;i<3;i++){
		System.out.println("STANDARD IS : "+st[i].std);
		System.out.println("TEACHER'S NAME IS : "+t[i].TeacherName);
		
		for(int j=0;j<3;j++){
		System.out.println(" STUDENT IS :"+s[j].StudentName);
		System.out.println("MARKS IN ENGLISH :"+m[j].english);
		System.out.println("MARKS IN SCIENCE :"+m[j].science);
        System.out.println("MARKS IN MATHS   :"+m[j].maths);
		System.out.println("TOTAL MARKS IS   :"+m[j].total);
		}
		}
		
		
		
		
		
		}
}