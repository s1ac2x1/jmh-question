package com.kishlaly.jmh.question;

import javax.swing.JFrame;

/**
 * @author Vladimir Kishlaly
 *         Date: 28.01.2015
 */
public class MyFrame extends JFrame {

	public MyFrame() {
		super("Hi");
		setBounds(100, 100, 200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		frame.setVisible(true);
	}

}
