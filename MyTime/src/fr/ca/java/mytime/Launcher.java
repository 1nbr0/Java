package fr.ca.java.mytime;

public class Launcher {
	public static void main(String[] args) {
//		System.out.println("Hello myTime");
//		
//		MyTime time1 = new MyTime();
//		System.out.println(time1);
//		
//		MyTime time2 = new MyTime(15,45,01);
//		System.out.println(time2);
		
        MyTime myTime = new MyTime(0, 0, 0);
        System.out.println(myTime);
        
        
        while(true) {
            myTime.nextSecond();
            System.out.println("\n\n\n\n\n\n\n\n\n\n");
            System.out.println(myTime);
            System.out.println("\n\n\n\n\n\n\n\n\n\n");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
		
		
	}
}
