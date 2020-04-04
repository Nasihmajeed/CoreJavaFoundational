import java.util.* ;

public class Student
{

	String stName ;
	int rNo,total=0,no ;
	float per=0 ;
	int[] subMark ;
	
	char result ;

	public void AdmitNewStudent()
	{

		Scanner in = new Scanner(System.in) ;

		System.out.print("Name : ") ;
		this.stName = in.nextLine() ;

		System.out.print("Roll Number : ") ;
		this.rNo = in.nextInt() ;
		in.nextLine() ;		
	}

	public void MarkEntry(Subject[] s, int n)
	{
		for(int i=0 ; i<n ; i++)
		{
			Scanner in = new Scanner(System.in) ;

			System.out.print(s[i].subName + " : ") ;
			s[i].sMark = in.nextInt() ;
			in.nextLine() ;

			this.subMark[i] = s[i].sMark ;
			no = n ;

		}

	}

	public void TotalMark()
	{

		for(int i =0 ; i<n ;i++)
		{

			this.total += this.subMark[i] ;
			this.per = this.total/n ;
		}
	}

}