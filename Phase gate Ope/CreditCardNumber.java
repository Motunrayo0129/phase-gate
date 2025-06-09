public class CreditCardNumber {
	public static void main(String[] args) {
 //4388576018410707
int[] cardNumbers = {4,3,8,8,5,7,6,0,1,8,4,1,0,7,0,7}; 

System.out.println(CreditCardValidator.validateCard(cardNumbers));

System.out.println(CreditCardValidator.applyLuhnAlgorithm(cardNumbers));



}
}