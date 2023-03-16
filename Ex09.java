package chap02;

import java.util.Scanner;

public class Ex09{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("원의 중심과 반지름 입력>>");
		double cenx = scan.nextDouble();
		double ceny = scan.nextDouble();
		double half = scan.nextDouble();
		
		System.out.print("점 입력>>");
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		
		if((x>=1)&&(x<=cenx+half)&&(y>=1)&&(y<=ceny+half))
		{System.out.println("점 {"+x+"," +y+")는 원 안에 있다.");
			
		}
		else
	
		{System.out.println("점 {"+x+"," +y+")는 원 안에 없다.");
		
		scan.close();

	}

	}
}
