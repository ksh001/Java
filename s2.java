package test01;

public class s2 {
//�����ε� : �̸��� ���� method�� 5�� ����� eat�� 5��
//�������̵� : �̸��� ���� method�� ������ �θ��� �޼ҵ忡 �ڽ��� �޼ҵ带 ������ؼ� eat�� 1��
	public static void main(String[] args) {

	Man man1 = new Man();
	Man man2 = new Student();
	Student st1 = new Student();
	//Student st2 = new Man();
	
	man1.eat();
	man2.eat();//����⸦ �ؼ� Man�� ����ϴ� ���� ���� ���ͼ� ��� �����ϴ�.
	st1.eat();
	
	}
}
	
	class Man{
		public void eat() {
			System.out.println("����� �� �Դ´�");
		}
	}

	class Student extends Man{
		public void eat() {
			System.out.println("�л��� �� �Դ´�");
		}	
	}

