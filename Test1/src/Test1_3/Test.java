package Test1_3;

public class Test {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 1;
		int Result = 0;
		
		
//		for(num2 = 1; num2<=9; num2++)
//		{
//			System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
//		}
//		for ( int count =1 ; count<= 9; count ++)
//		{
//			Result = 1 * num2;
//			System.out.println("1 * " + num2 + " = " + Result);
//			num2 ++;
//		}
		
		for (num1 =1 ; num1<=9; num1 ++)
		{
			for (num2=1 ; num2<=9; num2 ++)
			{
				Result = num1 * num2;
				System.out.println(num1 + " x " + num2 + " = " + Result);
				
			}
			System.out.println("--------------------");
		}
	}

}
