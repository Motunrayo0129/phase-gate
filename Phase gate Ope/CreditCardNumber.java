import java.util.Scanner;
public class CreditCardNumber {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
System.out.print("Enter card number: ");
	String cardNum = input.next();

int[] card = new int[cardNum.length()];
for (int num = 0; num < cardNum.length(); num++) {
	card[num]  = Character.getNumericValue(cardNum.charAt(num));

	}
System.out.println(CreditCardValidator.validateCard(card));

System.out.println(CreditCardValidator.applyLuhnAlgorithm(card));



}
}