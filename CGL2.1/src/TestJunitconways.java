import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestJunitconways {
	@Test
	public void testconways() {
		Conwaysgame c = new Conwaysgame();
		Assertions.assertEquals("hi", c.toString());
		
	}

}
