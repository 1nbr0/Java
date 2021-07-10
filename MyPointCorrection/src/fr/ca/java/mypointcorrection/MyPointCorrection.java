package fr.ca.java.mypointcorrection;

public class MyPointCorrection {
	
	private int x;
	private int y;
	
	public MyPointCorrection() {
		
	}

	public MyPointCorrection(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double distance() {
		return this.distance(0, 0);
	}
	
	public double distance(MyPointCorrection pc) {
		return this.distance(pc.getX(), pc.getY());
	}
	
	public double distance(int x, int y) {
		int diffX = x - this.x;
		int diffY = y - this.y;		
		return Math.sqrt(diffX*diffX + diffY*diffY);
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
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	

	public String toString() {
		return "This is my point correction (x = " + this.x + ", y = " + this.y + ")";
	}
	
	
}
