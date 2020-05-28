package org.comstudy21.day27;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//2 
//outter Ŭ���� ���.
class BtnEvtHandler implements ActionListener {
//
//	Label label; 
//	Button btn2;
//	BtnEvtHandler(Label label, Button btn2){
//		this.label = label;
//		this.btn2 = btn2;
//		
//	}
	ExPanelLabel target;
	public BtnEvtHandler(ExPanelLabel target) {
		this.target = target;
	}

	// 3 (�̺�Ʈ�� �ߛ����� �� ó���ϴ� ��
	public void actionPerformed(ActionEvent e) { // ���� ��ư�� �������� �� �� �ְ� ������ش�.
//		System.out.println("The button is pressed");
		// �������� �󺧿� �߰� ����� ���� ���
		// �����ڿ� this
		
		
		String actionCmd = e.getActionCommand();
		if (e.getSource() instanceof Button) {
			Button btn = (Button) e.getSource();
			String msg = "btn1";
			if (btn == target.btn2) {
				msg = "btn2";
			}
			msg += " : The button was pressed.";
			target.label.setText(msg); // setText������ �޽����� �־��ִ� ����.

		}
	}

}

public class ExPanelLabel extends Practice {
	Label label = new Label("Result : No button was pressed.");
	Button btn1 = new Button("Button1");
	Button btn2 = new Button("Button2");
	Panel panel1 = new Panel(new GridBagLayout());
	Panel panel2 = new Panel(new GridBagLayout());
	
	public ExPanelLabel() {
		super("title", 400, 200);
		panel2.add(label);
		add(panel2);
		add(BorderLayout.SOUTH, panel1);

		panel1.add(btn1);
		panel1.add(btn2);

		// �̺�Ʈ ó��

		// 1
//		BtnEvtHandler l = new BtnEvtHandler(label, btn2);
		BtnEvtHandler l = new BtnEvtHandler(this); // this�� Ÿ���� ExPanelLabel�̴�. ���ڸ� �ޱ����� Ÿ���� �Ȱ��� �ؾ��Ѵ�. �׷��� �ذ�ȴ�.
		btn1.addActionListener(l); // () ��ȣ���� handler ��ü
		btn2.addActionListener(l);

		setVisible(true);
	}

//	//2
//	//inner class (Ŭ���� ���ο� Ŭ������ �����ϴ� ��
	// Ŭ������ �����ϸ� ������ ����� �ű⿡ unimplement ������
//	class BtnEvtHandler implements ActionListener{
//		//3 (�̺�Ʈ�� �ߛ����� �� ó���ϴ� ��.
//		public void actionPerformed(ActionEvent e) { // ���� ��ư�� �������� �� �� �ְ� ������ش�.
////			System.out.println("The button is pressed");
//			// �������� �󺧿� �߰� ����� ���� ��� 
//			String actionCmd= e.getActionCommand();
//			if(e.getSource() instanceof Button) {
//				Button btn = (Button)e.getSource();
//				String msg = "btn1";
//				if(btn == btn2) {
//					msg="btn2";
//				}
//				msg += " : The button was pressed.";
//				label.setText(msg); // setText������ �޽����� �־��ִ� ����.
//				
//			}
//		}
//		
//	}

	public static void main(String[] args) {
		new ExPanelLabel();
	}

}
