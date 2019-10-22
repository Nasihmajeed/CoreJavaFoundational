package com.lxisoft.intern.files;
import java.util.Random;
//import java.util.ArrayList;
public class Car implements Luxury 
{   
	public String name;
	private Engine eng;
	private Tyre[] tyres;
	public int performance;
	
	public void setCarDetails()
	{
		tyres=new Tyre[4];
		String[] carnames = {"DODGE","LAMBORGINI","BMW","AUDI","BENZ"};
        Random rand = new Random();
        int index = rand.nextInt(4);
        name = carnames[index];	
		//if(name.equals(DODGE))
		Engine engine = new Engine();
        engine.setEngineDetails();
		this.eng = engine;
		Tyre tyre = new Tyre();
		for(int i=0;i<4;i++)
		{
			tyre.setTyreDetails();
			tyres[i]=tyre;
		}
		performance = (engine.normalspeed)*((tyres[0].tyreEfficiency+tyres[1].tyreEfficiency+tyres[2].tyreEfficiency+tyres[3].tyreEfficiency)/4)*(engine.power)*(engine.cc);
		System.out.println("performance :"+performance);
	}
	public void setNormalCarDetails()
	{
		tyres=new Tyre[4];
		String[] carnames = {"ZEN","ESTEEM","ALTO","BALENO","IKON"};
        Random rand = new Random();
        int index = rand.nextInt(4);
        name = carnames[index];	
		Engine engine = new Engine();
        engine.setEngineDetails();
		this.eng = engine;
		Tyre tyre = new Tyre();
		for(int i=0;i<4;i++)
		{
			tyre.setTyreDetails();
			tyres[i]=tyre;
		}
		performance = (engine.normalspeed)*((tyres[0].tyreEfficiency+tyres[1].tyreEfficiency+tyres[2].tyreEfficiency+tyres[3].tyreEfficiency)/4)*(engine.power)*(engine.cc);
		System.out.println("performance 1:"+performance);
	
	}
	public void getCarDetails()
	{
      System.out.println("\n\n\nName : "+name);
      eng.getEngineDetails();
      for(int i=0;i<4;i++)
      {
      	tyres[i].getTyreDetails();
      }
    }

   public void turbo()
   {
   	String comfort = "comfort level increased"; 
   } 

}