package org.comstudy21.day27;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Practice extends Frame {

	public Practice() {
		this("title", 100, 200);
	}

	public Practice(String title, int width, int height) {
		setTitle("");
		setSize(width, height);
		addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
				super.windowClosing(e);
			}

		});

		setVisible(true);
	}

	public static void main(String[] args) {
		new Practice("java", 400,200);
	}
}
