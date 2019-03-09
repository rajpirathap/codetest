package rajpirathap.code;

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
}
