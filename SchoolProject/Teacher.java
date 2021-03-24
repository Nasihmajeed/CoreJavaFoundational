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
			for(int i=0;i<3;i++){
				System.out.println("***********************************************");
				System.out.println(t[i].TeacherName+" teacher's computation");
				System.out.println("***********************************************");
				for(int j=0;j<3;j++){
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
		
		
		public void classTopper(Marks m[][], School st[], Student s[][]){
			float largest1;
			String topperName1=s[0][0].StudentName, topperName2=s[1][0].StudentName,topperName3=s[2][0].StudentName;
			
			largest1=m[0][0].total;
			for( int j=0; j<3;j++){
				if(m[0][j].total>largest1){
					largest1=m[0][j].total;
					topperName1=s[0][j].StudentName;
				}
				}
			System.out.println("*********************************************");
			System.out.println("*********************************************");
			System.out.println("TOPPER IN CLASS"+st[0].std+" is "+ topperName1);
		
		float largest2;
			largest2=m[1][0].total;
			for(int j=0; j<3;j++){
				if(m[1][j].total>largest2){
					largest2=m[1][j].total;
					topperName2=s[1][j].StudentName;
				}
				}
			System.out.println("TOPPER IN CLASS "+st[1].std+" is "+ topperName2);
		float largest3;
			largest3=m[2][0].total;
			for(int j=0; j<3;j++){
				if(m[2][j].total>largest3){
					largest3=m[2][j].total;
					topperName3=s[2][j].StudentName;
				}
				}
			System.out.println("TOPPER IN CLASS "+st[2].std+" is "+ topperName3);
		}
}