public class School
{
	
	String schoolname;
	
	Classroom c1,c2;
	Students s1,s2,s3,s4;
	Teacher t1,t2;
	public void Printdetail()
	{
		System.out.println("--------------------------------------------------------------------------");

	
		
		
		
	    System.out.println("\n Classroom Details : \n \n \t Class number:  "+c1.printDetail()+"\n \t Class number: \n \t"+c2.printDetail());
		
		System.out.println("\n Student Details : \n \t Student 1 :  "+s1.printDetail()+" Student 2: \n \t"+s2.printDetail()+"\n \t student 3 : "+s3.printDetail()+"\n \t student 4 : "+s4.printDetail());
	
		System.out.println("\n Teacher Details :\n \t \t Teacher 1: "+t1.printDetail()+"\n \t Teacher 2 :"+t2.printDetail());
		
	}
}