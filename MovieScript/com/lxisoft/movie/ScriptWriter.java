package com.lxisoft.movie;


import java.util.ArrayList;
import java.util.List;
import java.sql.*;
//import com.mysql.cj.jdbc.Driver;



public class ScriptWriter {

   
 private List< Dialogue>dialogues= new ArrayList<Dialogue>();



 public List <Dialogue> getDialogues() {

return dialogues;

 }


 public void setDialogues( List < Dialogue>dialogues)  {

this.dialogues = dialogues;

 }



public void createDialogues()   {

try {



Class.forName("com.mysql.cj.jdbc.Driver");

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lxisoft","root","Mubashir24092000");

Statement st = con.createStatement();

ResultSet rs = st.executeQuery("select dialogues from dialogues;");



while(rs.next()) {


dialogues.add(new Dialogue(rs.getString(1)));

}


} catch(Exception e) {

System.out.println("Exception");

e.printStackTrace();

}


}  

public Script addDialoguesToScenes(List <Actor> actors) {


Script script = new Script();

script.createScenes ();


for (int x =1; x < script.getScenes().length; x ++ ) {

if(script.getScenes()[x] != null)  {
      
  for(int i = 0;  i< 10;   i ++)  {

    int number =(int) (Math.random() *dialogues.size());

int actorNumber = (int) (Math.random()*actors.size());

dialogues.get(number).setDeliveredBy(actors.get(actorNumber));

      script.getScenes()[x].getDialogues().add( dialogues.get(number));
  
  }
       
}
 
}

return script;     

} }

