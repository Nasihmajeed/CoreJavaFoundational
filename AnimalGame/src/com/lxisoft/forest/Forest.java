package com.lxisoft.forest;
import com.lxisoft.type.*;
import com.lxisoft.Animals.*;
//import src.com.lxisoft.tddPackage.*;
import java.util.*;
public class Forest{
	Scanner sc=new Scanner(System.in);
	ArrayList<Animal> animal=new ArrayList<Animal>();
	ArrayList<String> deadAnimal=new ArrayList<String>();
	public void animalDetails(){
		animal.add(new Lion());
		animal.get(0).setName("lion");
		animal.get(0).setStrength(95);
		animal.get(0).setLife(true);
		animal.get(0).setDistance(50);
		
		animal.add(new Fox());
		animal.get(1).setName("fox");
		animal.get(1).setStrength(85);
		animal.get(1).setLife(true);
		animal.get(1).setDistance(48);
		
		animal.add(new Tiger());
		animal.get(2).setName("tiger");
		animal.get(2).setStrength(90);
		animal.get(2).setLife(true);
		animal.get(2).setDistance(51);
		
		animal.add(new Cheetah());
		animal.get(3).setName("cheetah");
		animal.get(3).setStrength(93);
		animal.get(3).setLife(true);
		animal.get(3).setDistance(55);
		
		animal.add(new Deer());
		animal.get(4).setName("deer");
		animal.get(4).setStrength(30);
		animal.get(4).setLife(true);
		animal.get(4).setDistance(5);
		
		animal.add(new Elephant());
		animal.get(5).setName("elephant");
		animal.get(5).setStrength(91);
		animal.get(5).setLife(true);
		animal.get(5).setDistance(30);
		
		animal.add(new Giraffe());
		animal.get(6).setName("giraffe");
		animal.get(6).setStrength(32);
		animal.get(6).setLife(true);
		animal.get(6).setDistance(6);
		
		animal.add(new Horse());
		animal.get(7).setName("horse");
		animal.get(7).setStrength(40);
		animal.get(7).setLife(true);
		animal.get(7).setDistance(9);
		
	}
	
	public int randNum(){
		int s=animal.size();
		int random=(int)(Math.random()*s);
                return random;
	}
	public int LuckRandm(){
		int lckRandm=(int)(Math.random()*2);
		return lckRandm;
	}
	public void setFight(){
			int randm1,randm2,a,d;
			
		System.out.println("************************************");
		System.out.println("Hi.... Welcome to the JUNGLE......");
		System.out.println("************************************");
		System.out.println("Press 1 to start the game ");
		a=sc.nextInt();
		if(a==1){
			do{
			randm1=randNum();
			randm2=randNum();
			if(randm1 !=randm2){
				d=Math.abs(animal.get(randm1).getDistance()-animal.get(randm2).getDistance());
				/* if(animal.get(randm1).getDistance()>animal.get(randm2).getDistance()){
						d=animal.get(randm1).getDistance()-animal.get(randm2).getDistance();
					}
					else
						d=animal.get(randm2).getDistance()-animal.get(randm1).getDistance(); */
				//System.out.println("\n\nANIMALS IN THE RING "+animal.get(randm1).getName()+" AND "+animal.get(randm2).getName());
				if(animal.get(randm1) instanceof Herbivorous && animal.get(randm2) instanceof Herbivorous){
					System.out.println("\n\nANIMALS IN THE RING "+animal.get(randm1).getName()+" AND "+animal.get(randm2).getName());
					System.out.println("BOTH ARE HERBIVOROUS NO FIGHT");
				}
				else if(animal.get(randm1) instanceof Herbivorous && animal.get(randm2) instanceof Carnivorous){
					System.out.println("\n\nANIMALS IN THE RING "+animal.get(randm1).getName()+" AND "+animal.get(randm2).getName());
					int lck= LuckRandm();
					if(animal.get(randm1) instanceof weakAnimal && lck==1){
						System.out.println("ANIMAL "+animal.get(randm1).getName()+" GOT LUCKY AND ESCAPES");
					}
					
					else if(d<30){
						System.out.println("ANIMALS "+animal.get(randm1).getName()+" AND "+animal.get(randm2).getName()+" ARE CLOSE ENOUGH TO FIGHT");
						fight(randm1,randm2);
					}
					else if(d>30){
						animal.get(randm1).setDistance(animal.get(randm1).getDistance()/2);
						animal.get(randm2).setDistance(animal.get(randm2).getDistance()/2);
						System.out.println("ANIMALS "+animal.get(randm1).getName()+" AND "+animal.get(randm2).getName()+" ARE FAR AWAY");
					}
				}
				else if(animal.get(randm2) instanceof Herbivorous && animal.get(randm1) instanceof Carnivorous){
					System.out.println("\n\nANIMALS IN THE RING "+animal.get(randm1).getName()+" AND "+animal.get(randm2).getName());
					int lck= LuckRandm();
					if(animal.get(randm2) instanceof weakAnimal && lck==1){
						System.out.println("ANIMAL "+animal.get(randm2).getName()+" GOT LUCKY AND ESCAPES");
					}
					else if(d<30){
						System.out.println("ANIMALS "+animal.get(randm1).getName()+" AND "+animal.get(randm2).getName()+" ARE CLOSE ENOUGH TO FIGHT");
						fight(randm1,randm2);
					}
					else if(d>30){
						animal.get(randm1).setDistance(animal.get(randm1).getDistance()/2);
						animal.get(randm2).setDistance(animal.get(randm2).getDistance()/2);
						System.out.println("ANIMALS "+animal.get(randm1).getName()+" AND "+animal.get(randm2).getName()+" ARE FAR AWAY");
					}
				}
				else if(animal.get(randm2) instanceof Carnivorous && animal.get(randm1) instanceof Carnivorous){
					System.out.println("\n\nANIMALS IN THE RING "+animal.get(randm1).getName()+" AND "+animal.get(randm2).getName());
					if(d<30){
						System.out.println("ANIMALS "+animal.get(randm1).getName()+" AND "+animal.get(randm2).getName()+" ARE CLOSE ENOUGH TO FIGHT");
						fight(randm1,randm2);
					}
					else if (d>30){
						animal.get(randm1).setDistance(animal.get(randm1).getDistance()/2);
						animal.get(randm2).setDistance(animal.get(randm2).getDistance()/2);
						System.out.println("ANIMALS "+animal.get(randm1).getName()+" AND "+animal.get(randm2).getName()+" ARE FAR AWAY");
					}
				}
			}
			}while(animal.size()!=1); 
			for(int i=0;i<deadAnimal.size();i++){
			System.out.println("DEAD ANIMAL : "+deadAnimal.get(i));
		}
		System.out.println("\n\n**********************************");
		System.out.println("*********WINNER IS "+animal.get(0).getName()+"***********");
		System.out.println("**********************************");
	} 
	}
	public void fight(int randm1,int randm2){
	
					
					if(animal.get(randm1).getStrength() > animal.get(randm2).getStrength()){
					System.out.println("ANIMAL "+animal.get(randm1).getName()+" WINS");
					animal.get(randm2).setStrength(animal.get(randm2).getStrength()/2);
					animal.get(randm1).setStrength(animal.get(randm1).getStrength()-10);
					System.out.println("STRENGTH OF "+animal.get(randm2).getName()+" IS "+animal.get(randm2).getStrength());
					if(animal.get(randm2).getStrength()<=10){
						System.out.println("ANIMAL "+animal.get(randm2).getName()+" IS DEAD\n");
						deadAnimal.add(animal.get(randm2).getName());
						animal.remove(randm2);
					}
					}
					else if(animal.get(randm2).getStrength() > animal.get(randm1).getStrength()){
					System.out.println("ANIMAL "+animal.get(randm2).getName()+" WINS");
					animal.get(randm1).setStrength(animal.get(randm1).getStrength()/2);
					animal.get(randm2).setStrength(animal.get(randm2).getStrength()-12);
					System.out.println("STRENGTH OF "+animal.get(randm1).getName()+" IS "+animal.get(randm1).getStrength());
					if(animal.get(randm1).getStrength()<=10){
						System.out.println("ANIMAL "+animal.get(randm1).getName()+" IS DEAD\n");
						deadAnimal.add(animal.get(randm1).getName());
						animal.remove(randm1);
					}
				}
				
		
		
		}
}

