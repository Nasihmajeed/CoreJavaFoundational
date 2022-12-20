package com.lxisoft.game;   

public class Board
{   
    private LocationCell[] locationCells;
    private LocationCell playerCurrentCell;         

    public LocationCell[] getLocationCell()
    {
        return locationCells;
    }       

    public void setLocationCell(LocationCell[] LocationCells)
    {
        this.locationCells = LocationCells;
    } 
       
}  
