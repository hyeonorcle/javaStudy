package Test1_3;

public class CastingTest3 {

	public static void main(String[] args) {

		long l = 1234567890123456789L;
		
		//자동형 변환
		float f = l;
		double d = l;
		System.out.println("원래의 long값 : " +l);
		System.out.println("long >> float로 변환 : " + f);
		System.out.println("long >> double로 변환 " + d);
		
		//수동형 변환 
		long fl = (long)f;
		long dl = (long)d;
		System.out.println("long >> float >> long으로 변환 : " + fl);
		System.out.println("long >> double >> long으로 변환 : " + dl);

	}

}
