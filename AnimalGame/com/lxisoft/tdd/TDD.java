//Packages

package com.lxisoft.tdd;
import com.lxisoft.forest.Animal;
import com.lxisoft.forest.Forest; 
import java.util.ArrayList;
import java.util.List;

public class TDD {
	public static void main (String [] args) {
			
		Forest denseForest=new Forest();
								
		// Printing Sections Forest Details		

		denseForest.setForestName("Amazon Forest");
		
		System.out.println("Forest Name : "+ denseForest.getForestName()+"\n");
		
		denseForest.animalDetails(10);
		denseForest.showAllAnimals();
		denseForest.randomAnimalsMeet();
		denseForest.getSurvivedAnimal();
				
	}
}