package TestSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class AA1 extends JFrame implements ActionListener {

	JLabel result = new JLabel();

	ImageIcon i1 = new ImageIcon("apple.jpg");
	ImageIcon i2 = new ImageIcon("pear.jpg");

	public AA1() 	//Constructor �޼���
	{
		JButton apple = new JButton("���");
		JButton pear = new JButton("��");

		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(apple);
		ct.add(pear);
		ct.add(result);

		apple.addActionListener(this);
		pear.addActionListener(this);

		setSize(300,300);
		setVisible(true);
	}

	//�������̵� �޼���(�̺�Ʈ ��鷯)
	public void actionPerformed(ActionEvent ae) 
	{
		//1��° ��ư(apple)���� ActionEvent �߻��߳�?
		if(ae.getActionCommand() == "���") {
			//1. ImageIcon�� �׸��� ������
			result.setIcon(i1);
			//2. Label�� ���ڸ� ������.
			result.setText("�̰��� �����");	

		}


		//2��° ��ư(pear)���� ActionEvent �߻��߳�?
		else if(ae.getActionCommand() == "��") {
			//1. ImageIcon�� �׸��� ������
			result.setIcon(i2);
			//2. Label�� ���ڸ� ������.
			result.setText("�̰��� ���");

		}
	}

}

public class Test_ImagIcon {

	public static void main(String[] args) {

		new AA1();

	}

}
