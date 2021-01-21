package test01;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//System.in-> console에 입력/(파일이나 다른 입력도 가능)/파일에 입력, 화면에 입력
		String num = sc.nextLine();
		String num2 = sc.next();
		
		//nextInt int num = 으로 바꿔야 함
		
		//System.out.printf("입력하신 문자는 %s 입니다.\n", num);
		System.out.println("입력하신 문자는 " + num + "입니다.");//입력하신 문자는 가나 다라입니다.
		System.out.println("입력하신 문자는 " + num2 + "입니다.");//입력하신 문자는 가나입니다.
		
		}

}
