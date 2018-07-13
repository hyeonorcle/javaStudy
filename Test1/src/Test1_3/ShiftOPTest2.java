package Test1_3;
import java.util.Scanner;

public class ShiftOPTest2 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner xyz = new Scanner(System.in);
		System.out.println("숫자 1개를 입력하라 : ");

		int a = xyz.nextInt();
		System.out.print( a%2==0 ?a + " 은(는) 짝수" : a + " 은(는) 홀수" );
	}
}
