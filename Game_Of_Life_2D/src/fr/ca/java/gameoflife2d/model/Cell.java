package fr.ca.java.gameoflife2d.model;

public interface Cell {
	Cell newGeneration(int nbNeighbours);

	String getAsString();

	boolean isAlive();

}
