import java.util.*;
import tDetails.Tyre;
import audio.AudioSystem;
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

 ArrayList<Tyre> tyres = new ArrayList<>();
 Tyre t1 =new  Tyre("MRF","zapper",15,"front right");
 Tyre t2 =new  Tyre("BRIDGESTONE","ULTRAGRIP",15,"front left");
 Tyre t3 =new  Tyre("CEAT","GRIPPER",25,"rear right");
 Tyre t4 =new Tyre("MICHELLiIN","NYLOGRIP",25,"rear left");
 
    tyres.add(t1);
    tyres.add(t2);
    tyres.add(t3);
    tyres.add(t4);
    
   car.tyres=tyres;    

    
car.startCar();
car.playMusic();
car.tyreDetails();


}



}
