package Generic;

import java.util.LinkedList;
import java.util.List;

public class EnhancedForCollection {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		//�ν��Ͻ� ���� 
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		 
		//��ü �ν��Ͻ� ����
		for(String s : list) 
			System.out.println(s+'\t');
		System.out.println();
		
		list.remove(1);		//ù ���� �ν��Ͻ� ����
		
		//��ü �ν��Ͻ� ����
		for(String s : list)
			System.out.println(s + '\t');
		System.out.println();
		

	}

}
