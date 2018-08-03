package javabook_4;
import javax.swing.*;
import java.awt.*;

class LineTestPanel extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawLine(10, 10, 100, 10);
		g.drawLine(100, 10, 100, 100);
		g.drawLine(100, 100, 10, 100);
		g.drawLine(10, 100, 10, 10);
		g.drawLine(10, 10, 100, 100);
		g.drawLine(10, 100, 100, 10);
	}
}
class LineTestFrame extends JFrame {
	LineTestFrame() {
		setTitle("DrawLine Test");
		Container ct = getContentPane();
		LineTestPanel ltp = new LineTestPanel();
		ct.add(ltp);
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class LineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LineTestFrame();

	}

}
