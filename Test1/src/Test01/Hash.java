package Test01;

import java.util.HashSet;
class MyNum {
	int num;
	
	MyNum(int a) {
		num = a;
	}
}

public class Hash {

	public static void main(String[] args) {
		HashSet<MyNum> set = new HashSet<>();
		set.add(new MyNum(1111));
		set.add(new MyNum(2222));
		set.add(new MyNum(3333));
		set.add(new MyNum(1111));
		
		System.out.println(set.size());

	}

}
