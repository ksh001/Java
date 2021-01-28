package test01;

class s{
	public static void main(String[] args) {
		Low S = new Low();//하위클래스만 호풀하여도 상위클래스의 생성자 호출
		S.showCount();
	}
}

	class High {
		static int count =0;
		
		public High() {
			count++;
		}
	}
	
	class Low extends High {
		
		public void showCount() {
			System.out.println(count);
		}
	}
	

		
		

