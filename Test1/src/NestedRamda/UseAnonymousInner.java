package NestedRamda;

/*interface Printable {
	void print();
}
*/
class Papers1 {
	private String con;

	public Papers1(String s) { con = s; }

	public Printable getPrinter() {
		return new Printable() {	//�͸� Ŭ������ ���ǿ� �ν��Ͻ� ����
			public void print() {
				System.out.println(con);
			}
		};
	}
}
	public class UseAnonymousInner {

		public static void main(String[] args) {
			Papers p = new Papers("���� ���� : �ູ�մϴ�.");
			Printable prn = p.getPrinter();
			prn.print();

		}

	}
