package test01;
//1978�� ������ ������ ABBA�� �θ� Dancing Queen
public class ex2 
{
	public static void main(String[] args) 
	{
		Song my_song = new Song("Dancing Queen", "ABBA", 1978, "������"); 
		my_song.show();
	 }
}

class Song
{	
	String Title;
	String artist;
	int year;
	String country;
	
	public Song(String t, String a, int y, String c)
	{
		Title = t;
		artist = a;
		year = y;
		country = c;
	}
	
	public void show()
	{
		System.out.printf("%d�� %s ������ %s�� �θ� %s", year, country, artist, Title );
	}
}
