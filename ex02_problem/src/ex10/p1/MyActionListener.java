package ex10.p1;

import java.awt.event.*;

import javax.swing.JButton;

public class MyActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JButton btn1 = (JButton) e.getSource();
		if(btn1.getText().equals("Action"))
			btn1.setText("액션");
		else if(btn1.getText().equals("액션"))
			btn1.setText("Action");
	}

}
