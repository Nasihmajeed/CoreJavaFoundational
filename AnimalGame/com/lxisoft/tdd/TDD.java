 //Packages

package com.lxisoft.tdd;
import com.lxisoft.forest.Animal;
import com.lxisoft.forest.Forest; 
import java.util.ArrayList;
import java.util.List;

public class TDD {
	public static void main (String [] args) {
		
		List<Animal> animals = new ArrayList<Animal>();
		
		Forest denseForest=new Forest();
		
		denseForest.setAnimals(animals);
		
		Forest Animal=new Forest();	
					
		// Printing Sections Forest Details		

		denseForest.setForestName("Amazon Forest");
		System.out.println("Forest Name : "+ denseForest.getForestName()+"\n");
		
		denseForest.animalDetails(5);
		denseForest.showAllAnimals();
		denseForest.fight();
				
	}
}