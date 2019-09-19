package com.Lxisoft.Animalgame;
import java.util.*;
import com.Lxisoft.Animalgame.*;
public class Forrest{ 	
 Animal	animal=new Animal();			 	
public Lion lion=new Lion(random(10),"Tutu the lion");
public Tiger tiger=new Tiger(random(8),"Ekru the tiger");
public Deer deer=new Deer(random(4),"Kutu the deer");
public void meet(){
	 lion.strength();
	 tiger.strength();
	 deer.strength();
	 	System.out.println("---Animal meet---");
	 }
public int random(int a){
	int random=(int)(Math.random()*a);
	return random;
}
public Animal[] animals(){
	Animal[] anim=new Animal[3];
    anim[0]=new Animal();
	anim[0]=lion;
	anim[1]=new Animal();
	anim[1]=tiger;
	anim[2]=new Animal();
	anim[2]=deer;
	 return anim;
	}
	//animal.fight();
public void fight(Animal[] anim){
	     System.out.println("---Animal Fights---"); 
		int x,y,count=0;
		Animal winner=new Animal();
		boolean isalive=true;		 
		for(int i=0;i<10;i++){
			x=random(3);
			y=random(3);
			if(x!=y){	
				if(anim[x].isalive==true&anim[y].isalive==true){
				   System.out.println("FIGHT---\n"+anim[x].name+"\tvs\t"+anim[y].name);			 			
					if(anim[x].strg>anim[y].strg){					
						System.out.println("\nwinner is "+anim[x].name+"\tstrength level is "+anim[x].strg);
						System.out.println("\nLoser is "+anim[y].name+"\tstrength level is "+anim[y].strg);
						anim[y].strg =(anim[y].strg)/2;
						if(anim[y].strg<=0){
							anim[y].isalive=false;
						}
						else{
							anim[y].isalive=true;
						}		
						count++;
						anim[x].strg =(anim[x].strg)-(anim[y].strg)/2;
						System.out.println("---AFTER FIGHT---");
				   		System.out.println("\nwinner is "+anim[x].name+"\tstrength level is "+anim[x].strg);
						System.out.println("\nLoser is "+anim[y].name+"\tstrength level is "+anim[y].strg);
						winner=anim[x];
						//System.out.println(""+winner);				
				   		}
				   		
					else{	
							 		 
						System.out.println("\nwinner is "+anim[y].name+"\tstrength level is "+anim[y].strg);
						System.out.println("\nLoser is "+anim[x].name+"\tstrength level is "+anim[x].strg);
							anim[x].strg=(anim[x].strg)/2;
						 if(anim[x].strg<=0){
							anim[x].isalive=false;
					       }
					      else{
					      	anim[x].isalive=true;
					      } 	
					      count++;
					  anim[y].strg=(anim[y].strg)-(anim[x].strg)/2;
					  System.out.println("---AFTER FIGHT---");
			          System.out.println("\nwinner is "+anim[y].name+"\tstrength level is "+anim[y].strg);
					  System.out.println("\nLoser is "+anim[x].name+"\tstrength level is "+anim[x].strg);
					  winner=anim[y];
			}
			        
			}
				else{
					i++;
				}

		}
			else{
				i--;
			}
			 
		}
		System.out.println("Number of fight="+count);
		System.out.println("\n\n-----THE KENG IS  "+winner.name);
		
		}
	} 	
				
			
		
		     
 	
 	
