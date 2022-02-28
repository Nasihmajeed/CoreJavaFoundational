package tst;

public class School 
{
	//just for test
	private String name;
	private String place;
	public School(String name, String place) {
		super();
		this.name = name;
		this.place = place;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	public void printinfoSchoo()
	{
		System.out.println(" school name is "+getName()+  " school place is " +getPlace());
	}

}
