package TestSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class AA1 extends JFrame implements ActionListener {

	JLabel result = new JLabel();

	ImageIcon i1 = new ImageIcon("apple.jpg");
	ImageIcon i2 = new ImageIcon("pear.jpg");

	public AA1() 	//Constructor 메서드
	{
		JButton apple = new JButton("사과");
		JButton pear = new JButton("배");

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

	//오버라이딩 메서드(이벤트 헨들러)
	public void actionPerformed(ActionEvent ae) 
	{
		//1번째 버튼(apple)에서 ActionEvent 발생했나?
		if(ae.getActionCommand() == "사과") {
			//1. ImageIcon에 그림을 보여줌
			result.setIcon(i1);
			//2. Label에 글자를 적어줌.
			result.setText("이것이 사과다");	

		}


		//2번째 버튼(pear)에서 ActionEvent 발생했나?
		else if(ae.getActionCommand() == "배") {
			//1. ImageIcon에 그림을 보여줌
			result.setIcon(i2);
			//2. Label에 글자를 적어줌.
			result.setText("이것이 배다");

		}
	}

}

public class Test_ImagIcon {

	public static void main(String[] args) {

		new AA1();

	}

}
