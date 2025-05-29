public class PositionArrayMain {
    public static void main(String[] args) {
        int[][] matrix = {
            {3, 4, 3},
            {1, 9, 3}
        };

        int[] sums = PositionArray.calculateSums(matrix);
        double[] averages = PositionArray.calculateAverages(matrix);
        int[] ranks = PositionArray.rankRows(matrix);

        // Printing arrays in expected format
        System.out.println("sum = " + java.util.Arrays.toString(sums));
        System.out.println("average = " + java.util.Arrays.toString(averages));
        System.out.println("rank = " + java.util.Arrays.toString(ranks));
    }
}