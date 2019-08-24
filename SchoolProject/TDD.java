public class TDD
{
	public static void main(String[] arg)
	{
		School school=new School();
		school.scan();
		System.out.println("\n");
		school.print();
		System.out.println("school wise ranklist");
		System.out.println("----------");
		school.rankList();
	}	
}