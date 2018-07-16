package NestedRamda;

/*interface Printable {
	void print();
}
*/
class Papers1 {
	private String con;

	public Papers1(String s) { con = s; }

	public Printable getPrinter() {
		return new Printable() {	//익명 클래스의 정의와 인스턴스 생성
			public void print() {
				System.out.println(con);
			}
		};
	}
}
	public class UseAnonymousInner {

		public static void main(String[] args) {
			Papers p = new Papers("서류 내용 : 행복합니다.");
			Printable prn = p.getPrinter();
			prn.print();

		}

	}
