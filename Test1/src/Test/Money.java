package Test;

import java.util.Scanner;

class Money {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("금액을 입력하세요. : ");
		int m = sc.nextInt();	
		
		int s = 50000;			// 돈 단위 저장 변수
		int arr[] = new int[9]; //돈 단위 개수

		for(int i = 0; i<9; i++) {
			if(s >= 10) {
				arr[i] = m/s;
				m = m%s;		//나머지 입력

				if(i%2 == 0) 
					s= s/5;

				else
					s = s/2;
			}

			else {
				arr[i] = m;
				break;}

		}
		System.out.println("50000 원\t 10000원\t 5000원\t 1000원\t 500원\t 100원\t 50원\t 10원\t 나머지값" );
		for(int i = 0; i<9; i++)
			System.out.print("  " + arr[i] + "개 \t");
		


	}
}

