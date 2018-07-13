package Test1_3;
import java.util.Random; 		//��������� ���� Ŭ���� �߰�.

public class MultiArraysTest1 {

	public static void main(String[] args) {
		//�迭 : �������� �����͸� �Ѳ����� ��Ƽ� ������ �� �ִ� ������� ���� 
		//	   16���� ������ ����.-->���� 4���� �׷���� 4���� �׷����� ����.

		Random ran = new Random();					//Random Ŭ�������� �޼Ҹ� ����ϱ� ���ؼ� 
		//���纻(��ü, �ν��Ͻ�) ����.

		int score[][] = new int [4][4]; 			//4���� �׷�, �� �׷��� 4����.

		//2���� �迭�� ���� ����.
		for (int i =0; i<4; i++) 					// �׷��� ��ȸ (0~3�� �׷����)
			for(int j=0; j<4; j++) 					//�� �׷쳻���� 4���� ��������� ��ȸ 
				score[i][j] = ran.nextInt(10);		//������ ����(0~9 ������ ���� �ƹ�����)

		//�迭�� �� ��������� ������ ������, ǥ���ϰ� , �� ���� ǥ��.
		for(int k=0; k<4; k++)						//�׷� ��ȸ
		{
			int sum = 0;							//�� �׷캰 �������� ����
			System.out.print((k+1)+ "�� �׷� { " );

			for(int value : score[k])				//�� �׷쳻�� ������� ��ȸ
			{
				System.out.print(value + " ");		//����� �����͸� ǥ��.
				sum = sum + value;					//������ �����ϸ鼭 ���� .

			}
			System.out.println("} " + "�� �������� ������ : " + sum);
		}


	}

}
