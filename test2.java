package test02;

public class test2 {

		public static void main(String[] args) {

		Mart[] mart = new Mart[4];
		
		mart[0] = new Emart (2, "Seoul", "CJ", "�̸�Ʈ", false);
		mart[1] = new Emart (3, "Suwon", "CJ", "�̸�Ʈ", true);
		mart[2] = new Lottemart (1,"�Ȼ�", "lotte", "�Ե���Ʈ", true);
		mart[3] = new Lottemart (10,"���", "lotte", "�Ե���Ʈ", false);

		for(int i =0; i<4; i++){
			mart[i].printInfo();
			mart[i].IsLotteria();//�ش� �޼ҵ尡 �����ϸ� �����ε�, ���ϸ� �ƹ��͵� ���� ���� �״�� ����
			mart[i].IsNobrand();
		}

	}

}

	
class Emart extends Mart{
	
		private boolean Nobrand;
		protected String name = "Lottemart";
		
		public Emart(int floor, String Loc, String Sub,String name, boolean Nobrand) {
			
			super(floor, Loc, Sub, name);
			this.Nobrand = Nobrand;
			
		}
		
		public void IsNobrand() {
			if(Nobrand == true) {
				System.out.println("Nobrand�� �ֽ��ϴ�!");
				return; //else�� ������� �ʰ� ���������� ���
			}
			System.out.println("Nobrand�� �����ϴ�!");
				
		}
	
}

class Lottemart extends Mart{
	
		private boolean Lotteria;
		protected String name = "Lottemart";
				
		public Lottemart(int floor, String Loc, String Sub, String name, boolean Lotteria) {
		
			super(floor, Loc, Sub, name);
			this.Lotteria = Lotteria;
		}
		
		public void IsLotteria() {
			
			if(Lotteria == true) {
				System.out.println("Lotteria�� �ֽ��ϴ�.");
				return;
			}
			System.out.println("Lotteria�� �����ϴ�.");
		}
		
		/*Is �ִ� �� 1
		 * public void printInfo() {
			
			super.printInfo();
			IsLotteria();
		}
			
		
		public void IsLotteria() { //��Ʈ�� ũ�⺸�� Ŀ�� �ܺ��� �Լ�. tset1ó�� �� ��, Mart�� �����ϸ� �� �� ����
			
			if(Lotteria == true) {
				System.out.println("Lotteria�� �ֽ��ϴ�.");
				return;
			}
			System.out.println("Lotteria�� �����ϴ�.");
		}*/
	
	}

	class Mart{
	
		private int floor;
		private String Loc;
		private String Sub;//�迭��
		protected String name;
		
		public Mart(int floor, String Loc, String Sub,  String name) {
			
			this.floor = floor;
			this.Loc = Loc;
			this.Sub = Sub;
			this.name = name;
		}
		
		public void printInfo() {
			System.out.println(Loc + "�� �ִ� " + name + "�� " + floor +"���̰�, " + Sub + "�迭�Դϴ�.");
		}
		//Is �ִ¹� : �߻�޼ҵ� -> �̸� ���� �صΰ� �����ε���
		public void IsLotteria() {
			
		}
		
		public void IsNobrand() {
			
		}
	}
	
	

	
