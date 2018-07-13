package TestSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;	//���� ����� ��Ű�� 

class AA2 extends JFrame implements ActionListener {

	JTextField jtf;
	JTextArea jta;
	JLabel jtl = new JLabel("�������");
	String filename;

	//Constructor method
	public AA2()
	{
		jtf = new JTextField(20);
		jta = new JTextArea(10,20);
		jta.setEditable(false);
		JButton jb = new JButton("����");

		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());

		JPanel jp = new JPanel(); //TextField, TextArea, Label ��θ� �ø� ,Panel ���� 
		jp.add(jtf);
		jp.add(jta);

		ct.add(jp);
		ct.add(jtl);
		ct.add(jb);		//��ư 1�� �߰�.

		jtf.addActionListener(this); 	//TextField������Ʈ�� �̺�Ʈ ó�� ���  
		jb.addActionListener(this);

		setSize(500,300);
		setVisible(true);
	}

	//�̺�Ʈ ��鷯 
	public void actionPerformed(ActionEvent ae)
	{


		// ���� �Էµ� �� ��     <= �Է°����� ��ü �� �� ,�� �� �Է°����ϸ�   
		if(jta.getLineCount() <= jta.getRows())
		{
			// �Ű������� ����, ���޵Ǿ�� ������ �״�� �������ٿ� �ٿ��ְ� Ŀ���� ���� �ٷ� ���� 
			if(ae.getActionCommand() == "����")
			{
				filename = jtf.getText();
			}
			else 
			{
				jta.append(ae.getActionCommand() + "\n");
				jtf.setText("");	//���ο� �Է��� �ޱ�����, ������ �Է³����� ���� 
			}
		}
		else 
		{
			jtl.setText("�� ������ ���׿�. �� �̻� �Է¾ȵ˴ϴ�");
			jtf.setEditable(false);	//�Է� �Ұ����� ���·� ���� 
		}

		if(ae.getActionCommand() == "����")
		{
			try
			{

				//Button�� ������ ��, TextArea�� ������ .txt���Ϸ� ����

				//filename = jtf.getText();
				//���Ϸ� ������
				//1. FileOutputStream ��ü(������ ���ϸ�) 
				//2. --> DataOutputStream��ü (FileOutputStream��ü)
				//3. --> write�޼ҵ带 ����ؼ� ����
				//4. ���� ������ �Ϸ�Ǹ� , �������� ����ϱ� ���� �������� ��ü�� release(����) : close�޼���
				FileOutputStream fos = new FileOutputStream(filename);
				DataOutputStream dos = new DataOutputStream(fos);
				dos.writeUTF(jta.getText());	//�����ڴ� "������ ����"
				fos.close();


			}

			catch(Exception e) {}
			System.out.println(filename + "������ �����Ǿ����ϴ�.");
		}
	}
}
public class Test_GUI_Text {

	public static void main(String[] args) {
		new AA2();

	}

}
