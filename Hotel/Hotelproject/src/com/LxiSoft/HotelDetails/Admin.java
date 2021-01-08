package com.LxiSoft.HotelDetails;
import java.util.*;

public class Admin 
{
    public void addMenuDetails()
    {
        Edit edit = new Edit();
        int opt;
                do
                {
                    Scanner s = new Scanner(System.in);
                    System.out.println("\n Admin Activity");
                    System.out.println("----------------");
                    System.out.println("1.View Menu \n2.Add \n3.Edit \n4.Delete");
                    int choice = s.nextInt();
                    if(choice==1)
                    {
                        edit.viewMenu();
                    }
                    else if(choice==2)
                    {
                        edit.addMenu();
                    }
                    else if(choice==3)
                    {
                        edit.editMenu();
                    }
                    else if(choice==4)
                    {
                        edit.deleteMenu();
                    }
                    else 
                    {
                        System.out.println("Invalid option");
                    }
                    System.out.println("\nBack to Admin Page? \n1.Yes\n0.No");
                    opt = s.nextInt();
                }
                while(opt!=0);
    }    
}
