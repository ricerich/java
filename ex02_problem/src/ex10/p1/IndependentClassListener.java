package ex10.p1;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class IndependentClassListener extends JFrame{
	
	public IndependentClassListener()
	{
		setTitle("리스너예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn1 = new JButton("Action");

		//버튼객체에 리스너를 장착한다
		MyActionListener lis1 = new MyActionListener();
		
		btn1.addActionListener(lis1);
		
		c.add(btn1);
		
		setSize(300,150);
		setVisible(true);
		
	}

}
