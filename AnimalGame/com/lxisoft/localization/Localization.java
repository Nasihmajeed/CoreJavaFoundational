package com.lxisoft.localization;

import java.io.FileNotFoundException;
import java.util.*;

import com.lxisoft.test.TDD;

import java.io.*;
import java.io.FileInputStream;
import java.net.*; 
import java.io.InputStreamReader;
public class Localization{

    
    
public static Properties properties = new Properties();
    public void initialize(int num, String name) {
        
       try{ 
        
        if(num == 1 && name == "english.properties"){
        
        properties.load(getClass().getResourceAsStream("/com/resources/" + name));                
       // return properties;
        }else {
           
            URL resource = getClass().getClassLoader().getResource("com/resources/" +name);         
            properties.load(new InputStreamReader(resource.openStream(), "UTF8"));
                        
            //return properties;
        }
    
} catch (FileNotFoundException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
       // return properties;
    }


   
    }