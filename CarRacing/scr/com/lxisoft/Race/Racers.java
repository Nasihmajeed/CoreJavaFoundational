package com.lxisoft.Race;
import java.util.List;
import java.util.Collections;
public  class Racers implements Comparable<Racers>
{
   private int enginCC;
   private String carName;
   private String driverName;
   private int topSpeed;
   private int distanceinTrack;

    public Racers(String carName ,String driverName ,int distanceinTrack , int enginCC , int topSpeed)
    {
      this.driverName=driverName;
      this.carName=carName;
      this.distanceinTrack=distanceinTrack; 
      this.enginCC=enginCC;
      this.topSpeed=topSpeed;
    }
    public String toString()
    {
      return this.carName+" "+" "+this.driverName+" "+" "+this.distanceinTrack+" "+" "+this.enginCC+" "+" "+this.topSpeed;
    }
    public String getcarName()
    {
      return carName;
    }
     public String getdriverName()
    {
      return driverName;
    }
    public int getdistanceinTrack()
    {
      return distanceinTrack;
    }
   public int getenginCC()
   {
      return enginCC;
   }
    public int gettopSpeed()
   {
      return topSpeed;
   }

    public int compareTo(Racers distanceinTrack)
   {
      if (this.getdistanceinTrack()>distanceinTrack.getdistanceinTrack())
      return 1;
       return -1;
   }
}