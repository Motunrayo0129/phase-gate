public class MotunrayoBankAtm {

	private double balance;
	private double accountWithdrawal;

	public static double account(double balance)  {
		balance = balance;
		return balance;

		}
	public static double WithdrawnAmount(double withdrawal, double balance) {
		double percentage = (balance / 100) * 90;
		if(withdrawal % 500 == 0) {
			if(withdrawal > 0 && withdrawal <= percentage && withdrawal > 20000){
		int charges = 100;
		int updateBalance = balance - withdrawal - charges
		System.out.println("Transaction successful.");
		System.out.println("withdrawal amount: " + withdrawal + \n "charges fees: " + charges + "remaining balance: " + updateBalance)
					}
					return updateBalance;
				else {
				System.out.println("Invalid amount, amount should not be greater than 90% of your balance");
		}			}
		else {
			System.out.println("Enter multiples of 500 and 1000 only: ");
				}

}









}