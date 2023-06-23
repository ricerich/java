package ex10.p6;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public 	class MyKeyListener extends KeyAdapter 
{
	KeyListenerEx keyListenerEx;
	
	public MyKeyListener(KeyListenerEx keyListenerEx) 
	{
		this.keyListenerEx = keyListenerEx;
	}

	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		char keyChar = e.getKeyChar();
		
		keyListenerEx.getKeyMessage()[0].setText(Integer.toString(keyCode));
		keyListenerEx.getKeyMessage()[1].setText(Character.toString(keyChar));
		keyListenerEx.getKeyMessage()[2].setText(e.getKeyText(keyCode));
	}	
}






