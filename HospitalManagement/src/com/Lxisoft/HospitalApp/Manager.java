package com.Lxisoft.HospitalApp;
import com.Lxisoft.HospitalApp.*;
import java.util.*;
import java.io.*;

public class Manager
{
  Doctor cardio = new Cardiology();
  Doctor pedia = new Pediatrician();
  
  public void menu(ArrayList<Doctor> doctors)
  {

    int choice=0;
    Scanner scanner = new Scanner(System.in);
    do
    {
      System.out.println("\n________________________");
      System.out.println("\n\n1. Add Doctors  \n\n2. Delete Doctors \n\n3. Update Doctors \n\n4. View Doctors \n\n5. View Patients \n\nPress 0 for Exit \n");
      choice=scanner.nextInt();

        if(choice==1)
        {
          this.addDoctors(doctors);
          this.viewDoctors(doctors);      
        }
        if(choice==2)
        {
             
          this.viewDoctors(doctors);
        }
        if(choice==3)
        {
          this.viewDoctors(doctors);
        }
        if(choice==4)
        {   
          this.viewDoctors(doctors);
        }
        if(choice==5)
        {
          this.viewDoctors(doctors);
        }
        
        else if(choice==0)
        {
            System.out.println(" ");
        }
    }
      while(choice>0);
  }
    public void addDoctors(ArrayList<Doctor> doctors)
    {
    Scanner addInput = new Scanner(System.in);
    System.out.println (" \n Enter Number of Doctors to be added: ");
    int input=addInput.nextInt();
    addInput.nextLine();
    for (int i=0; i<=input; i++)
    {
    doctors.add(new Doctor());
    System.out.println("\nEnter " +i+  " Doctors details");

    System.out.println("\n Enter the name of Doctor: ");
    String name=addInput.nextLine();
    doctors.get(i).setName(name);

    System.out.println("\n Enter the name of Department: ");
    String department=addInput.nextLine();
    doctors.get(i).setDepartment(department);
    
    System.out.println("\n Enter the ID Number: ");
    int code=addInput.nextInt();
    doctors.get(i).setCode(code);
    
        
    
     }
  }
  public void viewDoctors(ArrayList<Doctor> doctors)
  {
    for (int i=0; i<doctors.size(); i++)
    {
      System.out.println("Doctor "+i);
      System.out.println("________________________\n");
      System.out.println("Name : "+doctors.get(i).getName()+"\nDepartment : "+ doctors.get(i).getDepartment()+"\nCode : "+doctors.get(i).getCode());
      System.out.println("________________________\n");
    }
  }
  public void deleteDoctors(ArrayList<Doctor> doctors)
  {
    Scanner delete = new Scanner(System.in);
    System.out.println("\n Enter the Index Number of Book: ");
    int deleteIndex=delete.nextInt();
    doctors.remove(deleteIndex);
    System.out.println("Books after deletion is ");  
  }
     
}
