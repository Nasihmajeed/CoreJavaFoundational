package noteMaker2.noteContent;
public class DescContent implements NoteContent
{
	private String line;
	public DescContent(String descLine)
  	{
  		super();
  		setLine(descLine);

  	}

	public void setLine(String line)
	{
		this.line=line;
	}
	public String getLine()
	{
		return line;
	}
}