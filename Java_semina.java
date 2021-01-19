package test01;
//210120 java 실습




public class test {

	public static void main(String[] args) {
		Cal cal = new Cal("김수현");  // class의 크기를 갖는 참조변수 선언, new를 이용해 메모리 값 찝기, 생성자 변수 넣음
		
		int res = cal.add(5, 4);
		System.out.println(res);
		
		cal.name_print();
		
		System.out.println(cal.add("abb", "ccc"));
	}	
}

class Cal{
	private String name; //private : 같은 클래스 내에서만 사용 가능
	
	public Cal(String name){ // 생성자 함수 : 이름을 받음, class 이름과 같아야 함
		this.name = name; //this.name : class의 변수	
	}
	
	public void name_print() { //이름 출력
		System.out.println(name);
	}
	
	public int add(int a, int b) { // add 메소드 : 덧셈값 반환
		return a+b; //반환형이 없는건 생성자 함수밖에 없다.
	}
	
	public String add(String a, String b) { //string 받아서 이어주기
		return a+b;
	}
}
