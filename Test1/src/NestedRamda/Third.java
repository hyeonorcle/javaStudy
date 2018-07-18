package NestedRamda;

interface Printable6 {
	void print(String s);
}

public class Third {

	public static void main(String[] args) {
		Printable6 prn = (s) -> {System.out.println(s);};
		prn.print("Sample test");

	}

}
