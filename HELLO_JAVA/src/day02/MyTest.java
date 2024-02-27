package day02;

import java.util.Scanner;

public class MyTest {
	public static void main(String[] args) {
// 첫 수를 입력하세요.4
// 끝 수를 입력하시오, 5
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 수를 입력하세요");
		int a = sc.nextInt();
		System.out.println("끝 수를 입력하세요");
		int b = sc.nextInt();
		System.out.println(a+"와 "+b+"의 합은"+ (a+b) +"입니다.");
	}
	
}