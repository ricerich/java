package ex10;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class MouseAdapterEX extends JFrame 
{
	private JLabel la;
	
	public JLabel getJLabel()
	{
		return la;
	}
	
	public MouseAdapterEX()
	{
		setTitle("Mouse 이벤트 예제2222");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
//		MyMouseListener lis1 = new MyMouseListener();
//		c.addMouseListener(new MyMouseListener(this));
		c.addMouseListener(new MyMouseAdapter(this));
	
		c.setLayout(null);
		
		la = new JLabel("Hello");
		la.setSize(50, 20);
		la.setLocation(30, 30);
		
		//이벤트 처리???
		c.add(la);

		setSize(250, 250);
		setVisible(true);

	}
	
//	//방법2. 내부클래스
//	class MyMouseListener implements MouseListener{
//
//		@Override
//		public void mouseClicked(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public void mousePressed(MouseEvent e) {
//			int x = e.getX();
//			int y = e.getY();
//			
//			la.setLocation(x, y);
//		}
//
//		@Override
//		public void mouseReleased(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public void mouseEntered(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public void mouseExited(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//		
//	}
	

}







