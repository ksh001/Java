package test01;

class s{
	public static void main(String[] args) {
		Low S = new Low();//����Ŭ������ ȣǮ�Ͽ��� ����Ŭ������ ������ ȣ��
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
	

		
		

