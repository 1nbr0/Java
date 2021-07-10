package fr.ca.java.mycirlceandmypoint;



public class MyCircle {

	private MyPoint center = new MyPoint(0, 0);
	private int radius = 1;
	
	
	public MyCircle() {
		
	}
	
	public MyCircle(int x, int y, int radius) {
		this.center = new MyPoint(x, y);
		this.radius = radius;
	}
	
	public MyCircle(MyPoint center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI*(radius*radius);
	}
	
	public double getCircumference() {
		return (radius*2)*Math.PI;
	}
	
	public double distance(MyCircle c ) {
		return this.center.distance(c.getCenterX(), c.getCenterY());
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public MyPoint getCenter() {
		return center;
	}

	public void setCenter(MyPoint center) {
		this.center = center;
	}
	
	public int getCenterX() {
		return center.getX();
	}
	
	public void setCenterX(int x) {
		this.center.setX(x);
	}
	
	public int getCenterY() {
		return center.getY();
	}
	
	public void setCenterY(int y) {
		this.center.setY(y);;
	}
	
	public int[] getCenterXY() {
		return this.center.getXY();
	}
	
	public void setCenterXY(int x, int y) {
		this.center.setX(x);
		this.center.setY(y);
	}

	@Override
	public String toString() {
		return "MyCircle [ center = " + center + ", radius = " + radius + ", Area = " + getArea()
				+ ", Circumference = " + getCircumference() + " ]";
	}

	
}
