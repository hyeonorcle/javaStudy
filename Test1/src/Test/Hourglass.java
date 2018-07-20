package Test;

import java.util.Scanner;

public class Hourglass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요. : ");
		int s = sc.nextInt();	//배열 사이즈 
		int arr[][] = new int[s][s];

		int e = 65;	
		int h = s/2;			//배열 사이즈의 중간 값
		
		for(int i = 0; i<s; i++) {

			if(i<=h) {
				for(int j = i; j<s-i; j++ )
					arr[i][j] = e++;
				}
			
			else {
				for(int j =s-1-i; j<i+1; j++ )
					arr[i][j] = e++;
				}
		}
		
		for(int i = 0; i<s; i++) {
			for( int j = 0; j<s; j++) {
				System.out.print((char)arr[i][j] + " ");
				
				if(j==s-1)
					System.out.println();
			}
				
		}
		int brr[][] = new int[s][s];
		for(int i = 0; i<s; i++) {
			for(int j = 0; j<s; j++) {
				brr[j][s-1-i] = arr[i][j]; 
			}
		}
		
		System.out.println("============================================");
		for(int i = 0; i<s; i++) {
			for( int j = 0; j<s; j++) {
				System.out.print((char)brr[i][j] + " ");
				
				if(j==s-1)
					System.out.println();
			}
				
		}
			
		
		
		
	}

}
