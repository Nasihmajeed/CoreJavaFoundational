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
 Tyre t1=new Tyre();
 Tyre t2=new Tyre();
 Tyre t3=new Tyre();
 Tyre t4=new Tyre();
 car.t1=t1;
 car.t2=t2;
 car.t3=t3;
 car.t4=t4;
 
 t1.company="MRF";
 t1.design="zapper";
 t1.width=15;
 t1.position="front right";
 
 t2.company="BRIDGESTONE";
 t2.design="ULTRAGRIP";
 t2.width=15;
 t2.position="front left";
 
 t3.company="CEAT";
 t3.design="GRIPPER";
 t3.width=25;
 t3.position="rear right";
 
 t4.company="MICHELLiIN";
 t4.design="NYLOGRIP";
 t4.width=25;
 t4.position="rear left";
 

 
 
 


car.startCar();
car.playMusic();
car.tyreDetails();


}



}
