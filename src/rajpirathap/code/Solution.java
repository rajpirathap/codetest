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

enum Size {
	DEFAULT, LARGE, SMALL;
}

enum Color {
	DEFAULT, GREY, ORANGE;
}

class Fish extends Animal {

	Size s = Size.DEFAULT;
	Color c = Color.DEFAULT;

	boolean sing() {
		System.out.println("I cannot sing");
		return false;
	}

	public void walk() {
		System.out.println("I cannot walk");
	}

	boolean swim() {
		System.out.println("I can swim");
		return true;
	}

	void setFishSize(Size size) {
		this.s = size;
	}

	void setFishColor(Color color) {
		this.c = color;
	}
}

class Shark extends Fish {
	boolean eat() {
		System.out.println("I eat other fish");
		return true;
	}
}

class Clownfish extends Fish {
	boolean make() {
		System.out.println("I can make jokes");
		return true;
	}
}


class Dolhpin extends Animal {
	Fish fish = new Fish();

	boolean swim() {
		return fish.swim();
	}

}

interface Insect {
	boolean fly();

	void walk();

	boolean sound();
}

class Butterfly extends Animal implements Insect {

	@Override
	public boolean fly() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean sound() {
		// TODO Auto-generated method stub
		return false;
	}

}


class Caterpillar implements Insect {

	@Override
	public boolean fly() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean sound() {
		// TODO Auto-generated method stub
		return true;
	}

}

class Dog extends Animal {

}

class Cat extends Animal {

}

enum Language {
	DANISH, DUTCH, FRENCH, GERMAN;
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

	public static String makeRoosterSound(Language language) {
		String sound = "";
		switch (language) {
		case FRENCH:
			sound = "cocorico";
			break;
		case DUTCH:
			sound = "kukeleku";
			break;
		case DANISH:
			sound = "kykyliky";
			break;
		case GERMAN:
			sound = "kikeriki";
			break;
		default:
			break;
		}

		return sound;
	}
}
