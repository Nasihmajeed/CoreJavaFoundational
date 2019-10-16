import java.util.Scanner;
public class Classroom
{
  //int studNo;
  int std;
  String div;
  Teacher teacher;
  Student[] students; 
  
  public void scan()
 {
	int studNo; 
	 
    teacher	 = new Teacher();
	
    Scanner read = new Scanner(System.in);
   
    System.out.println("\n enter STD");
    std=read.nextInt();
	System.out.println("\n enter the DIV");
    div=read.next();
    teacher.scan();
	System.out.println("\n enter the number of students ");
	studNo=read.nextInt();
	students =  new Student[studNo];
   for(int i=0; i<studNo; i++)
   {
	   students[i] = new Student();
	   students[i].scan();
   }
   
   
 }
 
 public void print()
 {   
	 System.out.println(" \n STD  "+std+" & DIV:"+div);
	 teacher.print();
	 for(int i=0; i<students.length; i++)
	 {
		 students[i].print();
		 students[i].total();
	 }
	 
 }
 public void rank()
 {
	 int i,j ;
	 Student temp= new Student();
	 for(i=0;i<students.length;i++)
	 {
		 for(j=0;j<students.length;j++)
		 {
			 if(students[i].total>students[j].total)
			 {
				temp=students[i];
				students[i]=students[j];
				students[j]=temp;
			 }
		 }
	 }
	 System.out.println("RANK LIST--CLASS");
	 for(i=0;i<students.length;i++)
	 {
		 System.out.println((i+1)+" name--"+students[i].name+" score--"+students[i].total);
	 }
 } 
}