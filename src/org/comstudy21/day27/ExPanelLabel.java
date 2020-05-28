package org.comstudy21.day27;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//2 
//outter 클래스 방법.
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

	// 3 (이벤트가 발썡했을 때 처리하는 곳
	public void actionPerformed(ActionEvent e) { // 무슨 버튼을 눌렀는지 알 수 있게 만들어준다.
//		System.out.println("The button is pressed");
		// 윗문장을 라벨에 뜨게 만들고 싶을 경우
		// 생성자와 this
		
		
		String actionCmd = e.getActionCommand();
		if (e.getSource() instanceof Button) {
			Button btn = (Button) e.getSource();
			String msg = "btn1";
			if (btn == target.btn2) {
				msg = "btn2";
			}
			msg += " : The button was pressed.";
			target.label.setText(msg); // setText역할이 메시지를 넣어주는 역할.

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

		// 이벤트 처리

		// 1
//		BtnEvtHandler l = new BtnEvtHandler(label, btn2);
		BtnEvtHandler l = new BtnEvtHandler(this); // this의 타입은 ExPanelLabel이다. 인자를 받기위해 타입을 똑같게 해야한다. 그러면 해결된다.
		btn1.addActionListener(l); // () 괄호안이 handler 객체
		btn2.addActionListener(l);

		setVisible(true);
	}

//	//2
//	//inner class (클래스 내부에 클래스를 생성하는 것
	// 클래스를 생성하면 오류가 생기고 거기에 unimplement 누르기
//	class BtnEvtHandler implements ActionListener{
//		//3 (이벤트가 발썡했을 때 처리하는 곳.
//		public void actionPerformed(ActionEvent e) { // 무슨 버튼을 눌렀는지 알 수 있게 만들어준다.
////			System.out.println("The button is pressed");
//			// 윗문장을 라벨에 뜨게 만들고 싶을 경우 
//			String actionCmd= e.getActionCommand();
//			if(e.getSource() instanceof Button) {
//				Button btn = (Button)e.getSource();
//				String msg = "btn1";
//				if(btn == btn2) {
//					msg="btn2";
//				}
//				msg += " : The button was pressed.";
//				label.setText(msg); // setText역할이 메시지를 넣어주는 역할.
//				
//			}
//		}
//		
//	}

	public static void main(String[] args) {
		new ExPanelLabel();
	}

}
