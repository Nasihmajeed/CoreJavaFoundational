import java.util.* ;

public class RegisterSchool
{

	Address sAd = new Address() ;
	ClassRoom cR = new ClassRoom() ;

	public void NewSchool()
	{
		
		sAd.InputAddress() ;
		cR.CreateClassRoom() ;
		cR.UploadMark() ;

	}
}