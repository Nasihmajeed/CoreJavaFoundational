package com.lxisoft.intern.files;
import java.util.*;
import java.io.*;
import java.util.Random;
import java.lang.Math;
public class Forest
{ 
	      ArrayList <Animal> animalslist = new ArrayList <Animal>();
        static BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        static Scanner in = new Scanner(System.in);
        Random rand = new Random(); 
        int randomc ;
        int randomd ;
        int randome ;
        int randomf ;
    
   public void createAnimals()
   { Animal temp;
     int i=1;
     while(i<11)
    {
     int rt = rand.nextInt(4);
     switch(rt)
     {
      case 0 :
              temp = new Deer();
              String a = "DEER";
              temp.setName(a+ i);
              break;
      case 1 :
              temp = new Lion();
              String b = "LION";
              temp.setName(b+ i);
              break;
      case 2 :
              temp = new Rabbit();
              String c = "RABBIT";
              temp.setName(c+ i);
              break;
      case 3 :
              temp = new Tiger();
              String d = "TIGER";
              temp.setName(d+ i);
              break;
      default :
              System.out.println("gggg ");
              temp = new Rabbit();
              String e = "a";
              temp.setName(e+ i);
              break;                         
     }i++;
     int hl = createHunger();
     temp.setHunger(hl);
     int p = createPower();
     temp.setPower(p);
     animalslist.add(temp);
    }
    grid();
   }
  

   protected int createHunger()
   {
        int hunger = rand.nextInt(70); 
        return hunger;
   }
  

   protected int createPower()
   {
     int power = rand.nextInt(100);
     return power;
   }
  

   protected int[] coordinate()
   {
      int x = rand.nextInt(10);
      int y = rand.nextInt(10);
      int a[]  = new int[2]; 
      a[0] = x;
      a[1] = y;
      return a;
   }

   protected void grid()
    {   setLocation();
        int rows = 10;
        int columns = 10;
        int[][] array = new int[rows][columns];
         for(int i = 0; i<rows; i++)
             for(int j = 0; j<columns; j++)
                 array[i][j] = 0;
                   for(int i = 0; i<rows; i++)
                     { for(int j = 0; j<columns; j++)
                       { int flag=0;
                         for (int k=0;k<animalslist.size();k++)
                           {  if((i==animalslist.get(k).getLocx())&(j==animalslist.get(k).getLocy()))
                                { animalslist.get(k).getName();
                                  System.out.print(animalslist.get(k).getName()); flag=1;
                                  System.out.println();
                                }
                           }if(flag==0) 
                            System.out.print("  ");
                        }    
                     }
                    System.out.println();
                    display();
  }

  protected void display()
    { 
      for (int i=0;i<animalslist.size();i++)
            {if(animalslist.get(i).getPower()<=0)
              {animalslist.remove(i);}
              else{
             System.out.println(" Name of Animal   :"+animalslist.get(i).getName());
             System.out.println(" Power            :"+animalslist.get(i).getPower());
             System.out.println(" Hunger Level     :"+animalslist.get(i).getHunger());
             System.out.println(" x and y position :"+animalslist.get(i).getLocx()+" & "+animalslist.get(i).getLocy());
            
            }}
            
    } 
  protected void setLocation()
  {  for (int i=0;i<animalslist.size();i++)
      {  int c[] = coordinate();
         animalslist.get(i).setLocx(c[0]);
         animalslist.get(i).setLocy(c[1]);
      }
  }
     

  public void fight()
    {  Random rand = new Random();
       double dist=0.0;
       do{  for (int i=0;i<=animalslist.size()-3;i+=1)
            { String f = null;
              System.out.println(animalslist.get(i).getName()+" fight with " +animalslist.get(i+1).getName()); 
              for(int k=0;k<=animalslist.size()-2;k+=1)
              { if(i!=k)
                dist= distance(animalslist.get(i),animalslist.get(k));
                 try{if(dist<=1){
		              f= animalslist.get(i).fight(animalslist.get(i+1));}
                   if(!(f==null))
                    {   for(int j=0;j<=animalslist.size()-1  ;j++)
                         {
                          if(animalslist.get(j).getName().equals(f))
                           {
                             animalslist.remove(j);
                           } 
			                   }
                    }}catch(Exception e)
                    {System.out.println("Exception verified");}
            }} grid();
               alive();
               last();
             }while(animalslist.size()!=3);
                
    }


public double distance(Animal a,Animal b)
{   double dis = 0;
    int x1=0,x2=0,y1=0,y2=0;
       try{
        x1 = a.getLocx();
        x2 = a.getLocx();
        y1 = b.getLocy();
        y2 = b.getLocy();
        dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)); }catch (ArithmeticException e)
        {System.out.println("Due to Arthmetic Exception"+e); }      
      return dis;
}


 public void alive()
    {   
      for (int k=0;k<animalslist.size();k++) 
         { if((animalslist.get(k).getPower())<0)
              { 
                System.out.println(animalslist.get(k).getName()+" Died  1");
                animalslist.remove(k);
              }
            else
              {
                System.out.println(animalslist.get(k).getName()+" Not died");
              }
         }         
    }


    public void last()
    {
      for(int l=0;l<animalslist.size();l++)
      {
        if((animalslist.get(l).getPower())>=0)
           System.out.println("Finally alive "+animalslist.get(l).getName());
      }
    }
}  
