package com.Lxisoft.Animalgame;	
import com.Lxisoft.Animalgame.*;
public class Forrest{ 				 	
public Lion lion=new Lion(random(50)+15,"Tutu the lion",random(20),random(20));
public Tiger tiger=new Tiger(random(40)+10,"Ekru the tiger",random(20),random(20));
public Deer deer=new Deer(random(20),"Kutu the deer",random(15),random(15));
public Rabbit rabbit=new Rabbit(random(10),"mottu the rabbit",random(12),random(12));


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
	int x,y,c=0;	 
	do{	x=random(anim.length);
		y=random(anim.length);
		animalDis(anim[x],anim[y]);
	}while(anim[x].isalive==true||anim[y].isalive==true);

}


public void animalDis(Animal anim1,Animal anim2){
	if(anim1 instanceof Carnivores&&anim1!=anim2&&anim1.isalive==true&&anim2.isalive==true){
		System.out.println("\n\n...//Fight on//...\n"+" "+anim1.name+" vs "+" "+anim2.name);
	 	int dis=(int)(Math.sqrt((anim1.x)-(anim2.x))-((anim1.y)-(anim2.y)));
	 	System.out.println("----------------------------------"+dis);
			if(dis<=2){
				System.out.println(anim1.name+" see the "+anim2.name);
				animalFight(anim1,anim2);}
			else{
				 System.out.println(anim1.name+" far from "+anim2.name);
				 getAnimals();
      		}
      	}
   		else{
   			getAnimals();
   			}
     }     

 

public void animalFight(Animal anim1,Animal anim2){
	 	Animal attack;
		attack=((Carnivores)anim1).fight(anim2);
			if(attack==anim1){
				System.out.println("\n++++++ "+anim1.name+" beat "+anim2.name);
				anim2.strg=(anim2.strg)/2;
				anim1.strg=(anim1.strg)-((anim2.strg)/2);
					if(anim2.strg<=2){
						anim2.isalive=false;
						System.out.println(anim2.name+" \t++++++++++ is dead"); 
		   	 		}
					else{
						anim2.isalive=true;}
	 		 }
			 
				else {
					System.out.println("\n+++++ "+anim1.name+" attack "+anim2.name);
					anim1.strg=(anim1.strg)/2;
					anim2.strg=(anim2.strg)-((anim1.strg)/2);
			    		if(anim1.strg<=2){
							anim1.isalive=false;
							System.out.println(anim1.name+"\t+++++++++++ is dead"); 
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
				System.out.println(""+c);
				 
			}
		}
 	 }
 

	
 
 
     