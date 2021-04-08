import java.util.*;
class Forest{
	ArrayList<Animal> animal=new ArrayList<Animal>();
	Animal a=new Animal();
	public int randNum(){
		int random=(int)(Math.random()*4);
                return random;
	}
	/* 			
	public int randNum2(){
		int random2=(int)(Math.random()*4);
                return random2;
	} */
	public void forestDetails(){
		System.out.println("WELCOME TO THE JUNGLE");
		a.addAnimal(animal);
		fight(animal);
	}
	public void fight(ArrayList<Animal> animal){
		for(int i=0;i<15;i++){
			int randm1= randNum();
			int randm2= randNum();
			//System.out.println("RANDOM NUMBER"+randm1+"   "+randm2);
			if (randm1!=randm2){
				System.out.println("ANIMALS IN THE RING "+animal.get(randm1).name +" AND "+ animal.get(randm2).name);
				if(animal.get(randm1).strength>animal.get(randm2).strength){
				System.out.println("ANIMAL "+animal.get(randm1).name+" WINS");
				animal.get(randm2).strength=animal.get(randm2).strength/2;
				System.out.println("Strength of "+animal.get(randm2).name +" is "+animal.get(randm2).strength);
					if(animal.get(randm2).strength<10){
						
						System.out.println("ANIMAL "+animal.get(randm2).name+"IS DEAD");
					}
				}
				else{
					System.out.println("ANIMAL "+animal.get(randm2).name+" WINS");
					animal.get(randm1).strength=animal.get(randm1).strength/2;
					System.out.println("Strength of "+animal.get(randm1).name +" is "+animal.get(randm1).strength);
				}

			}
			else
				System.out.println("SAME ANIMALS......CANNOT FIGHT");
		}
	}
	//public void fight(randm1,randm2,ArrayList<Animal> animal){
		
	
}