//this
package test01;

public class ex5 {

	public static void main(String[] args) {
		Calc c = new Calc();
		 c.setValue(2, 5, '+');
		 c.result();
		 c.setValue(2, 5, '$');
		 c.result();
		 c.setValue(2, 5, '-');
		 c.result();
		 c.setValue(2, 5, '*');
		 c.result();
		 c.setValue(2, 5, '/');
		 c.result();

	}
}


class Calc{
	
	int num1, num2;
	public char A;
	
	
	void setValue(int num1, int num2, char A)
	{	
		this.num1 = num1;
		this.num2 = num2;
		this.A = A;
	}
	
	int add(int n, int m) {
		return(n+m);
	}
	
	int sub(int n, int m) {
		return(n-m);
	}
	
	int mul(int n, int m) {
		return(n*m);
	}
	
	int div(int n, int m) {
		return(n/m);
	}
	
	
	void result(){

		if(A == '+')
			System.out.printf("result = %d\n", add(num1, num2));
		else if(A == '-')
			System.out.printf("result = %d\n", sub(num1, num2));
		else if(A == '*')
			System.out.printf("result = %d\n", mul(num1, num2));
		else if(A == '/')
			System.out.printf("result = %d\n", div(num1, num2));
		else
			System.out.println("잘못된 연산자입니다.");
	}

}
