package com.lxisoft.Race;
public abstract class RacersDetails
{
   public void about()
   {
   	System.out.print("-------------------------------------------------------------------------------------------------------");
    System.out.print("\n");
   	System.out.println("ALL RACERS ARE EXPERIENCED AND WELL TRAINED TRACK RACERS ");
   	 System.out.print("-------------------------------------------------------------------------------------------------------");
     System.out.print("\n");
   }
   private String carname;
   private String drivername;
   private int speed;
   private int engin;
   private int distance;
   public void setcarName(String carname)
   {
   	 this.carname = carname;
   }
   public String getcarName()
   {
   	return carname;
   } 
     public void setdriverName(String drivername)
   {
       this.drivername = drivername;
   }
   public String getdriverName()
   {
      return drivername;
   } 
   public void settopSpeed(int speed)
   {
   	 this.speed = speed;
   }
   public int gettopSpeed()
   {
   	return speed;
   }
   public void setenginCC(int engin)
   {
   	 this.engin = engin;
   }
   public int getenginCC()
   {
   	return engin;
   }
   public void setdistanceoftheTrack(int distance)
   {
   	this.distance = distance;
   }
   public int setdistanceoftheTrack()
   {
   	return distance;
   }
}