package chap02;

import java.util.Scanner;

public class Ex07{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점 (x,y)의 좌표를 입력하시오>>");
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		if((x>=100)&&(x<=200)&&(y>=100)&&(y<=200))
		{System.out.println("("+x+","+y+")는 사각형 안에 있습니다.");
			
		}
		else
	
		System.out.println("("+x+","+y+")는 사각형 안에 없습니다.");
		
		scan.close();

	}

}
