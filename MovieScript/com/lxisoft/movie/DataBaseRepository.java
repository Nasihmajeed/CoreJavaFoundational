package com.lxisoft.movie;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class DataBaseRepository implements Repository{

 

 public List<Dialogue> findAll() {

  List< Dialogue>dialogues= new ArrayList<Dialogue>();


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
   

  return dialogues;
 }
 
}
