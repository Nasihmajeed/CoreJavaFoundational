package com.lxisoft.animalgame;
import java.util.Scanner;
import com.lxisoft.animalgame.Animal;
import com.lxisoft.animalgame.Lion;
import com.lxisoft.animalgame.Tiger;



public class Forest
{    
     
	 Animal[] animal;
	
	public void fight()
	{
		int s;
		animal = new Animal[5];
			
	    animal[0] = new Lion(" Sambu the Lion king ",80);
		animal[1] = new Tiger( " Sherkhan the Tiger ",70);
		animal[2]  = new Rabit( " Mottu the Rabit ",10 );
		animal[3]  = new Wildbull( " Sahal the Wildbull ",90);		
	    animal[4]  = new  Wolf(" Akela the wolf ",40);
		for(s=0;s<5;s++)
		{
			animal[s].display();
		}
        
             
	}
			  
		      
		
	

}