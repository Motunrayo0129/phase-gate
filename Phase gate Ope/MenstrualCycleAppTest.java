import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


	public class MenstrualCycleAppTest {

	@Test
	public void testIfMenstrualCycleAppIsValid() {
		String lastPeriod = "2025-05-16";
		int length = 26;
		String expected = """
		Next menstrual date: 2025-06-24,
		Ovulation date is: 2025-06-10,
		Fertile window start: 2025-06-05, end 2025-06-12,
		Safe date are before: 2025-06-05, After: 2025-06-12,
		""";
		String checked =  MenstrualCycleCalculator.mymenstrualCalculator(lastPeriod, length);
		assertEquals(checked, expected);
	}

}