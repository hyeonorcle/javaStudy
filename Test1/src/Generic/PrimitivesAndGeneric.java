package Generic;

/*
class Box<T> {	private T ob;

	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}
*/
public class PrimitivesAndGeneric {

	public static void main(String[] args) {
		Box<Integer> ibox = new Box<>();
		ibox.set(125); 		//���� �ڽ� ����
		int num = ibox.get();		//���� ��ڽ� ����
		System.out.println(num);
		

	}

}
