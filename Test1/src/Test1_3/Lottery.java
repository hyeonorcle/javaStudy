package Test1_3;
import java.util.Random;

public class Lottery {

	public static void main(String[] args) {
		//Random클래스 객체 생성.
		Random Rand = new Random();

		//1차원 배열 사용했을 경우.
		//1~45까지 공을 한그릇(배열)에 저장.
		//		int Ball[] = new int[45];
		//		for(int i = 0; i<45; i++)
		//			Ball[i] = i+1;
		//		for(int x : Ball)
		//		System.out.print(x + " "); 

		//중복되지 않은 정수 6개를 저장할 공간.
		int Selected[] = new int[6];
		int Count = 0;	//중복되지 않고 뽑혀진 숫자의 총 갯수.
		int CurrentNum;

		while(Count<=5)
		{
			//랜덤하게 정수를 추출(random클래스 메서드)

			CurrentNum = 1+ Rand.nextInt(45); //0~44사이의 숫자 1개가 임의로 추출5
			
			//중복되지 않은 (비교) 숫자 6개가 나올떄까지.(반복)
			for(int OldNum: Selected)
				if(CurrentNum != OldNum)	//방금 뽑은 숫자가 과거에 이미 뽑은 숫자가 아니면(중복되지 않으면)
				{
					System.out.println(CurrentNum + "가 선택되었습니다.");
					Selected[Count] = CurrentNum;
					Count ++;
					break;
					
				}
//			방금 뽑은 숫자가, 이미 뽑혀진 숫자이면(중복이면) ==> 아무것도 안한다.

		}
		//6개의 공간에 들어있는 숫자를 다 빼서, 출력.
		System.out.println("로또결과로 ,이번주의 로또번호는 아래와 같습니다.");
		for(int y: Selected)
			System.out.print(y + " ");
		
	}

}
