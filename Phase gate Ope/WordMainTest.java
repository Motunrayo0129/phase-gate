import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

	public class WordMainTest {

	@Test
	public void testIfNumberReturnTheLargestNumbersOfTheIndex() {
		String words = "Hello World";
		char returned = 'o';
		int expected = 2
		String checked = WordsCount.Word(words);
		assertArrayEquals(checked, expected);
	}

}