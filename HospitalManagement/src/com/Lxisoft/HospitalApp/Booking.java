package com.Lxisoft.HospitalApp;
import com.Lxisoft.HospitalApp.*;
import java.util.*;
public class Booking 
{
 public void bookAppoinment(ArrayList<Patient> patients)
    {
    Scanner addInput = new Scanner(System.in);
    System.out.println (" \n Enter Number of patients to consult the doctor: ");
    int input=addInput.nextInt();
    addInput.nextLine();
    for (int i=0; i<=input; i++)
    {
    patients.add(new Patient());
    System.out.println("\nEnter " +i+  " Doctors details");

    System.out.println("\n Enter the name of Patient: ");
    String name=addInput.nextLine();
    patients.get(i).setName(name);

    System.out.println("\n Enter the Phone Number: ");
    int phno=addInput.nextInt();
    patients.get(i).setPhoneNumber(phno);
    
    System.out.println("\n Enter the Desease: ");
    String desease=addInput.nextLine();
    patients.get(i).setDesease(desease);
   
     }
 }
public void viewPatients(ArrayList<Patient> patients)
  {
    for (int i=0; i<patients.size(); i++)
    {
      System.out.println("Patient "+i+" Detaisl ");
      System.out.println("________________________\n");
      System.out.println("Name : "+patients.get(i).getName()+"\nPhone Number : "+ patients.get(i).getPhoneNumber()+"\nDesease : "+patients.get(i).getDesease());
      System.out.println("________________________\n");
    }
  }
}