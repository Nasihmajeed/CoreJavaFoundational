import java.util.*;
class Animal{
	String name;
	int strength;
	ArrayList<Animal> herbAnimal=new ArrayList<Animal>();
	ArrayList<Animal> carnAnimal=new ArrayList<Animal>();
public void setName(String name){
	this.name=name;
}
public String getName(){
	return name;
}
public void setStrength(int strength){
	this.strength=strength;
}
public int getStrength(){
	return strength;
}
public void addAnimal(ArrayList<Animal> herbAnimal,ArrayList<Animal> carnAnimal){
	for(int i=0;i<5;i++){
		herbAnimal.add(new Animal());
	}
	herbAnimal.get(0).setName("DEER");
	herbAnimal.get(0).setStrength(40);
	//animal.add(new Animal());
	herbAnimal.get(1).setName("BUFFALLO");
	herbAnimal.get(1).setStrength(50);
	//animal.add(new Animal());
	herbAnimal.get(2).setName("GIRAFFE");
	herbAnimal.get(2).setStrength(45);
	//animal.add(new Animal());
	herbAnimal.get(3).setName("ELEPHANT");
	herbAnimal.get(3).setStrength(90);
	
	herbAnimal.get(4).setName("COW");
	herbAnimal.get(4).setStrength(38);
	
	for(int i=0;i<5;i++){
		carnAnimal.add(new Animal());
	}
	carnAnimal.get(0).setName("TIGER");
	carnAnimal.get(0).setStrength(84);
	
	carnAnimal.get(1).setName("LION");
	carnAnimal.get(1).setStrength(87);
	
	carnAnimal.get(2).setName("CHEETAH");
	carnAnimal.get(2).setStrength(60);
	
	carnAnimal.get(3).setName("FOX");
	carnAnimal.get(3).setStrength(79);
	
	carnAnimal.get(4).setName("PANTHER");
	carnAnimal.get(4).setStrength(82);
	
	/* carnAnimal.get(5).setName("LEOPARD");
	carnAnimal.get(5).setStrength(83); */
}
}