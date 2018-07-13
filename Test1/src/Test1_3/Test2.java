package Test1_3;
import java.util.Scanner;


public class Test2 {

	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner money = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner num = new Scanner(System.in);
		boolean a=true;
		int m = 0;

		System.out.println("------자동자판기------");
		System.out.println("잔액 : " + m + "원");
		System.out.print("돈을 투입해주세요 : ");

		m = money.nextInt();
		if(m>0)
		{	
			while(a)
			{
				
				System.out.println("-----잔액 " + m + "원------");


				
				System.out.println("[메뉴]");
				if(m<400)
					System.out.println("살수 있는 음료가 없습니다. 돈을 더 투입하세요.");
				else {
					System.out.println("생수 (400원) : 1번");
					if(m>=800)
						System.out.println("콜라 (800원) : 2번");
					if(m>=1000)
						System.out.println("주스 (1000원) : 3번");
				}
				System.out.println("반환 : 0번 ");
				System.out.println("투입 : 7번");
				System.out.println("메뉴를 선택해주세요 : ");

				int YourChoice = num.nextInt();
				
				switch(YourChoice)
				{
				case 1 : 
					System.out.println("=======음료배출!!!!=========");
					System.out.println("생수가 배출되었습니다.");
					m -= 400;
					break;
				case 2 :
					System.out.println("=======음료배출!!!!=========");
					System.out.println("콜라가 배출되었습니다.");
					m -= 800;
					break;
				case 3 :
					System.out.println("=======음료배출!!!!=========");
					System.out.println("주스가 배출되었습니다.");
					m -= 1000;
					break;
				case 0 :
					System.out.println("반환 : " + m);
					a = false;
					break;
				case 7 :
					System.out.print("투입 : ");
					
					m = m + money.nextInt();
					break;
					
				default: 
					System.out.println("올바른 번호를 입력해주세요.");
					break;

				}
			}
		}
		else
			System.out.println("오류!!!");
			
		
	}

}


