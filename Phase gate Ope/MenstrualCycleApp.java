import java.util.Scanner;
import java.util.Calendar;
import java.time.LocalDate;
public class MenstrualCycleApp {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
System.out.println("What is your previous menstrual date(YYYY-MM-DD): ");
String prevMenst = input.next();

System.out.println("What is your cycle length: ");
	int cycleLength = input.nextInt();

System.out.println(MenstrualCycleCalculator.mymenstrualCalculator(prevMenst, cycleLength));






}
	}