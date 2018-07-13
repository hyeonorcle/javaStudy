package TestSwing;

import javax.swing.*;
import java.awt.*;


class BL_TEST extends JFrame
{
	public BL_TEST() 
	{
		Container xx = getContentPane();
		BorderLayout yy = new BorderLayout(10,10); //(행간격, 열간격)
		xx.setLayout(yy);
		
		xx.add(new JButton("우측버튼"),BorderLayout.EAST);
		xx.add(new JButton("좌측버튼"),BorderLayout.WEST);
		xx.add(new JButton("위쪽버튼"),BorderLayout.NORTH);
		xx.add(new JButton("아래버튼"),BorderLayout.SOUTH);
		xx.add(new JButton("중앙버튼"),BorderLayout.CENTER);
		
		setTitle("BorderLayout TEST");
		setSize(1000,1000);
		setVisible(true);
	}
}
public class Test_BorderLayout {

	public static void main(String[] args) {
		new BL_TEST(); 

	}

}
