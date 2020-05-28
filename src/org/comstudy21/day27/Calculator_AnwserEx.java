package org.comstudy21.day27;

import java.awt.*;

//1
public class Calculator_AnwserEx extends MyFrame {
	// 5 �г� ���� �߰� ������ ����
	Panel p1 = new Panel(new GridLayout(6, 1, 5, 5));// ����
	Panel p2 = new Panel(new GridLayout(6, 2, 5, 5));// �߰�
	Panel p3 = new Panel(new GridLayout(3, 1, 5, 5));// ������
	Panel keyboard = new Panel(new FlowLayout());

	// 7
	Button[] btns1 = new Button[11]; // p1�� �� �г�
	Button[] btns2 = new Button[12];// p2�� �� �г�
	Button[] btns3 = new Button[5];// p3�� �� �г�
	String[] txt1 = { "MC", "MR", "<-", "CE", "7", "8", "4", "5", "1", "2", "0" };
	String[] txt2 = { "MS", "M+", "C", "��", "9", "/", "6", "*", "3", "-", ".", "+", };
	String[] txt3 = { "M-", "��", "%", "1/X", "=" };
	// 8 �ʱ�ȭ �� �гο� ��ư �ֱ�.
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
		// 6 �÷ο� ���̾ƿ��� ��� 123�� �־��ش�.
		keyboard.add(p1);
		keyboard.add(p2);
		keyboard.add(p3);
		add(keyboard);// ����Ʈ�� �߾�
		//������
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
// ������ ����.
// �г��� 3���� ������. ����Ʈ �̵� ����Ʈ
// �����г��� ���� �� �ִ� ��ü �г��� �����. --> �÷ο� ���̾ƿ����� �����.
// help - install
//http://dl.google.com/eclipse/inst/d2wbpro/latest/4.3
// �ش� Ŭ���� ������ Ŭ�� open with -> windowBuilder editor
