package com.lxisoft.Movies;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;

public class Ageinfo implements Comparator<movieInfo>
{
 public int compare(movieInfo m1,movieInfo m2)
 {
 if (m1.getAge() < m2.getAge()) return -1; 
        if (m1.getAge() > m2.getAge()) return 1; 
        else return 0;  }
}