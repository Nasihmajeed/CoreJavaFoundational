public class SnakeAndLadders
{
        public SnakeAndLadders()
        {        
            snakes = new ArrayList<Snake>() ;
            ladders = new ArrayList<Ladder>() ;

            snakes.add(new Snake(13,5));
            snakes.add(new Snake(27,15));
            snakes.add(new Snake(57,30));
            snakes.add(new Snake(77,60));
            snakes.add(new Snake(98,82));
        
            ladders.add(new Ladder(11,3)); 
            ladders.add(new Ladder(39,14));
            ladders.add(new Ladder(49,21));
            ladders.add(new Ladder(78,6));
            ladders.add(new Ladder(99,58)); 

            //FRESH,GAMEPLAY,END
    
            public Cell moveIfSnakeOrLadderExists()
            {
                for(Snake s : snakes)
                {
                    System.out.println("Snake Bites!!");
                    if(s.headCell == currentCell)                    
                    {
                        currentCell == s.tailCell;                                
                    }
                }
                
                for(Ladder l : ladders)
                {
                    System.out.println("Yeah You Got Ladders");                                        
                    if(l.tailCell == currentCell)                    
                    {
                        currentCell == l.headCell;                                
                    }
                }
            }
}
