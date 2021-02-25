package com.lxisoft.movie;
import com.lxisoft.movie.*;
import java.util.*;

public class Movies{
	String movieName = "C.I.D MOOSA";
	String director = "Jhony Antony";
	String genere = "Comedy";
	Scenes scene = new Scenes();
	ArrayList<Cast> cast = new ArrayList<Cast>();
	public void movieOptions(){
		Scanner s = new Scanner(System.in);
		int option;
		do{
			System.out.println("\n--------------Welcome---------------");
		    System.out.println("Press 1.View Script 2.View Cast 0.Exit");
		    option = s.nextInt();
		    if(option == 1){
		    	this.setMovie();
		    }
		    else if(option == 2){
		    	this.setCast();
		    	this.printCast();
		    }
		}while(option != 0);
	}  
	public void setCast(){
		cast.add(new Cast());
		cast.get(0).setName("Dileep");
		cast.get(0).setAge(38);
		cast.add(new Cast());
		cast.get(1).setName("Jagathy_Sreekumar");
		cast.get(1).setAge(53);
		cast.add(new Cast());
		cast.get(2).setName("Harisree_Asokan");
		cast.get(2).setAge(41);
		cast.add(new Cast());
		cast.get(3).setName("Cochin_Haneefa");
		cast.get(3).setAge(56);
		cast.add(new Cast());
		cast.get(4).setName("Saleem_Kumar");
		cast.get(4).setAge(36);
		cast.add(new Cast());
		cast.get(5).setName("Bhavana");
		cast.get(5).setAge(24);
	}
	public void printCast(){
		Collections.sort(cast);
 
        System.out.println("Movie Cast : ");
        
        for (Cast c: cast)
        {
            System.out.println("Name : "+c.getName()+"\nAge : "+c.getAge()+"\n");
        }
	}
	public void setMovie(){
		System.out.println("+--------------------------------------------------------------------------------------+");
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("|                                   "+movieName+"                                         |");
		System.out.println("|                     Directed by :   "+director+"                                      |");
		System.out.println("|    Genere : "+genere+"                                             IMDb : 7.6/10          |");
		System.out.println("|    Plot   : The adventures of a private detective CID Moosa, who's luck and wit helps |");
		System.out.println("|             him to solve the cases.                                                   |");
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("                                        Scene-1                                          ");
		System.out.println("                                       ---------                                         ");
		System.out.println("+---------------------------------------------------------------------------------------+");
		String des1 = " Moolam kuzhiyil Sahadevan get prepared for the police selection and leaves the home in \n the mid way he tries to stop Thorappan Kochunni from pickpoketting Meena but Shadevan\n too get arrested by S.I.Peethambaran";
		this.slowPrint(des1,50);
		System.out.println("\n+---------------------------------------------------------------------------------------+\n Scene-1 Begins");
		scene.setScene1();
		scene.printScene1();
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("                                        Scene-2                                          ");
		System.out.println("                                       ---------                                         ");
		System.out.println("+---------------------------------------------------------------------------------------+");
		String des2 = " Sahadevan has got expelled from the selection camp as he couldn't get there on Time.   \n So he decided to start his own Private Detective Company ";
		this.slowPrint(des2,50);
		System.out.println("\n+---------------------------------------------------------------------------------------+\n Scene-2 Begins");
		scene.setScene2();
		scene.printScene2();
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("                                        Scene-3                                          ");
		System.out.println("                                       ---------                                         ");
		System.out.println("+---------------------------------------------------------------------------------------+");
		String des3 = "Moosa and team chases an insane man and after long hardwork to capture him they came to\n know he is just a maniac.";
		this.slowPrint(des3,50);
		System.out.println("\n+---------------------------------------------------------------------------------------+\n Scene-3 Begins");
		scene.setScene3();
		scene.printScene3();
		System.out.println("+---------------------------------------------------------------------------------------+");

		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("                                       The End                                          ");
		System.out.println("                                      ----------                                         ");
		System.out.println("+---------------------------------------------------------------------------------------+");
	}
	public void slowPrint(String scne,long delay){
		for(int i=0; i<scne.length();i++){
			System.out.print(scne.charAt(i));
			try{
				Thread.sleep(delay);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}