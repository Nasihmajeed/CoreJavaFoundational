package com.lxisoft.storyline;
import com.lxisoft.script.*;
import java.io.*;
import java.util.*;
public class Mapping
{


Map<String,String> mapFromFile=new HashMap<>();
final String comedyScript="D:\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\script\\KarthiGanesh.txt";

final String romanceScript="D:\\CoreJavaFoundational\\MovieScript\\src\\com\\lxisoft\\script\\KarthiJessie.txt";


File comdey=new File(comedyScript);
File romance=new File(romanceScript);


BufferedReader comedyScriptReader=null;
BufferedReader romanceScriptReader=null;

public void scriptSelection()
{
	comedyScriptReader=new BufferedReader(new FileReader(comedyScript));
	romanceScriptReader=new BufferedReader(new FileReader(romanceScript));


}



}