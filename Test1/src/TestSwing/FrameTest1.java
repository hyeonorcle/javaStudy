package TestSwing;

import javax.swing.*;
import java.awt.*;

//GUI ó���� Ŭ����.
class FirstFrame1 extends JFrame {
	public FirstFrame1() {
		//1. ������(��ü) ����
//		JFrame jf = new JFrame("1st GUI ���α׷�");

		//2. ������ ���빰�� �ö� ��(ContentPane)�� ã��.
//		Container ct = jf.getContentPane();
		Container ct = getContentPane();

		//3. ������ ���빰(Component)�� �غ�.
		JButton jb = new JButton("�׽�Ʈ ��ư");

		//4. 2������ ã�Ƴ��� contentpane ���� component�� �ø�(�߰�).
		ct.add(jb);

		//5. ������ ������ ����
//		jf.setSize(400, 300);
		setTitle("1st GUI");
		setSize(400, 300);
		
		//6. ������ ���̰� ����.
//		jf.setVisible(true);
		setVisible(true);
		
	}
}

public class FrameTest1 {

	public static void main(String[] args) {
		new FirstFrame1();

	}

}
