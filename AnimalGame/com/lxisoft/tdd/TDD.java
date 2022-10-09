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

		denseForest.setForestName("\n"+"Forest Name : Amazon Forest");
		System.out.println(denseForest.getForestName()+"\n");
		
		denseForest.animalDetails();
		denseForest.meetAnimals();
				
	}
}