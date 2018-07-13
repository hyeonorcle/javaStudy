package Test1_3;
import java.util.Scanner;

public class SwitchTest1 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner abc = new Scanner(System.in);
		System.out.print("월을 입력하세요 : ");
		int month = abc.nextInt();
		String MtoS;
//		switch(month)
//		{
//		case 12:
//		case 1:
//		case 2:
//			MtoS = "겨울입니다.";
//			break;
//		case 3:
//		case 4:
//		case 5:
//			MtoS = "봄입니다.";
//			break;
//		case 6:
//		case 7:
//		case 8:
//			MtoS = "여름입니다.";
//			break;
//		case 9:
//			System.out.print("멋진 9월과 ");
//		case 10:
//			System.out.print("아름다운 10월과 ");
//		case 11:
//			System.out.print("낙엽의 11월은 ");
//			MtoS="가을입니다.";
//			break;
//			default:
//				MtoS="1~12월을 벗어난 달입니다.";
//				break;
//		}
		if((month == 12) || (month == 1) || (month ==2))
			MtoS = "겨울입니다.";
		else if ((month == 3) || (month == 4) || (month ==5))
			MtoS = "봄입니다.";
		else if ((month == 6) || (month == 7) || (month ==8))
			MtoS = "여름입니다.";
		else if ((month == 9) || (month == 10) || (month ==11))
			MtoS = "가을입니다.";
		else
			MtoS="1~12월을 벗어난 달입니다.";
		
		System.out.println(MtoS);

	}

}


