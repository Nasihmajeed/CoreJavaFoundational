import java.util.*;
class Forest{
		ArrayList<Animal> herbAnimal=new ArrayList<Animal>();
	ArrayList<Animal> carnAnimal=new ArrayList<Animal>();
	ArrayList<String> deadAnimal=new ArrayList<String>();
	Animal a=new Animal();
	public int randNum(){
		int random=(int)(Math.random()*carnAnimal.size());
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
		a.addAnimal(herbAnimal,carnAnimal);
				try {
			Thread.sleep(1500);                 //1500 milliseconds is one second.
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		fight(herbAnimal,carnAnimal);
	}
	public void fight(ArrayList<Animal> herbAnimal,ArrayList<Animal> carnAnimal){
		System.out.println("\n \n ANIMALS IN THE JUNGLE\n");
		System.out.printf("%-20s %10s\n", "HERBIVORES ANIMAL","STRENGTH");
		System.out.printf("----------------------------------------------");
			for(int i=0;i<carnAnimal.size();i++){
				System.out.printf("\n%-15s %10s\n", herbAnimal.get(i).name,herbAnimal.get(i).strength);
			}
			System.out.printf("\n\n%-20s %10s\n", "CARNIVORES ANIMAL","STRENGTH");
		System.out.printf("----------------------------------------------");
			for(int i=0;i<carnAnimal.size();i++){
				System.out.printf("\n%-15s %10s\n", carnAnimal.get(i).name,carnAnimal.get(i).strength);
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
				System.out.println("\n ANIMALS IN THE RING "+carnAnimal.get(randm1).name +" AND "+ carnAnimal.get(randm2).name);
				if(carnAnimal.get(randm1).strength>carnAnimal.get(randm2).strength){
					/* 				try {
					Thread.sleep(2000);                 //1500 milliseconds is one second.
				} catch(InterruptedException ex) {
					Thread.currentThread().interrupt();
				} */
				System.out.println("\n ANIMAL "+carnAnimal.get(randm1).name+" WINS");
				carnAnimal.get(randm2).strength=carnAnimal.get(randm2).strength/2;
						/* 			try {
						Thread.sleep(1500);                 //1500 milliseconds is one second.
					} catch(InterruptedException ex) {
						Thread.currentThread().interrupt();
					} */
				System.out.println("Strength of "+carnAnimal.get(randm2).name +" is "+carnAnimal.get(randm2).strength);
					if(carnAnimal.get(randm2).strength<=10){
							/* 				try {
						Thread.sleep(3000);                 //1500 milliseconds is one second.
					} catch(InterruptedException ex) {
						Thread.currentThread().interrupt();
					} */
						
						System.out.println("ANIMAL "+carnAnimal.get(randm2).name+" IS DEAD");
						//deadAnimal.add(new String());
						deadAnimal.add(carnAnimal.get(randm2).name);
						carnAnimal.remove(randm2);
					}
				}
				else if(carnAnimal.get(randm1).strength<carnAnimal.get(randm2).strength){
								/* 	try {
					Thread.sleep(2000);                 //1500 milliseconds is one second.
				} catch(InterruptedException ex) {
					Thread.currentThread().interrupt();
				} */
					System.out.println("\n ANIMAL "+carnAnimal.get(randm2).name+" WINS");
					carnAnimal.get(randm1).strength=carnAnimal.get(randm1).strength/2;
									/* 		try {
							Thread.sleep(1500);                 //1500 milliseconds is one second.
						} catch(InterruptedException ex) {
							Thread.currentThread().interrupt();
						} */
					System.out.println("Strength of "+carnAnimal.get(randm1).name +" is "+carnAnimal.get(randm1).strength);
					if(carnAnimal.get(randm1).strength<=10){
								/* 		try {
						Thread.sleep(3000);                 //1500 milliseconds is one second.
					} catch(InterruptedException ex) {
						Thread.currentThread().interrupt();
					} */
											System.out.println("ANIMAL "+carnAnimal.get(randm1).name+" IS DEAD");
											deadAnimal.add(carnAnimal.get(randm1).name);
							carnAnimal.remove(randm1);
					}
				}

			}
			//else
				//System.out.println("SAME ANIMALS......CANNOT FIGHT");
		}while(carnAnimal.size()!=1);
					try {
				Thread.sleep(5000);                 //1500 milliseconds is one second.
			} catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
			for(int i=0;i<deadAnimal.size();i++){
			System.out.println("DEAD ANIMAL : "+deadAnimal.get(i));
			}
		System.out.println("\n\n|***************************************************|");
		System.out.println("|******************WINNER IS "+carnAnimal.get(0).name+"******************|");
		System.out.println("|***************************************************|");
	}
	//public void fight(randm1,randm2,ArrayList<Animal> animal){
		
	
}