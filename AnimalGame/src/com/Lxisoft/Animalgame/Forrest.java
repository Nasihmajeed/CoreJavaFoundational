package com.Lxisoft.Animalgame;
import java.util.*;
import com.Lxisoft.Animalgame.*;
public class Forrest{ 				 	
public Lion lion=new Lion(random(10),"Tutu the lion");
public Tiger tiger=new Tiger(random(8),"Ekru the tiger");
public Deer deer=new Deer(random(4),"Kutu the deer");
public void meet(){
	 lion.print();
	 tiger.print();
	 deer.print();
	 System.out.println("---Animal meet---");
	 }
public int random(int a){
	int random=(int)(Math.random()*a);
	return random;
}
public Animal[] getAnimals(){
	Animal[] anim=new Animal[3]; 
	anim[0]=lion; 
	anim[1]=tiger; 
	anim[2]=deer;
	return anim;
	}
public void selectAnimals(Animal[] anim){
	System.out.println("---Animal Fights---"); 
	int x,y;
	boolean isalive=true;		 
	for(int i=0;i<10;i++){
		x=random(3);
		y=random(3);
		if(x!=y){	
			if(anim[x].isalive==true&&anim[y].isalive==true){
				System.out.println("\n\n...\tFight on...\n"+" "+anim[x].name+" vs "+" "+anim[y].name);
				 animalFight(anim[x],anim[y]);
			    }
			else{
				i++;
			}

	      }
        }
       }
public void animalFight(Animal anim1,Animal anim2){
	 	Animal attack;
		attack=anim1.fight(anim2);
		if(attack==anim1){
			System.out.println(" "+anim1.name+" beat "+anim2.name);
			anim2.strg=(anim2.strg)/2;
			anim1.strg=(anim1.strg)-((anim2.strg)/2);
			if(anim2.strg<=0){
				anim2.isalive=false;
		   	 }
			else{
				anim2.isalive=true;
			}
	 	 }
		else{
			System.out.println(" "+anim2.name+" beat "+anim1.name);
			anim1.strg=(anim1.strg)/2;
			anim2.strg=(anim2.strg)-((anim1.strg)/2);
			if(anim1.strg<=0){
				anim1.isalive=false;
		   	 }
			else{
				anim1.isalive=true;
			}
	 	 }
	 	 winnerAnimal(getAnimals());

	 }	
public void winnerAnimal(Animal[] anim){
	int count=0,k=0;
	for(int i=0;i<anim.length;i++){
		if(anim[i].isalive==true){
			count++;
			k=i;			
		    }
		  }

		if(count==1){
			System.out.println("\n\n\tThe KING is "+anim[k].name);

		}
	}
}
	
 
 
     