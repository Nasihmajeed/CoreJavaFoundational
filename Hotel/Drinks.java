import java.util.ArrayList;
import java.util.*;
class Drinks{
	int nos,idNo;
	String drinksName;
	float cost;
public static ArrayList<Drinks> drinks=new ArrayList<Drinks>(10);
	public Drinks(){
		this.nos=nos;
		this.drinks=drinks;
		this.cost=cost;
		this.idNo=idNo;
	}
	public void setIdno(int idNo){
		this.idNo=idNo;
	}
	public int getIdno(){
		return idNo;
	}
	public void setDrinksName(String drinksName){
		this.drinksName=drinksName;
	}
	public String getDrinksName(){
		return drinksName;
		
	}
	public void setCost(float cost){
		this.cost=cost;
	}
	public float getCost(){
		return cost;
		
	}
	public void setNos(int nos){
		this.nos=nos;
	}
	public int getNos(){
		return nos;
	}
	
	public void addDrinks(ArrayList<Drinks> drinks){
		Drinks[] d=new Drinks[10];
		for(int i=0;i<10;i++){
		d[i]=new Drinks();
		}
	
		d[0].setDrinksName("7-up");
		d[0].setCost(35);
		d[0].setNos(0);
		d[0].setIdno(1);
		
		d[1].setDrinksName("Mirinda");
		d[1].setCost(30);
		d[1].setNos(0);
		d[1].setIdno(2);
		
		d[2].setDrinksName("RedBull");
		d[2].setCost(110);
		d[2].setNos(0);
		d[2].setIdno(3);
		
		d[3].setDrinksName("Frooti");
		d[3].setCost(10);
		d[3].setNos(0);
		d[3].setIdno(4);
		
		d[4].setDrinksName("Frooti");
		d[4].setCost(10);
		d[4].setNos(0);
		d[4].setIdno(5);
		
		d[5].setDrinksName("Frooti");
		d[5].setCost(10);
		d[5].setNos(0);
		d[5].setIdno(6);
		
		d[6].setDrinksName("Frooti");
		d[6].setCost(10);
		d[6].setNos(0);
		d[6].setIdno(7);
		
		d[7].setDrinksName("Frooti");
		d[7].setCost(10);
		d[7].setNos(0);
		d[7].setIdno(8);
		
		d[8].setDrinksName("Frooti");
		d[8].setCost(10);
		d[8].setNos(0);
		d[8].setIdno(9);
		
		d[9].setDrinksName("Frooti");
		d[9].setCost(10);
		d[9].setNos(0);
		d[9].setIdno(10);
		
		for(int i=0;i<10;i++){
		drinks.add(d[i]);
		}
	}
    public void printDrinksMenu(ArrayList<Drinks> drinks){
	    //addMenu(food);
		System.out.println("**********************************");
		System.out.println("MENU LIST");
		System.out.println("**********************************");

		int j=1;
		for(int i=0;i<drinks.size();i++){
			if(j<=drinks.size()){
			System.out.println(j+" : "+ drinks.get(i).getDrinksName()+"  "+drinks.get(i).getCost());
			j++;
		}
		}
	}
}
		