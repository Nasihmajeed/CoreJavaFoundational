package noteMaker.note.noteContent;
import java.util.ArrayList;
public class BulletContent extends NoteContent
{
	/* private ArrayList<String> bulletPoints;  
  
    public void setBulletPoints(ArrayList<String> bulletPoints)
    {  
        this.bulletPoints = bulletPoints;  
    }  
  
    public ArrayList<String> getBulletPoints() 
    {  
        return this.bulletPoints;  
    }  */
     private String[] bulletPoints;  
  
    public void setBulletPoints(String[] bulletPoints)
    {  
        this.bulletPoints = bulletPoints;  
    }  
  
    public String[] getBulletPoints() 
    {  
        return this.bulletPoints;  
    }  


    public String[] addBulletPoint(String[] bulletPoints, String bulletPointToAdd) 
    {
	    String[] newBulletPoints = new String[bulletPoints.length + 1];
	   // System.arraycopy(bulletPoints, 0, newBulletPoints, 0, bulletPoints.length);
	    newBulletPoints[newBulletPoints.length - 1] = bulletPointToAdd;

	    return newBulletPoints;
	}
  
 }   
       

       