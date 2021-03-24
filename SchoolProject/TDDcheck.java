import java.util.Arrays;
class TDDcheck{
	float largest;
	public static void main(String[] args){
		
		School sh= new School();
		School [] st= new School[3];
		Teacher[] t=new Teacher[3];
		Marks[][] m= new Marks[3][3];
		Student[][] s= new Student[3][3];
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				m[i][j]=new Marks();
				s[i][j]=new Student();
			}
		}
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
		s[i][j].StudentName=s[i][j].Input();
		m[i][j].english=m[i][j].English();
		m[i][j].maths=m[i][j].Maths();
		m[i][j].science=m[i][j].Science();
		m[i][j].total=m[i][j].Total();
		
		}
		}
		for(int i=0;i<3;i++){
		System.out.println("STANDARD IS : "+st[i].std);
		System.out.println("TEACHER'S NAME IS : "+t[i].TeacherName);
		
		for(int j=0;j<3;j++){
		System.out.println(" STUDENT IS :"+s[i][j].StudentName);
		System.out.println("MARKS IN ENGLISH :"+m[i][j].english);
		System.out.println("MARKS IN SCIENCE :"+m[i][j].science);
        System.out.println("MARKS IN MATHS   :"+m[i][j].maths);
		System.out.println("TOTAL MARKS IS   :"+m[i][j].total);
		}
		}
	t[0].PassOrFail(s,m,t);
	t[0].classTopper(m,st,s);
	st[0].schoolTopper(m,s);	
		
		
		
		
		}
}