package Test1_3;

public class ArraysTest2 {

	public static void main(String[] args) {
		int score[] = {88,97,53,62,92,68,82};
		int max = score[0];
		
		for(int i : score)
			//기존 for 문 : for(int i=1; i<score.length; i++)
		{
			if(i>max)
				//기존의 for문을 사용할 때의 if문 : of(score[i]>max)
				max = i;
			//max = score[i];
			
		}
		System.out.println("배열요소의 최대값은 "+ max + "입니다.");
	}

}
