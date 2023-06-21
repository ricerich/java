package ex10;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AnonymousClassListener extends JFrame{
	
	public AnonymousClassListener()
	{
		setTitle("리스너예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn1 = new JButton("Action");

		//버튼객체에 리스너를 장착한다
//		MyActionListener lis1 = new MyActionListener();
		
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn1 = (JButton) e.getSource();
				if(btn1.getText().equals("Action"))
					btn1.setText("액션");
				else if(btn1.getText().equals("액션"))
					btn1.setText("Action");
			}
		} );
		
		c.add(btn1);
		
		setSize(300,150);
		setVisible(true);
		
	}
}
