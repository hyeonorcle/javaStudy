package TestSwing;

import javax.swing.*;
import java.awt.*;

//�̺�Ʈ ó���� ���� ��Ű�� �߰� 
import java.awt.event.*;

class BB implements ActionListener {
	
	JLabel jl2;
	
	//�̺�Ʈ�� ó���ϴ� ������ �ʿ��� ������Ʈ ������ �޾ƿ��� ����, ������ �޼��� �߰�  
	public BB(JLabel jl1)
	{
		jl2 = jl1; 
	}
	
	//�̺�Ʈ ó�� ��ƾ
	public void actionPerformed(ActionEvent e) 
	{
		jl2.setText("��ư �� ��������?");
	}

}


class AA extends JFrame implements ActionListener
{
	JLabel j1;
	
	public AA() {
		
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		JButton jb = new JButton("��ư");
		j1 = new JLabel("��ư ������");
		
		//ActionEvent �� ���� �̺�Ʈ �����ʸ� ����.
		//jb ��ü���� ActionEvent�� �߻��ϸ�, �� ó���� this(��)�� �����Ѵ�.
		jb.addActionListener(new BB(j1)); 
		
		ct.add(jb);
		ct.add(j1);
		
		setSize(300,300);
		setVisible(true);
	}
	
	//�̺�Ʈ ó���� ���� ������ inner class
//	private class BB implements ActionListener {
//		
//		//�̺�Ʈ ó�� ��ƾ(Evnet Handler)
//		public void actionPerformed(ActionEvent e)
//		{
//			j1.setText("��ư�� �� ��������?");
//		}
//	}
	
	//�̺�Ʈ ó�� ��ƾ(Event Handler)
	public void actionPerformed(ActionEvent e) 
	{
		j1.setText("��ư �� ��������?");
	}
}

public class Test_EventHandlin1 {

	public static void main(String[] args) {
		new AA();

	}

}
