import java.util.* ;

public class ClassRoom
{
	int studentStrength,nSub ; //Total Number of Students in the Class Room , Number of Subjects
	String clName ;

	Student[] st ; // Object for creating all the students present in the class
	Subject[] sub ; // object for assigning the various subjects for a given classroom.

	public void CreateClassRoom()
	{

		Scanner in = new Scanner(System.in) ;

		System.out.print("Name of the Class Room (I-XII): ") ;
		this.clName = in.nextLine() ;

		System.out.print("Total Number of Subjects for Class " + clName + " : ") ; //Taking input of the total number of subjects that are being teached by this classroom
		this.nSub = in.nextInt() ; 
		in.nextLine() ;

		sub = new Subject[nSub] ; // Created an object array of subject class with total subject number size

			for(int i=0 ; i<nSub ; i++)
			{
				sub[i] = new Subject() ; // Making the individual blocks into an object of subject class
				sub[i].NewSubject() ; // Feeding data of Subject information
			}

		System.out.print("Total Strength of Students : ") ;
		this.studentStrength = in.nextInt() ;
		in.nextLine() ;

		st = new Student[studentStrength] ;

			for(int i=0 ; i<studentStrength ; i++)
			{
				st[i] = new Student() ;
				st[i].AdmitNewStudent() ;
			}
	}

	public void UploadMark()
	{

		System.out.print("Upload Marks for the Sudents : ") ;

			for(int i=0 ; i<studentStrength ; i++)
			{

				st[i].MarkEntry(sub,nSub) ;

			}
	}



}