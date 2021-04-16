import java.util.*;
class Forest{
	ArrayList<Animal> animal=new ArrayList<Animal>();
	public void animalDetails(){
		animal.add(new Lion());
		animal.get(0).setName("lion");
		animal.get(0).setStrength(95);
		animal.get(0).setLife(true);
		
		animal.add(new Fox());
		animal.get(1).setName("fox");
		animal.get(1).setStrength(85);
		animal.get(1).setLife(true);
		
		animal.add(new Tiger());
		animal.get(2).setName("tiger");
		animal.get(2).setStrength(90);
		animal.get(2).setLife(true);
		
		animal.add(new Cheetah());
		animal.get(3).setName("cheetah");
		animal.get(3).setStrength(93);
		animal.get(3).setLife(true);
		
		animal.add(new Deer());
		animal.get(4).setName("deer");
		animal.get(4).setStrength(30);
		animal.get(4).setLife(true);
		
		animal.add(new Elephant());
		animal.get(5).setName("elephant");
		animal.get(5).setStrength(93);
		animal.get(5).setLife(true);
		
		animal.add(new Giraffe());
		animal.get(6).setName("giraffe");
		animal.get(6).setStrength(32);
		animal.get(6).setLife(true);
		
	}
	
	public int randNum(){
		int s=animal.size();
		int random=(int)(Math.random()*s);
                return random;
	}
	
	public void fight(){
		int randm1,randm2;
		do{
			randm1=randNum();
			randm2=randNum();
			if(randm1 !=randm2){
				System.out.println("ANIMALS IN THE RING "+animal.get(randm1).getName()+" AND "+animal.get(randm2).getName());
				if(animal.get(randm1) instanceof Herbivorous && animal.get(randm2) instanceof Herbivorous){
					System.out.println("NO FIGHT");
				}
				else if(animal.get(randm1) instanceof Herbivorous && animal.get(randm2) instanceof Carnivorous){
					
					if(animal.get(randm1).getStrength() > animal.get(randm2).getStrength()){
					System.out.println("ANIMAL "+animal.get(randm1).getName()+" WINS");
					animal.get(randm2).setStrength(animal.get(randm2).getStrength()/2);
					if(animal.get(randm2).getStrength()<=10){
						System.out.println("ANIMAL "+animal.get(randm2).getName()+" IS DEAD");
						animal.remove(randm2);
					}
					}
					else if(animal.get(randm2).getStrength() > animal.get(randm1).getStrength()){
					System.out.println("ANIMAL "+animal.get(randm2).getName()+" WINS");
					animal.get(randm1).setStrength(animal.get(randm1).getStrength()/2);
					if(animal.get(randm1).getStrength()<=10){
						System.out.println("ANIMAL "+animal.get(randm1).getName()+" IS DEAD");
						animal.remove(randm1);
					}
				}
				}
				else if(animal.get(randm2) instanceof Herbivorous && animal.get(randm1) instanceof Carnivorous){
					
					if(animal.get(randm1).getStrength() > animal.get(randm2).getStrength()){
					System.out.println("ANIMAL "+animal.get(randm1).getName()+" WINS");
					animal.get(randm2).setStrength(animal.get(randm2).getStrength()/2);
					if(animal.get(randm2).getStrength()<=10){
						System.out.println("ANIMAL "+animal.get(randm2).getName()+" IS DEAD");
						animal.remove(randm2);
					}
					}
					else if(animal.get(randm2).getStrength() > animal.get(randm1).getStrength()){
					System.out.println("ANIMAL "+animal.get(randm2).getName()+" WINS");
					animal.get(randm1).setStrength(animal.get(randm1).getStrength()/2);
					if(animal.get(randm1).getStrength()<=10){
						System.out.println("ANIMAL "+animal.get(randm1).getName()+" IS DEAD");
						animal.remove(randm1);
					}
				}
				}
			else if(animal.get(randm2) instanceof Carnivorous && animal.get(randm1) instanceof Carnivorous){
					
					if(animal.get(randm1).getStrength() > animal.get(randm2).getStrength()){
					System.out.println("ANIMAL "+animal.get(randm1).getName()+" WINS");
					animal.get(randm2).setStrength(animal.get(randm2).getStrength()/2);
					if(animal.get(randm2).getStrength()<=10){
						System.out.println("ANIMAL "+animal.get(randm2).getName()+" IS DEAD");
						animal.remove(randm2);
					}
					}
					else if(animal.get(randm2).getStrength() > animal.get(randm1).getStrength()){
					System.out.println("ANIMAL "+animal.get(randm2).getName()+" WINS");
					animal.get(randm1).setStrength(animal.get(randm1).getStrength()/2);
					if(animal.get(randm1).getStrength()<=10){
						System.out.println("ANIMAL "+animal.get(randm1).getName()+" IS DEAD");
						animal.remove(randm1);
					}
				}
				}
			}
		}while(animal.size()!=1);
		System.out.println("\n\n WINNER IS "+animal.get(0).getName());
}
}