package com.LxiSoft.Game;
import com.LxiSoft.Game.*;
import java.util.*;

public class Board 
{
    String[][] board = new String[10][10];

    public void setEasyBoard()
    {
        board[0][0] = "100";
        board[0][1] = " 99";
        board[0][2] = " 98";
        board[0][3] = " 97";
        board[0][4] = " 96";
        board[0][5] = " S ";
        board[0][6] = " 94";
        board[0][7] = " 93";
        board[0][8] = " 92";
        board[0][9] = " 91";

        board[1][0] = " 81";
        board[1][1] = " 82";
        board[1][2] = " 83";
        board[1][3] = " 84";
        board[1][4] = " 85";
        board[1][5] = " S ";
        board[1][6] = " 87";
        board[1][7] = " 88";
        board[1][8] = " 89";
        board[1][9] = " 90";

        board[2][0] = " L ";
        board[2][1] = " 79";
        board[2][2] = " 78";
        board[2][3] = " 77";
        board[2][4] = " 76";
        board[2][5] = " 75";
        board[2][6] = " 74";
        board[2][7] = " 73";
        board[2][8] = " 72";
        board[2][9] = " L ";

        board[3][0] = " 61";
        board[3][1] = " 62";
        board[3][2] = " 63";
        board[3][3] = " 64";
        board[3][4] = " 65";
        board[3][5] = " 66";
        board[3][6] = " 67";
        board[3][7] = " 68";
        board[3][8] = " 69";
        board[3][9] = " 70";

        board[4][0] = " 60";
        board[4][1] = " 59";
        board[4][2] = " S ";
        board[4][3] = " 57";
        board[4][4] = " 56";
        board[4][5] = " 55";
        board[4][6] = " 54";
        board[4][7] = " 53";
        board[4][8] = " 52";
        board[4][9] = " L ";

        board[5][0] = " 41";
        board[5][1] = " 42";
        board[5][2] = " 43";
        board[5][3] = " 44";
        board[5][4] = " 45";
        board[5][5] = " 46";
        board[5][6] = " S ";
        board[5][7] = " 48";
        board[5][8] = " 49";
        board[5][9] = " 50";

        board[6][0] = " 40";
        board[6][1] = " 39";
        board[6][2] = " 38";
        board[6][3] = " 37";
        board[6][4] = " L ";
        board[6][5] = " 35";
        board[6][6] = " 34";
        board[6][7] = " 33";
        board[6][8] = " 32";
        board[6][9] = " 31";

        board[7][0] = " 21";
        board[7][1] = " 22";
        board[7][2] = " 23";
        board[7][3] = " 24";
        board[7][4] = " 25";
        board[7][5] = " 26";
        board[7][6] = " 27";
        board[7][7] = " L ";
        board[7][8] = " 29";
        board[7][9] = " 30";

        board[8][0] = " L ";
        board[8][1] = " 19";
        board[8][2] = " 18";
        board[8][3] = " 17";
        board[8][4] = " 16";
        board[8][5] = " 15";
        board[8][6] = " 14";
        board[8][7] = " 13";
        board[8][8] = " 12";
        board[8][9] = " 11";

        board[9][0] = "  1";
        board[9][1] = "  2";
        board[9][2] = "  3";
        board[9][3] = "  L";
        board[9][4] = "  5";
        board[9][5] = "  6";
        board[9][6] = "  7";
        board[9][7] = "  8";
        board[9][8] = "  L";
        board[9][9] = " 10";
    }

    public void setHardBoard()
    {
        board[0][0] = "100";
        board[0][1] = " 99";
        board[0][2] = " 98";
        board[0][3] = " S ";
        board[0][4] = " 96";
        board[0][5] = " S ";
        board[0][6] = " 94";
        board[0][7] = " S ";
        board[0][8] = " 92";
        board[0][9] = " 91";

        board[1][0] = " 81";
        board[1][1] = " 82";
        board[1][2] = " 83";
        board[1][3] = " 84";
        board[1][4] = " 85";
        board[1][5] = " S ";
        board[1][6] = " 87";
        board[1][7] = " 88";
        board[1][8] = " 89";
        board[1][9] = " 90";

        board[2][0] = " 80";
        board[2][1] = " 79";
        board[2][2] = " 78";
        board[2][3] = " 77";
        board[2][4] = " 76";
        board[2][5] = " 75";
        board[2][6] = " 74";
        board[2][7] = " 73";
        board[2][8] = " 72";
        board[2][9] = " L ";

        board[3][0] = " S ";
        board[3][1] = " 62";
        board[3][2] = " 63";
        board[3][3] = " 64";
        board[3][4] = " 65";
        board[3][5] = " 66";
        board[3][6] = " 67";
        board[3][7] = " 68";
        board[3][8] = " 69";
        board[3][9] = " 70";

        board[4][0] = " 60";
        board[4][1] = " 59";
        board[4][2] = " S ";
        board[4][3] = " 57";
        board[4][4] = " 56";
        board[4][5] = " 55";
        board[4][6] = " 54";
        board[4][7] = " 53";
        board[4][8] = " 52";
        board[4][9] = " 51";

        board[5][0] = " 41";
        board[5][1] = " 42";
        board[5][2] = " 43";
        board[5][3] = " 44";
        board[5][4] = " 45";
        board[5][5] = " 46";
        board[5][6] = " S ";
        board[5][7] = " 48";
        board[5][8] = " S ";
        board[5][9] = " 50";

        board[6][0] = " 40";
        board[6][1] = " 39";
        board[6][2] = " 38";
        board[6][3] = " 37";
        board[6][4] = " L ";
        board[6][5] = " 35";
        board[6][6] = " 34";
        board[6][7] = " 33";
        board[6][8] = " 32";
        board[6][9] = " 31";

        board[7][0] = " 21";
        board[7][1] = " 22";
        board[7][2] = " 23";
        board[7][3] = " 24";
        board[7][4] = " 25";
        board[7][5] = " 26";
        board[7][6] = " 27";
        board[7][7] = " 28";
        board[7][8] = " 29";
        board[7][9] = " 30";

        board[8][0] = " L ";
        board[8][1] = " 19";
        board[8][2] = " 18";
        board[8][3] = " 17";
        board[8][4] = " 16";
        board[8][5] = " 15";
        board[8][6] = " 14";
        board[8][7] = " 13";
        board[8][8] = " 12";
        board[8][9] = " 11";

        board[9][0] = "  1";
        board[9][1] = "  2";
        board[9][2] = "  3";
        board[9][3] = "  L";
        board[9][4] = "  5";
        board[9][5] = "  6";
        board[9][6] = "  7";
        board[9][7] = "  8";
        board[9][8] = "  9";
        board[9][9] = " 10";
    }

    public void addPlayer(int num,ArrayList<Players>player)
    {
        for(int i=0; i<num; i++)
        {
            player.add(new Players());
        }
    }
    
    public void setPlayer(int playerNum,ArrayList<Players>player)
    {
        Scanner s = new Scanner(System.in);
        for(int i=0; i<playerNum; i++)
        {
            System.out.println("\nEnter the name of Player No. "+(i+1));
            String playerName = s.nextLine();
            player.get(i).setPlayer(playerName);
            System.out.println("Enter the coin : ");
            String coin = s.nextLine();
            System.out.println("\n");
            player.get(i).setColor(coin);
            player.get(i).setPosition(0);
            System.out.println("------------------------------------");

        }
    }

    public void eprint()
    {
		System.out.println("+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
        for(int i=0; i<10; i++)
        {
            for(int j=0; j<10; j++)
            {
				System.out.print("|");
                System.out.print(" "+board[i][j]+" ");
			}
            System.out.print("|\n");
            System.out.println("+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+"); 	
		}
	}
    public void hprint()
    {
		System.out.println("+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
        for(int i=0; i<10; i++)
        {
            for(int j=0; j<10; j++)
            {
				System.out.print("|");
                System.out.print(" "+board[i][j]+" ");
			}
            System.out.print("|\n");
            System.out.println("+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+"); 	
		}
	}
}
