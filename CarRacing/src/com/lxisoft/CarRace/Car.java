package com.lxisoft.CarRace;
import java.util.Scanner;

public class Car
{
	public String name;
	public int basic_speed=60;
	public double practspeed;
    public Tyre[] tyre = new Tyre[4];
	public Engine engine ;
	public double distance;

	public void display()
	{
		System.out.println(" Car name = "+this.name +"\t Engine type = "+engine.fuel+" cc ="+engine.cc*1000);
	}
    public void retyre()
    {
    
        for(int i=0;i<4;i++)
        {
            tyre[i]= new Tyre();
            int x= (int)(Math.random()*5);

            switch(x)
            {
            	case 0 : tyre[i].setname("MRF"); break;
            	case 1 : tyre[i].setname("ceat"); break;
            	case 2 : tyre[i].setname("rubco"); break;
            	case 3 : tyre[i].setname("mahindra"); break;
            	case 4 : tyre[i].setname("bajaj"); break;
            }
            switch(x)
            {
            	case 0 : tyre[i].setgrip(1.2); break;
            	case 1 : tyre[i].setgrip(1.5); break;
            	case 2 : tyre[i].setgrip(1.4); break;
            	case 3 : tyre[i].setgrip(1.3); break;
            	case 4 : tyre[i].setgrip(1.2); break;
            }
       
        }
      
    }
    public void supertyre()
    {

    }
	public void racespeed()
	{
		double tyrefact=0;
		for(int i=0;i<4;i++)
		{
			tyrefact=tyre[i].getgrip();
			tyrefact+=tyrefact;
		}
		for(int i=0;i<10;i++)
		{
			if(this instanceof Sportcar)
			{
				basic_speed=basic_speed+10;
			}
		}
        for(int j=0;j<10;j++)
        {
        	practspeed=tyrefact*basic_speed*engine.cc;
        }
		
	}
    public void racedistance()
    {
        double time = 70;

        for(int i= 0;i<10;i++)
        {
           distance=practspeed*time;
        }
    }
}