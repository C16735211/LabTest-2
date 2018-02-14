/*

	OOP LabTest2.java 

	Wednesday 14-02-2018

	Darren Byrne 
	C16735211
	DT228-2 Computer Science



*/

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

	
	public Tune(int x, String title, String altTitle, String notation)
	{
		this.x = x;
		this.title = title;
		this.altTitle = altTitle;
		this.notation = notation;
	}

	public loadFile(String title)
	{
		this.title = title;
	}

	public String toString()
    {
        StringBuffer sb = new StringBuffer();
      
        for(String Tune:tunes)
        {
        	sb.append(File + ",");
        }

	    return "Num " + x + " \nTitle: " + title + "Alt Title: " + altTitle "\n\n";

	    }

	}

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
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(inputStream != null)
			{
				try
				{
					inputStream.close();
				}
				catch(Exception e)
				{
					e.printStackTrace;
				}
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