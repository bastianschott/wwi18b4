package Minesweeper;

import java.awt.*;

import javax.swing.JButton;

public class Cell extends JButton {
	int row, col;
	int number;
	boolean isBomb, isFlagged, isRevealed;
	int numberNeighborBombs;

	Cell(int row, int col) {
		//TODO: DEBUG
		//setText(number+"");
		
		
		setBackground(Color.WHITE);
		this.row = row;
		this.col = col;
		setSize(200, 30);
		isBomb = isFlagged = isRevealed = false;
		number = 0;
		setMargin(new Insets(2, 2, 2, 2));

		if (isBomb) {
			setText("B");
		} else if (getNumberNeighborBombs() == 0) {
			setText("");
		} else
			setText(getNumberNeighborBombs() + "");
	}

	public void setBomb(boolean isBomb) {
		this.isBomb = isBomb;
		//TODO: DEBUG
		//setText("B");
	}

	void pressed() {
		System.out.println("row:\t" + row + "col:\t" + col);
		reveal();

		if (isBomb) {
			setText("B");
			setForeground(Color.RED);
			MainGame.frame.showLostScreen();

		} else if (getNumberNeighborBombs() == 0) {
			setText("");
			CellGrid.checkNeighbors(row, col);
		} else
			setText(getNumberNeighborBombs() + "");
		// TODO: check if bomb
		// TODO: print number
		// TODO: overlay a JLabel
	}

	void reveal() {
		
		isRevealed = true;
		if (!isBomb)
			setBackground(Color.GRAY);

	}

	private int getNumberNeighborBombs() {
		// TODO: Count neighbor Bombs
		return numberNeighborBombs;
	}
}
