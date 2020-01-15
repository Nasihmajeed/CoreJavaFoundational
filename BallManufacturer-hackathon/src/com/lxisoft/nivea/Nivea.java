package com.lxisoft.nivea;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class Nivea 
{
	public ArrayList<Ball> ball=new ArrayList<Ball>();
	public ArrayList<String> details=new ArrayList<String>();
	Scanner sc= new Scanner(System.in);
	CricketBall cricket=new CricketBall();
	TennisBall tennis =new TennisBall();
	FootBall football=new FootBall();
	VollyBall volly=new VollyBall();
	File file=new File("D:\\lxi\\java\\hackthon\\CoreJavaFoundational\\BallManufacturer-hackathon\\src\\com\\lxisoft\\file\\niveaBalls.txt");
	
	public void setObject()
	{
		ball.add(new CricketBall());
		ball.add(new TennisBall());
		ball.add(new VollyBall());
		ball.add(new FootBall());
		
	}

	public void setPrice()
	{
		ball.get(0).setPrice(200);
		ball.get(1).setPrice(500);
		ball.get(2).setPrice(900);
		ball.get(3).setPrice(1500);
	}

	public void setName()
	{
		ball.get(0).setName("CricketBall");
		ball.get(1).setName("tennisBall");
		ball.get(2).setName("vollyBall");
		ball.get(3).setName("footBall");
	}

	public void display()
	{	int x=0;
	do{ setObject();
		setPrice();
		setName();
		System.out.println(" NIVEA BALLS ");
		System.out.println("***************");
		System.out.println("\nDISCOUNT SALE IS ON!!!");
		System.out.println("1. "+ball.get(0).getName()+" ( "+ball.get(0).getPrice()+" RS )"+cricket.qty+"left");
		System.out.println("2. "+ball.get(1).getName()+" ( "+ball.get(1).getPrice()+" RS )"+tennis.qty+"left");
		System.out.println("3. "+ball.get(2).getName()+" ( "+ball.get(2).getPrice()+" RS )"+volly.qty+"left");
		System.out.println("4. "+ball.get(3).getName()+" ( "+ball.get(3).getPrice()+" RS )"+football.qty+"left");
		System.out.println(" select your choice ");
		int c=sc.nextInt();
		int d=c-1;
		System.out.println("enter the number of quantity you want");
		int q= sc.nextInt();
		choice(d);
		fileCreation();
		bill(d,q);
		System.out.println("enter 1 if you want to continue : ");
		x=sc.nextInt();
	  }while(x==1);
	}

	public void choice(int c)
	{
		if(ball.get(c)instanceof AirFillable)
		{
			System.out.println("hurrryy you got an air filling pump worth of rs 350");
		}
		else if(ball.get(c)instanceof Bouncible)
		{
			System.out.println("hurrayy you got 20% discount ");
			float f=(float)((ball.get(c).getPrice())-(ball.get(c).getPrice()*(0.2)));
			ball.get(c).setPrice(f);
		}
		quality();
	}

	public void quality()
	{
		System.out.println("check whether the select product is good in quality");
		System.out.println("checking.......");
		int random=(int)(Math.random()*50);
	try{if(random<26)
	{
		MyEx ex=new MyEx("the ball quality is not good enough");
		throw ex;
	}

	else
	{
		System.out.println("this one is awsome in quality you can start rocking.....");
	}}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}

	public void bill(int c,int q)
	{
		System.out.println("bill");
		System.out.println("******");
		System.out.println("\nsl no\tprdt\t\tquantity\tprice(with discount)");
		System.out.println("1."+"\t"+ball.get(c).getName()+"\t"+q+"\t\t"+(ball.get(c).getPrice())*q);
	}
	public void fileCreation()
	{
		fileValue();
		fileWrite();
		fileRead();

	}
	public void fileValue()
	{
		details.add("1.cricket ball =200rs");
		details.add("2.tennis ball =500rs");
		details.add("3.volly ball =900rs");
		details.add("4.footBall ball =1500rs");
	}
	public void fileWrite()
	{
		if(file.length()==0)
		{
		try{
		FileWriter fw =new FileWriter(file,false);
		BufferedWriter bw =new BufferedWriter(fw);
		for(String s : details)
		{	
			bw.write(s);
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	}
	public void fileRead()
	{
		ArrayList<String> read=new ArrayList<String>();
		try{
			FileReader fr =new FileReader(file);
			BufferedReader br =new BufferedReader(fr);
			String s;
			while((s=br.readLine())!=null)
			{
				read.add(s);
			}
					System.out.println("data in file");
					for(int i=0;i<read.size();i++)
					{
						System.out.println(read.get(i));
					}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
 }