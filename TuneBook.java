/*

	OOP LabTest2.java 

	Wednesday 14-02-2018

	Darren Byrne 
	C16735211
	DT228-2 Computer Science



*/

import java.util.ArrayList;

public class TuneBook
{
	ArrayList<String> Tune = new ArrayList<String>();

	Scanner s = new Scanner(new File("File.abc"));

	//private String File;

	private String title;

	public String tunes(String title)
	{
		this.title = title;

		while (s.hasNext()) 
		{
			Tune.add(s.next().title);
		}
	}


	public interface Player
	{
		public void play();
	}

	public String findTune(String title)
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public static void main(String[] args)
    {
        TuneBook tb = new TuneBook("File.abc");
        System.out.println(tb);

        Tune tb = tb.findTune("Scotsman over the Border");
        tb.play();
    }
}