import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestJunitboard {
	@Test
	public class testcreate() {
		board c = new board(10);
		System.out.println(c);
		c.createboard();
		Assertions.assertEquals("false", c.toString());
	}

}
