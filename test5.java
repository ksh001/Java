package test01;

public class test5 {

	public static void main(String[] args) {
		 Box[] ar = new Box[5];
		 ar[0] = new Box(101, "Coffee");
		 ar[1] = new Box(202, "Computer");
		 ar[2] = new Box(303, "Apple");
		 ar[3] = new Box(404, "Dress");
		 ar[4] = new Box(505, "Fairy-tale book");
		 
		 // �迭���� ��ȣ�� 505�� Box�� ã�� �� ���빰�� ����ϴ� �ݺ���
		 //��� ���� : Fairy-tale book
		 
		 for(Box e: ar) {
		 if(e.getBoxNum() == 505)
			 System.out.println(e);
		 }
	}
}

class Box{
	
	int num;
	String str;
	
	public Box(int num, String str) {
		this.num = num;
		this.str = str;
	}
	
	public int getBoxNum() {return num;}
	public String toString() {return str;}
}
