public class Car{

int myear;
String company;
String model;
String color;
String manufact;
AudioSystem audio1;
Tyre t1;
Tyre t2;
Tyre t3;
Tyre t4;


public void startCar(){

System.out.println("The "+this.myear+" made "+this.color+"  color "+this.company+" " +this.model+" manufactured in "+this.manufact+" has started");



}

public void playMusic()
{
this.audio1.playMusic();

}
public void tyreDetails(){

this.t1.tyreDetails();
this.t2.tyreDetails();
this.t3.tyreDetails();
this.t3.tyreDetails();




}







}
