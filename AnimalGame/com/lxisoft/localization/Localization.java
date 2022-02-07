package com.lxisoft.localization;

import java.io.FileNotFoundException;
import java.util.*;

import com.lxisoft.test.TDD;

import java.io.*;
import java.io.FileInputStream;
import java.net.*; 
import java.io.InputStreamReader;
public class Localization{

    Properties properties;
    

    public Properties initialize() {
        
       try{ 
        
        if(TDD.getOption() == 1){
        properties = new Properties();
        properties.load(getClass().getResourceAsStream("/com/resources/english.properties"));                
        return properties;
        }else if(TDD.getOption() == 2){
            properties = new Properties();
      
            URL resource = getClass().getClassLoader().getResource("com/resources/malayalam.properties");         
            properties.load(new InputStreamReader(resource.openStream(), "UTF8"));
                        
            return properties;
        }
    
} catch (FileNotFoundException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
        return properties;
    }


   /* public Properties initializeM() {
        
        try{ 
         
         properties = new Properties();
      
         URL resource = getClass().getClassLoader().getResource("com/lxisoft/localization/malayalam.properties");         
         properties.load(new InputStreamReader(resource.openStream(), "UTF8"));
                     
         return properties;
     
     
 } catch (FileNotFoundException e) {
     e.printStackTrace();
 } catch (IOException e) {
     e.printStackTrace();
 }*/
     //    return properties;
    // }
    }