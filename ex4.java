package test01;

public class ex4 {
	
	public static void main(String[] args) {
		
		Circle c1 = new Circle("Pizza", 0);
		Circle c2 = new Circle("donut", 0);
		Circle c3 = new Circle("hamburger", 0);
		
		c1.setRad(12);//반지름 변환
		c2.setRad(-2);
		c3.setRad(7);
		
		c1.show();
		c2.show();
		c3.show();
		
		if(c1.getArea()>c2.getArea()&&c1.getArea()>c3.getArea())//c1이 가장 클 때
			System.out.printf("가장 큰 면적은 %s",c1.getName());
		else if(c2.getArea()>c3.getArea())
			System.out.printf("가장 큰 면적은 %s",c2.getName());//c2가 가장 클 때
		else
			System.out.printf("가장 큰 면적은 %s",c3.getName());//c3가 가장 클 때
		
		
		}
	}

class Circle{

	private String name;
	private int radius;
	
	public Circle(String N, int R) 
	{
		name = N;
		radius = R;
	}
	
	
	void setRad(int r){//반지름 변환
		if(r>0)
			radius = r;
		}
	
	String getName() {//이름 반환
		return(name);
	}
	
	double getArea() {//넓이 반환
		return(radius*radius*3.14);
	}
	
	void show() {//넓이, 이름 출력
		System.out.printf("%s넓이 : %.2f\n", getName(), getArea());
	}
	
}