package TestSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Event2 extends JFrame {
	JLabel j1;
	JButton jb1, jb2;
	
	public Event2() {
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		jb1 = new JButton("����մϴ�");
		jb2 = new JButton("�ູ�մϴ�");
		
		j1 = new JLabel("��ư�� ��������");
		
		jb1.addActionListener(new EventProcess());
		jb2.addActionListener(new EventProcess());
		
		ct.add(jb1);
		ct.add(jb2);
		ct.add(j1);
		
		setTitle("Evnet Test2");
		setSize(250,150);
		setVisible(true);
		
	}
	
	private class EventProcess implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			j1.setText(e.getActionCommand());
		}
	}
}

public class Event_Test {

	public static void main(String[] args) {
		new Event2();

	}

}
