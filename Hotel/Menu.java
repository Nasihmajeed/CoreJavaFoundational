import java.util.Scanner;
import java.util.ArrayList;
public class Menu{

    //Order order=new Order();
    Food food=new Food();
  //  Dummy dummy=new Dummy();

   
    Scanner scanner=new Scanner(System.in);
    ArrayList<Food> menuList = new ArrayList<Food>();

     public void printMenuDetails(){

       

        menuList.add(new Food());
        menuList.get(0).setFoodName("TEA");
        menuList.get(0).setFoodPrice(10);

        menuList.add(new Food());
        menuList.get(1).setFoodName("COFFEE");
        menuList.get(1).setFoodPrice(15);

        menuList.add(new Food());
        menuList.get(2).setFoodName("SANDWICH");
        menuList.get(2).setFoodPrice(100);

        menuList.add(new Food());
        menuList.get(3).setFoodName("BURGER");
        menuList.get(3).setFoodPrice(200);

        menuList.add(new Food());
        menuList.get(4).setFoodName("MANGO SHAKE");
        menuList.get(4).setFoodPrice(120);


        food.print();




        for(int i=0;i<menuList.size();i++){
            System.out.println("\n"+menuList.get(i).getFoodName()+"\t \t"+menuList.get(i).getFoodPrice());  
            }
        }

       public void addDynamically(){

            System.out.println("Enter the food items to be added");
            String itemname=scanner.nextLine();


            System.out.println("Enter the food prize to be added");
            int itemprice=scanner.nextInt();

            menuList.add(new Food());
            menuList.get(5).setFoodName(itemname);
            menuList.get(5).setFoodPrice(itemprice);

             for(int i=0;i<menuList.size();i++){
            System.out.println("\n"+menuList.get(i).getFoodName()+"\t \t"+menuList.get(i).getFoodPrice());  
            }
        }
        
            public void getOrderDetails(){
                System.out.println("How many items do you wish to have");
                int itemNumber=scanner.nextInt();
                int sum=0;
                int total=0;
                int grantTotal=0;
                  ArrayList<Food> orderList = new ArrayList<Food>();

                    for(int i=0;i<=itemNumber;i++){

                        System.out.println("Enter the index number of  items which you want");
                        int indexNumber=scanner.nextInt();
                        System.out.println("How much quantity do you want");
                        int quantity=scanner.nextInt();
                        total=menuList.get(indexNumber).getFoodPrice()*quantity;
                       System.out.println("Your order and price is"+menuList.get(indexNumber).getFoodName() +"      "+total);
                       orderList.add(new Food());
                       orderList.get(i).setFoodPrice(total);
                       grantTotal=grantTotal+orderList.get(i).getFoodPrice();
                       System.out.println("Your total bill is"+grantTotal);

        
                                           }


                }
               
             

             public void removeDynamically(){
            System.out.println("Enter the index Number of item to be deleted");
            int indexnumber=scanner.nextInt();

            menuList.remove(indexnumber);
            System.out.println("The menu after deletion is ");


             for(int i=0;i<menuList.size();i++){
            System.out.println("\n"+menuList.get(i).getFoodName()+"\t \t"+menuList.get(i).getFoodPrice());  
            }
        }

            public void  modifyNameDynamically(){
                System.out.println("Enter the index number to be modified");
                int indexnumber=scanner.nextInt();
                System.out.println("Enter the new name");
                String newName=scanner.next();
                menuList.get(indexnumber).setFoodName(newName);
                for(int i=0;i<menuList.size();i++){
            System.out.println("\n"+menuList.get(i).getFoodName()+"\t \t"+menuList.get(i).getFoodPrice());  

            }
               
            }

            public void modifyPriceDynamically(){
                System.out.println("Enter the index number where price is to be modified");
                int indexNumber=scanner.nextInt();
                System.out.println("Enter the new price");
                int newPrice=scanner.nextInt();
                 menuList.get(indexNumber).setFoodPrice(newPrice);
                   for(int i=0;i<menuList.size();i++){
            System.out.println("\n"+menuList.get(i).getFoodName()+"\t \t"+menuList.get(i).getFoodPrice());  

            }
            }


          

        }