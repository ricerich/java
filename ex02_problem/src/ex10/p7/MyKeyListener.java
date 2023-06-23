package ex10.p7;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;

public class MyKeyListener extends KeyAdapter 
{
	Container c;
	JLabel la;
	
	public MyKeyListener(Container c, JLabel la) {
		this.c = c;
		this.la = la;
	}	

	public void keyPressed(KeyEvent e) {
//		la.setText(e.getKeyText(e.getKeyCode()));
		la.setText(e.getKeyText(e.getKeyCode()));

		if(e.getKeyChar() == '%') 
			c.setBackground(Color.YELLOW);
		else if(e.getKeyCode() == KeyEvent.VK_F1) 
			c.setBackground(Color.GREEN);
	}
}