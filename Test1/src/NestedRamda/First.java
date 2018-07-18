package NestedRamda;

interface Printable5 {
	void print();
}

class Papers5 {
	private String con;
	
	public Papers5(String s) { con = s; }
	
	public Printable5 getPrinter() {
		class Printer implements Printable5 { 	
			public void print() {
				System.out.println(con);
			}
		}
		
		return new Printer(); 		
	}
}
public class First {

	public static void main(String[] args) {
		Papers5 p = new Papers5("print this");
		Printable5 prn = p.getPrinter();
		prn.print();

	}

}
