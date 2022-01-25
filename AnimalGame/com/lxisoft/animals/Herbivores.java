package com.lxisoft.animals;
import java.*;
import com.lxisoft.game.Animal;
import com.lxisoft.factors.MyException;
import com.lxisoft.*;

public interface Herbivores {

    public static void escapeFromEnemy(Animal player1,Animal player2){ 
        try{
        if(player1 instanceof Carnivores && player2 instanceof Herbivores){
    System.out.println(player2.getName() +" escaping ..........");
    
        }
        else if(player1 instanceof Herbivores && player2 instanceof Carnivores){
            System.out.println(player1.getName() +" escaping ............");
            
        }
        throw new MyException("Players are Just Escaping");
    }catch(MyException e) {
        System.out.println(e);
     }
    }
    
       
}
