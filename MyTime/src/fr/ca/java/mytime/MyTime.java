package fr.ca.java.mytime;


public class MyTime {
	
	private int hour;
	private int minute;
	private int second;
	
	public MyTime() {
		this.hour = 00;
		this.minute = 00;
		this.second = 00;
	}
	
	public MyTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public MyTime nextSecond() {
		this.second = this.second + 1;
		if (this.second >= 60) {
			this.nextMinute();
			this.second = 0;
		} 
			return this;
	}
	
	public MyTime nextMinute() {
		this.minute = this.minute + 1;
		if (this.minute >= 60) {
			this.nextHour();
			this.minute = 0;
		} 
		return this;
	}
	
	public MyTime nextHour() {
		this.hour = this.hour + 1;
		if (this.hour >= 24) {
			this.hour = 0;
		} 
		return this;
	}
	
	public MyTime previousSecond() {
		this.second = this.second - 1;
		if (this.second < 0) {
			this.previousMinute();
			this.second = 59;
		} 
		return this;
	}
	
	public MyTime previousMinute() {
		this.minute = this.minute - 1;
		if (this.minute < 0) {
			this.previousHour();
			this.minute = 59;
		} 
		return this;
	}
	
	public MyTime previousHour() {
		this.hour = this.hour - 1;
		if (this.hour < 0) {
			this.hour = 23;
		} 
		return this;
	}
	
	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	@Override
	public String toString() {
        String hourFormatted = String.format("%02d", hour);
        String minuteFormatted = String.format("%02d", minute);
        String secondFormatted = String.format("%02d", second);
		return "MyTime " + hourFormatted + ":" + minuteFormatted + ":" + secondFormatted;
	}
	
	
	
	
	
}
