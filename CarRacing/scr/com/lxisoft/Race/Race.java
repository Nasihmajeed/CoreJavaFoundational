package com.lxisoft.Race;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;
public class Race
{
	ArrayList<RacersDetails> race = new ArrayList<RacersDetails>();
	Scanner scanner = new Scanner(System.in);
	public void showBoard()
    {
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n");
        System.out.println("                                                 WELCOME TO THE MM93 RACE TRACK                                                      ");
        System.out.println("\n");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n");
        System.out.println("  1. PLAYERS DETAILS \n  2. START THE GAME \n  3. CALL ALL RACERS TO THE TRACK IN ORDER \n ");
        int i =scanner.nextInt();
        if(i==1)
        {
            this.setRacersDetails();
        }
        else if(i==2)
        {
            this.gameStart();
        }
        else if(i==3)
        {
            ArrayList<Racers> rac = new ArrayList<Racers>();
            this.racersDetailsinorder();
        }
        else 
        {
            System.out.println(" INVAILD CHOICE ");
            System.out.println("\n");
        }

    }
	public void racersDetailsinorder()
	{
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
    public void setRacerDetails()
    {
        System.out.println("\n");
        System.out.println("                    CAR RACING GAME                  ");
        System.out.println("\n");
        System.out.println("-----------------------------------------------------");
        System.out.println("\n");
        race.add(new AUDI());
        race.get(0).setcarName("AUDI");
        race.get(0).setdriverName("ADARSH");
        race.get(0).setenginCC(1200);
        race.get(0).settopSpeed(250);
        race.get(0).setdistanceoftheTrack(1);

        race.add(new MARUTHI());
        race.get(1).setcarName("MARUTHI");
        race.get(1).setdriverName("ABHI");
        race.get(1).setenginCC(800);
        race.get(1).settopSpeed(180);
        race.get(1).setdistanceoftheTrack(3);


        race.add(new POLO());
        race.get(2).setcarName("POLO");
        race.get(2).setdriverName("VILLAN");
        race.get(2).setenginCC(1100);
        race.get(2).settopSpeed(220);
        race.get(2).setdistanceoftheTrack(5);

        race.add(new LEMBORGENI());
        race.get(3).setcarName("LEMBORGENI");
        race.get(3).setdriverName("NJUNI");
        race.get(3).setenginCC(2000);
        race.get(3).settopSpeed(400);
        race.get(3).setdistanceoftheTrack(7);

        race.add(new FORD());
        race.get(4).setcarName("FORD");
        race.get(4).setdriverName("ABHINAVE");
        race.get(4).setenginCC(1000);
        race.get(4).settopSpeed(200);
        race.get(4).setdistanceoftheTrack(9);
  
        race.add(new TOUATO());
        race.get(6).setcarName("TOUATO");
        race.get(6).setdriverName("AKHIL");
        race.get(6).setenginCC(1400);
        race.get(6).settopSpeed(290);
        race.get(6).setdistanceoftheTrack(2);

       race.add(new HUNDIA());
        race.get(7).setcarName("HUNDIA");
        race.get(7).setdriverName("RAZIK");
        race.get(7).setenginCC(1900);
        race.get(7).settopSpeed(320);
        race.get(7).setdistanceoftheTrack(4);

        race.add(new HUMMER());
        race.get(8).setcarName("HUMMER");
        race.get(8).setdriverName("JIZ");
        race.get(8).setenginCC(1800);
        race.get(8).settopSpeed(310);
        race.get(8).setdistanceoftheTrack(6);
        
        race.add(new FERARI());
        race.get(9).setcarName("FERARI");
        race.get(9).setdriverName("ARUN");
        race.get(9).setenginCC(1600);
        race.get(9).settopSpeed(300);
        race.get(9).setdistanceoftheTrack(8);

        race.add(new BMW());
        race.get(9).setcarName("BMW");
        race.get(9).setdriverName("SREEJITH");
        race.get(9).setenginCC(1300);
        race.get(9).settopSpeed(260);
        race.get(9).setdistanceoftheTrack(10);
        for(int i=0;i<race.size();i++)
        {
            System.out.println("  "+" CAR NAME : "+" "+race.get(i).getcarName()+"\n"+"  "+" CAR DRIVER NAME : "+" "+race.get(i).getdriverName()+"\n"+"  "+" ENGIN CC OF THE CAR :"+" "+race.get(i).getenginCC()+"\n"+"  "+" TOP SPEEDOF THE CAR : "+" "+race.get(i).gettopSpeed()+"\n"+"  "+" TRACK NUMBER "+" "+race.get(i).getdistanceinTrack());
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
        if(ag>18)
        {
            System.out.print(" YOU CAN PARTICIPATE IN THE RACE  ");
            System.out.print("\n");
            System.out.print("\n");
            System.out.print("\n");
            return true;
        }
        else
        {
            System.out.print(" YOU CANT PARTICIPATE IN RACE ");
            System.out.print("\n");
            System.out.print("\n");
            System.out.print("\n");
            return false;
        }
      }
    }
    //public void gameStart(int random1 , int random2)
}       