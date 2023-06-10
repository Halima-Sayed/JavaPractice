package Practice;

public class sumOfEvenIndexAndEvenRow2DArray {
    public static void main(String[] args) {
        /*
        Write a program that sums all numbers that are on even index and on even row.
         */
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };

        int sum = 0;

        for (int i = 2; i < a.length; i++) { // columns
            for (int j = 3; j < a[i].length; j++) {  // indexes
                sum += a[i][j];
            }
        }
        System.out.print(sum + " ");
    }
}





