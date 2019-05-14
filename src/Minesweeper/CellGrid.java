package Minesweeper;

import java.awt.Container;
import java.awt.GridLayout;

public class CellGrid extends Container {
	private static final long serialVersionUID = 1L;
	private static Cell[][] cells;

	public CellGrid(int rows, int cols) {
		cells = new Cell[rows][cols];
		generateCells();
		setLayout(new GridLayout(rows, cols));

	}

	private void generateCells() {

		// Generate each cell & add ActionListener & add to this
		for (int row = 0; row < cells.length; row++) {
			for (int col = 0; col < cells[row].length; col++) {
				final int row_ = row;
				final int col_ = col;
				cells[row][col] = new Cell(row, col);
				cells[row][col].addActionListener(e -> cells[row_][col_].pressed());
				add(cells[row][col]);
			}
		}
		// Generate mines for these cells
		int mineCount = 0;
		while (mineCount < Settings.numberBombs) {
			int randomInteger = (int) (Math.random() * cells.length);
			int randomInteger2 = (int) (Math.random() * cells[0].length);
			if (cells[randomInteger][randomInteger2].isBomb)
				continue;
			else {
				cells[randomInteger][randomInteger2].setBomb(true);
				mineCount++;
			}
		}

		for (int row = 0; row < cells.length; row++) {
			for (int col = 0; col < cells[row].length; col++) {
				if (!cells[row][col].isBomb)
					countNeighborBombs(row, col);
			}
		}

	}

	public static void checkNeighbors(int row, int col) {
		if (cells[row][col].numberNeighborBombs == 0) {

			for (int row_ = row - 1; row_ <= row + 1; row_++) {
				for (int col_ = col - 1; col_ <= col + 1; col_++) {
					if (row_ >= 0 && row_ < Settings.row && col_ >= 0 && col_ < Settings.col) {
						if (cells[row_][col_].number == 0 && !cells[row_][col_].isRevealed) {
							cells[row_][col_].reveal();
							checkNeighbors(row_, col_);
						}
					}
				}
			}
		}
	}

	private static void countNeighborBombs(int row, int col) {
		for (int row_ = row - 1; row_ <= row + 1; row_++) {
			for (int col_ = col - 1; col_ <= col + 1; col_++) {
				if (row_ >= 0 && row_ < Settings.row && col_ >= 0 && col_ < Settings.col) {
					if (cells[row_][col_].isBomb) {
						cells[row][col].numberNeighborBombs++;

						// TODO: DEBUG
						// cells[row][col].setText(cells[row][col].numberNeighborBombs + "");
					}
				}
			}
		}

	}

}
