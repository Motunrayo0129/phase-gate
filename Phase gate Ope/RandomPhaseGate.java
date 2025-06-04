import java.util.Scanner;
public class RandomPhaseGate {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

		int temp = 0;
		int score = 0;
long startTime = System.currentTimeMillis();
	for(int count = 1; count <= 10; count++)  { 
	int randomNumber1 = (int)(Math.random() * 20) + 1;
	int randomNumber2 = (int)(Math.random() * 20) + 1;
		if (randomNumber1 < randomNumber2)
			randomNumber2 = randomNumber1;
			temp = randomNumber2;
	
		int correctAnswer = randomNumber1 - randomNumber2;
		for(int num = 1; num <= 2; num++) {
	System.out.println("Substract " + randomNumber1 + " - " + randomNumber2);
		System.out.println("Enter your answer: ");
		int answer = input.nextInt();
		if(answer == correctAnswer)  {
			score++;
			break;
			}

		else if (num == 1){
			System.out.print("Last attempt for this question: ");
				
		}	
		 
    }
}
	long endTime = System.currentTimeMillis(); 
    long timeTaken = (endTime - startTime) / 1000; 

    System.out.println("You took " + timeTaken + " seconds to answer this question.");	
System.out.println("Your score is " + score);


}
}