import java.util.* ;

public class ClassRoom
{
	int studentStrength,nSub ; //Total Number of Students in the Class Room , Number of Subjects
	String clName ;
	char again = 'n' ;

	Student[] st ; // Object for creating all the students present in the class
	Subject[] sub ; // object for assigning the various subjects for a given classroom.

	Scanner in = new Scanner(System.in) ;

	public void createClassRoom(int j)
	{

		C.cls() ;

		System.out.print("\n ------------------ \n CLASSROOM DETAILS \n ------------------ \n") ;

		System.out.print("\n Name of Class Room " + j +" (I-XII): ") ;
		this.clName = in.nextLine() ;

		this.subjectDetails() ;

		System.out.print("\n \n Total Strength of Students in Class " + clName + " : ") ;
		this.studentStrength = in.nextInt() ;
		in.nextLine() ;

		System.out.print("\n  STUDENT DETAILS OF CLASS " + clName + " : \n --------------------------------- \n") ;

		st = new Student[studentStrength] ;

			for(int i=0 ; i<studentStrength ; i++)
			{
				st[i] = new Student() ;
				st[i].admitNewStudent(i+1,nSub) ;
			}
	}

	public void subjectDetails()
	{
		System.out.print("\n \n Number of Subjects teached in Class " + clName + " : ") ; //Taking input of the total number of subjects that are being teached by this classroom
		this.nSub = in.nextInt() ; 
		in.nextLine() ;
					
			System.out.print("\n ---------------- \n SUBJECT DETAILS \n ---------------- \n") ;

			sub = new Subject[nSub] ; // Created an object array of subject class with total subject number size


			for(int i=0 ; i<nSub ; i++)
			{
				sub[i] = new Subject() ; // Making the individual blocks into an object of subject class
				sub[i].newSubject(i+1) ; // Feeding data of Subject information
			}
	}

	public void displayClass()
	{

		System.out.print("\n \n CLASS NAME : " + clName + "\n ---------------- \n" ) ;
		System.out.print("\n SUBJECTS TEACHING : \n \n") ;
			for(int i=0 ; i<nSub ; i++ )
				{
					System.out.print("  ") ;
					System.out.print(i+1 + "." + sub[i].subName +"\n") ;
				}
		System.out.print("\n TOTAL STUDENT STRENGTH : "+ studentStrength + "\n \n") ;

	}

	public void className()
	{

		System.out.print(clName+"\n") ;
	}


	public void manage()
	{

		again = 'n' ;

		do
		{
			C.cls() ;

			System.out.print("\n -----------\n  CLASS " + clName + "\n ----------- \n \n") ;

			again = 'n' ;

			System.out.print("(1) Upload Marks \n \n(2) Generate Score Card \n \n(3) Go Back \n \n: ") ;
			char op = in.next().charAt(0) ;


			switch (op)
			{
				case '1' :
					this.uploadMark() ;
					System.out.print("\n \n All MARKS ENTERED. GO BACK? (Y/N) : ") ;
					again = in.next().charAt(0) ;
					break ;

				case '2' :
					this.generateScoreCard() ;
					break ;

				case '3' :

					again = 'n' ;
					break ;

				default :
					System.out.print("\n \n INVALID CHOICE. Try Again? (Y/N) : ") ;
					again = in.next().charAt(0) ;		
			}

		}while(again == 'y' || again == 'Y') ;	


	}

	public void generateScoreCard()
	{
		C.cls() ;
		System.out.print("\n Generate Score Card \n _______________________ ") ;
		System.out.print("\n \n(1) Based on SUBJECT \n \n(2) Based on TOTAL \n \n : ") ;
		char op = in.next().charAt(0) ;

		switch (op)
		{
			
			case '1' :
				this.displayMark() ;
				System.out.print("\n \n GO BACK? (Y/N) : ") ;
				again = in.next().charAt(0) ;
				break ;

			case '2' :
				this.displayTotal() ;
				System.out.print("\n \n GO BACK? (Y/N) : ") ;
				again = in.next().charAt(0) ;
				break ;
			default :
				System.out.print("\n \n INVALID CHOICE. Try Again? (Y/N) : ") ;
				again = in.next().charAt(0) ;
		}
	}

	public void uploadMark()
	{

		C.cls() ;

		System.out.print("\n -------------------- \n UPLOAD MARKS FOR SUBJECT \n -------------------- \n \n") ;

			for(int i=0 ; i<nSub ; i++)
			{
				System.out.print("\n "+sub[i].subName + "\n ---------------- \n ") ;

				for(int j=0 ; j<studentStrength ; j++)
					{
						st[j].markEntry(i) ;
					}

			}
	}

	public void displayMark()
	{
		C.cls() ;

		System.out.print("\n SCORECARD BASED ON SUBJECT \n ________________________________ \n \n") ;		

		System.out.print("\n ----------- \n CLASS " + clName + "\n ----------- \n \n") ;

			for(int i=0 ; i<nSub ; i++)
			{
				System.out.print("\n "+sub[i].subName + "\n ----------- \n ") ;

				for(int j=0 ; j<studentStrength ; j++)
					{
						st[j].markDisplay(i) ;
						sub[i].subAvg += st[j].subMark[i] ;
					}
				sub[i].subAvg /= studentStrength ;
				System.out.print("\n \n --------------------- \n Class Average : " + sub[i].subAvg + "\n --------------------- \n \n") ;

			}

	}

	public void displayTotal()
	{
		C.cls() ;

		System.out.print("\n SCORECARD BASED ON TOTAL \n _________________________ \n") ;		

		System.out.print("\n ----------- \n CLASS " + clName + "\n ----------- \n") ;

		for(int i=0 ; i<studentStrength ; i++)
		{
			System.out.print("\n Roll Number : " + st[i].rNo + "\n Name : "+ st[i].stName + "\n \n Marks Attained : \n --------------- \n" ) ;
						
				for(int j=0 ; j<nSub ; j++)
				{
					System.out.print("\n "+sub[j].subName + ": "+ st[i].subMark[j]) ;

				}


			st[i].totalMark() ;

		}



	}


}