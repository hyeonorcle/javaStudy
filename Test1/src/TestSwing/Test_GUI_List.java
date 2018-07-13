package TestSwing;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

class AAA extends JFrame implements ListSelectionListener
{
	String[] fruitlist = {"persimmom", "banana", "apple", "grape", "cherry", "pear"};
	private JList jlst = new JList(fruitlist);

	private ImageIcon[] fruiticons = {

			new ImageIcon("persimmom.jpg"),
			new ImageIcon("banana.jpg"),
			new ImageIcon("apple.jpg"),
			new ImageIcon("grape.jpg"),
			new ImageIcon("cherry.jpg"),
			new ImageIcon("pear.jpg"),
	};
	JLabel[] jlicon = new JLabel[6];
	JLabel jlname = new JLabel();

	public AAA() //Constructor �޼��� 
	{
		Container ct = getContentPane();
		JPanel jp1 = new JPanel();
		jp1.setLayout(new GridLayout(3,2,5,5));
		for(int i=0; i<6; i++) {
			jp1.add(jlicon[i] = new JLabel());
		}

		//�� ���� �г� ����.
		JPanel jp2 = new JPanel();
		jp2.add(jlname);
		ct.add(jlst,  BorderLayout.WEST);
		ct.add(jp1,  BorderLayout.CENTER);
		ct.add(jp2,  BorderLayout.EAST);

		//�̺�Ʈ ������ ���
		jlst.addListSelectionListener(this);

		setSize(700,300);
		setVisible(true);
	}//������ �޼��� ��.

	//�̺�Ʈ �ڵ鷯(����Ʈ ���� �̺�Ʈ)
	public void valueChanged(ListSelectionEvent lse)
	{
		for(int i=1; i<6; i++)	//������ �ʱ�ȭ
			jlicon[i].setIcon(null);
		
		int[] indices = jlst.getSelectedIndices();
		
		String s = "����� ������ �׸��� : ";
		
		for(int j=0; j<indices.length;j++)
		{
			jlicon[j].setIcon(fruiticons[indices[j]]);
			s = s + fruitlist[indices[j]]+ " ";
		}
		
		jlname.setText(s);
		
		
	}
}

public class Test_GUI_List {

	public static void main(String[] args) {
		new AAA();

	}

}

