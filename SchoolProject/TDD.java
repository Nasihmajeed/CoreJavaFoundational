public class TDD{
	public static void main(String[] arg)
	{
		School scl=new School();
		scl.setDetails();
		scl.printDetails();

		System.out.println("school wise ranklist");
		scl.rankList();
	}
}

