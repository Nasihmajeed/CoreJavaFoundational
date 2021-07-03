package com.lxisoft.movie;
import com.lxisoft.actors.*;
import com.lxisoft.director.*;
import java.io.IOException;

import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Movie{
  Director director=new Director();
  ScriptWriter writer=new ScriptWriter();
  public  void startMovie() {
    //director.casting();
try{
    writer.writeScript();
  }
  catch(IOException e){
  e.printStackTrace();
  }
  }






  }
