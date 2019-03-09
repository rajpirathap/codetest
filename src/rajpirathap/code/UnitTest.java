package rajpirathap.code;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import rajpirathap.code.Solution.Bird;


public class UnitTest {
	@Test
	public void testBird() {  // A.1
		Bird bird = new Bird();
		assertEquals(true, bird.fly());
		assertEquals(true, bird.sing());
	}
}
