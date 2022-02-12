package com.lxisoft.localization;

import java.io.FileNotFoundException;
import java.util.*;
import java.util.HashMap;
import com.lxisoft.test.TDD;

import java.io.*;
import java.io.FileInputStream;
import java.net.*; 
import java.nio.charset.Charset;
import java.io.InputStreamReader;
public class Localization{

    
    
    public static Properties properties ;

   public static HashMap<Integer, String> returnlanguage(){
    HashMap<Integer, String> languages = new HashMap<Integer, String>();
    languages.put(1, "com/resources/english.properties");
        languages.put(2, "com/resources/malayalam.properties");
        return languages;
   }
    


    public static void initialize(int option) {
        
     
       try{ 
        if(properties == null){
            properties = new Properties();
            String file1 = returnlanguage().get(1);
            String file2 = returnlanguage().get(2);
        if(option == 1){
        
          
            properties.load(new FileInputStream(file1));
      
        }else {

            FileInputStream inputStream = new FileInputStream(file2);
            properties.load(new InputStreamReader(inputStream, Charset.forName("UTF-8")));
       
            
        }
    }
    
} catch (FileNotFoundException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
     
    }


   
    }