import java.util.*;
class Animal{
	String name;
	int strength;
	ArrayList<Animal> animal=new ArrayList<Animal>();
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
public void addAnimal(ArrayList<Animal> animal){
	for(int i=0;i<10;i++){
		animal.add(new Animal());
	}
	animal.get(0).setName("TIGER");
	animal.get(0).setStrength(85);
	//animal.add(new Animal());
	animal.get(1).setName("LION");
	animal.get(1).setStrength(88);
	//animal.add(new Animal());
	animal.get(2).setName("CHEETAH");
	animal.get(2).setStrength(80);
	//animal.add(new Animal());
	animal.get(3).setName("FOX");
	animal.get(3).setStrength(75);
	
	animal.get(4).setName("ELEPHANT");
	animal.get(4).setStrength(86);
	
	animal.get(5).setName("BEAR");
	animal.get(5).setStrength(84);
	
	animal.get(6).setName("BULL");
	animal.get(6).setStrength(87);
	
	animal.get(7).setName("DEER");
	animal.get(7).setStrength(60);
	
	animal.get(8).setName("SNAKE");
	animal.get(8).setStrength(79);
	
	animal.get(9).setName("PANTHER");
	animal.get(9).setStrength(82);
	
	/* animal.get(10).setName("LEOPARD");
	animal.get(10).setStrength(83); */
}
}