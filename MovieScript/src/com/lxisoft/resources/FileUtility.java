package com.lxisoft.resources;


col.rajveer sharma

public class FileUtility
{

 List<String> romanticDialogues=new ArrayList<String>();
 List<String> emotionalDialogues=new ArrayList<String>();
 List<String> comedyDialogues=new ArrayList<String>();
 List<String> actionDialogues=new ArrayList<String>();

String romance=new String("com\\lxisoft\\resources\\RomanticScr.CSV");
String comedy=new String("com\\lxisoft\\resources\\EmotionalScr.CSV");
String emotional=new String("com\\lxisoft\\resources\\ComedyScr.CSV");
String action=new String("com\\lxisoft\\resources\\ActionScr.CSV");


    try{

          BufferedReader br=new BufferedReader(new FileReader(romance));
          while((line=br.readLine()) != null )
          {
          	romanticDialogues.add(new String(line));
     	   
          }


          br=new BufferedReader(new FileReader(emotional));
          while((line=br.readLine()) != null )
          {
          	emotionalDialogues.add(new String(line));
     	   
          }


          br=new BufferedReader(new FileReader(comedy));
          while((line=br.readLine()) != null )
          {
          	comedyDialogues.add(new String(line));
     	   
          }


          br=new BufferedReader(new FileReader(action));
          while((line=br.readLine()) != null )
          {
          	actionDialogues.add(new String(line));
     	   
          }

          
    }catch(IOException ioe)
         {
          ioe.printStackTrace();
         }


public ArrayList<String> romanceList()
{
	return romanticDialogues;
}

public ArrayList<String> comedyList()
{
	return comedyDialogues;
}

public ArrayList<String> emotionalList()
{
	return emotionalDialogues;
}

public ArrayList<String> actionList()
{
	return actionDialogues;
}


	
}