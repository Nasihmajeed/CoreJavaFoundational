package com.lxisoft.hotel;
import java.util.Scanner;
import java.util.ArrayList;
public class Menu{

	//Order order=new Order();
	Food food=new Food();

   
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
            menuList.get(4).setFoodName(itemname);
            menuList.get(4).setFoodPrice(itemprice);

             for(int i=0;i<menuList.size();i++){
            System.out.println("\n"+menuList.get(i).getFoodName()+"\t \t"+menuList.get(i).getFoodPrice());  
            }
        }




      

        

        
            public void getOrderDetails(){
                System.out.println("GIVE YOUR ORDER PLEASE");
                System.out.println("PRESS 5 TO QUIT");
                boolean quit= false;
                int sum=0;
                String order=" ";
                
                do{
             for(int i=0;i<menuList.size();i++){
            System.out.println("\n"+menuList.get(i).getFoodName()+"\t \t"+menuList.get(i).getFoodPrice());  

            }

            int indexnumber=scanner.nextInt();
                switch(indexnumber){
                    case 1:
                    System.out.println(menuList.get(0).getFoodName());
                    sum=sum+menuList.get(0).getFoodPrice();
                    order=order.concat(menuList.get(0).getFoodName());
                    break;

                    case 2:
                    System.out.println(menuList.get(1).getFoodName());
                    sum=sum+menuList.get(1).getFoodPrice();
                    order=order.concat(menuList.get(1).getFoodName());
                    break;

                    case 3:
                    System.out.println(menuList.get(2).getFoodName());
                    sum=sum+menuList.get(2).getFoodPrice();
                    order=order.concat(menuList.get(2).getFoodName());
                    break;

                    case 4:
                    System.out.println(menuList.get(3).getFoodName());
                    sum=sum+menuList.get(3).getFoodPrice();
                    order=order.concat(menuList.get(3).getFoodName());
                    break;

                    case 5:
                    quit=true;
                    default:
                    System.out.println("Wrong input");

                }  
            
           }while(!quit);
             System.out.println("-----------------------------------------------");
        System.out.println("-Your Orders are:\n-"+order);
        System.out.println("-----------------------------------------------");
        System.out.println("Your total bill="+sum);
        System.out.println("Thank you");
    
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


            public void addingTOArrayList(){
                menuList.get(5).setFoodName(food.drinks("mangoshake"));
            }

           
        }
