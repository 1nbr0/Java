package fr.ca.java.oop.demooop4computer;

public class Computer {
	
	private String modelName;
	private boolean started;
	
	public Computer() {
		this.modelName = "Unknown Model";
		this.started = false;
	}
	
	public Computer(String modelName, boolean started) {
		this.modelName = modelName;
		this.started = started;
	}
	
	void start() {
		System.out.println("start" + this.modelName);
		this.started = true;
	}
	
	public boolean isStarted() {
		return this.started;
	}

	public void setStarted(boolean started) {
		this.started = started;
	}

	public String getModelName() {
		return this.modelName;
	}
	
	public void setModeName(String modelName) {
		this.modelName = modelName;
	}
	
	@Override
	public String toString() {
		return "The model of this computer is " + this.modelName + " and is it started ? " + this.started;
	}
	
}
