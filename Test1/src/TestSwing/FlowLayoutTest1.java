package TestSwing;

import javax.swing.*;
import java.awt.*;

class FlowLayout1 extends JFrame{
	
	public FlowLayout1()	//생성자 메서드 
	{
		Container ct = getContentPane();
		
		//Container에 component를 추가하기 전에,
		//배치(layout)에 관한 설정을 먼저 함.
		FlowLayout f1 = new FlowLayout(FlowLayout.RIGHT,10,20);
		ct.setLayout(f1);//사전 설정된 배치정보를 container에 저장 
		
		for(int i=1; i<=15; i++)
			ct.add(new JButton("버튼"+i));
		setTitle("FlowLayout Test1");
		setSize(500,300);
	
		setVisible(true);
		
	}
}

public class FlowLayoutTest1 {

	public static void main(String[] args) {
		new FlowLayout1();

	}

}
