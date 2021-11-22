public class Car {
String name;
String model;
String RegNo;
String colour;

Tyre t1;
Tyre t2;
Tyre t3;
Tyre t4;

public void inputDetails() {


this.name= "Maruthi";
this.model= "Maruthi 800";
this.RegNo= "Kl-09-AB-9003";
this.colour= "Red";


this.t1.brand="MRF";
this.t1.radius="3.5";
this.t1.position="Front Right";

this.t2.brand="MRF";
this.t2.radius="3.5";
this.t2.position="Front Left";

this.t3.brand="MRF";
this.t3.radius="3.5";
this.t3.position="Back Left";

this.t4.brand="MRF";
this.t4.radius="3.5";
this.t4.position="Back Right";


}
void printDetails()
{
System.out.println("CAR NAME:" +name);
System.out.println("CAR MODEL:" +model);
System.out.println("CAR REGISTER NUMBER:" +RegNo);
System.out.println("CAR COLOUR:" +colour);

t1.printDetails();
t2.printDetails();
t3.printDetails();
t4.printDetails();
}
}