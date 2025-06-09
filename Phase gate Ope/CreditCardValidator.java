public class CreditCardValidator {
	public static String validateCard(int[] cardNumber)  {
	if(cardNumber.length < 13 || cardNumber.length > 16) {
		return "Invalid length";
		
			}

		String cardType = "";
		int count = 0;
		
	for(int num = 0; num < cardNumber.length; num++)  {
			count++;
	}
		
	if(cardNumber[0] == 4 && count == 16)  {
		cardType = "visacard";
	}

if(cardNumber[0] == 5 && count == 16)  {
		cardType = "mastercard";
	}
else if(cardNumber[0] == 6 && count == 16)  {
		cardType = "discovercard";
	}
else if(cardNumber[0] == 3 && cardNumber[1] == 1 && count == 13)  {
		cardType = "AmericanExpress card";
	}
else {
cardType = "Unknown Card Type";
	}
		return cardType;
}



public static String applyLuhnAlgorithm(int[] cardNumber) {
int sum = 0;
Boolean digitDouble = false;

	for(int num =  cardNumber.length - 1; num >= 0; num--)  {
		int digit = cardNumber[num];
		if(digitDouble)  {
			digit *= 2;
		if (digit > 9) {
			digit -= 9;
		}
			}
	sum += digit;
	digitDouble = !digitDouble;
		}
		return (sum % 10 == 0) ? "Valid" : "Invalid";
		 

	}
}