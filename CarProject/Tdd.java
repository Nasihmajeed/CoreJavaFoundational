public class Tdd{
public static void main(String[] args)
{

Car car= new Car();
car.myear=1996;
car.company="NISSAN";
car.model="Patrol";
car.color="Black";
car.manufact="India";

 AudioSystem audio1= new AudioSystem();
 audio1.brand="JBL";
 audio1.noOfSpeaker=4;
 car.audio1=audio1;
 Tyre[] tyres=new Tyre[4];
 
 tyres[0] = new Tyre("MRF","zapper",15,"front right");
 tyres[1] = new Tyre("BRIDGESTONE","ULTRAGRIP",15,"front left");
 tyres[2] = new Tyre("CEAT","GRIPPER",25,"rear right");
 tyres[3] = new Tyre("MICHELLiIN","NYLOGRIP",25,"rear left");
 car.tyres=tyres;
 
car.startCar();
car.playMusic();
car.tyreDetails();


}



}
