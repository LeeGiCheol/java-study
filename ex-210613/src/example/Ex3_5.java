package example;

import java.util.Scanner;

public class Ex3_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			System.out.println(num == 0 ? "0" : (num > 0 ? "양수" : "음수"));
			
			if (num == -1) {
				break;
			}
			
		}
		

		
	}
	
}
