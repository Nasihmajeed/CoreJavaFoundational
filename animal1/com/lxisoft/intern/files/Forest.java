package com.lxisoft.intern.files;
import java.util.*;
import java.io.*;
import java.util.Random;
public class Forest
{ 

	ArrayList <Animal> animalslist = new ArrayList <Animal>();
        static BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        static Scanner in = new Scanner(System.in);

	public void createAnimals()
	{   
	     
	     Random rand = new Random();              
	     int random1 = rand.nextInt(60); 
	     int random2 = rand.nextInt(90); 
	     int random3 = rand.nextInt(100); 
             int random4 = rand.nextInt(30); 
	     Animal d = new Deer("Deer",random1);
       	     Animal t = new Tiger("Tiger",random2);
     	     Animal l = new Lion("Lion",random3);
    	     Animal r = new Rabbit("Rabbit",random4);

    	     animalslist.add(d);
       	     animalslist.add(t);
             animalslist.add(l);
             animalslist.add(r);
	
        } 
     public void display()
         { 
          for (int i=0;i<animalslist.size();i++)
            {
             System.out.println(" Names of Animal :"+animalslist.get(i).name);
             System.out.println(" Power           :"+animalslist.get(i).power);
            }
         } 
    public void fight()
          {   
              int a = animalslist.size();
              Random rand = new Random();
              for (int i=0;i<a-1;i+=1)
                 {    int random2;
		      int random1 = rand.nextInt(animalslist.size());
                      do{ random2 = rand.nextInt(animalslist.size());}while(random1 == random2);
 			 System.out.println(animalslist.get(random1).name+" fight with " +animalslist.get(random2).name); 
		           if(random1 != random2)
                             {
					if(animalslist.get(random1).power >= animalslist.get(random2).power)
					    {System.out.println(animalslist.get(random1).name+" wins ");
				             animalslist.remove(random2); }
					else{System.out.println(animalslist.get(random2).name+" wins ");
					     animalslist.remove(random1);}
                             }else  System.out.println("no fight between same animal");
                       } for (int j=0;j<animalslist.size();j++)              
                             {System.out.println("finally alive "+animalslist.get(j).name);}
         }
   

}



