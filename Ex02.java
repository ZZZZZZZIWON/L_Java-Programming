package chap02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("2자리수 정수 입력(10~99)>>");
		int num = scan.nextInt();
		int quo = num/10;
		int rem = num%10;
		
		if(quo==rem)
		System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		
		else if(quo!=rem)
		System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
		
		scan.close();

	}

}
