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
		System.out.println(ob.eat());	//Eatable�� �����Ͽ��⿡ eatȣ�� ����
		return ob;
	}
}

public class BoundedInterFaceBox {
	public static void main(String[] args) {
		Box1<Apple1> box = new Box1<>();
		box.set(new Apple1());	//��� ����
		
		Apple1 ap = box.get();	//��� ������
		System.out.println(ap);
	}

}
