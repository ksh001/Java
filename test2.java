package test02;

public class test2 {

		public static void main(String[] args) {

		Mart[] mart = new Mart[4];
		
		mart[0] = new Emart (2, "Seoul", "CJ", "이마트", false);
		mart[1] = new Emart (3, "Suwon", "CJ", "이마트", true);
		mart[2] = new Lottemart (1,"안산", "lotte", "롯데마트", true);
		mart[3] = new Lottemart (10,"양산", "lotte", "롯데마트", false);

		for(int i =0; i<4; i++){
			mart[i].printInfo();
			mart[i].IsLotteria();//해당 메소드가 존재하면 오버로딩, 안하면 아무것도 없는 내용 그대로 있음
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
				System.out.println("Nobrand가 있습니다!");
				return; //else를 사용하지 않고 빠져나오는 방법
			}
			System.out.println("Nobrand가 없습니다!");
				
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
				System.out.println("Lotteria가 있습니다.");
				return;
			}
			System.out.println("Lotteria가 없습니다.");
		}
		
		/*Is 넣는 법 1
		 * public void printInfo() {
			
			super.printInfo();
			IsLotteria();
		}
			
		
		public void IsLotteria() { //마트의 크기보다 커서 외부의 함수. tset1처럼 한 뒤, Mart로 선언하면 쓸 수 없음
			
			if(Lotteria == true) {
				System.out.println("Lotteria가 있습니다.");
				return;
			}
			System.out.println("Lotteria가 없습니다.");
		}*/
	
	}

	class Mart{
	
		private int floor;
		private String Loc;
		private String Sub;//계열사
		protected String name;
		
		public Mart(int floor, String Loc, String Sub,  String name) {
			
			this.floor = floor;
			this.Loc = Loc;
			this.Sub = Sub;
			this.name = name;
		}
		
		public void printInfo() {
			System.out.println(Loc + "에 있는 " + name + "는 " + floor +"층이고, " + Sub + "계열입니다.");
		}
		//Is 넣는법 : 추상메소드 -> 미리 선언만 해두고 오버로딩함
		public void IsLotteria() {
			
		}
		
		public void IsNobrand() {
			
		}
	}
	
	

	
