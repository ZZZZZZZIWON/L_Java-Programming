package chap02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("정수 3개 입력>>");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int med;
		if (a > b) 
		{
			     if (c > a)		med = a;
			else if (c < b)
								med = b;
			else
								med = c;
		} 
		else if (b > c) 
		{
				 if (a > b)		med = b;
			else if (a < c)
								med = c;
			else        
				                med = a;
		} 
		else 
		{
			med = b;
		}

		System.out.println("중간 값은 " + med);

		scan.close();

	}

}
