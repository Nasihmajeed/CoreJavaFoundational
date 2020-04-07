import java.util.* ;

public class ClassRoom
{
	int studentStrength,nSub ; //Total Number of Students in the Class Room , Number of Subjects
	String clName ;

	Student[] st ; // Object for creating all the students present in the class
	Subject[] sub ; // object for assigning the various subjects for a given classroom.

	public void CreateClassRoom(int j)
	{

		Scanner in = new Scanner(System.in) ;

		C.cls() ;

		System.out.print("\n ------------------ \n CLASSROOM DETAILS \n ------------------ \n") ;

		System.out.print("\n Name of Class Room " + j +" (I-XII): ") ;
		this.clName = in.nextLine() ;

		System.out.print("\n \n Number of Subjects teached in Class " + clName + " : ") ; //Taking input of the total number of subjects that are being teached by this classroom
		this.nSub = in.nextInt() ; 
		in.nextLine() ;
					
			System.out.print("\n ---------------- \n SUBJECT DETAILS \n ---------------- \n") ;

			sub = new Subject[nSub] ; // Created an object array of subject class with total subject number size


			for(int i=0 ; i<nSub ; i++)
			{
				sub[i] = new Subject() ; // Making the individual blocks into an object of subject class
				sub[i].NewSubject(i+1) ; // Feeding data of Subject information
			}

		System.out.print("\n \n Total Strength of Students in Class " + clName + " : ") ;
		this.studentStrength = in.nextInt() ;
		in.nextLine() ;

		System.out.print("\n  STUDENT DETAILS OF CLASS " + clName + " : \n --------------------------------- \n") ;

		st = new Student[studentStrength] ;

			for(int i=0 ; i<studentStrength ; i++)
			{
				st[i] = new Student() ;
				st[i].AdmitNewStudent(i+1,nSub) ;
			}
	}

	public void DisplayClass()
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

	public void ClassName()
	{

		System.out.print(clName+"\n") ;
	}


	public void Manage()
	{

		char again = 'n' ;

		do
		{
			C.cls() ;

			System.out.print("\n -----------\n  CLASS " + clName + "\n ----------- \n \n") ;

			Scanner input = new Scanner(System.in) ;

			again = 'n' ;

			System.out.print("(1) Upload Marks \n \n(2) Generate Score Card \n \n(3) Go Back \n \n: ") ;
			char op = input.next().charAt(0) ;


			switch (op)
			{
				case '1' :
					this.UploadMark() ;
					System.out.print("\n \n All MARKS ENTERED. GO BACK? (Y/N) : ") ;
					again = input.next().charAt(0) ;
					break ;

				case '2' :
					C.cls() ;
					System.out.print("\n Generate Score Card \n _______________________ ") ;
					System.out.print("\n \n(1) Based on SUBJECT \n \n(2) Based on TOTAL \n \n : ") ;
					op = input.next().charAt(0) ;

						switch (op)
						{
						
							case '1' :
								this.DisplayMark() ;
								System.out.print("\n \n GO BACK? (Y/N) : ") ;
								again = input.next().charAt(0) ;
								break ;

							case '2' :
								this.DisplayTotal() ;
								System.out.print("\n \n GO BACK? (Y/N) : ") ;
								again = input.next().charAt(0) ;
								break ;
							default :
								System.out.print("\n \n INVALID CHOICE. Try Again? (Y/N) : ") ;
								again = input.next().charAt(0) ;
						}

					break ;

				case '3' :

					again = 'n' ;
					break ;

				default :
					System.out.print("\n \n INVALID CHOICE. Try Again? (Y/N) : ") ;
					again = input.next().charAt(0) ;		
			}

		}while(again == 'y' || again == 'Y') ;	


	}

	public void UploadMark()
	{

		C.cls() ;

		System.out.print("\n -------------------- \n UPLOAD MARKS FOR SUBJECT \n -------------------- \n \n") ;

			for(int i=0 ; i<nSub ; i++)
			{
				System.out.print("\n "+sub[i].subName + "\n ---------------- \n ") ;

				for(int j=0 ; j<studentStrength ; j++)
					{
						st[j].MarkEntry(i) ;
					}

			}
	}

	public void DisplayMark()
	{
		C.cls() ;

		System.out.print("\n SCORECARD BASED ON SUBJECT \n ________________________________ \n \n") ;		

		System.out.print("\n ----------- \n CLASS " + clName + "\n ----------- \n \n") ;

			for(int i=0 ; i<nSub ; i++)
			{
				System.out.print("\n "+sub[i].subName + "\n ----------- \n ") ;

				for(int j=0 ; j<studentStrength ; j++)
					{
						st[j].MarkDisplay(i) ;
						sub[i].subAvg += st[j].subMark[i] ;
					}
				sub[i].subAvg /= studentStrength ;
				System.out.print("\n \n --------------------- \n Class Average : " + sub[i].subAvg + "\n --------------------- \n \n") ;

			}

	}

	public void DisplayTotal()
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


			st[i].TotalMark() ;

		}



	}


}