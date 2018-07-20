package Test01;

interface Printable {
	void print(String s);
}

interface Calculable {
	int add(int a, int b);
}

public class MyTest {

	public static void main(String[] args) {

		// ¹®Á¦ 1¹ø 
		Printable pr = (s) -> {System.out.println(s);};

		Calculable ca = (a,b) -> a + b ;

		pr.print("abc");
		System.out.println(ca.add(10, 20));
		
	}

}



