public class MenstrualCycleCalculator  {

public static String mymenstrualCalculator(int cycleLength, String lastPeriodDate)  {

	LocalDate lastPeriod = LocalDate.parse(lastPeriodDate);
	LocalDate nextPeriodDate = lastPeriod.PlusDays(cycleLength);
	LocalDate ovulationDate = nextPeriodDate.minusDays(14);
	LocalDate ovulationDate = nextPeriodDate.PlusDays(2);
	LocalDate 
	











}

	}