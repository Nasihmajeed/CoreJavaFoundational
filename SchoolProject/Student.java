import java.util.* ;

public class Student
{

	String stName ;
	int rNo,no,total=0 ; // no : Total number of subjects
	float per=0 ;
	int[] subMark = new int[10] ;
	
	char result ;

	public void admitNewStudent(int i,int n)
	{

		Scanner in = new Scanner(System.in) ;

		no = n ;

		System.out.print("\n Details of Student " + i + " : ") ;
		
		this.rNo = i ;
		System.out.print("\n \n Roll Number : " + this.rNo) ;
		
		System.out.print("\n Name : ") ;
		this.stName = in.nextLine() ;
		
		System.out.print("\n ----------------------------------- \n" ) ;			
	}

	public void markEntry(int n)
	{
		
			Scanner in = new Scanner(System.in) ;

			System.out.print("\n "+ this.stName + " : ") ;
			this.subMark[n] = in.nextInt() ;
			in.nextLine() ;

	}

	public void markDisplay(int n)
	{
		System.out.print("\n "+ this.stName + " : " + this.subMark[n]) ;

		if(this.subMark[n]>80)
			System.out.print(" - A GRADE - PASS") ;
		else if(this.subMark[n]>70)
			System.out.print(" - B GRADE - PASS") ;
		else if(this.subMark[n]>60)
			System.out.print(" - C GRADE - PASS") ;
		else if(this.subMark[n]>45)
			System.out.print(" - D GRADE - JUST PASS") ;
		else
			System.out.print(" - F GRADE - FAILED.") ;

	}

	public void totalMark()
	{

		for(int i =0 ; i<no ;i++)
		{
			this.total += this.subMark[i] ;
		}

		this.per = this.total/no ;

		System.out.print("\n TOTAL MARKS : " + this.total + "\n \n RESULT : \n \n Percentage : "+ this.per + "%% \n GRADE : ") ;
		if(this.per>80)
			System.out.print(" A GRADE - PASS") ;
		else if(this.per>70)
			System.out.print(" B GRADE - PASS") ;
		else if(this.per>60)
			System.out.print(" C GRADE - PASS") ;
		else if(this.per>45)
			System.out.print(" D GRADE - JUST PASS") ;
		else
			System.out.print(" F GRADE - FAILED.") ;

		System.out.print("\n \n ------------------------ \n") ;

	}

}