import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CheckOutApp  {

public static void main(String[] args)  {
	Scanner input = new Scanner(System.in);

      LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm:ss a");
        String formattedDateTime = now.format(formatter);

        System.out.println("Date : " + formattedDateTime);

System.out.print("Enter customer's name: ");
String customerName = input.nextLine();

double subtotal = 0;
double totalPrice = 0;
String items = "";
while (true) {
	System.out.print("Enter product name: ");
	String productName = input.nextLine();
	
	System.out.print("Enter price per unit: ");
	double price = input.nextDouble();

	System.out.print("Enter quantity: ");
	int quantity = input.nextInt();

	double itemTotal = price * quantity;
	subtotal += itemTotal;
 items += String.format("%-15s %-10d %-10.2f %-10.2f%n", productName, quantity, price, itemTotal);

System.out.print("Add more items? (Enter '1' for Yes/Enter '2' for No): ");
int response = input.nextInt();
while (response != 1 && response != 2)  {
   System.out.print("invalid input. Enter 1 or 2: ");
   response = input.nextInt();
	}
if(response == 2) {
	break;	

    }
        }
       System.out.print("Enter your name(CASHIER'S NAME): ");
        String cashierName = input.nextLine();
	input.nextLine();
        System.out.print("Enter discount percentage: ");
        double discountRate = input.nextDouble();

	 
	double discount = subtotal * (discountRate / 100);
	double vat =  subtotal * (7.5 / 100);
	double total = subtotal - discount + vat; 
	 

 System.out.println();
	System.out.println ("""
		SEMICOLON STORES
	MAIN BRANCH
	LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
	TELEPHONE: 08121135541,
	DATE: """ + formattedDateTime + "\n CASHIER: " + cashierName + "\n CUSTOMER: " + customerName);
System.out.println("==========================================================================");
 System.out.println();
 System.out.println("________________________________________________________________________");
  System.out.println();
        System.out.printf("%-15s %-10s %-10s %-10s%n", "item", "Quantity", "Price", "Total");       System.out.println("__________________________________________________________________________");

        System.out.print(items);

 System.out.println("--------------------------------------------------------------------------");
        System.out.println("		Subtotal: " + subtotal);
        System.out.println("		Discount: " + discount);
        System.out.println("		VAT: " + vat);

 System.out.println();
System.out.println("==========================================================================");
 System.out.println();
        System.out.println("		Total Amount: " + total);
 System.out.println();
System.out.println("==========================================================================");
 System.out.println();
	        System.out.println("THIS IS NOT AN RECEIPT KINDLY PAY " + total);	
System.out.println("==========================================================================");

	System.out.print("How much did the customer give you: ");
		double amount = input.nextDouble();
	while (amount < total) {
	System.out.print("Insufficient fund. Enter valid amount: ");
	amount = input.nextInt();

	}
	double balance = 0;
	if(amount >= total) {
		balance = amount - total;	
	}

	
System.out.println("==========================================================================");
 System.out.println();
 System.out.println("________________________________________________________________________");
  System.out.println();
        System.out.printf("%-15s %-10s %-10s %-10s%n", "item", "Quantity", "Price", "Total");       System.out.println("__________________________________________________________________________");

        System.out.print(items);

 System.out.println("--------------------------------------------------------------------------");
        System.out.println("			Subtotal: " + subtotal);
        System.out.println("			Discount: " + discount);
        System.out.println("			VAT: " + vat);

 System.out.println();
System.out.println("==========================================================================");
 System.out.println();
        System.out.println("			Bill Total: " + total);
        System.out.println("			Amount Paid: " + amount);
        System.out.println("			Balance: " + balance);


 System.out.println();
System.out.println("==========================================================================");
 System.out.println();
	        System.out.println("    _____THANKS FOR YOUR PATRONAGE_____");	
System.out.println("==========================================================================");








}
    }

