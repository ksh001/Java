package test01;
//210120 java �ǽ�




public class test {

	public static void main(String[] args) {
		Cal cal = new Cal("�����");  // class�� ũ�⸦ ���� �������� ����, new�� �̿��� �޸� �� ���, ������ ���� ����
		
		int res = cal.add(5, 4);
		System.out.println(res);
		
		cal.name_print();
		
		System.out.println(cal.add("abb", "ccc"));
	}	
}

class Cal{
	private String name; //private : ���� Ŭ���� �������� ��� ����
	
	public Cal(String name){ // ������ �Լ� : �̸��� ����, class �̸��� ���ƾ� ��
		this.name = name; //this.name : class�� ����	
	}
	
	public void name_print() { //�̸� ���
		System.out.println(name);
	}
	
	public int add(int a, int b) { // add �޼ҵ� : ������ ��ȯ
		return a+b; //��ȯ���� ���°� ������ �Լ��ۿ� ����.
	}
	
	public String add(String a, String b) { //string �޾Ƽ� �̾��ֱ�
		return a+b;
	}
}
