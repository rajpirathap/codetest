package rajpirathap.code;

class Animal {
	public void walk() {
		System.out.println("I am walking");
	}

}

class Bird extends Animal {
	boolean fly() {
		System.out.println("I am flying");
		return true;
	}

	boolean sing() {
		System.out.println("I am singing");
		return true;
	}

	String say(String sound) {
		System.out.println(sound);
		return sound;
	}
}

class Duck extends Bird {
	boolean swim() {
		System.out.println("I can swim");
		return true;
	}
}

class Chicken extends Bird {
	boolean fly() {
		System.out.println("I cannot fly");
		return false;
	}
}


public class Solution {
	
}
