package org.comstudy21.day27_2;

import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Day27Ex01_swing extends JFrame {
	//3
	JPanel content = null;
	JLabel label = new JLabel("JFrame test");
	JPanel p1 = new JPanel(new GridBagLayout());
	public Day27Ex01_swing() {
		//2
		//defaultCloseOperation() 
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);	
		content =(JPanel)getContentPane(); // 다운캐스팅.
		
		p1.add(label);
		content.add(p1);
		
		//ContentPanel을 받아온다.
		//1
		setSize(640, 480);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
	}
}
