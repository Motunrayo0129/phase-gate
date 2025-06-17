public class CreditCardValidator {
	public static String validateCard(int[] cardNumber)  {
		int length = cardNumber.length;
	if(length < 13 || length > 16) {
		return "Invalid length";
		
			}

		String cardType = "";
		int count = cardNumber.length;
				
	if(cardNumber[0] == 4 && count == 16)  {
		cardType = "visacard";
		return "visacard";
	}

if(cardNumber[0] == 5 && count == 16)  {
		cardType = "mastercard";
		return "mastercard";
	}
else if(cardNumber[0] == 6 && count == 16)  {
		cardType = "discovercard";
		return "discovercard";
	}

else if(cardNumber[0] == 3 && cardNumber[1] == 7 && count == 13)  {
		cardType = "AmericanExpress card";
		return "AmericanExpress card";
	}
else {
	return "Unknown Card Type";

	}
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