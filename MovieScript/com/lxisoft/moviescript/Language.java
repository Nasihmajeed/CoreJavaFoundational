package com.lxisoft.moviescript;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Properties;
import java.util.Scanner;

public class Language {

    static Scanner sc = new Scanner(System.in);

    private static Language lang = new Language();
   
    private Language(){


    }

    public static HashMap <Integer,String> languageSection() {

        HashMap <Integer,String> langfiles = new HashMap<Integer,String>();

        langfiles.put(1,"resources/English.properties");
        langfiles.put(2,"resources/Malayalam.properties");

        return langfiles;
    }
    
    public static Properties prop = new Properties();

    public static void selectLanguage(int languageSelection) {

        try {

            String propertyFile;

            propertyFile = languageSection().get(languageSelection);

            InputStream fis = new FileInputStream(propertyFile);

            prop.load(new InputStreamReader(fis,StandardCharsets.UTF_8));
        }
        catch (Exception e) {

            e.printStackTrace();
        }
        
    }
}
