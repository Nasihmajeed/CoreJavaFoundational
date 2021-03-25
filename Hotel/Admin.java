class Admin
{
String uname,pwd;
boolean auth;


	public boolean authentication(String uname, String pwd)
	{
		this.uname=uname;
		this.pwd=pwd;
		if(uname=="admin" & pwd=="123")
			{
			return true
			}
	}
	
	public void verification()
	{
	auth=authentication("admin","123")
	if(auth)
	{
	System.out.println("Verification Successful");
	}
	}
	


}