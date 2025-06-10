public class CreditCardNumber {
	public static void main(String[] args) {

int[] cardNumbers = {4,5,3,9,1,4,8,8,0,3,4,3,6,4,6,7}; 

System.out.println(CreditCardValidator.validateCard(cardNumbers));

System.out.println(CreditCardValidator.applyLuhnAlgorithm(cardNumbers));



}
}