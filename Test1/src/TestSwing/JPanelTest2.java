package TestSwing;

import javax.swing.*;
import java.awt.*;

class Panel_Test extends JFrame {
	public Panel_Test() {
		Container ct = getContentPane();
		ct.setLayout(new BorderLayout(5,5));
		//버튼 5개는 jp1 패널에, 라디오버튼 5개는 jp2 패널에 추가.
		
		JPanel jp1 = new JPanel();
		
		//패널에 배치정보 설정 
		jp1.setLayout(new GridLayout(3,1));
		jp1.add(new JButton("1번 버튼"));
		jp1.add(new JButton("2번 버튼"));
		jp1.add(new JButton("3번 버튼"));
		
		ct.add(jp1, BorderLayout.WEST);

		JPanel jp2 = new JPanel();
		jp2.setLayout(new GridLayout(3,1));
		jp2.add(new JRadioButton("1번 버튼"));
		jp2.add(new JRadioButton("2번 버튼"));
		jp2.add(new JRadioButton("3번 버튼"));
		
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
