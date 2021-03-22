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
		
		
		public void classTopper(Marks m[][], School st[], Student s[][]){
			float largest1;
			String topperName1="", topperName2="",topperName3="";
			int i,j;
			largest1=m[0][0].total;
			for(i=0,j=0; j<3;j++){
				if(m[i][j].total>largest1){
					largest1=m[i][j].total;
					topperName1=s[i][j].StudentName;
				}
				}
			System.out.println("TOPPER IN CLASS"+st[i].std+" is "+ topperName1);
		
		float largest2;
			largest2=m[1][0].total;
			for(i=1,j=0; j<3;j++){
				if(m[i][j].total>largest2){
					largest2=m[i][j].total;
					topperName2=s[i][j].StudentName;
				}
				}
			System.out.println("TOPPER IN CLASS "+st[i].std+" is "+ topperName2);
		float largest3;
			largest3=m[2][0].total;
			for(i=2,j=0; j<3;j++){
				if(m[i][j].total>largest3){
					largest3=m[i][j].total;
					topperName3=s[i][j].StudentName;
				}
				}
			System.out.println("TOPPER IN CLASS "+st[i].std+" is "+ topperName3);
		}
}