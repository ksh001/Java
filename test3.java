package test01;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		
	int[] ref = new int[3];//배열 선언 방식
		Scanner sc = new Scanner(System.in);
		
				
		for(int i =0; i<3; i++) {
			
			ref[i] = sc.nextInt();
			System.out.printf("ref[%d] = %d\n", i, ref[i]);	
		}
		
		System.out.println(ref.length);//배열의 길이 출력
	}
//과제 Box class
}
