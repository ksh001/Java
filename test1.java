package test02;

public class test1 {

		
	public static void main(String[] args) {

		Emart[] emart = new Emart[2];
		
		emart[0] = new Emart (2, "Seoul", "CJ", false);
		emart[1] = new Emart (3, "Suwon", "CJ", true);
		
		Lottemart[] lotte = new Lottemart[2];
		
		lotte[0] = new Lottemart (1,"�Ȼ�", "lotte", true);
		lotte[1] = new Lottemart (10,"���", "lotte", false);

		emart[0].printInfo();
		emart[0].IsNobrand();
		emart[1].printInfo();
		emart[1].IsNobrand();

		lotte[0].printInfo();
		lotte[0].IsLotteria();
		lotte[1].printInfo();
		lotte[1].IsLotteria();
		

	}

}

	
class Emart{
		
		private int floor;
		private String Loc;
		private String Sub;//�迭��
		private boolean Nobrand;
		
		public Emart(int floor, String Loc, String Sub, boolean Nobrand) {
			
			this.floor = floor;
			this.Loc = Loc;
			this.Sub = Sub;
			this.Nobrand = Nobrand;
		}
		
		public void printInfo() {
			System.out.println(Loc + "�� �ִ� Emart��" + floor +"���̰�, " + Sub + "�迭�Դϴ�");
		}
		
		public void IsNobrand() {
			if(Nobrand == true) {
				System.out.println("Nobrand�� �ֽ��ϴ�.");
				return;
		}
			System.out.println("Nobrand�� �����ϴ�.");
		}
	
	}

class Lottemart{
	
		private int floor;
		private String Loc;
		private String Sub;//�迭��
		
		private boolean Lotteria;
		
		public Lottemart(int floor, String Loc, String Sub, boolean Lotteria) {
			
			this.floor = floor;
			this.Loc = Loc;
			this.Sub = Sub;
			this.Lotteria = Lotteria;
		}
		
		public void printInfo() {
			System.out.println(Loc + "�� �ִ� Lottemart��" + floor +"���̰�, " + Sub + "�迭�Դϴ�");
		}
		
		public void IsLotteria() {
			
			if(Lotteria == true) {
				System.out.println("Lotteria�� �ֽ��ϴ�.");
				return;
		}
			System.out.println("Lotteria�� �����ϴ�.");
		}
	
}
