//Packages
package com.lxisoft.Forest;
import java.util.ArrayList;
import java.util.List;
import com.lxisoft.Forest.Animal;

public class Forest {
	
	private List<Animal> animal = new ArrayList<>();
	private String forestName;
	
	public void setForestName(String foresName){
	this.forestName=foresName;	
	}
	
	public String getForestName(){
		return this.forestName;
	}
	
	public void setAnimal(List<Animal> Ani){
	this.animal = Ani;
	}

	public List<Animal> getAnimal (){
	return animal;
	}
			
	public void print(){
		
		for (int i=0; i<animal.size();i++){
			animal.get(i).print();
		}
		System.out.println (this.forestName);
				
	}
}