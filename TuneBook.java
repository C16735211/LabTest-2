import java.util.ArrayList;

public class TuneBook
{
	ArrayList<String> tunes = new ArrayList<String>();

	private int x;
	private String title;
	private String altTitle;
	private String notation;

	public TuneBook(int x, String title, String altTitle, String notation)
	{
		this.x = x;
		this.title = title;
		this.altTitle = altTitle;
		this.notation = notation;
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
        TuneBook tb = new TuneBook("hnj0.abc");
        System.out.println(tb);

        Tune tb = tb.findTune("Scotsman over the Border");
        tb.play();
    }
}