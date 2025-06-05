import java.util.Arrays;
import java.util.Scanner;
public class MyQuestions {

public static void main(String[] args) {


	String display = """
_____________________________________________
	Welcome to MyQuestions Quiz
______________________________________________
""";
	System.out.println(display);

	String[] questions = new String[10];
		 questions[0] = "What is the capital of lagos state";
		 questions[1] = "What is the sum of 2 and 8";
		 questions[2] = "What is the roman numeral of L";
		 questions[3] = "How many languages is cohort 25 writing, within three month of resumption.";
		 questions[4] = "What is the square root of 9";
		 questions[5] = "What is the name of the priest of pathfinder";
		 questions[6] = "Where is semicolon located";
		 questions[7] = "Nigeria gain independent at what year";
		 questions[8] = "What is the marketing strategy of semicolon";
		 questions[9] = "How to declare class name in java";

	System.out.print("Enter a number from 1 to 10:");
			 
		Scanner input = new Scanner(System.in);
		int score = 0;
		int[] userInput = new int[10];
	for(int index = 0; index < questions.length; index++)  {
		//for(int count = 0; count < userInput.length; count++)
			boolean answer = true;
			while (answer == true) {
		System.out.print("Enter number: ");
		int choice = input.nextInt();
			if(index == choice) {
			}
		//if(index)
			
			switch(choice) {
				case 1: {
		System.out.println(questions[0]);
			String option = """
		___________________________________________________
				OPTIONS
		___________________________________________________
			(A). ABUJA               (B). SHOMOLU
			(C). IKEJA		 (D). IKORODU

		====================================================
			""";
			System.out.println(option);
			for(int correct = 1; correct <= 2; correct++)  {
			String answer1 = "c";
			System.out.print("Enter options: ");
				String options = input.next();
					options.toLowerCase();
				if (options.equals(answer1)) {
			System.out.println("You are correct");
				answer = false;
				score++;
				break;
				
			}
				else if (!options.equals(answer1)){
				System.out.println("Last attempt");
					answer = true;
						}
				} break;

					}
			
				case 2: {
		System.out.println(questions[1]);
			String option = """
		___________________________________________________
				OPTIONS
		___________________________________________________
			(A). 10               (B). 12
			(C). 18		      (C). 2

		====================================================
			""";
			System.out.println(option);
			for(int correct = 1; correct <= 2; correct++)  {
			String answer1 = "a";
			System.out.print("Enter options: ");
				String options = input.next();
					options.toLowerCase();
				if (options.equals(answer1)) {
			System.out.println("You are correct");
				score++;
				answer = false;
				break;
			}
				else if (!options.equals(answer1)){
				System.out.println("Last attempt");
					answer = true;
						}						

					}break;

						}
				case 3: {
		System.out.println(questions[2]);
			String option = """
		___________________________________________________
				OPTIONS
		___________________________________________________
			(A). 10               (B). 12
			(C). Invalid input    (D). 50

		====================================================
			""";
			System.out.println(option);
			for(int correct = 1; correct <= 2; correct++)  {
			String answer1 = "d";
			System.out.print("Enter options: ");
				String options = input.next();
					options.toLowerCase();
				if (options.equals(answer1)) {
			System.out.println("You are correct");
				score++;
				answer = false;
				break;

			}
				else if (!options.equals(answer1)){
				System.out.println("Last attempt");
					answer = true;
						}

					}
						break;
						}
				

				case 4: {
		System.out.println(questions[3]);
			String option = """
		___________________________________________________
				OPTIONS
		___________________________________________________
			(A). 5              (B). 2
			(C). Invalid input    (D). 3

		====================================================
			""";
			System.out.println(option);
			for(int correct = 1; correct <= 2; correct++)  {
			String answer1 = "c";
			System.out.print("Enter options: ");
				String options = input.next();
					options.toLowerCase();
				if (options.equals(answer1)) {
			System.out.println("You are correct");
				score++;
				answer = false;
				break;

			}
				else if (!options.equals(answer1)){
				System.out.println("Last attempt");
					answer = true;
						}

					}
						break;
						}
				case 5: {
		System.out.println(questions[4]);
			String option = """
		___________________________________________________
				OPTIONS
		___________________________________________________
			(A). 3    (B). 6
			(C). 81    (D). 4

		====================================================
			""";
			System.out.println(option);
			for(int correct = 1; correct <= 2; correct++)  {
			String answer1 = "b";
			System.out.print("Enter options: ");
				String options = input.next();
					options.toLowerCase();
				if (options.equals(answer1)) {
			System.out.println("You are correct");
				score++;
				answer = false;
				break;

			}
				else if (!options.equals(answer1)){
				System.out.println("Last attempt");
					answer = true;
						}

					}
						break;
						}

				case 6: {
		System.out.println(questions[5]);
			String option = """
		___________________________________________________
				OPTIONS
		___________________________________________________
			(A). Mr Ibrahim    (B). Mr Caleb
			(C). Onibudo Motunrayo    (D). Mr Ikigai

		====================================================
			""";
			System.out.println(option);
			for(int correct = 1; correct <= 2; correct++)  {
			String answer1 = "a";
			System.out.print("Enter options: ");
				String options = input.next();
					options.toLowerCase();
				if (options.equals(answer1)) {
			System.out.println("You are correct");								score++;
				answer = false;
				break;

			}
				else if (!options.equals(answer1)){
				System.out.println("Last attempt");
					answer = true;
						}
					}
						break;
						}
				case 7: {
		System.out.println(questions[6]);
			String option = """
		___________________________________________________
				OPTIONS
		___________________________________________________
			(A). Abuja    (B). Ogun
			(C). Lagos     (D). Abia

		====================================================
			""";
			System.out.println(option);
			for(int correct = 1; correct <= 2; correct++)  {
			String answer1 = "c";
			System.out.print("Enter options: ");
				String options = input.next();
					options.toLowerCase();
				if (options.equals(answer1)) {
			System.out.println("You are correct");
				score++;
				answer = false;
				break;

			}
				else if (!options.equals(answer1)){
				System.out.println("Last attempt");
					answer = true;
						}

					}
						break;
						}


					case 8: {
		System.out.println(questions[7]);
			String option = """
		___________________________________________________
				OPTIONS
		___________________________________________________
			(A). 1960   (B). 1962
			(C). 1959     (D). 1990

		====================================================
			""";
			System.out.println(option);
			for(int correct = 1; correct <= 2; correct++)  {
			String answer1 = "a";
			System.out.print("Enter options: ");
				String options = input.next();
					options.toLowerCase();
				if (options.equals(answer1)) {
			System.out.println("You are correct");
				score++;
				answer = false;
				break;

			}
				else if (!options.equals(answer1)){
				System.out.println("Last attempt");
					answer = true;
						}
					}
						break;
						}

					case 9: {
		System.out.println(questions[8]);
			String option = """
		___________________________________________________
				OPTIONS
		___________________________________________________
			(A). Come as you are.   (B). Start from the
						     top ans say I ca
			(C). Go placidly amid the
			      noise and haste    (D). 1990

		====================================================
			""";
			System.out.println(option);
			for(int correct = 1; correct <= 2; correct++)  {
			String answer1 = "a";
			System.out.print("Enter options: ");
				String options = input.next();
					options.toLowerCase();
				if (options.equals(answer1)) {
			System.out.println("You are correct");
				score++;
				answer = false;
				break;

			}
				else if (!options.equals(answer1)){
				System.out.println("Last attempt");
					answer = true;
						}
					}
						break;
						}

					case 10: {
		System.out.println(questions[9]);
			String option = """
		___________________________________________________
				OPTIONS
		___________________________________________________
			(A). upper case    (B). Camel case
			(C).Lower case      (D). Pascal case

		====================================================
			""";
			System.out.println(option);
			for(int correct = 1; correct <= 2; correct++)  {
			String answer1 = "d";
			System.out.print("Enter options: ");
				String options = input.next();
					options.toLowerCase();
				if (options.equals(answer1)) {
			System.out.println("You are correct");
				score++;
				answer = false;
				break;

			}
				else if (!options.equals(answer1)){
				System.out.println("Last attempt");
					answer = true;
						}					}
						break;
						}

			default: {
			System.out.print("Invalid input");
				}
					break;

			} break;

			} // for loop

	} //switch

System.out.println("Your scores is " + score);


}//static void
		} //class