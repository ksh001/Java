//java의 this 기능 활용

package test01;
//자바 클래스를 작성하는 연습을 해보자. 다음 main() 메소드를 실행하였을 때 예시와 같이 출력하도록 TV 클래스를 작성하라
//LG에서 만든 2017년형 32인치TV
public class ex1 
{
	public static void main(String[] args) 
	{
		TV myTV = new TV("LG", 2017, 32); // LG에서 만든 2017년 32인치"
		myTV.show();
	 }
}

class TV 
{	
	String TV;
	int YEAR;
	int INCH;
	
	public TV(String TV, int YEAR, int INCH)
	{
		this.TV = TV;
		this.YEAR = YEAR;
		this.INCH = INCH;	
	}
	
	public void show()
	{
		System.out.printf("%s에서 만든 %d년형 %d인치TV", TV, YEAR, INCH );
	}
}
