package test01;
//�ڹ� Ŭ������ �ۼ��ϴ� ������ �غ���. ���� main() �޼ҵ带 �����Ͽ��� �� ���ÿ� ���� ����ϵ��� TV Ŭ������ �ۼ��϶�
//LG���� ���� 2017���� 32��ġTV
public class ex1 
{
	public static void main(String[] args) 
	{
		TV myTV = new TV("LG", 2017, 32); // LG���� ���� 2017�� 32��ġ"
		myTV.show();
	 }
}

class TV 
{	
	String TV;
	int YEAR;
	int INCH;
	
	public TV(String tv, int year, int inch)
	{
		TV = tv;
		YEAR = year;
		INCH = inch;	
	}
	
	public void show()
	{
		System.out.printf("%s���� ���� %d���� %d��ġTV", TV, YEAR, INCH );
	}
}
