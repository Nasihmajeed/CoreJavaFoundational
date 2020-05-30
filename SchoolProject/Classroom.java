import java.util.*;
public class Classroom
{
	String cName;
	String printOrNot;
	int totStudent;
	Student[] st;
	Teacher t = new Teacher();
	Student[] temp;
	 
	public void setClassroomDetails()
	{
		Scanner in = new Scanner(System.in);
		totStudent = in.nextInt();
		in.nextLine();
		System.out.println("Class Name :\t");
		cName = in.nextLine();	
		
		//********Student Details**************
		st = new Student[this.totStudent];
		for(int i=0;i<this.totStudent;i++)
		{
			st[i] = new Student();
			System.out.println("Enter Student " + (i+1) +" Details") ;
			st[i].setStudentDetails();
		}
		//**********Teacher******
		t.setTeacherDetails();
		

	}
	
	
	
	void printClassDetails()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Class Name : "+this.cName);
		System.out.println("Number Of Students = "+this.totStudent+"\n");
		System.out.println("\t\tSubject Wise Marks\t");
		System.out.println("\t*****************************");
		System.out.println("Student Name - Subject Name -  Mark Obtained ");
		System.out.println("--------------------------------");
		for(int i=0;i<totStudent;i++)
		{
			st[i].printSubjectDetails();
		}
		System.out.println("\n");
		System.out.println("\n \t\t Student Info");
		System.out.println("\t*****************************");
		System.out.println("Student Name     -     Roll Number     -     Total Mark     -     percentage     -     Reslut\n");
		for(int i=0;i<totStudent;i++)
		{
			st[i].printStudentDetails();
		}
		System.out.println("\nDisplay Class Ranklist(yes/not) \n");
		printOrNot=in.nextLine();
		if(printOrNot.equals("yes"))
		{
			System.out.println(" \t\t Class Ranklist ");
			System.out.println("\t------------------------------");
			this.printRank();
		}	
	}
	
	void printRank()
	{
		Student tmp = new Student();
		Student[] temp=new Student[totStudent];
		for(int j=0;j<st.length;j++)
		{
			temp[j]= new Student();
			temp[j]= st[j];
		}
		for(int i=0;i<st.length;i++)
		{
			for(int k=i+1;k<st.length;k++)
			{
				if(temp[i].total<temp[k].total)
				{
					tmp = temp[i];
					temp[i]=temp[k];
					temp[k]=tmp;
				}
			}
		}
		System.out.println("Rank - Name     - \t Total");
		for(int q=0;q<st.length;q++)
		{
			System.out.println((q+1)+"    "+temp[q].studName+"    "+temp[q].total);
		}
	}
	
	
	void printTeacherDetails()
	{
		
		System.out.println("\n\n \t\t Faculty Info");
		System.out.println("\t*****************************");
		t.printTeacher();
		

	}
}