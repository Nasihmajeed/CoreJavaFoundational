public class Board
 {

     final BoardElements[] be = new BoardElements[100];

  public void makeSnakes()
  {
    be[39]= new BoardElements();
    int a=39;
   be[39].setSnakeHead(a);

    be[3]=new BoardElements();
   int a1=3; 
   be[3].setSnakeTail(a1);
   be[23]=new BoardElements();
    be[23].setLadderEnd(23);

   be[7]= new BoardElements();
    be[7].setLadderStart(ladderStart);
    be[29]=new BoardElements();
    be[29].setLadderEnd(ladderEnd);


    be[28]= new BoardElements();
    be[28].setLadderStart(ladderStart);
    be[77]=new BoardElements();
    be[77].setLadderEnd(ladderEnd);


    be[70]= new BoardElements();
    be[70].setLadderStart(ladderStart);
    be[90]=new BoardElements();
    be[90].setLadderEnd(ladderEnd);


    be[87]= new BoardElements();
    be[87].setLadderStart(ladderStart);
    be[93]=new BoardElements();
    be[93].setLadderEnd(ladderEnd);
  } 
  public void createLadder()
  {
    be[2]= new BoardElements();
    int a=2;
     be[2].setLadderStart(a);

     be[23]= new BoardElements();
     int a1=23;
     be[23].setLadderEnd(a1);
  }
 
  public void printSnakeAndLadder()
  {
    System.out.println("\n The Board Details are ");
     System.out.println("SNakes Head Positions Are- "+be[39].getSnakeHead());
    System.out.println("SNake Tail Positionsare:-"+be[3].getSnakeTail());
    System.out.println("Ladder begin:-"+be[2].getLadderStart());
    System.out.println("Ladder End: "+be[23].getLadderEnd());
}
}