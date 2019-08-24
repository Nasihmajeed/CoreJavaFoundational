public class Subject
{
   int mark;
   String subName;
   
   	public Subject(int sMark,String stSubName)
   	{
   	mark=sMark;
   	subName=stSubName;	
   	}

	void getSubDetails()
	   {
		    System.out.println("SubjectName :" +subName);
			System.out.println("Marks :" +mark);
      }
}
 		