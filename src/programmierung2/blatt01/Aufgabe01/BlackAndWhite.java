package programmierung2.blatt01.Aufgabe01;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.*;

public class BlackAndWhite extends JFrame {
	static Container c;
	JButton b;

	public BlackAndWhite() {
		c = getContentPane();
		c.setLayout(new FlowLayout());
		b = new JButton("Drueck mich!");
		c.add(b);
		
		ActionListener bb = new ButtonBearbeiter();
		MouseListener mb = new MausBearbeiter();
		b.addActionListener(bb);
		c.addMouseListener(mb);
	}
	
	public static void main(String[] args) {
		BlackAndWhite fenster = new BlackAndWhite();
		fenster.setTitle("Black and White");
		fenster.setSize(250,150);
		fenster.setVisible(true);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
