package com.lxisoft.hotel;
import java.util.Scanner;
import java.util.ArrayList;
public class Menu{

	Order order=new Order();
	Food food=new Food();

   
    Scanner scanner=new Scanner(System.in);
    ArrayList<Food> menuList = new ArrayList<Food>();

     public void printMenuDetails(){


        menuList.add(new Food());
        menuList.get(0).setFoodName("VEG MEALS");
        menuList.get(0).setFoodPrice(60);

        menuList.add(new Food());
        menuList.get(1).setFoodName("NON VEG MEALS");
        menuList.get(1).setFoodPrice(80);

        menuList.add(new Food());
        menuList.get(2).setFoodName("VEG BIRIYANI");
        menuList.get(2).setFoodPrice(100);

        menuList.add(new Food());
        menuList.get(3).setFoodName("NON BIRIYANI");
        menuList.get(3).setFoodPrice(150);




        for(int i=0;i<menuList.size();i++){
            System.out.println("\n"+menuList.get(i).getFoodName()+"\t \t"+menuList.get(i).getFoodPrice());  
            }










    
        
            System.out.println("SELECT THE OPERATIONS");
            System.out.println("1. ADD");
            System.out.println("2. DELETE");
        
            

            int choice=scanner.nextInt();


            switch(choice){
                case 1:System.out.println("ADD IN MENULIST");
                 System.out.println("Enter the food items to be added");


                 String itemname=scanner.nextLine();
                  menuList.add(new Food());
                menuList.get(4).setFoodName(itemname);

                System.out.println("Enter the food prize to be added");
                int itemprice=scanner.nextInt();

               
                menuList.get(4).setFoodPrice(itemprice);

                for(int i=0;i<menuList.size();i++){
                System.out.println("\n"+menuList.get(i).getFoodName()+"\t \t"+menuList.get(i).getFoodPrice()); 
                }
                break;


                
                case 2:System.out.println("Enter the index Number of item to be deleted");
                int indexnumber=scanner.nextInt();

                menuList.remove(indexnumber);
                System.out.println("The menu after deletion is ");


                for(int i=0;i<menuList.size();i++){
                System.out.println("\n"+menuList.get(i).getFoodName()+"\t \t"+menuList.get(i).getFoodPrice());  
                }
                break;
                default:
                System.out.println("Wrong input");


               






            }
        }
    }

















      /*  public void addDynamically(){

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


        public void removeDynamically(){
            System.out.println("Enter the index Number of item to be deleted");
            int indexnumber=scanner.nextInt();

            menuList.remove(indexnumber);
            System.out.println("The menu after deletion is ");


             for(int i=0;i<menuList.size();i++){
            System.out.println("\n"+menuList.get(i).getFoodName()+"\t \t"+menuList.get(i).getFoodPrice());  
            }

        }

        public void modifyDynamically(){
            System.out.println("Enter the index of the array to be modified");
            int indexnumber=scanner.nextInt();

            menuList//code to modify
        }




        }*/
    
      
     


     


     	




         









        
        

