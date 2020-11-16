package com.lxisoft.Race;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Race
{
	ArrayList<RacersDetails> racee = new ArrayList<RacersDetails>();
	Scanner scanner = new Scanner(System.in);
	public void show()
    {
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n");
        System.out.println("                                                 WELCOME TO THE MM93 RACE TRACK                                                      ");
        System.out.println("\n");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n");
        this.showBoard();
    }
    public void showBoard()
    {
        System.out.println("  1. PLAYERS DETAILS \n  2. START THE GAME \n  3. CALL ALL RACERS TO THE TRACK IN ORDER \n  4. VERIFICATION OF THE RACER \n  5. FILE READ ");
        int i =scanner.nextInt();
        if(i==1)
        {
            this.setRacersDetails();
            this.showBoard();
        }
        else if(i==2)
        {
            //this.gameStart();
        }
        else if(i==3)
        {
            this.racersDetailsinorder();
            this.showBoard();
        }
        else if(i==4)
        {
            this.racersAge();
            this.showBoard();
        }
        else if(i==5)
        {
            this.creatFilesofracers();
            this.showBoard();
        }
        else 
        {
            System.out.println(" INVAILD CHOICE ");
            System.out.println("\n");
        } 
    }
	public void racersDetailsinorder()
	{
        ArrayList<Racers> rac = new ArrayList<Racers>();
		System.out.println("\n");
		System.out.println("                    CAR RACING GAME                  ");
        System.out.println("\n");
		System.out.println("-----------------------------------------------------");
		System.out.println("\n");
        rac.add(new Racers(" AUDI "," ADARSH ",1,1200,250));
        rac.add(new Racers(" BMW "," SREEJITH ",10,1300,260));
        rac.add(new Racers(" FORD "," ABHINAVE ",9,1000,200));
        rac.add(new Racers(" TOUATO "," AKHIL",2,1400,290));
        rac.add(new Racers(" fERARI "," ARUN ",8,1600,300));
        rac.add(new Racers(" POLO "," VILLAN ",5,1100,220));
        rac.add(new Racers(" LEMBORGENI "," NJUNI ",7,2000,400));
        rac.add(new Racers(" HUNDIA "," RAZIK ",4,1900,320));
        rac.add(new Racers(" HUMMER "," JIZ ",6,1800,310));
        rac.add(new Racers(" MARUTHI "," ABHI ",3,800,180));
		Collections.sort(rac);
        for(Racers race : rac)
        {
           System.out.println("  "+" CAR NAME : "+" "+race.getcarName()+"\n"+"  "+" CAR DRIVER NAME : "+" "+race.getdriverName()+"\n"+"  "+" ENGIN CC OF THE CAR :"+" "+race.getenginCC()+"\n"+"  "+" TOP SPEEDOF THE CAR : "+" "+race.gettopSpeed()+"\n"+"  "+" TRACK NUMBER "+" "+race.getdistanceinTrack());
           System.out.println("\n");
        }
    }
    public void setRacersDetails()
    {
        System.out.println("\n");
        System.out.println("                    CAR RACING GAME                  ");
        System.out.println("\n");
        System.out.println("-----------------------------------------------------");
        System.out.println("\n");
        racee.add(new Adarsh());
        racee.get(0).setcarName("AUDI");
        racee.get(0).setdriverName("ADARSH");
        racee.get(0).setenginCC(1200);
        racee.get(0).settopSpeed(250);
        racee.get(0).setdistanceoftheTrack(1);

        racee.add(new Abhi());
        racee.get(1).setcarName("MARUTHI");
        racee.get(1).setdriverName("ABHI");
        racee.get(1).setenginCC(800);
        racee.get(1).settopSpeed(180);
        racee.get(1).setdistanceoftheTrack(3);


        racee.add(new Villan());
        racee.get(2).setcarName("POLO");
        racee.get(2).setdriverName("VILLAN");
        racee.get(2).setenginCC(1100);
        racee.get(2).settopSpeed(220);
        racee.get(2).setdistanceoftheTrack(5);

        racee.add(new Njuni());
        racee.get(3).setcarName("LEMBORGENI");
        racee.get(3).setdriverName("NJUNI");
        racee.get(3).setenginCC(2000);
        racee.get(3).settopSpeed(400);
        racee.get(3).setdistanceoftheTrack(7);

        racee.add(new Abhinav());
        racee.get(4).setcarName("FORD");
        racee.get(4).setdriverName("ABHINAVE");
        racee.get(4).setenginCC(1000);
        racee.get(4).settopSpeed(200);
        racee.get(4).setdistanceoftheTrack(9);
  
        racee.add(new Akhil());
        racee.get(6).setcarName("TOUATO");
        racee.get(6).setdriverName("AKHIL");
        racee.get(6).setenginCC(1400);
        racee.get(6).settopSpeed(290);
        racee.get(6).setdistanceoftheTrack(2);

        racee.add(new Razik());
        racee.get(7).setcarName("HUNDIA");
        racee.get(7).setdriverName("RAZIK");
        racee.get(7).setenginCC(1900);
        racee.get(7).settopSpeed(320);
        racee.get(7).setdistanceoftheTrack(4);

        racee.add(new Jiz());
        racee.get(8).setcarName("HUMMER");
        racee.get(8).setdriverName("JIZ");
        racee.get(8).setenginCC(1800);
        racee.get(8).settopSpeed(310);
        racee.get(8).setdistanceoftheTrack(6);
        
        racee.add(new Arun());
        racee.get(9).setcarName("FERARI");
        racee.get(9).setdriverName("ARUN");
        racee.get(9).setenginCC(1600);
        racee.get(9).settopSpeed(300);
        racee.get(9).setdistanceoftheTrack(8);

        racee.add(new Sreejith());
        racee.get(9).setcarName("BMW");
        racee.get(9).setdriverName("SREEJITH");
        racee.get(9).setenginCC(1300);
        racee.get(9).settopSpeed(260);
        racee.get(9).setdistanceoftheTrack(10);
        for(int i=0;i<racee.size();i++)
        {
            System.out.println("  "+" CAR NAME : "+" "+racee.get(i).getcarName()+"\n"+"  "+" CAR DRIVER NAME : "+" "+racee.get(i).getdriverName()+"\n"+"  "+" ENGIN CC OF THE CAR :"+" "+racee.get(i).getenginCC()+"\n"+"  "+" TOP SPEEDOF THE CAR : "+" "+racee.get(i).gettopSpeed()+"\n"+"  "+" TRACK NUMBER "+" "+racee.get(i).getdistanceoftheTrack());
           System.out.println("\n");
       }
    }
     public boolean racersAge()
     {
      System.out.print("ENTER THE AGE : ( ABOVE 18 YEARS ONLY CAN PARTICIPATE IN RACE ) ");
      System.out.print("\n");
      int ag=scanner.nextInt();
      {
        assert(ag>18 && ag<29);
        System.out.print("AGE OF THE PERSON IS : "+ag);
        System.out.print("\n");
        if(ag>20)
        {
            System.out.print(" YOU CAN PARTICIPATE IN THE RACE ");
            System.out.print("\n");
            System.out.print("\n");
            System.out.print("\n");
            return true;
        }
        else
        {
            System.out.print(" YOU CANT NOT PARTICIPATE IN THE RACE ");
            System.out.print("\n");
            System.out.print("\n");
            System.out.print("\n");
            return false;
        }
      }
    }
    public void creatFilesofracers()
    {
      try
      {
       File file = new File("D:\\program\\java\\CoreJavaFoundational\\CarRacing\\scr\\com\\lxisoft\\File\\file.txt");
       FileWriter filewriter = new FileWriter(file);
       BufferedWriter writer = new BufferedWriter(filewriter);
       writer.write("\n NAME : ADARSH \n CAR NAME : AUDI \n AGE : 25 \n ------------------------------------------------------------ ");
       writer.write("\n NAME : SREEJITH \n CAR NAME : BMW \n AGE : 25 \n ------------------------------------------------------------");
       writer.write("\n NAME : ABHINAVE \n CAR NAME : FORD \n AGE : 25 \n ------------------------------------------------------------");
       writer.write("\n NAME : JIZ \n CAR NAME : HUMMER \n AGE : 25 \n ------------------------------------------------------------");
       writer.write("\n NAME : RAZIK \n CAR NAME : HUNDIA \n AGE : 25 \n ------------------------------------------------------------");
       writer.write("\n NAME : VILLAN \n CAR NAME : POLO \n AGE : 25 \n ------------------------------------------------------------");
       writer.write("\n NAME : NJUNI \n CAR NAME : LEMBORGENI \n AGE : 25 \n ------------------------------------------------------------");
       writer.write("\n NAME : ARUN \n CAR NAME : FERARI \n AGE : 25 \n ------------------------------------------------------------");
       writer.write("\n NAME : ABHI \n CAR NAME : MARUTHI \n AGE : 25 \n ------------------------------------------------------------");
       writer.write("\n NAME : AKHIL \n CAR NAME : TOUATO \n AGE : 25 \n ------------------------------------------------------------");
       
       writer.flush();
       writer.close();
      } 
      catch(IOException e)
      {
        e.printStackTrace();
      }
      this.readFileofracers();
    }
    public void readFileofracers()
    {
        try
        {
            Scanner scanner = new Scanner(System.in);
            BufferedReader buffer = new BufferedReader(new FileReader("D:\\program\\java\\CoreJavaFoundational\\CarRacing\\scr\\com\\lxisoft\\File\\file.txt"));
            String a = scanner.next();
            while((a=buffer.readLine()) != null)
            {
                System.out.print("\n"+a+"\n");
            } 
            buffer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    //public void gameStart(int random1 , int random2)
  
}       