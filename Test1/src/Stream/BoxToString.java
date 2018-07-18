package Stream;

import java.util.Arrays;
import java.util.List;

class Box<T> {
	private T ob;
	public Box(T o) { ob = o; };
	public T get() { return ob; };
}
public class BoxToString {

	public static void main(String[] args) {
		List<Box<String>> ls = Arrays.asList(new Box<>("Robot"), new Box<>("Simple"));
		
		// �� ��ġ���� ��Ʈ���� ���� �� ���� ������ �����ϴ� ���� ����
		ls.stream()
		  .map(s -> s.get())
		  .forEach(n -> System.out.print(n + "\t"));
		
		System.out.println();
		
		ls.stream()
		  .map(s -> s.get().length())
		  .forEach(n -> System.out.print(n + "\t"));
		

	}

}
