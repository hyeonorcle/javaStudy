package TestSwing;

import javax.swing.*;
import java.awt.*;


class BL_TEST extends JFrame
{
	public BL_TEST() 
	{
		Container xx = getContentPane();
		BorderLayout yy = new BorderLayout(10,10); //(�ణ��, ������)
		xx.setLayout(yy);
		
		xx.add(new JButton("������ư"),BorderLayout.EAST);
		xx.add(new JButton("������ư"),BorderLayout.WEST);
		xx.add(new JButton("���ʹ�ư"),BorderLayout.NORTH);
		xx.add(new JButton("�Ʒ���ư"),BorderLayout.SOUTH);
		xx.add(new JButton("�߾ӹ�ư"),BorderLayout.CENTER);
		
		setTitle("BorderLayout TEST");
		setSize(1000,1000);
		setVisible(true);
	}
}
public class Test_BorderLayout {

	public static void main(String[] args) {
		new BL_TEST(); 

	}

}
