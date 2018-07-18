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
		
		// 이 위치에서 스트림의 생성 및 맵핑 연산을 진행하는 문자 구성
		ls.stream()
		  .map(s -> s.get())
		  .forEach(n -> System.out.print(n + "\t"));
		
		System.out.println();
		
		ls.stream()
		  .map(s -> s.get().length())
		  .forEach(n -> System.out.print(n + "\t"));
		

	}

}
