package com.myschool.gameoflife;

public interface Cell {
	Cell newGeneration(int nbNeighbours);

	String getAsString();

	boolean isAlive();

}
