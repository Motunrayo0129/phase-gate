import java.util.Scanner;

public class LagbajaSchoolGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int studentCount = input.nextInt();

        System.out.print("Enter the number of subjects: ");
        int subjectCount = input.nextInt();

        int[][] scores = new int[studentCount][subjectCount];
        double[] averages = new double[studentCount];
        int[] totalScores = new int[studentCount];
        int[] subjectTotal = new int[subjectCount];
        int[] subjectFails = new int[subjectCount];
		int hardestSubject = -1;
		int easiestSubject = -1;
		int bestStudent = -1;
		int worstStudent = -1;

        for (int studentIndex = 0; studentIndex < studentCount; studentIndex++) {
            System.out.println("Entering scores for Student " + (studentIndex + 1) + ":");
            for (int subjectIndex = 0; subjectIndex < subjectCount; subjectIndex++) {
                System.out.print("Enter score for Subject " + (subjectIndex + 1) + " (0-100): ");
                int score = input.nextInt();

                while (score < 0 || score > 100) {
                    System.out.println("Invalid input! Score must be between 0 and 100.");
                    System.out.print("Re-enter score for Subject " + (subjectIndex + 1) + ": ");
                    score = input.nextInt();
                }

                scores[studentIndex][subjectIndex] = score;
                totalScores[studentIndex] += score;
                subjectTotal[subjectIndex] += score;

                if (score < 50) {
                    subjectFails[subjectIndex]++;
                }
            }
            averages[studentIndex] = (double) totalScores[studentIndex] / subjectCount;
        }

        int[] highestStudent = new int[subjectCount];
        int[] lowestStudent = new int[subjectCount];
        int[] highestScore = new int[subjectCount];
        int[] lowestScore = new int[subjectCount];

        for (int subjectIndex = 0; subjectIndex < subjectCount; subjectIndex++) {
            highestStudent[subjectIndex] = -1;
            lowestStudent[subjectIndex] = -1;
            highestScore[subjectIndex] = -1;
            lowestScore[subjectIndex] = 101;
        }

        hardestSubject = 0;
	easiestSubject = 0;

for (int subjectIndex = 1; subjectIndex < subjectCount; subjectIndex++) {
    if (subjectFails[subjectIndex] > subjectFails[hardestSubject]) {
        hardestSubject = subjectIndex;
    }
    if (subjectFails[subjectIndex] < subjectFails[easiestSubject]) {
        easiestSubject = subjectIndex;
    }
}

        bestStudent = -1;
        worstStudent = -1;

        for (int studentIndex = 0; studentIndex < studentCount; studentIndex++) {
            if (bestStudent == -1 || totalScores[studentIndex] > totalScores[bestStudent]) {
                bestStudent = studentIndex;
            }
            if (worstStudent == -1 || totalScores[studentIndex] < totalScores[worstStudent]) {
                worstStudent = studentIndex;
            }
        }

        for (int subjectIndex = 0; subjectIndex < subjectCount; subjectIndex++) {
            for (int studentIndex = 0; studentIndex < studentCount; studentIndex++) {
                if (scores[studentIndex][subjectIndex] > highestScore[subjectIndex]) {
                    highestScore[subjectIndex] = scores[studentIndex][subjectIndex]; 
                    highestStudent[subjectIndex] = studentIndex;
                }
                if (scores[studentIndex][subjectIndex] < lowestScore[subjectIndex]) {
                    lowestScore[subjectIndex] = scores[studentIndex][subjectIndex];
                    lowestStudent[subjectIndex] = studentIndex;
                }
            }
        }

 System.out.println();

        System.out.println("SUBJECT SUMMARY:");
        System.out.println("===========================================================");
        for (int subjectIndex = 0; subjectIndex < subjectCount; subjectIndex++) {
            System.out.println("Subject " + (subjectIndex + 1) + ":");
            System.out.println("Highest Scoring Student: Student " + (highestStudent[subjectIndex] + 1) + " scoring " + highestScore[subjectIndex]);
            System.out.println("Lowest Scoring Student: Student " + (lowestStudent[subjectIndex] + 1) + " scoring " + lowestScore[subjectIndex]);
            System.out.println("Total Score: " + subjectTotal[subjectIndex]);
            System.out.println("Number of Fails: " + subjectFails[subjectIndex]);
       System.out.println();    System.out.println("===========================================================");
        }
System.out.println();

       System.out.println("CLASS ANALYSIS:");
        System.out.println("===========================================================");
        System.out.println("Hardest Subject: Subject " + (hardestSubject + 1) + " with " + subjectFails[hardestSubject] + " failures.");
        System.out.println("Easiest Subject: Subject " + (easiestSubject + 1) + " with " + (studentCount - subjectFails[easiestSubject]) + " passes.");
System.out.println();
System.out.println("===========================================================");

	System.out.println("STUDENT PERFORMANCES:");
System.out.println();
System.out.println("===========================================================");
		
        System.out.println("Best Graduating Student: Student " + (bestStudent + 1) + " scoring " + totalScores[bestStudent]);
System.out.println();
System.out.println("===========================================================");
System.out.println();
System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        System.out.println("Worst Graduating Student: Student " + (worstStudent + 1) + " scoring " + totalScores[worstStudent]);

System.out.println();
System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("===========================================================");
    }
}