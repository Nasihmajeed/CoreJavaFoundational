package com.lxisoft.movie;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import java.util.Scanner;

public class Language {
 

static Scanner sc = new Scanner(System.in);



public static void selectLanguage() throws Exception {

 String selectLanguage;

 System.out.println("Select Language");
 System.out.println("1 = English");
 System.out.println("2 = Malayalam       ");
 selectLanguage = sc.nextLine();
 
 switch (selectLanguage)  {
 
 case "1":
 
 selectLanguage = "English";
 break;
 
 case "2" :
 selectLanguage = "Malayalam";
 break;
 }
  
 System.out.println("");     
 
 System.out.println("You are Selected " + selectLanguage + " Language");
 
 
 try ( InputStream fileinputstream = new FileInputStream("../resources/resourceBundle/language/" + selectLanguage + "Language.properties"))  {
 
 Properties property= new Properties();
 
 property.load(new InputStreamReader(fileinputstream,StandardCharsets.UTF_8));
 


} catch(Exception e)  {

System.out.println("Exception");
e.printStackTrace();

}




}}
