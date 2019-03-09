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

class Rooster extends Chicken {

}

interface IParrot {

}

class Parrot extends Bird implements IParrot {

}

class ParrotWithDog extends Parrot {

}

class ParrotWithCat extends Parrot {

}

class ParrotWithRooster extends Parrot {

}

class ParrotFactory {
	public IParrot getParrot(String sound) {
		if (sound.equalsIgnoreCase("Woof, woof")) {
			return new ParrotWithDog();

		} else if (sound.equalsIgnoreCase("Meow")) {
			return new ParrotWithCat();

		} else if (sound.equalsIgnoreCase("Cock-a-doodle-doo")) {
			return new ParrotWithRooster();
		}

		return null;
	}
}
//
//class Rooster {
//	Chicken chicken = new Chicken();
//
//	String say(String sound) {
//		return chicken.say(sound);
//	}
//}

public class Solution {

}
