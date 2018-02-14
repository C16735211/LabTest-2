import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.*;

public class Tune
{
	private int x;
	private String title;
	private String altTitle;
	private String notation;

	/*
	public Tune(int x, String title, String altTitle, String notation)
	{
		this.x = x;
		this.title = title;
		this.altTitle = altTitle;
		this.notation = notation;
	}
	*/

	public void loadFile()
	{
		BufferedReader inputStream = null;

		try
		{
			inputStream = new BufferedReader(new FileReader("File.abc"));

			String l;

			while((l = inputStream.readLine()) != null)
			{
				File.add(l);
			}
		}
	}



	public class PlayTune implements TuneBook
	{
		public void play()
		{
			System.out.println("Tune Plays");
		}
	}



	
}