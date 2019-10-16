package com.lxisoft.carRacing.race;
import java.util.ArrayList;
import com.lxisoft.carRacing.race.car.Car;
import com.lxisoft.carRacing.race.car.luxury.LuxuryCar;
import com.lxisoft.carRacing.race.car.normalCar.NormalCar;
public class Race 
{
	public Car[] cars=new Car[10];
	public 	ArrayList<Double> times;

	public void startRace()
	{
		cars[0]=new NormalCar();
		cars[1]=new LuxuryCar();
		cars[2]=new NormalCar();
		cars[3]=new LuxuryCar();
		cars[4]=new LuxuryCar();
		cars[5]=new LuxuryCar();
		cars[6]=new LuxuryCar();
		cars[7]=new NormalCar();
		cars[8]=new NormalCar();
		cars[9]=new NormalCar();
		setCarFeatures();
		printCompetitors();
		findTime(cars,4.0);
		printTimeChart();
		findMinTime(times);

		/*cars[0].print(); 
		cars[1].print();*/	
	}

	public void setCarFeatures()
	{
		cars[0].setName("suzuki");
		cars[0].setEngine("petrol");
		cars[0].setCc(1000);

		cars[1].setName("benz");
		cars[1].setEngine("petrol");
		cars[1].setCc(1500);

		cars[2].setName("maruti");
		cars[2].setEngine("petrol");
		cars[2].setCc(1000);

		cars[3].setName("bmw");
		cars[3].setEngine("diesel");
		cars[3].setCc(1000);

		cars[4].setName("lamborghini");
		cars[4].setEngine("diesel");
		cars[4].setCc(1500);
	
		cars[5].setName("ferrari");
		cars[5].setEngine("diesel");
		cars[5].setCc(1500);
	
		cars[6].setName("porche");
		cars[6].setEngine("petrol");
		cars[6].setCc(1500);
	
		cars[7].setName("toyota");
		cars[7].setEngine("diesel");
		cars[7].setCc(1000);
	
		cars[8].setName("creta");
		cars[8].setEngine("petrol");
		cars[8].setCc(1000);
	
		cars[9].setName("swift");
		cars[9].setEngine("diesel");
		cars[9].setCc(1000);
	
	}

	public void printCompetitors()
	{
		System.out.println("\nCOMPETITORS\n----------\n");
		for(Car car:cars)
		{
			if(car!=null)
			{
				System.out.println(car.getName()+"\t"+car.getEngine()+"\t"+car.getCc());
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
				if(car.getEngine()=="petrol")
				{
					if(car.getCc()==1000)
					{
						speed=100.0*1.1;
					}
					if(car.getCc()==1500)
					{
						speed=100.0*1.3;
					}
				}
				if(car.getEngine()=="diesel")
				{
					if(car.getCc()==1000)
					{
						speed=200.0*1.1;
					}
					if(car.getCc()==1500)
					{
						speed=200.0*1.3;
					}
				}
			time=distance/speed;
			car.setTime(time);
			times.add(time);
			}
		}

		System.out.println("\ntime ="+times+"\n");
			
	}

	public void printTimeChart()
	{
		System.out.println("TIME CHART\n----------\n");
		for(Car car:cars)
		{
			if(car!=null)
			{
				System.out.println("time ="+car.getTime()+"\tfor "+car.getName());
			}
		}

	}

	public void findMinTime(ArrayList<Double> times)
	{
		double minTime=times.get(0);
		String winner=" ";
		for(Car car:cars)
		{
			if(car.getTime()<minTime)
			{
				minTime=car.getTime();
				winner=car.getName();
			}
		}
		System.out.println("\n***********\nminimum time="+minTime+"\t WINNER is "+winner);
	}

}