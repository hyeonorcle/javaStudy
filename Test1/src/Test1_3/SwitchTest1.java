package Test1_3;
import java.util.Scanner;

public class SwitchTest1 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner abc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		int month = abc.nextInt();
		String MtoS;
//		switch(month)
//		{
//		case 12:
//		case 1:
//		case 2:
//			MtoS = "�ܿ��Դϴ�.";
//			break;
//		case 3:
//		case 4:
//		case 5:
//			MtoS = "���Դϴ�.";
//			break;
//		case 6:
//		case 7:
//		case 8:
//			MtoS = "�����Դϴ�.";
//			break;
//		case 9:
//			System.out.print("���� 9���� ");
//		case 10:
//			System.out.print("�Ƹ��ٿ� 10���� ");
//		case 11:
//			System.out.print("������ 11���� ");
//			MtoS="�����Դϴ�.";
//			break;
//			default:
//				MtoS="1~12���� ��� ���Դϴ�.";
//				break;
//		}
		if((month == 12) || (month == 1) || (month ==2))
			MtoS = "�ܿ��Դϴ�.";
		else if ((month == 3) || (month == 4) || (month ==5))
			MtoS = "���Դϴ�.";
		else if ((month == 6) || (month == 7) || (month ==8))
			MtoS = "�����Դϴ�.";
		else if ((month == 9) || (month == 10) || (month ==11))
			MtoS = "�����Դϴ�.";
		else
			MtoS="1~12���� ��� ���Դϴ�.";
		
		System.out.println(MtoS);

	}

}

