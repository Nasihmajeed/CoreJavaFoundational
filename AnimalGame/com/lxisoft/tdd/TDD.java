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
		
		//FIXME modify the following method names. Preferred format: verb+noun(eg. eatFood()
		denseForest.creatingNewAnimals(2);
		denseForest.totalAnimalsInForest();
		denseForest.randomAnimalsMeetAndFight();
		denseForest.survivedAnimalNameAndDetails();
		
				
	}
}
