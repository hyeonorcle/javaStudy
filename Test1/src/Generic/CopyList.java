package Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CopyList {

	public static void main(String[] args) {
		List<String> src = Arrays.asList("Box", "Apple", "Toy", "Robot");
		
		//���纻�� �����.
		List<String> dest = new ArrayList<>(src);
		
		//�����Ͽ� �� ����� ���
		Collections.sort(dest);
		System.out.println(dest);
		
		//dest �� ����� ������ src�� ����� �������� ���
		Collections.copy(dest, src);
		
		//�ǵ��� Ȯ��
		System.out.println(dest); //�÷��� �ν��Ͻ��� ����� ���� ���� ��� 

	}

}
