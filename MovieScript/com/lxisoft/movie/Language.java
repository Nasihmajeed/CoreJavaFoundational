package com.lxisoft.movie;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Properties;
import java.util.Scanner;

public class Language {
 
static Scanner sc = new Scanner(System.in);

 private static Language language = new Language();

private Language()   {


}

public static HashMap <Integer,String> languageSection()  {

HashMap<Integer,String> files = new HashMap<Integer , String> ();
 
files.put(1,"../resources/resourceBundle/language/EnglishLanguage.properties");

files.put(2,"../resources/resourceBundle/language/MalayalamLanguage.properties");


 return files;


 
}

public  static Properties property= new Properties();




public static void selectLanguage(int  selectLanguage) {


  try {


    String propertyFile;
propertyFile =  languageSection().get(selectLanguage);

    InputStream  fileinputstream = new FileInputStream(propertyFile);


  
    property.load(new InputStreamReader(fileinputstream,StandardCharsets.UTF_8));


  } catch (Exception e) {

    e.printStackTrace();
  }
 
 


  
}

}
