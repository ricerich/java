package ex10;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyMouseListener implements MouseListener{

	MouseListenerEX ml1;
//	JFrame f1;

	public MyMouseListener(MouseListenerEX ml1) {
		this.ml1 = ml1;
	}
	
//	public MyMouseListener(JFrame f1) {
//		this.f1 = f1;
//	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();

		ml1.getJLabel().setLocation(x, y);
//		f1.getJLabel().setLocation(x, y);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


}