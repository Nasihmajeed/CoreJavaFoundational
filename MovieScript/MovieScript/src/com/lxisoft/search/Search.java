package com.lxisoft.search;
import com.lxisoft.movie.*;
import com.lxisoft.actors.*;
import java.util.*;
import java.util.regex.*;
import java.io.*;

public class Search 
{
    String name;
    Movies movie = new Movies();
    
    public void look()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Search Actor ? \n1.Yes \n2.No");
        String x = s.nextLine();
        Pattern pattern = Pattern.compile(x);
        Matcher matcher = pattern.matcher("1");
        if (matcher.matches())
        {
            System.out.println("Enter the name : ");
            String y = s.nextLine();
            Pattern pattern1 = Pattern.compile(y);
            Matcher matcher1 = pattern1.matcher("Dileep");
            // Matcher matcher2 = pattern1.matcher("Bhavna Pani");
            // Matcher matcher3 = pattern1.matcher("Kalabhavan Mani");
            // Matcher matcher4 = pattern1.matcher("Mithun Ramesh")
            if (matcher1.matches())
            {
            System.out.println( y + " is in the Movie");
            }
            // else if (matcher2.matches())
            // {
            // System.out.println( y + " is in the Movie");
            // } 
            // else if(matcher3.matches())
            // {
            // System.out.println( y + " is in the Movie");
            // }
            // else if (matcher4.matches())
            // {
            // System.out.println( y + " is in the Movie");
            // }
            else
            {
                System.out.println( y + " is not in the Movie");
                System.out.println("Available characters are : ");
                movie.printActors();
            }
        }
    }
}
