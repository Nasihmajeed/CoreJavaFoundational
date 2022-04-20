package com.lxisoft.moviescript;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Language {

    public void setUpLanguage(){

       // FileInputStream fis = new FileInputStream(new File("resources/" + languageSelection + ".properties"));
    }

    private static Properties prop = new Properties();

    
    private Language(){


    }
    public static Properties getProperties(){
        return prop;
    }
}
