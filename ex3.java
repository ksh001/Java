package test01;

public class ex3 {
	public static void main(String args[]) {
		 Rectangle r = new Rectangle(2, 2, 8, 7);
		 Rectangle s = new Rectangle(5, 5, 6, 6);
		 Rectangle t = new Rectangle(1, 1, 10, 10);
		 
		 r.show();
		 System.out.println("s의 면적은 " + s.square());
		 if (t.contains(r))
		 System.out.println("t는 r을 포함합니다.");
		 if (t.contains(s))
		 System.out.println("t는 s를 포함합니다.");
		 }
	}

class Rectangle{

	int x, y, width, height;
	
	public Rectangle(int X, int Y, int W, int H) 
	{
		x = X;
		y = Y;
		width = W;
		height = H;
	}
	
	int square(){
		return(width*height);
		}
	
	void show() {
		System.out.printf("(%d,%d)에서 크기가 %d×%d인 사각형", x, y, width, height);
		}
	
	boolean contains(Rectangle A) 
	{ 
		if((A.x-A.width/2)>=(x-width/2)&&(A.x+A.width/2)<=(x+width/2)
				&&(A.y-A.height/2)>=(y-height/2)&&(A.y+A.height/2)<=(y+height/2)) 
			return true;

		else return false;
	}
}