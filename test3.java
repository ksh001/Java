package test01;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		
	int[] ref = new int[3];//�迭 ���� ���
		Scanner sc = new Scanner(System.in);
		
				
		for(int i =0; i<3; i++) {
			
			ref[i] = sc.nextInt();
			System.out.printf("ref[%d] = %d\n", i, ref[i]);	
		}
		
		System.out.println(ref.length);//�迭�� ���� ���
	}
//���� Box class
}
