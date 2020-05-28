package org.comstudy21.day27;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {
	
	public MyFrame() {
		this("title", 300, 500);
	}
	
	public MyFrame(String title, int width, int height) {
		setTitle(title);
		setSize(width,height);
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize(); // dimention -
		int x = ((int)screen.getWidth()/2 - width/2); //전체넓이에서 반을 이동한다. 공식과 같다.
		int y = ((int)screen.getHeight()/2 - height/2);
		setLocation(x, y);
		
		setBackground(Color.LIGHT_GRAY);
		
		//예외처리
		addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
				super.windowClosing(e);
			}
			
		});
	}

	public static void main(String[] args) {                                                                                     
		
		MyFrame myF = new MyFrame("Calculator",200,250);
		myF.setVisible(true);
	
	}
}
