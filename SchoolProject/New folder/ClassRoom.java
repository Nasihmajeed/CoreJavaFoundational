import java.util.Scanner;

public class ClassRoom
{
	Student[] students;
	Teacher teacher;
	String classNo;
	


	Scanner myObj=new Scanner(System.in);
	

	public void classRoomDetalis()
	{

		

		System.out.println("Enter count of students");
		int studentscount=Integer.parseInt(myObj.nextLine());

		students=new Student[studentscount];
		
		
		

		for(int i=0;i<students.length;i++)
		{
			students[i]=new Student();
		}


		teacher=new Teacher();
		
		System.out.println("Enter classno");
		classNo=myObj.nextLine();
		

		teacher.teacherDeatails();
		
		for(int i=0;i<students.length;i++)
		{
			students[i].studentDetails();
		}


		for(int i=0;i<students.length;i++)
		{
			students[i].printTotalMarks();
		}
		
		
	}

	public void printClassnumber()
	{
		System.out.println(".............................");
		System.out.println(".............................");
		System.out.println("The class number is"+classNo);



		for(int i=0;i<students.length;i++)
		{

			students[i].printStudentDetails();
			students[i].printPercentage();
			students[i].printResultOfStudents();
		}

		

			
		}


		public void printRankDetails()
	{
		System.out.println("THE RANKLIST");
			for(int i=0;i<students.length;i++)
			{
				for(int j=i+1;j<students.length;j++)
				{
					

					if(students[i].total<students[j].total)
					{
							Student temp=students[i];
							students[i]=students[j];
							students[j]=temp;
					}
				}
			}

			for(int i=0;i<students.length;i++)
			{
				System.out.println(students[i].name + " :"+students[i].total);

			}





		
	}

	

	
}