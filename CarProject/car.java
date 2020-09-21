 public class Car
{
	 public string name;
	 public String color;
	 public float size;

	public Car(string na,String c,float s)
	{
		this.name = na;
		this.color = c;
		this.size = s;
	}

	public int getsize()
	{
		return this.size;
	}
	public String getname()
	{
		return this.name;
	}
	public string getcolor()
	{
		return this.color;
	}
}
class Fourwheeler extends car
{
    int noofleaf;
    Fourwheeler(String na,string c,float s,int n)
    {
        tair(na,c,s);
        noofleaf=n;
    }
    void display()
    {
        System.out.println("Four wheeler car");
        tair.display();
        System.out.println("No. of leaf:" +noofleaf);
    }
}
 
class door car
{
    int noofdoors;
    doorofcar(String na,string c,float s,int n)
    {
        door(na,c,s);
        noofdoors=n;
    }
    void display()
    {
        System.out.println("car's door");
        door.display();
        System.out.println("No. of leaf:" +noofdoors);
    }
}
class carDemo
{
    public static void main(String arg[])
    {
        Fourwheeler f1;
		door d1;
        f1=new Fourwheeler("audi","black",4.70 m);
		d1=new door("audi","black",4.70 m);
        f1.display();
		d1.display();
    }
}