package com.lxisoft.intern.files;
import java.util.ArrayList;
public class Track
{   
	ArrayList <Car> vehiclelist = new ArrayList <Car>();
	public void startRace()
	{   
		System.out.println("Ready To Go...");
		
		for(int i=0;i<5;i++)
      	   {
             Car car = new Car();
             car.setCarDetails();
             vehiclelist.add(car);
            } 

        for(int j=0;j<5;j++)
      	   {
             Car normalcar = new Car();
             normalcar.setNormalCarDetails();
             vehiclelist.add(normalcar);
           }
      displayCarDetails();   
	}
	public void displayCarDetails()
	{  
		System.out.println(vehiclelist.size());
		for(int i=0;i<vehiclelist.size();i++)
		{
		System.out.println("\n\n\nCAR :"+(i+1));
		vehiclelist.get(i).getCarDetails();
		}
		rank();
	}
    public void rank()
    {
    	for(int i=0;i<10;i++){
    		int tempPerf=-1;
    		int index=0;
    		for(int j=0;j<vehiclelist.size();j++){
    		if(vehiclelist.get(j).performance>tempPerf)
              {
              	index=j;
              	tempPerf=vehiclelist.get(j).performance;
              }
            
    	}
    	System.out.println("Rank "+(i+1)+" : "+vehiclelist.get(index).name+" Performance:"+vehiclelist.get(index).performance);
        vehiclelist.remove(index);
    	}
    }
}

