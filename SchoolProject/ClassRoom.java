public class ClassRoom   {


private String seats;
private String standard;
private String division;
private Teacher tc;
Students [] st = new Students[4];


ClassRoom(String standard, String division,String seats)   {
	
	
	this.standard = standard;
	this.division = division;
	this.seats = seats;
	
}
	

public String getSeats()  {
  return seats;
}
public void setSeats(String newSeats)  {
  this.seats = newSeats;
}


public String getStandard()  {
	return standard;
}
public void setStandard(String newStandard)  {
	this.standard = newStandard;
}


public String getDivision()  {
	return division;
}
public void setDivision(String newDivision)   {
	this.division = newDivision;
}


public Teacher getTc()  {
	return tc;
}
public void setTc(Teacher newTc)   {
	this.tc = newTc;
}


public void printDetails()  {
	
	System.out.println("Standard :" + this.standard);
    System.out.println("Division :" + this.division); 
    System.out.println("Seats :" + this.seats);
	System.out.println("\n");
	
	tc.printDetails();
	
	for(int x = 1; x < 4; x++)  {
		
	st[x].printDetails();
}
}
}