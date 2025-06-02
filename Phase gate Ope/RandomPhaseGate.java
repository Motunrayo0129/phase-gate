import java.util.Scanner;
public class RandomPhaseGate {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int counter = 0;
	int score = 0;
	int attempt = 0;
	
	while(counter <= 10) {
	int computerChoice1 = (int)(Math.random() * 9) + 1;
	int computerChoice2 = (int)(Math.random() * 9) + 1;

	int correctAnswer = computerChoice1 - computerChoice2;
for (int count = 1; count < 2; count++) {
	if(computerChoice1 > computerChoice2) {
	System.out.println("Substract " + computerChoice1 + " - " + computerChoice2);
		int userAnswer = input.nextInt();
		if(userAnswer == correctAnswer && counter == 10) {
			score++;
			attempt++;
			break;
					
}	
		else if(userAnswer != correctAnswer && userAnswer == 2) {
			attempt++;
			break;


		}


	}
   } 
            }
System.out.println(score);


}
}
