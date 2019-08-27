import java.util.*;
public class Classroom
 {
	public int std;
	public String div;
	public Student[] s1;
	public Teacher t;
	public void scan() 
	{
		t=new Teacher();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter STD : ");
		std=s.nextInt();
		System.out.println("Enter DIV : ");
		div=s.next();
		t.scan();
		System.out.println("Enter the number of students : ");
		int ln=s.nextInt();
		s1=new Student[ln];
		for(int i=0;i<ln;i++)
			{
			s1[i]=new Student();
			System.out.println("Enter name of the student : ");
			s1[i].name=s.next();
			System.out.println("Enter the RollNo : ");
			s1[i].rollno=s.nextInt();
			s1[i].scan();
			}
	}	
		public void print()
		{
			System.out.println("STD : "+std+"\tDIV : "+div);
			t.print();
			
			for(int i=0;i<s1.length;i++)
			{
				System.out.println("\t\n "+s1[i].name+"--"+s1[i].rollno);
				s1[i].print();
				System.out.println("\n\t TOTAL:"+s1[i].gettoTal());
				
			}
		}	
		public void maxTotal()
		{	 
			System.out.println("\n\t\t---RANK LIST---");
			Student temp=null;
			for(int i=0;i<s1.length;i++)
			{	 
				for(int j=i+1;j<s1.length;j++){
					if(s1[i].total<s1[j].total){
						temp=s1[i];
						s1[i]=s1[j];
						s1[j]=temp;
						}
					}
					System.out.println("\n\t"+s1[i].name+"---"+s1[i].rollno);
				}
				
		}
	}
		 
	