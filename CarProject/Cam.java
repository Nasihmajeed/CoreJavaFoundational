class Cam
{
    public static void main(String s[])
    {
        car cars[] = new car[5];
        cars[0] = new car();
        cars[0].name = "maruthi";
        cars[0].model = "maruthi suzuki";
        cars[0].registration = "india";
        cars[0].tire = "MRF";
        cars[0].color = "red";

        cars[1] = new car();
        cars[1].name = "volkswagen";
        cars[1].model = "polo";
        cars[1].registration = "germany";
        cars[1].tire = "ceat";
        cars[1].color = "red";
    
        cars[2] = new car();
        cars[2].name = "suzuki";
        cars[2].model = "suzuki swift";
        cars[2].registration = "india";
        cars[2].tire = "MRF";
        cars[2].color = "red";
    
        cars[3] = new car();
        cars[3].name = "jeep";
        cars[3].model = "compass";
        cars[3].registration = "america";
        cars[3].tire = "michelin";
        cars[3].color = "red";
    
        cars[4] = new car();
        cars[4].name = "toyata";
        cars[4].model = "innova";
        cars[4].registration = "kerala";
        cars[4].tire = "MRF";
        cars[4].color = "red";
    
    
        for(int i = 0; i < cars.length; i++)
        {
            System.out.println(  cars[i].name + " is manufactured in " + cars[i].registration + " it's model is  " + cars[i].model  );
            System.out.println( cars[i].tire+ "is its tire. its colour is " + cars[i].color );
        }
    }

}

class car 
{
    String name;
    String model;
    String registration;
    String tire;
    String color;
}    