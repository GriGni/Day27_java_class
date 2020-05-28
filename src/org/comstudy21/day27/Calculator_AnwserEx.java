package org.comstudy21.day27;

import java.awt.*;

//1
public class Calculator_AnwserEx extends MyFrame {
	// 5 패널 왼쪽 중간 오른쪽 생성
	Panel p1 = new Panel(new GridLayout(6, 1, 5, 5));// 왼쪽
	Panel p2 = new Panel(new GridLayout(6, 2, 5, 5));// 중간
	Panel p3 = new Panel(new GridLayout(3, 1, 5, 5));// 오른쪽
	Panel keyboard = new Panel(new FlowLayout());

	// 7
	Button[] btns1 = new Button[11]; // p1에 들어갈 패널
	Button[] btns2 = new Button[12];// p2에 들어갈 패널
	Button[] btns3 = new Button[5];// p3에 들어갈 패널
	String[] txt1 = { "MC", "MR", "<-", "CE", "7", "8", "4", "5", "1", "2", "0" };
	String[] txt2 = { "MS", "M+", "C", "±", "9", "/", "6", "*", "3", "-", ".", "+", };
	String[] txt3 = { "M-", "√", "%", "1/X", "=" };
	// 8 초기화 블럭 패널에 버튼 넣기.
	{
		for (int i = 0; i < btns1.length; i++) { // i
			btns1[i] = new Button(txt1[i]);
			btns2[i] = new Button(txt2[i]);
		}
		btns2[btns2.length - 1] = new Button(txt2[btns2.length - 1]);
		for (int i = 0; i < btns3.length; i++) {
			btns3[i] = new Button(txt3[i]);
		}

	}

	// 2
	public Calculator_AnwserEx() {
		super("calculator", 200,235);
		// 9
		int cnt = 0;
		Panel row = null;
		for (int i = 0; i < 5; i++) {
			row = new Panel(new GridLayout(1, 2, 5, 5));
			row.add(btns1[cnt++]);
			row.add(btns1[cnt++]);
			p1.add(row);
		}
//		row = new Panel(new GridLayout(1, 2, 5, 5));
//		row.add(btns1[cnt]);
//		row.add(btns1[cnt++]);
//		p1.add(row);
		p1.add(btns1[cnt]);
		for (int i = 0; i < btns2.length; i++) {
			p2.add(btns2[i]);
		}
		cnt = 0;
		for (int i = 0; i < 2; i++) {
			row = new Panel(new GridLayout(2, 1, 5, 5));
			row.add(btns3[cnt++]);
			row.add(btns3[cnt++]);
			p3.add(row);
		}
//		row = new Panel(new GridLayout(1, 2));
//		row.add(btns3[cnt]);
//		row.add(btns3[cnt++]);
//		p3.add(row);
		p3.add(btns3[cnt++]);
		// 6 플로우 레이아웃에 페널 123을 넣어준다.
		keyboard.add(p1);
		keyboard.add(p2);
		keyboard.add(p3);
		add(keyboard);// 디폴트는 중앙
		//마지막
		TextField txtField = new TextField("0", 20);
		Panel txtPanel = new Panel(new GridLayout());
		txtPanel.add(txtField);
//		txtPanel.setSize(200,30);
//		txtField.setBounds(10, 10, 200, 80);
		add(BorderLayout.NORTH, txtPanel);

		// 4
		setVisible(true);
	}

	public static void main(String[] args) {
		// 3
		new Calculator_AnwserEx();

	}
}
// 병욱씨꺼 참고.
// 패널을 3개로 나눈다. 레프트 미들 라이트
// 상위패널을 담을 수 있는 전체 패널을 만든다. --> 플로우 레이아웃으로 만든다.
// help - install
//http://dl.google.com/eclipse/inst/d2wbpro/latest/4.3
// 해당 클래스 오른쪽 클릭 open with -> windowBuilder editor
