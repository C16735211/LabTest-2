import java.util.ArrayList;

public class TuneBook
{
	ArrayList<String> tunes = new ArrayList<String>();

	Scanner s = new Scanner(new File("File.abc"));
	private String File;

	private String title;

	public String tunes(String title)
	{
		this.title = title;

		while (s.hasNext()) 
		{
			tunes.add(s.next().title);
		}
	}


	public interface Player
	{
		public void play();
	}

	public Tune findTune(String title)
	{
		return title[0];
	}

	public static void main(String[] args)
    {
        TuneBook tb = new TuneBook("File.abc");
        System.out.println(tb);

        Tune tb = tb.findTune("Scotsman over the Border");
        tb.play();
    }
}