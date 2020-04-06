import java.util.* ;

public class School
{

	Address sAd = new Address() ;
	ClassRoom[] cR ;

	int nCr ; //nCR : No of Classroom

	public void NewSchool()
	{
		
		sAd.InputAddress() ;

		Scanner in = new Scanner(System.in) ;

		System.out.print("\n \n Number of Classrooms in " + sAd.sName + " School : ") ; //Taking input of the total number of CLassrooms present in the School
		this.nCr = in.nextInt() ; 
		in.nextLine() ;

		C.cls() ;

		cR = new ClassRoom[nCr] ; // Created an object array of subject class with total subject number size

			for(int i=0 ; i<nCr ; i++)
			{
				cR[i] = new ClassRoom() ; // Making the individual blocks into an object of ClassRoom  class
				cR[i].CreateClassRoom(i+1) ; // Feeding data of ClassROom information
			}

		
	}

	public void DisplayInfo()
	{

		C.cls() ;

		System.out.print("\n ------------------ \n SCHOOL DETAILS \n ------------------ \n") ;

		System.out.print("\n \n ADDRESS \n _________ \n") ;
		sAd.DisplayAddress() ;

		System.out.print("\n \n CLASSROOMS \n _________ \n") ;
		
		for(int i=0 ; i<nCr ; i++ )
			cR[i].DisplayClass() ;
	}

	public void SelectClass()
	{

		for(int i=0 ; i<nCr ; i++)
			{
				System.out.print("(") ;
				System.out.print(i+1 + ") ") ;
				cR[i].ClassName() ;
			}
	}

	public void EditClass(int c)
	{
		cR[c].Manage() ;
	}
}