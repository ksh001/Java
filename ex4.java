package test01;

public class ex4 {
	
	public static void main(String[] args) {
		
		Circle c1 = new Circle("Pizza", 0);
		Circle c2 = new Circle("donut", 0);
		Circle c3 = new Circle("hamburger", 0);
		
		c1.setRad(12);//������ ��ȯ
		c2.setRad(-2);
		c3.setRad(7);
		
		c1.show();
		c2.show();
		c3.show();
		
		if(c1.getArea()>c2.getArea()&&c1.getArea()>c3.getArea())//c1�� ���� Ŭ ��
			System.out.printf("���� ū ������ %s",c1.getName());
		else if(c2.getArea()>c3.getArea())
			System.out.printf("���� ū ������ %s",c2.getName());//c2�� ���� Ŭ ��
		else
			System.out.printf("���� ū ������ %s",c3.getName());//c3�� ���� Ŭ ��
		
		
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
	
	
	void setRad(int r){//������ ��ȯ
		if(r>0)
			radius = r;
		}
	
	String getName() {//�̸� ��ȯ
		return(name);
	}
	
	double getArea() {//���� ��ȯ
		return(radius*radius*3.14);
	}
	
	void show() {//����, �̸� ���
		System.out.printf("%s���� : %.2f\n", getName(), getArea());
	}
	
}