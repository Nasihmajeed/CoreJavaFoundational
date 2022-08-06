package com.lxisoft.files;

public class Board
{
    private Board[] board;        
    private int location;
    int numOfHits;

    public Board getBoard()
    {
        return board;
    }
    public void setBoard(Board Board)
    {
        this.board=Board;
    }

    public int getLocationCell()
    {
        return location;
    }
    
    public void setLocationCell(int LocationCell)
    {
        this.location=LocationCell;
    }

    public void numOfHits()
    {
        System.out.println(location);                    
    }

    public void startPlaying()
    {
        
    }
}
