package test01;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//System.in-> console�� �Է�/(�����̳� �ٸ� �Էµ� ����)/���Ͽ� �Է�, ȭ�鿡 �Է�
		String num = sc.nextLine();
		String num2 = sc.next();
		
		//nextInt int num = ���� �ٲ�� ��
		
		//System.out.printf("�Է��Ͻ� ���ڴ� %s �Դϴ�.\n", num);
		System.out.println("�Է��Ͻ� ���ڴ� " + num + "�Դϴ�.");//�Է��Ͻ� ���ڴ� ���� �ٶ��Դϴ�.
		System.out.println("�Է��Ͻ� ���ڴ� " + num2 + "�Դϴ�.");//�Է��Ͻ� ���ڴ� �����Դϴ�.
		
		}

}
