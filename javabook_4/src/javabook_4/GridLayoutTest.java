package javabook_4;
import javax.swing.*;
import java.awt.*;

class GridLayout1 extends JFrame { 
	public GridLayout1() {
		Container ct = getContentPane();
		GridLayout g1 = new GridLayout(3,5,5,5);
		ct.setLayout(g1);
		for (int i = 1; i <= 15; i++)
			ct.add(new JButton("¹öÆ°"+ i));
		setTitle("GridLayout Test");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class GridLayoutTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayout1();

	}

}
