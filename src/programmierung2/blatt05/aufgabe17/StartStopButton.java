package programmierung2.blatt05.aufgabe17;

import java.awt.*;
import javax.swing.*;

public class StartStopButton extends JButton {

	public StartStopButton(Color bg) {
		setVisible(true);
		setBackground(bg);
		setFont(new Font("Arial",0, 25));
		setHorizontalAlignment(JButton.CENTER);
		setVerticalAlignment(JButton.CENTER);
		setText("START");
	}

}
