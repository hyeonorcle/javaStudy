package Generic;

interface Eatable {
	public String eat();
}

class Apple1 implements Eatable {
	public String toString() {
		return "Iam an apple.";
	}
	
	@Override
	public String eat() {
		return "It tastes so good!";
	}
}

class Box1<T extends Eatable> {
	T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		System.out.println(ob.eat());	//Eatable로 제한하였기에 eat호출 가능
		return ob;
	}
}

public class BoundedInterFaceBox {
	public static void main(String[] args) {
		Box1<Apple1> box = new Box1<>();
		box.set(new Apple1());	//사과 저장
		
		Apple1 ap = box.get();	//사과 꺼내기
		System.out.println(ap);
	}

}
