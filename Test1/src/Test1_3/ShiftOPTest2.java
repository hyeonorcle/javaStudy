package Test1_3;
import java.util.Scanner;

public class ShiftOPTest2 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner xyz = new Scanner(System.in);
		System.out.println("���� 1���� �Է��϶� : ");

		int a = xyz.nextInt();
		System.out.print( a%2==0 ?a + " ��(��) ¦��" : a + " ��(��) Ȧ��" );
	}
}
