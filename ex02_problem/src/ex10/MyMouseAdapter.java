package ex10;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseAdapter extends MouseAdapter {
	
	MouseAdapterEX ml1;
//	JFrame f1;

	public MyMouseAdapter(MouseAdapterEX ml1) {
		this.ml1 = ml1;
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();

		ml1.getJLabel().setLocation(x, y);
	}
}
