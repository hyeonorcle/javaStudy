package Test;

import java.util.Scanner;

class Money {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�ݾ��� �Է��ϼ���. : ");
		int m = sc.nextInt();	
		
		int s = 50000;			// �� ���� ���� ����
		int arr[] = new int[9]; //�� ���� ����

		for(int i = 0; i<9; i++) {
			if(s >= 10) {
				arr[i] = m/s;
				m = m%s;		//������ �Է�

				if(i%2 == 0) 
					s= s/5;

				else
					s = s/2;
			}

			else {
				arr[i] = m;
				break;}

		}
		System.out.println("50000 ��\t 10000��\t 5000��\t 1000��\t 500��\t 100��\t 50��\t 10��\t ��������" );
		for(int i = 0; i<9; i++)
			System.out.print("  " + arr[i] + "�� \t");
		


	}
}

