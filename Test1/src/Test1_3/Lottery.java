package Test1_3;
import java.util.Random;

public class Lottery {

	public static void main(String[] args) {
		//RandomŬ���� ��ü ����.
		Random Rand = new Random();

		//1���� �迭 ������� ���.
		//1~45���� ���� �ѱ׸�(�迭)�� ����.
		//		int Ball[] = new int[45];
		//		for(int i = 0; i<45; i++)
		//			Ball[i] = i+1;
		//		for(int x : Ball)
		//		System.out.print(x + " "); 

		//�ߺ����� ���� ���� 6���� ������ ����.
		int Selected[] = new int[6];
		int Count = 0;	//�ߺ����� �ʰ� ������ ������ �� ����.
		int CurrentNum;

		while(Count<=5)
		{
			//�����ϰ� ������ ����(randomŬ���� �޼���)

			CurrentNum = 1+ Rand.nextInt(45); //0~44������ ���� 1���� ���Ƿ� ����5
			
			//�ߺ����� ���� (��) ���� 6���� ���Ë�����.(�ݺ�)
			for(int OldNum: Selected)
				if(CurrentNum != OldNum)	//��� ���� ���ڰ� ���ſ� �̹� ���� ���ڰ� �ƴϸ�(�ߺ����� ������)
				{
					System.out.println(CurrentNum + "�� ���õǾ����ϴ�.");
					Selected[Count] = CurrentNum;
					Count ++;
					break;
					
				}
//			��� ���� ���ڰ�, �̹� ������ �����̸�(�ߺ��̸�) ==> �ƹ��͵� ���Ѵ�.

		}
		//6���� ������ ����ִ� ���ڸ� �� ����, ���.
		System.out.println("�ζǰ���� ,�̹����� �ζǹ�ȣ�� �Ʒ��� �����ϴ�.");
		for(int y: Selected)
			System.out.print(y + " ");
		
	}

}
