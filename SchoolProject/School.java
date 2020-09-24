public class School
{
	String Name,Principal,Address,Teacher,Students;
	public void SchoolName1()
	{
		System.out.println(" School name is vyasa vidya peetham");
	}
	public void Address1()
	{
		System.out.println(" vyasa vidya peetham \n Near District Police camp  \n kallekkad (po) ,palakkad \n pincode :678006");
	}
    public void PrincipalName1()
    {
    	System.out.println(" Principal of vyasa vidya peetham is ABCD");
    }
    public void Display1()
    {
    	ClassTeacher t = new ClassTeacher();
    	Students st = new Students();
    	t.tName = (" balu , he is 1st std Students Class Teacher");
    	st.st1=("Rohit");
    	st.st2=("Anwer");
    	st.st3=("sreejith");
    	t.tTeacher1();
    	st.stdisplay1();
    }


    public void SchoolName2()
	{
		System.out.println(" School name is Puliyamparamb Higher Secondary School");
	}
	public void Address2()
	{
		System.out.println(" Puliyamparamb Higher Secondary School \n Near Pirayiri  \n kodumthirapully (po) ,palakkad \n pincode :678004");
	}
    public void PrincipalName2()
    {
    	System.out.println(" Principal of Puliyamparamb Higher Secondary School is EFGH");
    }
    public void Display2()
    {
    	ClassTeacher t = new ClassTeacher();
    	Students st = new Students();
    	t.tName = (" robin , he is 2nd std Students Class Teacher");
    	st.st1=("Akhil");
    	st.st2=("Manu");
    	st.st3=("Rahul");
    	t.tTeacher2();
    	st.stdisplay2();
    }

}
