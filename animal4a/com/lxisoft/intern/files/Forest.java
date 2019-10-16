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
    /* int c[] = coordinate();
     temp.setLocx(c[0]);
     temp.setLocy(c[1]);*/
     animalslist.add(temp);
    }
    grid();
   }
   public int createHunger()
   {
        int hunger = rand.nextInt(70); 
        return hunger;
   }
   public int createPower()
   {
     int power = rand.nextInt(100);
     return power;
   }
   public int[] coordinate()
   {
      int x = rand.nextInt(10);
      int y = rand.nextInt(10);
      int a[]  = new int[2]; 
      a[0] = x;
      a[1] = y;
      return a;
   }

   public void grid()
    {
       setLocation();

        int rows = 10;
        int columns = 10;
        int[][] array = new int[rows][columns];
         for(int i = 0; i<rows; i++)
             for(int j = 0; j<columns; j++)
                 array[i][j] = 0;

                    for(int i = 0; i<rows; i++)
                     {
                      for(int j = 0; j<columns; j++)
                       {
                        int flag=0;
                         for (int k=0;k<animalslist.size();k++)
                           {
                            if((i==animalslist.get(k).getLocx())&(j==animalslist.get(k).getLocy()))
                           
                             { System.out.print(animalslist.get(k).getName()); flag=1;
                              System.out.println();
                               }
                             }
                            if(flag==0) 
                            System.out.print("  ");
                        } 
                    
    }
    System.out.println();
    display();
  }

  public void display()
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
  public void setLocation()
  {  
     for (int i=0;i<animalslist.size();i++)
    { 
      //System.out.println(animalslist.get(i).getName());
      int c[] = coordinate();
      animalslist.get(i).setLocx(c[0]);
      animalslist.get(i).setLocy(c[1]);
     }
    
  }
     

  public void fight()
    { 
        Random rand = new Random();
        int lim = animalslist.size();
        for (int i=0;i<=lim+1;i+=1)
            { 
              String f = null;   
              int random2;
              int random1 = rand.nextInt(animalslist.size());
              do{
                 random2 = rand.nextInt(animalslist.size());
                }while(random1 == random2);
                System.out.println(" ");
                System.out.println(animalslist.get(random1).getName()+" fight with " +animalslist.get(random2).getName()); 
		            f= animalslist.get(random1).fight(animalslist.get(random2));
                if(!(f==null))
                  {   for(int j=0;j<=animalslist.size()-1  ;j++)
                       {
                        if(animalslist.get(j).getName().equals(f))
                          {
                            animalslist.remove(j);
                          }
			                 }
                  }
            }
            alive();
            last();
    
}
public void distance()
{   double dis = 0;
    int a = 5;
    int x1=0,x2=0,y1=0,y2=0;
    for(int i=0;i<=animalslist.size()-2;i++)
      { x1 = animalslist.get(i).getLocx();
        x2 = animalslist.get(i+1).getLocx();
        y1 = animalslist.get(i).getLocy();
        y2 = animalslist.get(i+1).getLocy();
        dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));       
      }
      if(dis <= a)
      {System.out.println("distance between two points : "+dis);}
    if(x1==x2)
      
   fight(); 
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
                //System.out.println("finally alive "+animalslist.get(k).getName());
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