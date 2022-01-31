package com.lxisoft.localization;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;
public class Localization{
    public void initialize() {
        Properties prop = new Properties();
        try {
            prop.load(getClass().getResourceAsStream("/com/lxisoft/localization/malayalam.properties"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}