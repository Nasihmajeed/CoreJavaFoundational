package com.lxisoft.carrise;
import com.lxisoft.carrise.*;
public class Car 
{
	public String carName;
	public int engineCC;
	public int basicSpeed=60;
	public String fuelType;
	public int practicalVelocity;
	public int power;
	public Engine engine;
    Tyre[] tyre;

    public void tyreDetails()
    {
    	for(int i=0;i<4;i++)
    	{
    		tyre=new Tyre[4];
    		int x=(int)(Math.random()*4);
	    	switch(x)
	    	{
	    		case 1:tyre[i].setBrand("JK");break;
	    		case 2:tyre[i].setBrand("CEAT");break;
	    		case 3:tyre[i].setBrand("MRF");break;
	    		case 4:tyre[i].setBrand("APOLLO");break;
	    	}
	    	switch(x)
	    	{
	    		case 1:tyre[i].setEfficiency(10);break;
	    		case 2:tyre[i].setEfficiency(8);break;
	    		case 3:tyre[i].setEfficiency(6);break;
	    		case 4:tyre[i].setEfficiency(4);break;
	    	}
	    }
	}
}
