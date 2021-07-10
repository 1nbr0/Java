package com.myschool.gameoflife;

public class Launcher {
	public static void main(String[] args) {
		System.out.println("Hello Game Of Life");

		World world = new World(20, 20);
		while (true) {
			System.out.println(world);
			world.newGeneration();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
