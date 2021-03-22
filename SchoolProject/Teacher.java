import java.util.Scanner;
class Teacher{
	
	String TeacherName;
	public String teacherName(){
		Scanner sc= new Scanner(System.in);
	    System.out.println("ENTER TEACHER'S NAME  :");
		String TeacherName= sc.nextLine();
		
		return TeacherName;
}
		public void PassOrFail(Student s[][], Marks m[][], Teacher t[]){
			for(int i=0;i<2;i++){
				System.out.println("***********************************************");
				System.out.println(t[i].TeacherName+" teacher's computation");
				System.out.println("***********************************************");
				for(int j=0;j<2;j++){
					if(m[i][j].english>30){
						System.out.println(s[i][j].StudentName+" has passed in ENGLISH");
					}
					else
						System.out.println(s[i][j].StudentName+" has failed in ENGLISH");
					if(m[i][j].maths>30){
						System.out.println(s[i][j].StudentName+" has passed in MATHS");
					}
					else
						System.out.println(s[i][j].StudentName+" has failed in MATHS");
					if(m[i][j].science>30){
						System.out.println(s[i][j].StudentName+" has passed in SCIENCE");
					}
					else
						System.out.println(s[i][j].StudentName+" has failed in SCIENCE");
				}
			}
				
					
		}
}