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
            {if(animalslist.get(i).getPower()<=0)
              System.out.println("********");
              else{
             System.out.println(" Name of Animal  :"+animalslist.get(i).getName());
             System.out.println(" Power           :"+animalslist.get(i).getPower());
            }}
    } 
  public void selectAnimal()
    { Random rand = new Random();
         for (int i=0;i<=animalslist.size()+1;i+=1)
            { 
              String f = null;   
              int random2;
		             int random1 = rand.nextInt(animalslist.size());
                  do{ random2 = rand.nextInt(animalslist.size());
                    }while(random1 == random2);
                        
 			                 System.out.println(animalslist.get(random1).getName()+" fight with " +animalslist.get(random2).getName()); 
				               f= animalslist.get(random1).fight(animalslist.get(random2));
                         if(!(f==null))
                             {   for(int j=0;j<=animalslist.size()-1;j++)
                                 {
                                   if(animalslist.get(j).getName().equals(f))
                                      {if((animalslist.get(j).getPower())<=0)
                                       {animalslist.remove(j);}
                                       }
					                       }
                            }
                              
            }         
              for (int k=0;k<animalslist.size();k++) 

                             { if((animalslist.get(k).getPower())<=0)
                                System.out.println(animalslist.get(k).getName()+" Died");
                                else{System.out.println("Not Died");
                                
                              System.out.println("finally alive "+animalslist.get(k).getName());}
                             }         
}

}