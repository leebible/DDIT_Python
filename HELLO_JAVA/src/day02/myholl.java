package day02;

import java.util.Scanner;

public class myholl {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.print("홀짝을 선택해주세요.");
		String user = sc.next();
		int rand = (int) Math.random()*100;
		String com ="";
		if(rand>50) {
			com = "홀";
		}else {
			com = "짝";
		}
		
		System.out.println(com);
		
		if(com.equals(user)) {
			System.out.println("이겼습니다.");
		}else {
			System.out.println("졌습니다.");
		}
		}
	}
	
}
