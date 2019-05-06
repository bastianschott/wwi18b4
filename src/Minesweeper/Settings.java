package Minesweeper;

import javax.swing.*;

public class Settings extends JFrame {
	final static int row = setSize(), col = setSize(), numberBombs = setNumberBombs();

	private static int setSize() {
		// TODO: Settings menu to set size & number of bombs
		return 10;
	}

	private static int setNumberBombs() {
		// TODO: Exception if bombs > cells (maybe even cells/2?)
		return 15;
	}
}
