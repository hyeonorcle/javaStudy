package TestSwing;

import javax.swing.*;
import java.awt.*;

//GUI 처리용 클래스.
class FirstFrame1 extends JFrame {
	public FirstFrame1() {
		//1. 프레임(객체) 생성
//		JFrame jf = new JFrame("1st GUI 프로그램");

		//2. 보여질 내용물을 올라갈 판(ContentPane)을 찾음.
//		Container ct = jf.getContentPane();
		Container ct = getContentPane();

		//3. 보여줄 내용물(Component)을 준비.
		JButton jb = new JButton("테스트 버튼");

		//4. 2번에서 찾아놓은 contentpane 위에 component을 올림(추가).
		ct.add(jb);

		//5. 프레임 사이즈 지정
//		jf.setSize(400, 300);
		setTitle("1st GUI");
		setSize(400, 300);
		
		//6. 프레임 보이게 설정.
//		jf.setVisible(true);
		setVisible(true);
		
	}
}

public class FrameTest1 {

	public static void main(String[] args) {
		new FirstFrame1();

	}

}
