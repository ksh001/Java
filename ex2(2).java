//java의 this

package test01;
//1978년 스웨덴 국적의 ABBA가 부른 Dancing Queen
public class ex2 
{
	public static void main(String[] args) 
	{
		Song my_song = new Song("Dancing Queen", "ABBA", 1978, "스웨덴"); 
		my_song.show();
	 }
}

class Song
{	
	String Title;
	String artist;
	int year;
	String country;
	
	public Song(String Title, String artist, int year, String country)
	{
		this.Title = Title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	public void show()
	{
		System.out.printf("%d년 %s 국적의 %s가 부른 %s", year, country, artist, Title );
	}
}
