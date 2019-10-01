package com.Lxisoft.Animalgame;	
import com.Lxisoft.Animalgame.*;
public class Forrest{ 				 	
public Lion lion=new Lion(random(50)+10,"Tutu the lion",random(20)+5,random(20)+5);
public Tiger tiger=new Tiger(random(45)+5,"Ekru the tiger",random(20)+4,random(20)+4);
public Deer deer=new Deer(random(26)+5,"Kutu the deer",random(15)+2,random(15)+2);
public Rabbit rabbit=new Rabbit(random(18)+5,"mottu the rabbit",random(12)+2,random(12)+2);
public void meet(){
	System.out.println("\n\n\t\t---DARK FORREST---\n\n"+"\n\tAnimals in the jungle");
	 lion.print();
	 tiger.print();
	 deer.print();
	 rabbit.print();
	 lion.eat();
	 tiger.eat();
	 deer.eat();
	 rabbit.eat();
	 System.out.println("\n\n---Animal meet---\n\n");
	 }
public int random(int a){		
	int random=(int)(Math.random()*a);
	return random;
}
public Animal[] getAnimals(){
	Animal[] anim=new Animal[4]; 
	anim[0]=lion; 
	anim[1]=tiger; 
	anim[2]=deer;
	anim[3]=rabbit;
	return anim;
	}
public void selectAnimals(Animal[] anim){
	System.out.println("---Animal Fights---\n"); 
	int x,y;
	boolean isalive=true;		 
	//for(int i=0;i<10;i++){
	do{
		x=random(anim.length);
		y=random(anim.length);
		if(x!=y&&anim[x] instanceof Herbivores){
		 System.out.println("\n\n...\tFight on...\n"+" "+anim[x].name+" vs "+" "+anim[y].name);
		 animalDis(anim[x],anim[y]);
		 }	
			}while(anim[x].isalive==false&&anim[y].isalive==false);
			
		}
public void animalDis(Animal anim1,Animal anim2){
	int dis=(int)(Math.sqrt((anim1.x)-(anim2.x))-((anim1.y)-(anim2.y)))+2;
	System.out.println("Distance b/w "+anim1.name+" - "+anim2.name+" = "+dis);
	if(dis<=2){
		animalFight(anim1,anim2);
	}
	else{
		System.out.println("CID escape");
	}
  }
 
public void animalFight(Animal anim1,Animal anim2){
	 	Animal attack;
		attack=((Carnivores)anim1).fight(anim2);
			if(attack==anim1){
				System.out.println("\n "+anim1.name+" beat "+anim2.name);
				anim2.strg=(anim2.strg)/2;
				anim1.strg=(anim1.strg)-((anim2.strg)/3);
				if(anim2.strg<=0)
				{
					anim2.isalive=false;
					System.out.println(anim2.name+" is dead"); 
		   	 	}
				else
				{
					anim2.isalive=true;
				}
	 		 }
			else{
				System.out.println("\n "+anim2.name+" beat "+anim1.name);
				anim1.strg=(anim1.strg)/2;
				anim2.strg=(anim2.strg)-((anim1.strg)/3);
			if(anim1.strg<=0){
				anim1.isalive=false;
				System.out.println(anim1.name+" is dead"); 
		   	 }
			else{
				anim1.isalive=true;
			}
	 	 }
	 	 winnerAnimal(getAnimals());
        }	
public void winnerAnimal(Animal[] anim){
	int count=0,k=0,c=0;
	for(int i=0;i<anim.length;i++){
		if(anim[i].isalive==true&&anim[k] instanceof Carnivores){
			count++;
			c=count;
			k=i;			
		    }
		  }

		if(count==1&&anim[k] instanceof Carnivores){
			System.out.println("\n\n\tThe KING is "+anim[k].name);

		}
		else{
		//	System.out.println(""+c);
		}
	}
  }
 

	
 
 
     