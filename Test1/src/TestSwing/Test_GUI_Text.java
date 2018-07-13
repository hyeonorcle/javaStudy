package TestSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;	//파일 입출력 패키지 

class AA2 extends JFrame implements ActionListener {

	JTextField jtf;
	JTextArea jta;
	JLabel jtl = new JLabel("배고프다");
	String filename;

	//Constructor method
	public AA2()
	{
		jtf = new JTextField(20);
		jta = new JTextArea(10,20);
		jta.setEditable(false);
		JButton jb = new JButton("저장");

		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());

		JPanel jp = new JPanel(); //TextField, TextArea, Label 모두를 올릴 ,Panel 생성 
		jp.add(jtf);
		jp.add(jta);

		ct.add(jp);
		ct.add(jtl);
		ct.add(jb);		//버튼 1개 추가.

		jtf.addActionListener(this); 	//TextField컴포넌트에 이벤트 처리 등록  
		jb.addActionListener(this);

		setSize(500,300);
		setVisible(true);
	}

	//이벤트 헨들러 
	public void actionPerformed(ActionEvent ae)
	{


		// 현재 입력된 줄 수     <= 입력가능한 전체 줄 수 ,즉 더 입력가능하면   
		if(jta.getLineCount() <= jta.getRows())
		{
			// 매개변수를 통해, 전달되어온 내용을 그대로 마지막줄에 붙여주고 커서는 다음 줄로 변경 
			if(ae.getActionCommand() == "저장")
			{
				filename = jtf.getText();
			}
			else 
			{
				jta.append(ae.getActionCommand() + "\n");
				jtf.setText("");	//새로운 입력을 받기위해, 기존의 입력내용을 지움 
			}
		}
		else 
		{
			jtl.setText("빈 공간이 없네요. 더 이상 입력안됩니다");
			jtf.setEditable(false);	//입력 불가능한 상태로 변경 
		}

		if(ae.getActionCommand() == "저장")
		{
			try
			{

				//Button을 눌렀을 때, TextArea의 내용을 .txt파일로 저장

				//filename = jtf.getText();
				//파일로 저장방법
				//1. FileOutputStream 객체(저장할 파일명) 
				//2. --> DataOutputStream객체 (FileOutputStream객체)
				//3. --> write메소드를 사용해서 저장
				//4. 파일 저장이 완료되면 , 마지막에 사용하기 위해 만들어놓은 객체를 release(해제) : close메서드
				FileOutputStream fos = new FileOutputStream(filename);
				DataOutputStream dos = new DataOutputStream(fos);
				dos.writeUTF(jta.getText());	//실인자는 "저장할 내용"
				fos.close();


			}

			catch(Exception e) {}
			System.out.println(filename + "파일이 생성되었습니다.");
		}
	}
}
public class Test_GUI_Text {

	public static void main(String[] args) {
		new AA2();

	}

}
