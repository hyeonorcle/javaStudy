package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BaseballGame {

	public static void main(String[] args) {

		Random rand = new Random();
		Scanner sc = new Scanner(System.in);


		int StrikeBall[] = new int[3];
		int hit[] = new int[3];

		int CStrikeBall = 0;



		int count = 0;

		while(count<=2)
		{
			CStrikeBall = 1 + rand.nextInt(8); 

			for(int o : StrikeBall) {
				if(o != CStrikeBall) {
					StrikeBall[count] = CStrikeBall;
					count++;  
					break;
				}
			}
		}

		while(true) {

			int ballCount = 0; 
			int strikeCount = 0;


			for(int i=0; i<3; i++) {
				System.out.print("[" + (i+1) + "] ball : ");
				hit[i] = sc.nextInt();
				System.out.println();
			}
			for(int i = 0; i< 3; i++) {
				for(int j =0; j<3; j++) {
					if(StrikeBall[i] == hit[j]) {
						if( i == j )
							strikeCount++;
						else
							ballCount++;
					}
				}
			}

			System.out.println(ballCount + "볼, " + strikeCount + "스트라이크 입니다.");

			if(strikeCount == 3)
				break;

		}

	}
}