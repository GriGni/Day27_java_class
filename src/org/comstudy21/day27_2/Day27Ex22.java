package org.comstudy21.day27_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//content 펜을 만들어서 넣어주기.
//3
class MainContent extends JPanel {
	JLabel label = new JLabel("Hello Swing world");
	JButton btn1 = new JButton("button1");
	JButton btn2 = new JButton("button2");
	JButton btn3 = new JButton("button3");
	JPanel p1 = new JPanel(new GridBagLayout());
	JPanel p2 = new JPanel(new GridBagLayout());

	public MainContent() {
		this.setLayout(new BorderLayout());
		// 5
//		add(new JLabel("hello world"));
		p1.add(label);
		p2.add(btn1);
		p2.add(btn2);
		p2.add(btn3);

		this.add(p1);
		this.add(BorderLayout.SOUTH, p2);

		BtnEvtHandler l = new BtnEvtHandler();
		btn1.addActionListener(l);
		btn2.addActionListener(l);
		btn3.addActionListener(l);
	}

	class BtnEvtHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() instanceof JButton) {
				JButton btn = (JButton) e.getSource();
				if (btn == btn1) {
					p1.setBackground(Color.pink);
					p2.setBackground(Color.pink);
				} else if (btn == btn2) {
					p1.setBackground(Color.LIGHT_GRAY);
					p2.setBackground(Color.LIGHT_GRAY);
				} else if (btn == btn3) {
					p1.setBackground(Color.orange);
					p2.setBackground(Color.orange);
				}
			}

		}

	}

}

public class Day27Ex22 extends JFrame {

	public Day27Ex22() {
		// 2
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		// 4
		setContentPane(new MainContent()); // Contenetpane 타입이 Jpanel 상속받아서 사용.
		// 1
		setSize(640, 480);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Day27Ex22();

	}

}
