package tst;

public class ClassRoom 
{
  private int standard;
  private char division;
public ClassRoom(int standard, char division) {
	super();
	this.standard = standard;
	this.division = division;
}
public int getStandard() {
	return standard;
}
public void setStandard(int standard) {
	this.standard = standard;
}
public char getDivision() {
	return division;
}
public void setDivision(char division) {
	this.division = division;
}
public void printinfoClass()
{
	System.out.println(" your std is "+getStandard()+  " your division is " +getDivision());
}
}
