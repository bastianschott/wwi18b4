package programmierung2.whd.blatt01;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;;

public class BlackAndWhite extends JFrame {
	public BlackAndWhite() {
		Container c = getContentPane();
		setLayout(new FlowLayout());
		JButton b = new JButton("Drueck mich!");
		c.add(b);
		b.addActionListener(e -> c.setBackground(Color.BLACK));

		c.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
				c.setBackground(Color.WHITE);
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});

	}

	public static void main(String[] args) {
		BlackAndWhite frame = new BlackAndWhite();
		frame.setSize(250, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
