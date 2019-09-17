package com.Lxisoft.Animalgame;
import java.util.*;
import com.Lxisoft.Animalgame.Animal;
import com.Lxisoft.Animalgame.Lion;
import com.Lxisoft.Animalgame.Tiger;
import com.Lxisoft.Animalgame.Deer;
public class Forrest{ 		 			 	
public Lion lion=new Lion(10,"Tutu the lion");
public Tiger tiger=new Tiger(8,"Ekru the tiger");
public Deer deer=new Deer(4,"Kutu the deer");
public void meet(){
	 lion.strength();
	 tiger.strength();
	 deer.strength();
	 	System.out.println("---Animal meet---");
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
public void fight(Animal[] anim){
	     System.out.println("---Animal Fights---"); 
		int x,y;
		boolean isalive=true;
		 
		for(int i=0;i<2;i++){
			x=(int)(Math.random()*3);
			y=(int) (Math.random()*3);
			if(x!=y){	
				if(anim[x].isalive==true&anim[y].isalive==true){
				   System.out.println(""+anim[x].name+"\tAttack\t"+anim[y].name);			 			
					if(anim[x].strg>anim[y].strg){					
						System.out.println("winner is "+anim[x].name);
						System.out.println("Loser is "+anim[y].name);
						anim[y].isalive=false;						
				   		}
					else{				 		 
						System.out.println("winner is "+anim[y].name);
			        	System.out.println("Loser is "+anim[x].name);
			        	anim[x].isalive=false;					        
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
			
			}
		
		}
		     
 	
 	
