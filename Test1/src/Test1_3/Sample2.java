package Test1_3;

public class Sample2 {

	public static void main(String[] args) {
//		String s1 = args[0];
//		String s2 = args[1];
//		System.out.println("첫 번쨰 매개 변수값 : " + s1);
//		System.out.println("두 번쨰 매개 변수값 : " + s2);
		
		System.out.println("매개 변수로 받은 두 수의 합은 : " + (args[0] + args[1]));
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("매개 변수로 받은 두 수의 합은 : " + (a+b));

	}

}
