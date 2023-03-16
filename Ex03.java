package chap02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("금액을 입력하시오>>");
		int price = scan.nextInt();
		int 오만원권 = price/50000;
		int 나머지 = price%50000;
		int 만원권 = 나머지/10000;
		int 나머지1 = 나머지%10000;
		int 천원권 = 나머지1/1000;
		int 나머지2 = 나머지1%1000;
		int 백원 = 나머지2/100;
		int 나머지3 = 나머지2%100;
		int 오십원 = 나머지3/50;
		int 나머지4 = 나머지3%50;
		int 십원 = 나머지4/10;
		int 나머지5 = 나머지4%10;
		int 일원 = 나머지5/1;
		
	
		System.out.println("오만원권 "+오만원권+"매");
		System.out.println("만원권 "+만원권+"매");
		System.out.println("천원권 "+천원권+"매");
		System.out.println("백원 "+백원+"매");
		System.out.println("오십원 "+오십원+"매");
		System.out.println("십원 "+십원+"매");
		System.out.println("일원 "+일원+"매");
		
		scan.close();

	}

}
