package noteMaker2.noteContent;
import java.util.List;
public class BulletContent implements NoteContent
{
	private List<String> bulletPoints;  
  
  	public BulletContent(List<String> bulletPoints)
  	{
  		super();
  		setBulletPoints(bulletPoints);

  	}
    public void setBulletPoints(List<String> bulletPoints)
    {  
        this.bulletPoints = bulletPoints;  
    }  
  
    public List<String> getBulletPoints() 
    {  
        return this.bulletPoints;  
    }  

}