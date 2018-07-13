package Test1_3;

public class ForTest1 {

	public static void main(String[] args) {
		int count = 1, sum = 0;
//		for (i =1; i<=10; i++)
//		{
//			sum += i;
//		}
//		while(count<=5) 
//		{
//			sum = sum + (count + 2);
//			count ++;
//		}
		do 
		{
			sum = sum + (count + 2);
			count ++;
			
		}while(count <= 5);
		System.out.println("1부터 10까지의 합은 " + sum + " 입니다.");
	}

}
