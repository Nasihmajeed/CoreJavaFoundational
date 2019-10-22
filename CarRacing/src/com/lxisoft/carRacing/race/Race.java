package com.lxisoft.carRacing.race;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import com.lxisoft.carRacing.race.car.Car;
import com.lxisoft.carRacing.race.car.luxury.LuxuryCar;
import com.lxisoft.carRacing.race.car.Tyre;
public class Race 
{
	public Car[] cars=new Car[10];
	public 	ArrayList<Double> times;
	public Tyre[] tyres=new Tyre[4];
	public List<String[]> carTyreNames;
	//public ArrayList<String[]> tyreNames = new ArrayList<String[]>();
	public String[][] tyreNames=new String[10][4];
	public void startRace()
	{
		cars[0]=new Car("suzuki","petrol",1500);
		cars[1]=new Car("creta","diesel",1000);
		cars[2]=new Car("maruti","petrol",1000);
		cars[3]=new Car("zen","petrol",1500);
		cars[4]=new Car("swift","petrol",1000);
		cars[5]=new LuxuryCar("benz","petrol",1500);
		cars[6]=new LuxuryCar("bmw","diesel",1000);
		cars[7]=new LuxuryCar("ferrari","petrol",1500);
		cars[8]=new LuxuryCar("lamborghini","diesel",1500);
		cars[9]=new LuxuryCar("porche","petrol",1000);
		

		printCompetitors();
		setTyres();
		createTyres();
		setTyreWeightage();
		sumWeightage();
		//printTyres();
	
		findTime(cars,4.0);
		printTimeChart();
		
		findMinTime(times);
	//	tyreWeightage(cars);
		/*cars[0].print(); 
		cars[1].print();*/	
	}



	public void printCompetitors()
	{
		System.out.println("\nCOMPETITORS\n----------\n");
		for(Car car:cars)
		{
			if(car!=null)
			{
				System.out.println(car.name+"\t"+car.engine+"\t"+car.cc);
			}
		}
	}

	public void findTime(Car[] cars, double distance)
	{
		times=new ArrayList<Double>();
		double speed=0.0;
		double time=0.0;
		for(Car car:cars)
		{
			if(car!=null)
			{
				if(car.engine=="petrol")
				{
					if(car.cc==1000)
					{
						speed=100.0*1.1;
					}
					if(car.cc==1500)
					{
						speed=100.0*1.3;
					}
				}
			time=distance/speed;
			car.setTime(time);
			times.add(time);
			}
		}

		System.out.println("\ntime ="+times+"\n");
			
	}

	public void setTyres()
	{

		carTyreNames=new ArrayList<String[]>();
		String[] car1={"mrf","apolo","mrf","apolo"};
		String[] car2={"mrf","apolo","nipon","nipon"};
		String[] car3={"mrf","apolo","mrf","nipon"};
		String[] car4={"nipon","apolo","nipon","mrf"};
		String[] car5={"mrf","apolo","nipon","nipon"};
		String[] car6={"nipon","apolo","nipon","nipon"};
		String[] car7={"mrf","nipon","nipon","nipon"};
		String[] car8={"mrf","mrf","mrf","mrf"};
		String[] car9={"apolo","apolo","apolo","nipon"};
		String[] car10={"apolo","apolo","nipon","nipon"};
		carTyreNames.add(car1);
		carTyreNames.add(car2);
		carTyreNames.add(car3);
		carTyreNames.add(car4);
		carTyreNames.add(car5);
		carTyreNames.add(car6);
		carTyreNames.add(car7);
		carTyreNames.add(car8);
		carTyreNames.add(car9);
		carTyreNames.add(car10);
		/*for(String[] strarray:carTyreNames)
		{
			System.out.println(Arrays.toString(strarray));
		}*/
	}

	public void createTyres()
	{
		for(int i=0;i<10;i++)
		{
			cars[i].setCarTyres(carTyreNames.get(i));
		}
	}

	public void setTyreWeightage()
	{
		for(Car car:cars)
		{
			for(int i=0;i<4;i++)
			{
				if(car.tyres[i].getCompany()=="mrf")
				{
					car.tyres[i].setWeightage(2);
				}
				if(car.tyres[i].getCompany()=="apolo")
				{
					car.tyres[i].setWeightage(3);
				}
				if(car.tyres[i].getCompany()=="nipon")
				{
					car.tyres[i].setWeightage(1);
				}
				
				//System.out.println(car.tyres[i].getCompany()+"\t"+car.tyres[i].getWeightage());
			}

		}
	}

	public void sumWeightage()
	{
		System.out.println("\nCOMPANY AND WEIGHTAGE\n----------\n");
		for(Car car:cars)
		{
			for(int i=0;i<4;i++)
			{
				//car.tyres[i].getWeightage();
				System.out.println("company="+car.tyres[i].getCompany()+"\t"+"weightage="+car.tyres[i].getWeightage());
			}
		}
	}


	public void printTimeChart()
	{
		System.out.println("TIME CHART\n----------\n");
		for(Car car:cars)
		{
			if(car!=null)
			{
				System.out.println("time ="+car.getTime()+"\tfor "+car.name);
			}
		}

	}

	public void findMinTime(ArrayList<Double> times)
	{
		double minTime=times.get(0);
		String winner=" ";
		for(Car car:cars)
		{
			//System.out.println(car.getTime());
			if(car.getTime() < minTime)
			{
				minTime=car.getTime();
				winner=car.name;
			}
		}
		System.out.println("\n***********\nminimum time="+minTime+"\t WINNER is "+winner);
	}
	
}