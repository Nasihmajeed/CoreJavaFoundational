public class Tyre {

private String Brand ;
private String Position;
private String Radius;
String Br,Po,R;
public String getBrand()
{
return Brand;
}
public void setBrand(String newBrand)
{
Brand=this.Br;
}

public String getPosition()
{
return Position;
}
public void setPosition(String newPosition)
{
Position = this.Po;
}
public String getRadius()
{
return Radius;
}
public void setRadius(String newRadius)
{
Radius=this.R;
}

public void printDetails()  {
System.out.println("TYRE");
System.out.println("Brand Is :" +this.Br);
System.out.println("Position Is :" + this.Po);
System.out.println("Radius Is :" +this.R);
System.out.println("\n");
}

}