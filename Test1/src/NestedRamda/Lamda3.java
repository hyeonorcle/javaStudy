package NestedRamda;

interface Printable3 {	//�߻� �޼ҵ尡 �ϳ��� �������̽�
	void print(String s);
}

public class Lamda3 {

	public static void main(String[] args) {
		Printable3 prn = (s) -> { System.out.println(s); };
		prn.print("What is Lamda?");

	}

}
