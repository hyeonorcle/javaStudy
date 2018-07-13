package Test1_3;

public class OneArraysTest1 {

	public static void main(String[] args) {
		int num[] = {10,20,30};
		int num2[] = {40,50,60};
		
		num2 = num;
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num2[2]);
		
		num2[2] = 100;
		
		System.out.println(num[2]);
	}

}


