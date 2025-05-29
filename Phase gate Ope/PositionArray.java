public class PositionArray {

    // Method to calculate sums for all rows
    public static int[] calculateSums(int[][] matrix) {
        int[] sums = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[].length; j++) { // Using indexed loop
                sum += matrix[i][j];
            }
            sums[i] = sum;
        }
        return sums;
    }

    // Method to calculate averages for all rows
    public static double[] calculateAverages(int[][] matrix) {
        double[] averages = new double[matrix.length];
        int[] sums = calculateSums(matrix);
        for (int i = 0; i < matrix.length; i++) {
            averages[i] = (double) sums[i] / matrix[i].length;
        }
        return averages;
    }

    // Method to rank rows based on their averages
    public static int[] rankRows(int[][] matrix) {
        double[] averages = calculateAverages(matrix);
        int[] ranks = new int[matrix.length];

        // Initialize rank positions
        for (int i = 0; i < matrix.length; i++) {
            ranks[i] = i + 1;
        }

        // Sorting rows by average in descending order
        for (int i = 0; i < averages.length - 1; i++) {
            for (int j = i + 1; j < averages.length; j++) {
                if (averages[i] < averages[j]) { // Swap if needed
                    double tempAvg = averages[i];
                    averages[i] = averages[j];
                    averages[j] = tempAvg;

                    int tempRank = ranks[i];
                    ranks[i] = ranks[j];
                    ranks[j] = tempRank;
                }
            }
        }
        return ranks;
    }
}