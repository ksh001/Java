package test01;

public class s2 {
//오버로딩 : 이름이 같은 method를 5개 만들면 eat가 5개
//오버라이딩 : 이름이 같은 method가 있으면 부모의 메소드에 자식의 메소드를 덮어쓰기해서 eat가 1개
	public static void main(String[] args) {

	Man man1 = new Man();
	Man man2 = new Student();
	Student st1 = new Student();
	//Student st2 = new Man();
	
	man1.eat();
	man2.eat();//덮어쓰기를 해서 Man이 허용하는 범위 내에 들어와서 사용 가능하다.
	st1.eat();
	
	}
}
	
	class Man{
		public void eat() {
			System.out.println("사람이 밥 먹는다");
		}
	}

	class Student extends Man{
		public void eat() {
			System.out.println("학생이 밥 먹는다");
		}	
	}

