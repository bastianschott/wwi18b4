package Minesweeper;

import javax.swing.JFrame;

public class FrameGUI extends JFrame {
	private static final long serialVersionUID = 1L;
	static CellGrid cg;

	public FrameGUI() {
		cg = new CellGrid(Settings.row, Settings.col);
		add(cg);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(Settings.row * 40, Settings.col * 40 + 20);
	}
	
	void showLostScreen() {
		
	}
}
