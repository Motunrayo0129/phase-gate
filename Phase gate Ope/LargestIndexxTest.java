import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

	public class LargestIndexxTest {

	@Test
	public void testIfNumberReturnTheLargestNumbersOfTheIndex() {
		int[] array = {1, 2, 8, 20, 5};
		int[] returned = 3;
		int[] checked = LargestIndex.Index(array);
		assertArrayEquals(checked, returned);
	}

