//Packages

package com.lxisoft.tdd;
import com.lxisoft.forest.Animal;
import com.lxisoft.forest.Forest; 
import java.util.ArrayList;
import java.util.List;

public class TDD {
	public static void main (String [] args) {
			
		Forest denseForest=new Forest();
								
		// Forest Details		

		denseForest.setName("Amazon Forest");
		
		denseForest.initializeAnimals();
		denseForest.countAnimalsInForest();
		denseForest.coutingCarnivores();
		denseForest.startFight();
		denseForest.survivedAnimalNameAndDetails();
		System.out.println("Forest Name : "+ denseForest.getname()+"\n");
				
	}
}