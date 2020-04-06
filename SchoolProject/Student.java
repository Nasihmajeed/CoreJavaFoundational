import java.util.* ;

public class Student
{

	String stName ;
	int rNo,no ; // no : Total number of subjects
	float per=0 ;
	int[] subMark,total ;
	
	char result ;

	public void AdmitNewStudent(int i)
	{

		Scanner in = new Scanner(System.in) ;

		System.out.print("\n Details of Student " + i + " : ") ;
		
		System.out.print("\n \n Name : ") ;
		this.stName = in.nextLine() ;

		System.out.print("\n Roll Number : ") ;
		this.rNo = in.nextInt() ;
		in.nextLine() ;	
		
		System.out.print("\n ----------------------------------- \n" ) ;			
	}

	public void MarkEntry(int n)
	{
		
			Scanner in = new Scanner(System.in) ;

			System.out.print("\n "+ this.stName + " : ") ;
			this.subMark[n] = in.nextInt() ;
			in.nextLine() ;

	}

	public void TotalMark()
	{

		for(int i =0 ; i<no ;i++)
		{

			this.total[i] += this.subMark[i] ;
			this.per = this.total[i]/no ;
		}
	}

}