public class Car{

int myear;
String company;
String model;
String color;
String manufact;
AudioSystem audio1;
Tyre[] tyres;





public void startCar(){

System.out.println("The "+this.myear+" made "+this.color+"  color "+this.company+" " +this.model+" manufactured in "+this.manufact+" has started\n\n");
}

public void playMusic()
{
this.audio1.playMusic();

}
public void tyreDetails(){
for(int i=0;i<=3;i++)
{

tyres[i].tyreDetails();
}





}







}
