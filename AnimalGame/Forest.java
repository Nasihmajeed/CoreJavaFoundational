import java.util.*;
class Forest{
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
		System.out.println("|******WELCOME TO THE JUNGLE*******|");
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
		System.out.printf("%-15s %10s\n", "ANIMAL","STRENGTH");
		System.out.printf("--------------------------------");
			for(int i=0;i<animal.size();i++){
				System.out.printf("\n%-15s %10s\n", animal.get(i).name,animal.get(i).strength);
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
				System.out.println("\n ANIMALS IN THE RING "+animal.get(randm1).name +" AND "+ animal.get(randm2).name);
				if(animal.get(randm1).strength>animal.get(randm2).strength){
					/* 				try {
					Thread.sleep(2000);                 //1500 milliseconds is one second.
				} catch(InterruptedException ex) {
					Thread.currentThread().interrupt();
				} */
				System.out.println("\n ANIMAL "+animal.get(randm1).name+" WINS");
				animal.get(randm2).strength=animal.get(randm2).strength/2;
						/* 			try {
						Thread.sleep(1500);                 //1500 milliseconds is one second.
					} catch(InterruptedException ex) {
						Thread.currentThread().interrupt();
					} */
				System.out.println("Strength of "+animal.get(randm2).name +" is "+animal.get(randm2).strength);
					if(animal.get(randm2).strength<=10){
							/* 				try {
						Thread.sleep(3000);                 //1500 milliseconds is one second.
					} catch(InterruptedException ex) {
						Thread.currentThread().interrupt();
					} */
						
						System.out.println("ANIMAL "+animal.get(randm2).name+" IS DEAD");
						//deadAnimal.add(new String());
						deadAnimal.add(animal.get(randm2).name);
						animal.remove(randm2);
					}
				}
				else if(animal.get(randm1).strength<animal.get(randm2).strength){
								/* 	try {
					Thread.sleep(2000);                 //1500 milliseconds is one second.
				} catch(InterruptedException ex) {
					Thread.currentThread().interrupt();
				} */
					System.out.println("\n ANIMAL "+animal.get(randm2).name+" WINS");
					animal.get(randm1).strength=animal.get(randm1).strength/2;
									/* 		try {
							Thread.sleep(1500);                 //1500 milliseconds is one second.
						} catch(InterruptedException ex) {
							Thread.currentThread().interrupt();
						} */
					System.out.println("Strength of "+animal.get(randm1).name +" is "+animal.get(randm1).strength);
					if(animal.get(randm1).strength<=10){
								/* 		try {
						Thread.sleep(3000);                 //1500 milliseconds is one second.
					} catch(InterruptedException ex) {
						Thread.currentThread().interrupt();
					} */
											System.out.println("ANIMAL "+animal.get(randm1).name+" IS DEAD");
											deadAnimal.add(animal.get(randm1).name);
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
		System.out.println("|******************WINNER IS "+animal.get(0).name+"******************|");
		System.out.println("|***************************************************|");
	}
	//public void fight(randm1,randm2,ArrayList<Animal> animal){
		
	
}