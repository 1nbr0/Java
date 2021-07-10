package com.myschool.gameoflife;

import java.util.Random;

public class World {

	private Cell[][] cells;

	public World(int nbColumns, int nbRows) {
		cells = new Cell[nbColumns][nbRows];

		Random random = new Random();

		// fill with alive cells
		for (int i = 0; i < cells.length; i++) {
			for (int j = 0; j < cells[i].length; j++) {

				if (random.nextBoolean()) {
					cells[i][j] = new AliveCell();

				} else {
					cells[i][j] = new DeadCell();
				}

			}
		}

	}

	public void newGeneration() {

		Cell[][] tempNewGenerationCells = new Cell[cells.length][cells[0].length];

		for (int i = 0; i < cells.length; i++) {
			for (int j = 0; j < cells[i].length; j++) {
				int nbNeighbours = 0;
				for (int x = -1; x <= 1; x++) {
					for (int y = -1; y <= 1; y++) {
						int indexColumnOfNeighbour = i + x;
						int indexRowOfNeighbour = j + y;
						if (x != 0 || y != 0) {
							if (indexColumnOfNeighbour >= 0 && indexRowOfNeighbour >= 0) {
								if (indexColumnOfNeighbour < cells.length && indexRowOfNeighbour < cells[i].length) {
									if (cells[indexColumnOfNeighbour][indexRowOfNeighbour].isAlive()) {
										nbNeighbours += 1;
									}
								}
							}
						}
					}
				}
				tempNewGenerationCells[i][j] = cells[i][j].newGeneration(nbNeighbours);
			}
		}
		cells = tempNewGenerationCells;
	}

	@Override
	public String toString() {
		String worldStr = "";

		// loop over cells
		for (int i = 0; i < cells.length; i++) {
			for (int j = 0; j < cells[i].length; j++) {
				worldStr += cells[i][j].getAsString();
			}
			worldStr += "\n";
		}

		return worldStr;
	}

}
