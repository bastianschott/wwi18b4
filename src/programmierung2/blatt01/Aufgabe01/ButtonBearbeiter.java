package programmierung2.blatt01.Aufgabe01;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ButtonBearbeiter implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		BlackAndWhite.c.setBackground(Color.WHITE);
		
	}
}
