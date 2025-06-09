import java.util.Calendar;
import java.time.LocalDate;
public class MenstrualCycleCalculator  {

public static String mymenstrualCalculator(String lastPeriodDate, int cycleLength)  {
	if(cycleLength < 21 || cycleLength > 35) {
		return "Please seek medical attention.";
		}

	LocalDate lastPeriod = LocalDate.parse(lastPeriodDate);
	LocalDate nextPeriodDate = lastPeriod.plusDays(cycleLength);
	LocalDate ovulationDate = nextPeriodDate.minusDays(14);
	LocalDate fertileStart = ovulationDate.minusDays(5);
	LocalDate fertileEnd = ovulationDate.plusDays(2);
	
	

	return """
	Next menstrual date: %s,
	Ovulation date is: %s,
	Fertile window start: %s, end %s,
	Safe date are before: %s, After: %s,
	""".formatted(nextPeriodDate, ovulationDate, fertileStart, fertileEnd, fertileStart, fertileEnd);
    


	







}

	}