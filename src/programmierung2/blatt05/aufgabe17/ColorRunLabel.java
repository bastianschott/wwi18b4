package programmierung2.blatt05.aufgabe17;

import java.awt.*;
import javax.swing.*;

public class ColorRunLabel extends JLabel implements Runnable {

	private boolean running = false;

	public ColorRunLabel(Color bg) {
//		setVisible(true);
//		setBackground(bg);
//		setFont(new Font("Arial", Font.BOLD, 50));
//		setHorizontalAlignment(JButton.CENTER);
//		setVerticalAlignment(JButton.CENTER);
//		setText("0");
		
		setVisible(true);
		setBackground(bg);
		setFont(new Font("Arial",0, 25));
		setHorizontalAlignment(JButton.CENTER);
		setVerticalAlignment(JButton.CENTER);
		setText("START");
	}

	public void start() {
		running = true;
		run();
	}

	public void stop() {
		running = false;
	}

	public void run() {
		while (running) {
			setText("" + (int) (Math.random() * 9));
			try{
				Thread.sleep(100);
			} catch(InterruptedException e) {
			}
		}
	}
}
