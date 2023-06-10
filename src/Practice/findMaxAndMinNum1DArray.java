package Practice;

public class findMaxAndMinNum1DArray {
    public static void main(String[] args) {
        /*
        Find maximum and minimum Temperature in 1D Array.
         */
        double[] temp = {22.3, -0, 13.5,};

        double max = temp[0];
        double min = temp[0];

        for (double v : temp) {
            if (v > max) {
                max = v;
            } else if (v < min) {
                min = v;
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}







     /*   for (double[] doubles : temp) {
            for (double aDouble : doubles) {
                if (aDouble > max) {
                    max = aDouble;
                } else if (aDouble < min) {
                    min = aDouble;

      */



