package com.lxisoft.localization;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;
import java.io.FileInputStream;
public class Localization{

    Properties properties;
    

    public Properties initialize() {
        
       try{ 
        properties = new Properties();
        properties.load(getClass().getResourceAsStream("/com/lxisoft/localization/english.properties"));                
        return properties;
    
    
} catch (FileNotFoundException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
        return properties;
    }


    public Properties initializeM() {
        
        try{ 
         properties = new Properties();
         properties.load(getClass().getResourceAsStream("/com/lxisoft/localization/malayalam.properties"));                
         return properties;
     
     
 } catch (FileNotFoundException e) {
     e.printStackTrace();
 } catch (IOException e) {
     e.printStackTrace();
 }
         return properties;
     }
   /* public Properties initializeMalayalam() {
        prop = new Properties();
        try {
            prop.load(getClass().getResourceAsStream("/com/lxisoft/localization/malayalam.properties"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }*/
}