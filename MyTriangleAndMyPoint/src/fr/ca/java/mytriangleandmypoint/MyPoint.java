package fr.ca.java.mytriangleandmypoint;


public class MyPoint {
	
	private int x = 0;
	private int y = 0;
	
	public MyPoint() {
		
	}
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double distance() {
		int xDiff = 0 - this.x;
		int yDiff = 0 - this.y;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	
	public double distance(int x, int y) {
		int xDiff = x - this.x;
		int yDiff = y - this.y;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	
	public double distance(MyPoint p ) {
		int xDiff = p.x - this.x;
		int yDiff = p.y - this.y;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int[] getXY() {
		int[] xy = {this.x, this.y};
		return xy;
		
	}
	
	public void setXY(int[] xy) {
		this.x = xy[0];
		this.y = xy[1];
	}
	
	
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
	
}
