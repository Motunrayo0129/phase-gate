import java.util.Scanner;
public class EmployeesPayRoll {
 public static void main(String[] args) {

String menu = """
____________________________________________
	MENU LIST FOR EMPLOYEE PAYROLL.
____________________________________________
PRESS =========>
1. Add employee payroll.
2. View employee payroll.
3. Update employee payroll.
4. Exit.
______________________________________________
""";
    System.out.println(menu);

	Scanner input = new Scanner(System.in);
	System.out.println("Enter menu number: ");
	int userInput = input.nextInt();

	switch(userInput)  {


          case 1:  {
		double  grossPays = 0;
		double  fedTaxRate = 0;
		double  staTaxRate = 0;
		double  deduction = 0;
		double  netPay = 0;

		System.out.print("Enter numbers of employee: ");
			int nums = input.nextInt();
		for(int count = 1; count <= nums; count++) {
		   //for(int index = count; index )
		System.out.println("Enter Employee name: ");
 		String employees = input.next();
		System.out.println("Number of hours work in a week");
			int hour = input.nextInt();
			if(hour > 91 || hour < 0) {
		System.out.println("Hey big fool. You be machine, You no fit work pass 91 hours per week.");
		System.out.println("Hour must not be greater than 91 hours. Enter number of hours work in a week hours: ");
			int mumu = input.nextInt();
			mumu = hour;
				}
		System.out.println("Enter hourly pay rate: ");
			double payRate = input.nextInt();
		System.out.println("Federal tax rate: ");
			double fedRate = input.nextInt();
		System.out.println("State tax rate: ");
			double staRate = input.nextInt();
		System.out.println("Employees added ===============>");
			
		String option = """
		____________________________________________
			MORE OPTIONS
		____________________________________________
		1. view employees payroll.
		2. update employees payroll
		3. go back to menu.

		=============================>
		""";
		System.out.print("Enter option: ");
			int opt = input.nextInt();
				if(opt == 1) {
			grossPays = payRate * hour;
			fedTaxRate = grossPays / 100 * fedRate;
			staTaxRate = grossPays / 100 * staRate;
			deduction = staTaxRate + fedTaxRate;
			netPay = grossPays - deduction;
			
				}	
	System.out.println("The gross pay is " + grossPays);
	System.out.println("The federal tax rate is " + fedTaxRate);
	System.out.println("The state tax rate is " + staTaxRate);
	System.out.println("Total deduction " + deduction);
	System.out.println("The net pay is " + netPay);

		if(opt == 2) 
		System.out.println("Your System is not updated. Download the latest version. ");
		
		
		else if(opt == 3) 
		System.out.println("Goodbye you exit the group: ");
			
		else 
		System.out.println("Invalid input");
			}
			
		}
			break;

	case 2: {
	System.out.print("No employee entered.");

	}	
		break;
	case 3: {
	
	System.out.print("No employee entered.");

	}
		break;
	case 4: {
	
	System.out.print("Goodbye!.");

	} 
		break;
	default:  {
	System.out.println("Invalid input");
		} 
			break;





}







}
	}