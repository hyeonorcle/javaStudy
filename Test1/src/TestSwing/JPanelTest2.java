package TestSwing;

import javax.swing.*;
import java.awt.*;

class Panel_Test extends JFrame {
	public Panel_Test() {
		Container ct = getContentPane();
		ct.setLayout(new BorderLayout(5,5));
		//��ư 5���� jp1 �гο�, ������ư 5���� jp2 �гο� �߰�.
		
		JPanel jp1 = new JPanel();
		
		//�гο� ��ġ���� ���� 
		jp1.setLayout(new GridLayout(3,1));
		jp1.add(new JButton("1�� ��ư"));
		jp1.add(new JButton("2�� ��ư"));
		jp1.add(new JButton("3�� ��ư"));
		
		ct.add(jp1, BorderLayout.WEST);

		JPanel jp2 = new JPanel();
		jp2.setLayout(new GridLayout(3,1));
		jp2.add(new JRadioButton("1�� ��ư"));
		jp2.add(new JRadioButton("2�� ��ư"));
		jp2.add(new JRadioButton("3�� ��ư"));
		
		ct.add(jp2, BorderLayout.EAST);
		
		setTitle("JPanel Test");
		setSize(700,700);
		setVisible(true);
		
	}
}

public class JPanelTest2 {

	public static void main(String[] args) {
		new Panel_Test();

	}

}
