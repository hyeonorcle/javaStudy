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

		System.out.println("------�ڵ����Ǳ�------");
		System.out.println("�ܾ� : " + m + "��");
		System.out.print("���� �������ּ��� : ");

		m = money.nextInt();
		if(m>0)
		{	
			while(a)
			{
				
				System.out.println("-----�ܾ� " + m + "��------");


				
				System.out.println("[�޴�]");
				if(m<400)
					System.out.println("��� �ִ� ���ᰡ �����ϴ�. ���� �� �����ϼ���.");
				else {
					System.out.println("���� (400��) : 1��");
					if(m>=800)
						System.out.println("�ݶ� (800��) : 2��");
					if(m>=1000)
						System.out.println("�ֽ� (1000��) : 3��");
				}
				System.out.println("��ȯ : 0�� ");
				System.out.println("���� : 7��");
				System.out.println("�޴��� �������ּ��� : ");

				int YourChoice = num.nextInt();
				
				switch(YourChoice)
				{
				case 1 : 
					System.out.println("=======�������!!!!=========");
					System.out.println("������ ����Ǿ����ϴ�.");
					m -= 400;
					break;
				case 2 :
					System.out.println("=======�������!!!!=========");
					System.out.println("�ݶ� ����Ǿ����ϴ�.");
					m -= 800;
					break;
				case 3 :
					System.out.println("=======�������!!!!=========");
					System.out.println("�ֽ��� ����Ǿ����ϴ�.");
					m -= 1000;
					break;
				case 0 :
					System.out.println("��ȯ : " + m);
					a = false;
					break;
				case 7 :
					System.out.print("���� : ");
					
					m = m + money.nextInt();
					break;
					
				default: 
					System.out.println("�ùٸ� ��ȣ�� �Է����ּ���.");
					break;

				}
			}
		}
		else
			System.out.println("����!!!");
			
		
	}

}


