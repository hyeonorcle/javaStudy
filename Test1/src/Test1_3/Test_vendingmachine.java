package Test1_3;
import java.util.Scanner;

public class Test_vendingmachine {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner objDrink = new Scanner(System.in);
		int YourChoice = -1; 

		int TotalMoney = 0; // �ܾ� ��� �������(����)
		System.out.println("�������. �������� �ϰ� ������?");
		System.out.println("�ܾ� : " + TotalMoney);


		while(true)
		{
			System.out.println("���ð� ������, ���� �����ϼ��� : ");
			@SuppressWarnings("resource")
			Scanner objMoney = new Scanner(System.in);	//Ŭ�����κ��� ��ü ����.
			int Money = objMoney.nextInt();
			if(Money > 0)	//���Ե� �ݾ��� ������ 
			{
				TotalMoney = TotalMoney + Money; 	//���� �ܾ׿� ���Ե� �ݾ��� ���ؼ�, �ܾ� ����
				System.out.println("�ܾ� : " + TotalMoney);
			}
			//���ð����� �޴��� ǥ��.
			if(TotalMoney >= 1000)
				System.out.println("�޴������Ͻÿ�(��ȯ:0, ����:1 �ݶ� :2, �꽺:3) : ");
			else if(TotalMoney >= 800)
				System.out.println("�޴������Ͻÿ�(��ȯ :0, ���� :1, �ݶ�:2) : ");
			else if(TotalMoney >= 400)
				System.out.println("�޴������Ͻÿ�(��ȯ:0, ����:1) : ");
			else
				System.out.println("�ܾ����� ������ �� �ִ� �޴��� �����ϴ�. �� ��������. ");

			//�޴� ����.
			if(TotalMoney>=400)
			{
				YourChoice = objDrink.nextInt();


				switch(YourChoice)
				{
				case 0: 
					System.out.println("�ܾ� " + TotalMoney + "�� ��ȯ�Ǿ����ϴ�. �� ������.");
					TotalMoney = 0;
					break;
				case 1:
					System.out.println("������ ����Ǿ����ϴ�.");
					TotalMoney = TotalMoney - 400;
					break;
				case 2:
					System.out.println("�ݶ� ����Ǿ����ϴ�.");
					TotalMoney -=  800;
					break;
				case 3:
					System.out.println("�꽺�� ����Ǿ����ϴ�.");
					TotalMoney -= 1000;
					break;
				}
				//�ܾ� ����
				System.out.println("�ܾ� : " + TotalMoney);
			}
		}
	}

}
