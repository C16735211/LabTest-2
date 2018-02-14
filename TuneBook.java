import java.util.ArrayList;

public class TuneBook
{
	ArrayList<String> tunes = new ArrayList<String>();

	private int x;
	private String title;
	private String altTitle;
	private String notation;

	public String toString()
    {
        StringBuffer sb = new StringBuffer();
        
        for(String word:words)
        {
            sb.append(word + ", ");
        }

		return sb.toString();
}