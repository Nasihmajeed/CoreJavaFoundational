package com.lxisoft.intern.files;
import java.util.*;
import java.io.*;
import java.util.Random;
public class Forest
{ 
	      ArrayList <Animal> animalslist = new ArrayList <Animal>();
        static BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        static Scanner in = new Scanner(System.in);
        int randomc ;
        int randomd ;
        int randome ;
        int randomf ;

	public void createAnimals()
	 {   
	     Random rand = new Random(); 
       int randoma = rand.nextInt(5);
       int randomb = rand.nextInt(5);   
       for(int a=1;a<=randoma;a++)
       {   int random1 = rand.nextInt(60); 
           int random2 = rand.nextInt(90);
           int random3 = rand.nextInt(70);
           int random4 = rand.nextInt(100); 
           randomc = rand.nextInt(10);
           randomd = rand.nextInt(10);
           randome = rand.nextInt(10);
           randomf = rand.nextInt(10);
           Animal d = new Deer("Deer"+a,random1,random3,randomc,randomd);
           animalslist.add(d);
           Animal l = new Lion("Lion"+a,random2,random4,randome,randomf);
           animalslist.add(l);
           
       } 
       for(int b =1;b<=randomb;b++)
       {
        int random5 = rand.nextInt(100); 
        int random6 = rand.nextInt(30);
        int random7 = rand.nextInt(90);
        int random8 = rand.nextInt(50);
        randomc = rand.nextInt(10);
        randomd = rand.nextInt(10);
        randome = rand.nextInt(10);
        randomf = rand.nextInt(10);
        Animal t = new Tiger("Tiger"+b,random5,random7,randome,randomf);
        animalslist.add(t);
        Animal r = new Rabbit("Rabbit"+b,random6,random8,randome,randomf);
        animalslist.add(r);
       }
	 } 
   public void grid()
    {
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
                            System.out.print("     ");
                        } 
                    
    }}

  public void display()
    { 
      for (int i=0;i<animalslist.size();i++)
            {if(animalslist.get(i).getPower()<=0)
              {animalslist.remove(i);}
              else{
             System.out.println(" Name of Animal   :"+animalslist.get(i).getName());
             System.out.println(" Power            :"+animalslist.get(i).getPower());
             System.out.println(" Hunger Level     :"+animalslist.get(i).getHunger());
             System.out.println(" x and y position :"+animalslist.get(i).getLocx()+"   "+animalslist.get(i).getLocy());
            
            }}
            
    } 
  

  public void selectAnimal()
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