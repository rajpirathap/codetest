package rajpirathap.code;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class UnitTest {
	@Test
	public void testBird() {  // A.1
		Bird bird = new Bird();
		assertEquals(true, bird.fly());
		assertEquals(true, bird.sing());
	}
	
	@Test
	public void testDuckAndChicken() { //A.2
		Duck duck = new Duck();
		Bird chicken = new Chicken();
		
		assertEquals("Quack, quack", duck.say("Quack, quack"));
		assertEquals(true, duck.swim());
		assertEquals("Cluck, cluck", chicken.say("Cluck, cluck"));
		assertEquals(false, chicken.fly());
	}
	
	@Test
	public void testRooster() {  // A.3
		Rooster rooster = new Rooster();
		assertEquals("Cock-a-doodle-doo", rooster.say("Cock-a-doodle-doo"));
	}
	
	@Test
	public void testParrort() { // A.4
		ParrotFactory parrotFac = new ParrotFactory();
		Parrot parrotWithDog = (Parrot) parrotFac.getParrot("Woof, woof");
		Parrot parrotWithCat = (Parrot) parrotFac.getParrot("Meow");
		Parrot parrotWithRooster = (Parrot) parrotFac.getParrot("Cock-a-doodle-doo");

		assertThat(parrotWithDog, instanceOf(Parrot.class));
		assertThat(parrotWithCat, instanceOf(Parrot.class));
		assertThat(parrotWithRooster, instanceOf(Parrot.class));
	}
	
	@Test
	public void testFish() {  // B.1
		Fish fish = new Fish();
		assertEquals(false, fish.sing());
		assertEquals(true, fish.swim());
	}
	
	@Test
	public void testSharkAndClownFish() {  // B.2
		Shark shark = new Shark();
		shark.setFishColor(Color.GREY);
		shark.setFishSize(Size.LARGE);
		assertEquals(true, shark.eat());

		Clownfish clownfish = new Clownfish();
		clownfish.setFishColor(Color.ORANGE);
		clownfish.setFishSize(Size.SMALL);
		assertEquals(true, clownfish.make());
	}
	
	@Test
	public void testDolphin() {  // B.3
		Dolhpin dolphin = new Dolhpin();
		assertEquals(true, dolphin.swim());
	}
	
	@Test
	public void testButterFly(){  // D.1
		Butterfly butterfly = new Butterfly();
		assertEquals(true, butterfly.fly());
		assertEquals(false, butterfly.sound());
	}
	
	@Test
	public void testCaterpillar(){  // D.2
		Caterpillar caterpiller = new Caterpillar();
		assertEquals(false, caterpiller.fly());
	}
}
