package Test1_3;
import java.util.Random; 		//랜덤기능을 가진 클래스 추가.

public class MultiArraysTest1 {

	public static void main(String[] args) {
		//배열 : 복수개의 데이터를 한꺼번에 모아서 저장할 수 있는 저장공간 생성 
		//	   16개의 정수를 저장.-->정수 4개씩 그룹지어서 4개의 그룹으로 생성.

		Random ran = new Random();					//Random 클래스내의 메소를 사용하기 위해서 
		//복사본(객체, 인스턴스) 생성.

		int score[][] = new int [4][4]; 			//4개의 그룹, 각 그룹은 4개씩.

		//2차원 배열에 값을 저장.
		for (int i =0; i<4; i++) 					// 그룹의 순회 (0~3번 그룹까지)
			for(int j=0; j<4; j++) 					//각 그룹내에서 4개의 저장공간을 순회 
				score[i][j] = ran.nextInt(10);		//임의의 숫자(0~9 사이의 정수 아무꺼나)

		//배열의 각 저장장소의 내용을 꺼내서, 표시하고 , 그 총합 표시.
		for(int k=0; k<4; k++)						//그룹 순회
		{
			int sum = 0;							//각 그룹별 데이터의 총합
			System.out.print((k+1)+ "번 그룹 { " );

			for(int value : score[k])				//각 그룹내의 저장공간 순회
			{
				System.out.print(value + " ");		//저장된 데이터를 표시.
				sum = sum + value;					//총합을 누적하면서 구함 .

			}
			System.out.println("} " + "의 데이터의 총합은 : " + sum);
		}


	}

}
