package fr.ca.java.demooop8inheritance;

public class Launcher {
	public static void main(String[] args) {
		
//		Catlike myCatlike = new Catlike();
//		myCatlike.name = "Yolo";
//		myCatlike.hunt();
//		
//		Cat myCat = new Cat();
//		myCat.name = "Fabrice";
//		myCat.hunt();
//		myCat.sleep();
//		
//		Tiger myTiger = new Tiger();
//		myTiger.name = "TigerWoods";
//		myTiger.killCounter = 100;
//		myTiger.hunt();
//		myTiger.swim();
//		myTiger.sleep();
		
		//polymorphism = can have different "declared type" and "true type"
		
//		Cat myCat2 = new Cat();
		//type of variable is also called "declared type"
		//type of the instance is also called "true type"
		
		
		Catlike[] myCatlikeArray = new Catlike[2];
		myCatlikeArray[0] = new Cat();
		myCatlikeArray[1] = new Tiger();
		
//		for (int i = 0; i < myCatlikeArray.length; i++) {
//			myCatlikeArray[i].hunt();
//			myCatlikeArray[i].sleep();
//		}
		
//		Catlike myCatlike2 = new Cat();
//		
//		Catlike myCatlike3 = new Tiger();
//		Tiger myTiger3 = (Tiger) myCatlike3;
//		myTiger3.swim();
		
		for (int i = 0; i < myCatlikeArray.length; i++) {
			if (myCatlikeArray[i] instanceof Cat) {
				System.out.println("This is a cat");
			} else if (myCatlikeArray[i] instanceof Tiger) {
				Tiger t = (Tiger) myCatlikeArray[i];
				t.swim();
			}

		}
		
		
		
	}
}
