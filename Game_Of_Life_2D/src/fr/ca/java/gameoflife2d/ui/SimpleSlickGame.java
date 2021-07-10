package fr.ca.java.gameoflife2d.ui;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

import fr.ca.java.gameoflife2d.model.Cell;
import fr.ca.java.gameoflife2d.model.World;

public class SimpleSlickGame extends BasicGame   {
	
	private World world = new World(50, 50);
//	int positionX = 0;
//	int positionY = 0;
	
	public SimpleSlickGame(String gamename) {
		super(gamename);
	}

	@Override
	public void init(GameContainer gc) throws SlickException {
	}

	@Override
	public void update(GameContainer gc, int i) throws SlickException {
		
		world.newGeneration();
//		Input input = gc.getInput();
//		
//		if (input.isKeyDown(Input.KEY_DOWN)) {
//			positionY += 10;
//		}
//		
//		if (input.isKeyDown(Input.KEY_UP)) {
//			positionY -= 10;
//		}
//		
//		if (input.isKeyDown(Input.KEY_LEFT)) {
//			positionX -= 10;
//		}
//		
//		if (input.isKeyDown(Input.KEY_RIGHT)) {
//			positionX += 10;
//		}
	}

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException {
		Cell[][] cells = world.getCells();
		
		for (int i = 0;i < cells.length; i++) {
			for (int j = 0;j < cells.length; j++) {
				
				int positionX = i * 20;
				int positionY = j * 20;
				
				if (cells[i][j].isAlive()) {
					g.fillRect(positionX, positionY, 18, 18);
				}
			}
		}
//		g.fillRect(positionX, positionY, 10, 50);
	}

}