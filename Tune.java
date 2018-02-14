import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader

public class Tune
{
	private int x;
	private String title;
	private String altTitle;
	private String notation;

	public Tune(int x, String title, String altTitle, String notation)
	{
		this.x = x;
		this.title = title;
		this.altTitle = altTitle;
		this.notation = notation;
	}

	public String toString()
    {
        StringBuffer sb = new StringBuffer();
        
        for(String word:words)
        {
            sb.append(word + ", ");
        }

		return sb.toString();

	public static void main(String[] args)
	{
		
	}
}