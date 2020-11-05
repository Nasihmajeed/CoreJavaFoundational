package com.lxisoft.Movie;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class SeatNumber
{
	ArrayList<SeatDetails> seatD = new ArrayList<SeatDetails>();
	public void Details()
	{
       seatD.add(new SeatDetails(" ADARSH "," A BLOCK ",11));
       seatD.add(new SeatDetails(" SREEJITH "," A BLOCK ",10));
       seatD.add(new SeatDetails(" ABHINAVE "," A BLOCK ",7));
       seatD.add(new SeatDetails(" AJITH "," A BLOCK ",9));
       seatD.add(new SeatDetails(" ABHISHEK "," A BLOCK ",8));

    Collections.sort(seatD);
       for(SeatDetails movie : seatD)
       {
       	System.out.print("\n"+" NAME OF THE PERSON IS "+movie.getName()+"\n"+" BLOCK IS "+movie.getBlock()+"\n"+" SEAT NUMBER IS "+movie.getseatNumber());
       	System.out.print("\n");
      	System.out.print("\n");
      	System.out.print("\n");
      	System.out.print("\n");
       }
	} 
}