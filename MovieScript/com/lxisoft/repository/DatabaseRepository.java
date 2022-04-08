package com.lxisoft.repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.lxisoft.moviescript.Dialogue;

public class DatabaseRepository implements Repository {

    public List <Dialogue>  findAll(){

        List<Dialogue> dialogue = new ArrayList <Dialogue>();

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
  
            Connection sql = DriverManager.getConnection("jdbc:mysql://localhost:3306/lxisoft","root","root");
  
            Statement stmt = sql.createStatement();
  
            ResultSet rst = stmt.executeQuery("select dialogue from dialogues;");
  
            while (rst.next()){
              
            dialogue.add(new Dialogue(rst.getString(1)));
        }
      }
        catch (Exception e) {
  
          System.out.println("Exceptin Found");
  
          e.printStackTrace();
        }
        
        return dialogue;
    }
}
