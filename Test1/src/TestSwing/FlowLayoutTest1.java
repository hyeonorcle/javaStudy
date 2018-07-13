package TestSwing;

import javax.swing.*;
import java.awt.*;

class FlowLayout1 extends JFrame{
	
	public FlowLayout1()	//������ �޼��� 
	{
		Container ct = getContentPane();
		
		//Container�� component�� �߰��ϱ� ����,
		//��ġ(layout)�� ���� ������ ���� ��.
		FlowLayout f1 = new FlowLayout(FlowLayout.RIGHT,10,20);
		ct.setLayout(f1);//���� ������ ��ġ������ container�� ���� 
		
		for(int i=1; i<=15; i++)
			ct.add(new JButton("��ư"+i));
		setTitle("FlowLayout Test1");
		setSize(500,300);
	
		setVisible(true);
		
	}
}

public class FlowLayoutTest1 {

	public static void main(String[] args) {
		new FlowLayout1();

	}

}
