import static org.junit.jupiter.api.Assertions.assertEquals;;
import org.junit.jupiter.api.Test;

public class CreditCardValidatorTest {

    @Test
    public void testVisaCardValidation() {
        int[] visa = {4,5,5,6,7,3,7,5,8,6,9,8,5,4,3,2};
        assertEquals("visacard", CreditCardValidator.validateCard(visa));
    }

    @Test
    public void testMasterCardValidation() {
        int[] mastercard = {5,6,4,5,2,8,9,7,1,1,9,1,1,1,1,0};
        assertEquals("mastercard", CreditCardValidator.validateCard(mastercard));
    }

    @Test
    public void testDiscoverCardValidation() {
        int[] discover = {6,0,1,9,7,1,3,1,8,7,1,1,9,1,5,1};
        assertEquals("discovercard", CreditCardValidator.validateCard(discover));
    }

    @Test
    public void testAmericanExpressValidation() {
        int[] amex = {3,7,3,2,1,3,7,5,8,6,9,8,5};
        assertEquals("AmericanExpress card", CreditCardValidator.validateCard(amex));
    }

    @Test
    public void testInvalidLength() {
        int[] tooShort = {4,5,5};
        assertEquals("Invalid length", CreditCardValidator.validateCard(tooShort));
    }

    @Test
    public void testUnknownCardType() {
        int[] unknown = {2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
        assertEquals("Unknown Card Type", CreditCardValidator.validateCard(unknown));
    }

    @Test
    public void testLuhnValidCard() {
        int[] validLuhn = {4,5,5,6,7,3,7,5,8,6,9,8,5,4,3,2};
        assertEquals("Valid", CreditCardValidator.applyLuhnAlgorithm(validLuhn));
    }

    @Test
    public void testLuhnInvalidCard() {
        int[] invalidLuhn = {4,5,5,6,7,3,7,5,8,6,9,8,5,4,3,3};
        assertEquals("Invalid", CreditCardValidator.applyLuhnAlgorithm(invalidLuhn));
    }
}