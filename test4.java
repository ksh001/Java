package test01;

public class test4 {

	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5};
		int sum = 0;
		
		
		//for each¹®
		for(int e : ar) {	
			System.out.println(e);
			sum += e;
		}
		
		System.out.println(sum);
	}

}
