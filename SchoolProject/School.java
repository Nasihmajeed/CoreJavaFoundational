import java.util.*;

public class School
{
	String name;
    	String place;
    	String medium;
    	int number;

    Classroom[] classroom;
    Student[] rank; 

    public void addSchoolDetails()
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("School Name : ");
         name = s.nextLine();
        System.out.println("Place : ");
         place = s.next();
        System.out.println("Medium : ");
         medium = s.next();

        System.out.println("Enter the number of Classrooms");
         number = s.nextInt();

        classroom = new Classroom[number];
        System.out.println(">----------------------------<");

        for(int i=0; i<number; i++)
        {
            System.out.println(">----Enter  Class  Details---<");

            classroom[i] = new Classroom();
            classroom[i].addClassDetails();
        }
    }

    public void printSchoolDetails()
    {
    	System.out.println("\n");
    
        System.out.println(">----------------------------<");
        System.out.println(">-------School Details-------<");
        System.out.println("School Name : " + name);
        System.out.println("Place       : " + place);
        System.out.println("Medium      : " + medium);
       

        
        for(int i=0; i<number; i++)
        {
            System.out.println(">----------------------------<");
            System.out.println(">-------Class  Details-------<");
            classroom[i].printClassDetails(i);
            classroom[i].classRankList();
        }
    }

    public void SchoolRankList()
    {
        int total =0;
        rank = new Student[100];
        
        for(int j=0; j<number; j++)
        {
            for(int k=0; k<classroom[j].student.length;k++)
            {
                rank[total] = new Student();
                rank[total] = classroom[j].student[k];
                total++;
            }
        }
        for(int x=0; x<total; x++)
        {
            for(int y=x+1; y<total; y++)
            {
                if(rank[x].totalMark < rank[y].totalMark)
                {
                    Student stdnt = new Student();
                    stdnt = rank[x];
                    rank[x] = rank[y];
                    rank[y] = stdnt;
                }
            }
        }


        System.out.println(">----------------------------<");
        System.out.println(">------School Rank List------<");
        System.out.println(">----------------------------<");
        for(int x=0; x<total; x++)
        {
            System.out.println("Name        : "+ rank[x].name);
            System.out.println("Roll No.    : "+ rank[x].roll);
            System.out.println("Total Mark  : "+ rank[x].totalMark);
            System.out.println(">----------------------------<");
        }
    }

}