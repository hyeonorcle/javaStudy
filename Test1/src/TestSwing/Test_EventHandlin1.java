package TestSwing;

import javax.swing.*;
import java.awt.*;

//이벤트 처리를 위한 패키지 추가 
import java.awt.event.*;

class BB implements ActionListener {
	
	JLabel jl2;
	
	//이벤트가 처리하는 과정에 필요한 컴포넌트 정보를 받아오기 위해, 생성자 메서드 추가  
	public BB(JLabel jl1)
	{
		jl2 = jl1; 
	}
	
	//이벤트 처리 루틴
	public void actionPerformed(ActionEvent e) 
	{
		jl2.setText("버튼 잘 눌렀군요?");
	}

}


class AA extends JFrame implements ActionListener
{
	JLabel j1;
	
	public AA() {
		
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		JButton jb = new JButton("버튼");
		j1 = new JLabel("버튼 눌러라");
		
		//ActionEvent 에 대한 이벤트 리스너를 연결.
		//jb 객체에서 ActionEvent가 발생하면, 그 처리는 this(내)가 전담한다.
		jb.addActionListener(new BB(j1)); 
		
		ct.add(jb);
		ct.add(j1);
		
		setSize(300,300);
		setVisible(true);
	}
	
	//이벤트 처리를 위한 별도의 inner class
//	private class BB implements ActionListener {
//		
//		//이벤트 처리 루틴(Evnet Handler)
//		public void actionPerformed(ActionEvent e)
//		{
//			j1.setText("버튼을 잘 눌렀군요?");
//		}
//	}
	
	//이벤트 처리 루틴(Event Handler)
	public void actionPerformed(ActionEvent e) 
	{
		j1.setText("버튼 잘 눌렀군요?");
	}
}

public class Test_EventHandlin1 {

	public static void main(String[] args) {
		new AA();

	}

}
