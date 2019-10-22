package com.lxisoft.intern.files;
import java.util.Random;
public class Tyre
{
 String brand;
 int tyreEfficiency;
 public void setTyreDetails()
  {
    Random rand = new Random();
    String[] tyrebrand = {"MRF","CEAT","APPOLO","BRIDGESTONE"};
    int index = rand.nextInt(3);
    brand = tyrebrand[index];
    tyreEfficiency = rand.nextInt(9)+1;
  }
  public void getTyreDetails()
  {
  	System.out.println("Tyre brand      :"+brand);
  	System.out.println("Tyre Efficiency :"+tyreEfficiency);
  }
}