package tDetails;
public class Tyre{
String company;
String design;
int width;
String position;
public Tyre(String br,String mod,int wid,String pos)
{

company=br;
design=mod;
width=wid;
position=pos;

}
public void tyreDetails(){

System.out.println("The "+this.position+" tyre of this car is "+this.company+" " + this.design + " with width " +this.width+" cm");



}




}
