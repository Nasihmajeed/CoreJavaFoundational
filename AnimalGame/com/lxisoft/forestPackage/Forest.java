package com.lxisoft.forestPackage;
import com.lxisoft.animalPackage.*;
import java.util.*;
public class Forest{
		//ArrayList<Animal> herbAnimal=new ArrayList<Animal>();
	ArrayList<Animal> animal=new ArrayList<Animal>();
	ArrayList<String> deadAnimal=new ArrayList<String>();
	Animal a=new Animal();
	public int randNum(){
		int random=(int)(Math.random()*animal.size());
                return random;
	}
	/* 			
	public int randNum2(){
		int random2=(int)(Math.random()*4);
                return random2;
	} */
	public void forestDetails(){
		System.out.println("|**********************************|");
		System.out.println("|******WELCOME TO THE JUNGLE********|");
		System.out.println("|**********************************|");
		a.addAnimal(animal);
				try {
			Thread.sleep(1500);                 //1500 milliseconds is one second.
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		fight(animal);
	}
	public void fight(ArrayList<Animal> animal){
		System.out.println("\n \n ANIMALS IN THE JUNGLE\n");
		System.out.printf("%-20s %10s\n", "HERBIVORES ANIMAL","STRENGTH");
		System.out.printf("----------------------------------------------");
			for(int i=0;i<animal.size();i++){
				if(animal.get(i).getType().equals("HERBIVORES")){
				System.out.printf("\n%-15s %10s\n", animal.get(i).getName(),animal.get(i).getStrength());
				}
			}
			System.out.printf("\n\n%-20s %10s\n", "CARNIVORES ANIMAL","STRENGTH");
		System.out.printf("----------------------------------------------");
			for(int i=0;i<animal.size();i++){
				if(animal.get(i).getType().equals("CARNIVORES")){
				System.out.printf("\n%-15s %10s\n", animal.get(i).getName(),animal.get(i).getStrength());
				}
			}
		do{
			
			
			int randm1= randNum();
			int randm2= randNum();
			//System.out.println("RANDOM NUMBER"+randm1+"   "+randm2);
			if (randm1!=randm2){
						/* 		try {
					Thread.sleep(1500);                 //1500 milliseconds is one second.
				} catch(InterruptedException ex) {
					Thread.currentThread().interrupt();
				} */
				System.out.println("\n ANIMALS IN THE RING "+animal.get(randm1).getName() +" AND "+ animal.get(randm2).getName());
				if(animal.get(randm1).getType().equals("HERBIVORES")&&animal.get(randm2).getType().equals("HERBIVORES")){
					System.out.println("HERBIVORES ANIMALS WON'T FIGHT");
				}
				 else if(animal.get(randm1).getStrength()>animal.get(randm2).getStrength()){
					/* 				try {
					Thread.sleep(2000);                 //1500 milliseconds is one second.
				} catch(InterruptedException ex) {
					Thread.currentThread().interrupt();
				} */
				System.out.println("\n ANIMAL "+animal.get(randm1).getName()+" WINS");
				animal.get(randm2).setStrength(animal.get(randm2).getStrength()/2);
						/* 			try {
						Thread.sleep(1500);                 //1500 milliseconds is one second.
					} catch(InterruptedException ex) {
						Thread.currentThread().interrupt();
					} */
				System.out.println("Strength of "+animal.get(randm2).getName() +" is "+animal.get(randm2).getStrength());
					if(animal.get(randm2).getStrength()<=10){
							/* 				try {
						Thread.sleep(3000);                 //1500 milliseconds is one second.
					} catch(InterruptedException ex) {
						Thread.currentThread().interrupt();
					} */
						
						System.out.println("ANIMAL "+animal.get(randm2).getName()+" IS DEAD");
						//deadAnimal.add(new String());
						deadAnimal.add(animal.get(randm2).getName());
						animal.remove(randm2);
					}
				}
				else if(animal.get(randm1).getStrength()<animal.get(randm2).getStrength()){
								/* 	try {
					Thread.sleep(2000);                 //1500 milliseconds is one second.
				} catch(InterruptedException ex) {
					Thread.currentThread().interrupt();
				} */
					System.out.println("\n ANIMAL "+animal.get(randm2).getName()+" WINS");
					animal.get(randm1).setStrength(animal.get(randm1).getStrength()/2);
									/* 		try {
							Thread.sleep(1500);                 //1500 milliseconds is one second.
						} catch(InterruptedException ex) {
							Thread.currentThread().interrupt();
						} */
					System.out.println("Strength of "+animal.get(randm1).getName() +" is "+animal.get(randm1).getStrength());
					if(animal.get(randm1).getStrength()<=10){
								/* 		try {
						Thread.sleep(3000);                 //1500 milliseconds is one second.
					} catch(InterruptedException ex) {
						Thread.currentThread().interrupt();
					} */
											System.out.println("ANIMAL "+animal.get(randm1).getName()+" IS DEAD");
											deadAnimal.add(animal.get(randm1).getName());
							animal.remove(randm1);
					}
				}

			}
			//else
				//System.out.println("SAME ANIMALS......CANNOT FIGHT");
		}while(animal.size()!=1);
					try {
				Thread.sleep(5000);                 //1500 milliseconds is one second.
			} catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
			for(int i=0;i<deadAnimal.size();i++){
			System.out.println("DEAD ANIMAL : "+deadAnimal.get(i));
			}
		System.out.println("\n\n|***************************************************|");
		System.out.println("|******************WINNER IS "+animal.get(0).getName()+"******************|");
		System.out.println("|***************************************************|");
	}
	//public void fight(randm1,randm2,ArrayList<Animal> animal){
		
	
}